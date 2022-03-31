package util;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SyntaxErrorListener extends BaseErrorListener {
    public static SyntaxErrorListener INSTANCE = new SyntaxErrorListener();

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String targetLine = "";
        try {
            targetLine = Files.readAllLines(Paths.get(recognizer.getInputStream().getSourceName())).get(line - 1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        String srcName = recognizer.getInputStream().getSourceName();
        if(!srcName.isEmpty()) {
            srcName = String.format("%s:%d:%d: ", srcName, line, charPositionInLine);
        }
        if(!targetLine.isEmpty()) {
            System.err.println("Error Line: [" + targetLine + "]");
        }
        throw new ParseCancellationException(String.format("%s%s", srcName, msg));
    }
}
