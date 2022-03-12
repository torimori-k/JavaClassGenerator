package ast;

public class ConstructorDef extends Node{
    private String name;

    public ConstructorDef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <C, T> T accept(C context, ClassGenVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
