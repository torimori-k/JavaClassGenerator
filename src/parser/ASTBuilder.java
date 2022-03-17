package parser;

import ast.*;
import exception.ASTBuilderException;
import exception.InvalidVisibilityModifierExcpeption;
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
            for(ClassGenParser.Opt_attr_defContext opt_attr_def: Utility.getSafeList(attr_defs.opt_attr_def())) {
                attributeDefs.add(visitAttr_def(opt_attr_def.attr_def()));
            }
        }

        List<ConstructorDef> constDefs = new ArrayList<>();
        List<MethodDef> methodDefs = new ArrayList<>();
        Utility.log("Finish: building AST");
        return new Program(classStmt, attributeDefs, constDefs, methodDefs);
    }

    @Override
    public ClassStmt visitClass_stmt(ClassGenParser.Class_stmtContext ctx) {
        Utility.log("Processing class statement");
        ClassStmt result;
        ClassGenParser.Class_defContext classDefContext = ctx.class_def();
        VisibilityModifier visMod = handleClassVisMod(classDefContext.class_visibility_mod());
        String className = classDefContext.name_exp().getText();
        result = new ClassStmt(visMod, className);
        Utility.log("Done processing class statement; Result: " + result);
        return result;
    }

    /**
     * A function to return a correct visibility modifier based on the given context
     * @param visMod: ClassGenParser.Class_visibility_modContext
     * @return Enum value: VisibilityModifier
     */
    public VisibilityModifier handleClassVisMod(ClassGenParser.Class_visibility_modContext visMod) {
        Utility.log("Handling class visibility modifier");
        String visMod_str;
        if (visMod == null) {
            visMod_str = "";
        } else {
            visMod_str = visMod.getText();
        }
        Utility.log("Class Visibility Modifier Value: " + visMod_str);
        VisibilityModifier result;
        try {
            result = VisibilityModifier.getVisMod(visMod_str);
        } catch (InvalidVisibilityModifierExcpeption e) {
            throw new RuntimeException("Runtime Error: invalid visibility modifier in class definition");
        }
        Utility.log("Handling class visibility modifier done");
        return result;
    }

    @Override
    public AttributeDef visitAttr_def(ClassGenParser.Attr_defContext attr_defCxt) {
        // TODO resume from here.
        return null;
    }

}
