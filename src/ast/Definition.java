package ast;

public abstract class Definition extends Node{
    protected VisibilityModifier visMod;
    protected Name name;
    protected BasicType type;
    protected boolean isArrayType;

    public Definition(VisibilityModifier visMod, String name, BasicType type, boolean isArrayType) {
        this.visMod = visMod;
        this.name = new Name(name);
        this.type = type;
        this.isArrayType = isArrayType;
    }

    public VisibilityModifier getVisMod() {
        return visMod;
    }

    public String getName() {
        return this.name.getName();
    }

    public BasicType getType() {
        return type;
    }

    public boolean isArrayType() {
        return isArrayType;
    }

    @Override
    public String toString() {
        return "Definition{" +
                "visMod=" + visMod +
                ", name=" + name +
                ", type=" + type +
                ", isArrayType=" + isArrayType +
                '}';
    }
}
