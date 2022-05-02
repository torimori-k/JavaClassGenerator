import ast.Program;
import ast.StaticAttributeDecValidator;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;
import ui.Main;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

import static org.junit.Assert.*;

public class ClassGenTest {
    @Rule
    public TestName name = new TestName();
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private StaticAttributeDecValidator validator;
    private String error;
    private String filepath = "./test_input/";
    private final String STATIC_ERR_MSG_TEMP = "The following attribute has not been declared, so cannot be used in the constructor: ";
    @Before
    public void before() {
        // TODO: resume from here
        validator = new StaticAttributeDecValidator();
        String testName = name.getMethodName();
        if (testName.contains("Valid")) {
            filepath += "valid/";
        } else if (testName.contains("InvalidSem")) {
            filepath += "invalidSem/";
        } else if (testName.contains("InvalidParse")) {
            filepath += "invalidParse/";
        } else {
            System.err.println("Not implemented test type");
            System.exit(1);
        }
        filepath += testName + ".txt";
        File file = new File(filepath);
        if (file.isFile()) {
            System.out.println(file.getName());
        }
        if (!testName.contains("InvalidParse")) {
            Program program = Main.parseInput(filepath);
            error = validator.visit(new HashMap<>(), program);
        }
    }

    @Test
    public void testValidAll() {
        assertTrue(error.isEmpty());
    }

    @Test
    public void testInvalidParseAllEmpty() {
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("The empty input.");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidSemTentative() {
        assertFalse(error.isEmpty());
        String expectedErrorMsg = STATIC_ERR_MSG_TEMP + "age";
        assertEquals(expectedErrorMsg, error.toString());

    }
}
