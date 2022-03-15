package ui;


import ast.Program;
import exception.NullClassNameException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.ASTBuilder;
import parser.ClassGenLexer;
import parser.ClassGenParser;
import util.Utility;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private static final String INPUT_FILE_NAME = "input.txt";
    private static String output_path;

    public static void main(String[] args) throws IOException, NullClassNameException {
        Program program = parseInput();

        // TODO: add static validation (come up with what to check later)

        String className;
        try {
            className = "Dog"; // program.getClassName(); // TODO: after completing implementation, uncomment this part
            if(className != null) {
                output_path = Utility.setOutputFileLocation(className);
                PrintWriter out = new PrintWriter(new FileWriter(output_path));
                // TODO: add evaluation
                out.println("testing"); // TODO: delete this later.
                out.close();
                System.out.println("Evaluation Completed");
                System.out.println("Generated a File at \"" + output_path + "\"");
            } else {
                throw new NullClassNameException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



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
