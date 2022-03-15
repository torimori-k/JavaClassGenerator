package ui;


import ast.Program;
import org.antlr.v4.runtime.CharStreams;
import parser.ClassGenLexer;

public class Main {
    private static final String INPUT_PATH = "input.txt";
    private static String output_dir = "out/";

    public static void main(String[] args) {
        Program program = parseInput(INPUT_PATH);
    }

    public static Program parseInput(String filePath){
        return null;
    }

}
