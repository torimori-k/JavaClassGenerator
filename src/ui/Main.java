package ui;


import ast.ClassGenEvaluator;
import ast.Program;
import ast.StaticAttributeDecValidator;
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
import java.util.HashMap;

public class Main {
    private static final String INPUT_FILE_NAME = "input.txt";
    private static String output_path;

    public static void main(String[] args) throws IOException, NullClassNameException {
        Program program = parseInput();

        StaticAttributeDecValidator validator = new StaticAttributeDecValidator();
        String errorMsg = validator.visit(new HashMap<>(), program);
        if (!errorMsg.isEmpty()) {
            System.err.println("Static Validation Failed:\n" + errorMsg);
            System.exit(1);
        }
        Utility.log("Static Validation Completed");

        String className;
        try {
            className = program.getClassName();
            if(className != null) {
                output_path = Utility.setOutputFileLocation(className);
                PrintWriter out = new PrintWriter(new FileWriter(output_path));

                ClassGenEvaluator evaluator = new ClassGenEvaluator(out);
                evaluator.visit(null, program);
                out.close();
                Utility.log("Evaluation Completed");
                Utility.log("Generated a File at \"" + output_path + "\"");
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
        Utility.log("Tokenization Completed.");

        ClassGenParser parser = new ClassGenParser(tokens);
        ASTBuilder astBuilder = new ASTBuilder();
        Program program = astBuilder.visitProgram(parser.program());
        Utility.log("Parsing and Building AST Completed.");

        return program;
    }

}
