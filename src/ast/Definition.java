package ast;

public abstract class Definition extends Node{
    protected VisibilityModifier visMod;
    protected String name;
    protected BasicType type;
    protected boolean isArrayType;

    public Definition(VisibilityModifier visMod, String name, BasicType type, boolean isArrayType) {
        this.visMod = visMod;
        this.name = name;
        this.type = type;
        this.isArrayType = isArrayType;
    }

    public VisibilityModifier getVisMod() {
        return visMod;
    }

    public String getName() {
        return name;
    }

    public BasicType getType() {
        return type;
    }

    public boolean isArrayType() {
        return isArrayType;
    }
}
