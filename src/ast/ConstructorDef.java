package ast;

public class ConstructorDef extends Node{
    private Name name;

    public ConstructorDef(String name) {
        this.name = new Name(name);
    }

    public String getName() {
        return this.name.getName();
    }

    @Override
    public <C, T> T accept(C context, ClassGenVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
