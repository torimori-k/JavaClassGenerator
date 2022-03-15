package ui;


import ast.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.ASTBuilder;
import parser.ClassGenLexer;
import parser.ClassGenParser;

import javax.management.RuntimeErrorException;
import java.io.IOException;

public class Main {
    private static final String INPUT_FILE_NAME = "input.txt";
    private static String output_dir = "out/";

    public static void main(String[] args) throws IOException {
        Program program = parseInput();

        // TODO: add static validation (come up with what to check later)

        // TODO: add evaluation
    }

    public static Program parseInput() throws IOException {
        ClassGenLexer lexer = new ClassGenLexer(CharStreams.fromFileName(INPUT_FILE_NAME));
        TokenStream tokens = new CommonTokenStream(lexer);
        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
        lexer.reset(); // reset the token stream to the initial position
        System.out.println("Tokenization Completed.");

        ClassGenParser parser = new ClassGenParser(tokens);
        ASTBuilder astBuilder = new ASTBuilder();
        Program program = astBuilder.visitProgram(parser.program());
        System.out.println("Parsing and Building AST Completed.");

        return program;
    }

}
