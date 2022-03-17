package ast;

import exception.InvalidVisibilityModifierExcpeption;

public enum VisibilityModifier {
    PUBLIC("public"), PRIVATE("private"), PROTECTED("protected"), DEFAULT("");

    private String value;

    VisibilityModifier(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * A function to check if the input is a valid visibility modifier
     * and to return the corresponding instance of visibility modifier
     * @param input: String
     * @return newly created visibility modifier based on the input
     */
    public static VisibilityModifier getVisMod(String input) throws InvalidVisibilityModifierExcpeption {
        switch(input) {
            case "+": return VisibilityModifier.PUBLIC;
            case "-": return VisibilityModifier.PRIVATE;
            case "#": return VisibilityModifier.PROTECTED;
            case "": return VisibilityModifier.DEFAULT;
            default: break;
        }
        throw new InvalidVisibilityModifierExcpeption();
    }
}
