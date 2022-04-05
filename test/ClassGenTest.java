import ast.Program;
import ast.StaticAttributeDecValidator;
import jdk.jshell.spi.ExecutionControl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import ui.Main;

import java.io.File;
import java.util.HashMap;

public class ClassGenTest {
    @Rule
    public TestName name = new TestName();

    private StaticAttributeDecValidator validator;
    private String error;

    @Before
    public void before() {
        // TODO: resume from here
        validator = new StaticAttributeDecValidator();
        String filepath = "./test_input/";
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
//        Program program = Main.parseInput(filepath);
//        error = validator.visit(new HashMap<>(), program);
    }

    @Test
    public void testValidAll() {
        Assert.assertTrue(true);
    }

    @Test
    public void testInvalidParseAllEmpty() {
        Assert.assertFalse(false);
    }

    @Test
    public void testInvalidSemTentative() {
        Assert.assertFalse(false);
    }
}
