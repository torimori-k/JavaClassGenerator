package parser;

import ast.*;
import exception.BasicTypeException;

import exception.InvalidVisibilityModifierExcpeption;

import org.antlr.v4.runtime.ParserRuleContext;
import util.Utility;

import java.util.ArrayList;
import java.util.List;


public class ASTBuilder extends ClassGenParserBaseVisitor<Node> {
    /**
     * In this class, conversion from parse tree to AST is implemented
     * based on the visitor interface in gen/parser/ClassGenParser.java
     */

    @Override
    public Program visitProgram(ClassGenParser.ProgramContext ctx) {
        Utility.log("Start: building AST");
        ClassStmt classStmt = visitClass_stmt(ctx.class_stmt());

        List<AttributeDef> attributeDefs = new ArrayList<>();
        ClassGenParser.Attr_defsContext attr_defs = ctx.attr_stmt().attr_defs();
        if (attr_defs != null) {
            attributeDefs.add(visitAttr_def(attr_defs.attr_def()));
            for (ClassGenParser.Opt_attr_defContext opt_attr_def : Utility.getSafeList(attr_defs.opt_attr_def())) {
                attributeDefs.add(visitAttr_def(opt_attr_def.attr_def()));
            }
        }

        List<ConstructorDef> constDefs = new ArrayList<>();
        ClassGenParser.Const_defsContext const_defs = ctx.const_stmt().const_defs();
        if (const_defs != null) {
            constDefs.add(visitConst_def(const_defs.const_def()));
            for (ClassGenParser.Opt_const_defContext opt_const_def : Utility.getSafeList(const_defs.opt_const_def())) {
                constDefs.add(visitConst_def(opt_const_def.const_def()));
            }
        }

        List<MethodDef> methodDefs = new ArrayList<>();
        ClassGenParser.Method_defsContext method_defs = ctx.method_stmt().method_defs();
        if (method_defs != null) {
            methodDefs.add(visitMethod_def(method_defs.method_def()));
            for (ClassGenParser.Opt_method_defContext opt_method_def : Utility.getSafeList(method_defs.opt_method_def())) {
                methodDefs.add(visitMethod_def(opt_method_def.method_def()));
            }
        }

        Utility.log("Finish: building AST");
        return new Program(classStmt, attributeDefs, constDefs, methodDefs);
    }

    @Override
    public ClassStmt visitClass_stmt(ClassGenParser.Class_stmtContext ctx) {
        Utility.log("Processing class statement");
        ClassStmt result;
        ClassGenParser.Class_defContext classDefContext = ctx.class_def();
        VisibilityModifier visMod = handleVisMod(classDefContext.class_visibility_mod());
        String className = classDefContext.name_exp().getText();
        result = new ClassStmt(visMod, className);
        Utility.log("Done processing class statement; Result: " + result);
        return result;
    }

    /**
     * A function to return a correct visibility modifier based on the given context
     * <p>
     * REQUIRES: The parameter has to be typed as either Class_visibility_modContext or Visibility_modContext.
     *
     * @param visMod: ParserRuleContext
     * @return Enum value: VisibilityModifier
     */
    public VisibilityModifier handleVisMod(ParserRuleContext visMod) {
        String visMod_str;
        if (visMod == null) {
            visMod_str = "";
        } else {
            visMod_str = visMod.getText();
        }
        VisibilityModifier result;
        try {
            result = VisibilityModifier.getVisMod(visMod_str);
        } catch (InvalidVisibilityModifierExcpeption e) {
            throw new RuntimeException("Runtime Error: invalid visibility modifier in a definition");
        }
        return result;
    }

    @Override
    public AttributeDef visitAttr_def(ClassGenParser.Attr_defContext attr_defCxt) {
        Utility.log("Processing Attribute Definition");
        AttributeDef result;
        VisibilityModifier visMod = handleVisMod(attr_defCxt.visibility_mod());
        String attrName = attr_defCxt.name_exp().getText();
        BasicType var_type;
        boolean isArray = false;
        if (attr_defCxt.attr_type().arr_type() != null) {
            isArray = true;
            try {
                var_type = handleBasicType(attr_defCxt.attr_type().arr_type().var_basic_type());
            } catch (BasicTypeException e) {
                throw new RuntimeException("Error: for array type value while handling attribute definition");
            }
        } else {
            try {
                var_type = handleBasicType(attr_defCxt.attr_type().var_basic_type());
            } catch (BasicTypeException e) {
                throw new RuntimeException("Error: for non-array type value while handling attribute definition");
            }
        }
        boolean hasGetter = false;
        boolean hasSetter = false;
        ClassGenParser.Getter_setter_optionsContext getterSetterCtx = attr_defCxt.getter_setter_options();
        if (getterSetterCtx.GETTER_OPTION() != null) {
            hasGetter = true;
        }
        if (getterSetterCtx.SETTER_OPTION() != null) {
            hasSetter = true;
        }
        result = new AttributeDef(visMod, attrName, var_type, isArray, hasGetter, hasSetter);
        Utility.log("Done processing attribute definition; Result: " + result);
        return result;
    }

    /**
     * A function to return a right BasicType for a given type context
     *
     * @param typeCtx: ClassGenParser.Var_basic_typeContext
     * @return BasicType
     * @throws BasicTypeException: thrown when there is some error in matching the type given the context
     */
    public BasicType handleBasicType(ClassGenParser.Var_basic_typeContext typeCtx) throws BasicTypeException {
        if (typeCtx.BYTE_TYPE() != null) {
            return BasicType.BYTE;
        } else if (typeCtx.SHORT_TYPE() != null) {
            return BasicType.SHORT;
        } else if (typeCtx.INT_TYPE() != null) {
            return BasicType.INT;
        } else if (typeCtx.LONG_TYPE() != null) {
            return BasicType.LONG;
        } else if (typeCtx.FLOAT_TYPE() != null) {
            return BasicType.FLOAT;
        } else if (typeCtx.DOUBLE_TYPE() != null) {
            return BasicType.DOUBLE;
        } else if (typeCtx.CHAR_TYPE() != null) {
            return BasicType.CHAR;
        } else if (typeCtx.BOOLEAN_TYPE() != null) {
            return BasicType.BOOLEAN;
        } else if (typeCtx.STRING_TYPE() != null) {
            return BasicType.STRING;
        } else {
            throw new BasicTypeException("Error: invalid basic type");
        }
    }

    @Override
    public ConstructorDef visitConst_def(ClassGenParser.Const_defContext const_defCtx) {
        Utility.log("Processing Constructor Definition");
        String const_name = const_defCtx.name_exp().getText();
        ConstructorDef result = new ConstructorDef(const_name);
        Utility.log("Done processing constructor definition; Result: " + result);
        return result;
    }

    @Override
    public MethodDef visitMethod_def(ClassGenParser.Method_defContext method_defCtx) {
        Utility.log("Processing Method Definition");
        MethodDef result;
        VisibilityModifier visMod = handleVisMod(method_defCtx.visibility_mod());
        String methodName = method_defCtx.name_exp().getText();
        BasicType return_type;
        boolean isArray = false;
        if (method_defCtx.method_type().arr_type() != null) {
            isArray = true;
            try {
                return_type = handleBasicType(method_defCtx.method_type().arr_type().var_basic_type());
            } catch (BasicTypeException e) {
                throw new RuntimeException("Error: for array type value while handling method definition");
            }
        } else {
            if (method_defCtx.method_type().return_basic_type().VOID_TYPE() != null) {
                return_type = BasicType.VOID;
            } else {
                try {
                    return_type = handleBasicType(method_defCtx.method_type().return_basic_type().var_basic_type());
                } catch (BasicTypeException e) {
                    throw new RuntimeException("Error: for non-array type value while handling method definition");
                }
            }
        }
        result = new MethodDef(visMod, methodName, return_type, isArray);
        Utility.log("Done processing method definition; Result: " + result);
        return result;
    }


}
