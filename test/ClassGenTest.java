import ast.Program;
import ast.StaticAttributeDecValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import ui.Main;

import java.util.HashMap;

public class ClassGenTest {
    @Rule
    public TestName name = new TestName();

    private StaticAttributeDecValidator validator;
    private String error;

    @Before
    public void init() {
        // TODO: resume from here
        validator = new StaticAttributeDecValidator();
        String filepath = ""; // TODO: add a way to change the filename accordingly based on the test file input name
        Program program = Main.parseInput(filepath);
        error = validator.visit(new HashMap<>(), program);
    }

    @Test
    public void test() {
        Assert.assertTrue(true);
    }
}
