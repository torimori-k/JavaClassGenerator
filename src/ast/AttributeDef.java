package ast;

public class AttributeDef extends Definition{

    private boolean hasGetter;
    private boolean hasSetter;

    public AttributeDef(VisibilityModifier visMod, String name, BasicType type, boolean isArrayType, boolean hasGetter, boolean hasSetter) {
        super(visMod, name, type, isArrayType);
        this.hasGetter = hasGetter;
        this.hasSetter = hasSetter;
    }

    public boolean hasGetter() {
        return hasGetter;
    }

    public boolean hasSetter() {
        return hasSetter;
    }

    @Override
    public <C, T> T accept(C context, ClassGenVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
