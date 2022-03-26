package ast;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Self Note: A new line or spacing should be appended after the statement unless there is some condition to handle. (no prepend)
 */

public class ClassGenEvaluator implements ClassGenVisitor<Void, Void> {

    private PrintWriter out;
    private int indentCounter;
    private int[] nums;
    private Map<String, AttributeInfo> attributes; // This will be used to build a constructor.
    private Map<String, AttributeInfo> constParams; // remember this map will always be the subset of map attributes.

    public ClassGenEvaluator(PrintWriter out) {
        this.out = out;
        indentCounter = 0;
        attributes = new TreeMap<>();
        constParams = new TreeMap<>();
    }

    @Override
    public Void visit(Void context, Program program) {
        ClassStmt classStmt = program.getClassStmt();
        classStmt.accept(context, this);

        List<AttributeDef> attrStmt = program.getAttrStmt();
        for (AttributeDef attrDef : attrStmt) {
            attrDef.accept(context, this);
        }

        List<ConstructorDef> constStmt = program.getConstStmt();
        indentCounter++;
        out.write(getIndent() + "public " + program.getClassName() + "(");
        for (ConstructorDef constDef : constStmt) {
            constDef.accept(context, this);
        }
        writeConstParameterList();
        out.write(") {\n");
        writeConstructorDefinition();
        out.write(getIndent() + "}\n");
        indentCounter--;

        List<MethodDef> methodStmt = program.getMethodStmt();
        for (MethodDef methodDef : methodStmt) {
            methodDef.accept(context, this);
        }

        out.write("}");
        return null;
    }

    @Override
    public Void visit(Void context, ClassStmt classStmt) {
        if (classStmt.getVisMod() != VisibilityModifier.DEFAULT) {
            out.write(classStmt.getVisMod().getValue() + " ");
        }
        out.write("class " + classStmt.getName() + " {\n");
        return null;
    }

    @Override
    public Void visit(Void context, AttributeDef attributeDef) {
        indentCounter++;
        out.write(getIndent());
        VisibilityModifier visMod = attributeDef.getVisMod();
        BasicType basicType = attributeDef.getType();
        boolean isArrayType = attributeDef.isArrayType();
        String name = attributeDef.getName();

        // Put the attribute declaration
        if(visMod != VisibilityModifier.DEFAULT) {
            out.write(visMod.getValue() + " ");
        }
        String formattedType = formatType(basicType, isArrayType);
        out.write(formattedType + " ");
        out.write(name + ";\n");

        // check if getter/setter should be generated.
        if(attributeDef.hasGetter()) {
            out.write(getIndent() + "public " + formattedType + " get" + capitalizeFirstChar(name) + "() {\n");
            out.write(getIndent() + "return this." + name + ";\n");
            out.write(getIndent() + "}\n");
        }
        if(attributeDef.hasSetter()){
            out.write(getIndent() + "public void set" + capitalizeFirstChar(name));
            out.write("(" + formattedType + " " + name + ") {\n");
            out.write(getIndent() + "this." + name + " = " + name + ";\n");
            out.write(getIndent() + "}\n");
        }

        out.write("\n");

        attributes.put(name, new AttributeInfo(basicType, isArrayType));
        indentCounter--;
        return null;
    }

    @Override
    public Void visit(Void context, ConstructorDef constDef) {
        String paramName = constDef.getName();
        AttributeInfo attributeInfo = attributes.get(paramName);
        if (attributeInfo != null) {
            constParams.put(paramName, new AttributeInfo(attributeInfo.getBasicType(), attributeInfo.isArrayType()));
        }
        return null;
    }

    @Override
    public Void visit(Void context, MethodDef methodDef) {
        indentCounter++;
        VisibilityModifier visMod = methodDef.getVisMod();
        String methodName = methodDef.getName();
        BasicType basicType = methodDef.getType();
        boolean isArray = methodDef.isArrayType();
        out.write(getIndent());
        if (visMod != VisibilityModifier.DEFAULT) {
            out.write(visMod.getValue() + " ");
        }
        String formattedReturnType = formatType(basicType, isArray);
        out.write(formattedReturnType + " " + methodName + "() {\n");
        if (basicType != BasicType.VOID) {
            indentCounter++;
            out.write(getIndent() + "return " + getDefaultReturnValue(basicType) + ";\n");
            indentCounter--;
        }
        out.write(getIndent() + "}\n\n");
        indentCounter--;
        return null;
    }

    @Override
    public Void visit(Void context, Name name) {
        // no implementation necessary for now
        return null;
    }

    /**
     * @return Based on the current number of indentation in this class object,
     *          this function returns multiple of four spaces as string.
     */
    public String getIndent() {
        return "    ".repeat(Math.max(0, indentCounter));
    }

    /**
     *
     * @param type BasicType used for definition
     * @param isArray boolean: true if it is array type; false, otherwise
     * @return formatted string value for the evaluation process
     */
    public String formatType(BasicType type, boolean isArray) {
        String result = type.getValue();
        if(isArray) {
            result += "[]";
        }
        return result;
    }

    /**
     *
     * @param input target String
     * @return a string whose first character is ensured to be capitalized
     */
    public String capitalizeFirstChar(String input) {
        char firstChar = input.charAt(0);
        if (Character.isAlphabetic(firstChar)) {
            if(Character.isLowerCase(firstChar)) {
                input = Character.toUpperCase(firstChar) + input.substring(1);
            }
        }
        return input;
    }

    /**
     * A function to write the parameter list to the target file
     */
    public void writeConstParameterList() {
        StringBuilder result = new StringBuilder();
        if(constParams.isEmpty()) {
            return;
        }
        for(String paramName: constParams.keySet()) {
            AttributeInfo paramType = constParams.get(paramName);
            BasicType basicType = paramType.getBasicType();
            boolean isArray = paramType.isArrayType();
            String formattedType = formatType(basicType, isArray);
            result.append(formattedType).append(" ").append(paramName).append(", ");
        }
        out.write(result.substring(0, result.length() - 2)); // remove the last ", "
    }

    /**
     * A function to write the definition of constructor to the target file
     */
    public void writeConstructorDefinition() {
        indentCounter++;
        for(String paramName: constParams.keySet()) {
            out.write(getIndent() + "this." + paramName + " = " + paramName + ";\n");
        }
        indentCounter--;
    }

    public String getDefaultReturnValue(BasicType type) {
        if (type == BasicType.BOOLEAN) {
            return "false";
        } else if (type == BasicType.BYTE || type == BasicType.DOUBLE || type == BasicType.FLOAT
                    || type == BasicType.INT || type == BasicType.LONG || type == BasicType.SHORT) {
            return "0";
        } else if (type == BasicType.CHAR) {
            return "'\\0'";
        } else if (type == BasicType.STRING) {
            return "null";
        } else {
            return "";
        }
    }

    private class AttributeInfo{
        BasicType type;
        boolean isArrayType;
        AttributeInfo(BasicType type, boolean isArrayType) {
            this.type = type;
            this.isArrayType = isArrayType;
        }

        public BasicType getBasicType() {
            return type;
        }

        public boolean isArrayType() {
            return isArrayType;
        }
    }
}
