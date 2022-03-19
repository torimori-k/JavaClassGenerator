package ast;

public enum BasicType {
    BYTE("byte"), SHORT("short"), INT("int"),
    LONG("long"), FLOAT("float"), DOUBLE("double"), BOOLEAN("boolean"),
    CHAR("char"), STRING("String"), VOID("void");

    private String type_value;

    BasicType(String type_value) {
        this.type_value = type_value;
    }


}
