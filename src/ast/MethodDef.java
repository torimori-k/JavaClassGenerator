package ast;

public class MethodDef extends Definition {

    public MethodDef(VisibilityModifier visMod, String name, BasicType returnType, boolean isArrayType) {
        super(visMod, name, returnType, isArrayType);
    }

    @Override
    public <C, T> T accept(C context, ClassGenVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
