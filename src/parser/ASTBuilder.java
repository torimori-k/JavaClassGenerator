package parser;

import ast.*;
import exception.InvalidContextException;
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
        List<MethodDef> methodDefs = new ArrayList<>();
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
    //public VisibilityModifier handleVisMod(ClassGenParser.Class_visibility_modContext visMod) {
    public VisibilityModifier handleVisMod(ParserRuleContext visMod) {
        Utility.log("Handling visibility modifier");
        String visMod_str;
        if (visMod == null) {
            visMod_str = "";
        } else {
            visMod_str = visMod.getText();
        }
        Utility.log("Visibility Modifier Value: " + visMod_str);
        VisibilityModifier result;
        try {
            result = VisibilityModifier.getVisMod(visMod_str);
        } catch (InvalidVisibilityModifierExcpeption e) {
            throw new RuntimeException("Runtime Error: invalid visibility modifier in a definition");
        }
        Utility.log("Handling visibility modifier done");
        return result;
    }

    @Override
    public AttributeDef visitAttr_def(ClassGenParser.Attr_defContext attr_defCxt) {
        VisibilityModifier visMod = handleVisMod(attr_defCxt.visibility_mod());
        String attrName = attr_defCxt.name_exp().getText();

        return null;
    }


}
