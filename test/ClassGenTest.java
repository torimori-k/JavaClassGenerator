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
    public void testValidAllEmpty(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidArrTypeAttr(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidArrTypeMethod(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidEmptyAttribute(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidEmptyConst(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidEmptyMethod(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidOtherVismodMethod(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testValidProtectedModifier(){
        assertTrue(error.isEmpty());
    }

    @Test
    public void testInvalidParseAllEmpty() {
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("The empty input.");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingColonAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingColonAttr.txt:2:10: missing ':' at '['");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingColonClass(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingColonClass.txt:1:6: missing ':' at '+'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingColonConst(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingColonConst.txt:3:12: missing ':' at '['");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingColonMethod(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingColonMethod.txt:4:7: missing ':' at '['");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingColonTypeAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingColonTypeAttr.txt:2:19: missing ':' at 'string'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingColonTypeMethod(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingColonTypeMethod.txt:4:15: missing ':' at 'void'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingGsAttribute(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingGsAttribute.txt:2:26: mismatched input ',' expecting '('");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingQuotesTextConst(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingQuotesTextConst.txt:3:14: token recognition error at: 'n'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingTypeAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingTypeAttr.txt:2:20: mismatched input '(' expecting {'byte', 'short', 'int', 'long', 'float', 'double', 'boolean', 'char', 'string', 'arr'}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseMissingTypeMethod(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseMissingTypeMethod.txt:4:16: mismatched input ',' expecting {'void', 'byte', 'short', 'int', 'long', 'float', 'double', 'boolean', 'char', 'string', 'arr'}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoAttr.txt:2:0: mismatched input 'constructor' expecting 'attribute'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoClass(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoClass.txt:1:0: mismatched input 'attribute' expecting 'class'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoCommaAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoCommaAttr.txt:2:29: mismatched input '\"' expecting {']', ','}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoCommaConst(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoCommaConst.txt:3:21: mismatched input '\"' expecting {']', ','}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoCommaMethod(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoCommaMethod.txt:4:21: mismatched input '\"' expecting {']', ','}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoConst(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoConst.txt:3:0: mismatched input 'method' expecting {']', ','}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoMethod(){
        expectedException.expect(ParseCancellationException.class);
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseNoQuotesName(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseNoQuotesName.txt:1:8: token recognition error at: 'B'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseProtectedVismodClass(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseProtectedVismodClass.txt:1:7: extraneous input '#' expecting {START_DOUBLE_QUOTE, '+', '-'}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseTypeAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseTypeAttr.txt:2:20: token recognition error at: 'inv'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseTypeMethod(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseTypeMethod.txt:4:16: token recognition error at: 'inv'");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidParseVoidTypeAttr(){
        expectedException.expect(ParseCancellationException.class);
        expectedException.expectMessage("./test_input/invalidParse/testInvalidParseVoidTypeAttr.txt:2:20: mismatched input 'void' expecting {'byte', 'short', 'int', 'long', 'float', 'double', 'boolean', 'char', 'string', 'arr'}");
        error = validator.visit(new HashMap<>(), Main.parseInput(filepath));
    }

    @Test
    public void testInvalidSemConstInvalidAttr() {
        assertFalse(error.isEmpty());
        assertTrue(error.contains("age"));

    }

    @Test
    public void testInvalidSemMultiInvalidAttrs() {
        assertFalse(error.isEmpty());
        assertTrue(error.contains("age") && error.contains("height"));

    }

    @Test
    public void testInvalidSemMultiUndecAttrs() {
        assertFalse(error.isEmpty());
        assertTrue(error.contains("age") && error.contains("name"));

    }

    @Test
    public void testInvalidSemSingleUndecAttr() {
        assertFalse(error.isEmpty());
        assertTrue(error.contains("name"));

    }

}
