package ast;

import exception.InvalidClassVisibilityModifierException;

public class ClassStmt extends Node{
    private VisibilityModifier visMod;
    private ClassName name;

    public ClassStmt(VisibilityModifier visMod, String name) {
        this.visMod = visMod;
        this.name = new ClassName(name);
    }

    public VisibilityModifier getVisMod() {
        return visMod;
    }

    public String getName() {
        return this.name.getName();
    }

    @Override
    public <C, T> T accept(C context, ClassGenVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
