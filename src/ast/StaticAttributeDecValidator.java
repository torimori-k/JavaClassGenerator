package ast;

import java.util.Map;

/**
 * A class to check if the variables in the parameter list have been already declared in the attribute section.
 *
 * Context type: Map --> key (the name of the variable) and value (the attribute definition instance)
 * Return type: Error message (String instance)
 *
 * When a specific node is irrelevant to the validation, it just returns an empty string.
 */

public class StaticAttributeDecValidator implements ClassGenVisitor<Map<String, AttributeDef>, String>{

    @Override
    public String visit(Map<String, AttributeDef> context, Program program) {
        StringBuilder buffer = new StringBuilder();
        for(AttributeDef attributeDef: program.getAttrStmt()) {
            buffer.append(attributeDef.accept(context, this));
        }
        for(ConstructorDef constDef: program.getConstStmt()) {
            buffer.append(constDef.accept(context, this));
        }
        return buffer.toString();
    }

    @Override
    public String visit(Map<String, AttributeDef> context, AttributeDef attributeDef) {
        // just putting the information of declared information, so there shouldn't be any error message for this part.
        context.put(attributeDef.getName(), attributeDef);
        return "";
    }

    @Override
    public String visit(Map<String, AttributeDef> context, ConstructorDef constDef) {
        AttributeDef result = context.get(constDef.getName());
        if (result == null) {
            return "The following attribute has not been declared, so cannot be used in the constructor: " + constDef.getName();
        } else {
            return "";
        }
    }

    @Override
    public String visit(Map<String, AttributeDef> context, ClassStmt classStmt) {
        return "";
    }

    @Override
    public String visit(Map<String, AttributeDef> context, MethodDef methodDef) {
        return "";
    }

    @Override
    public String visit(Map<String, AttributeDef> context, Name name) {
        return "";
    }
}
