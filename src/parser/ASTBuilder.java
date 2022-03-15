package parser;

import ast.*;

public class ASTBuilder extends ClassGenParserBaseVisitor<Node> {
    /**
     * In this class, conversion from parse tree to AST is implemented
     * based on the visitor interface in gen/parser/ClassGenParser.java
     */

    @Override
    public Program visitProgram(ClassGenParser.ProgramContext ctx) {
        return null;
    }

}
