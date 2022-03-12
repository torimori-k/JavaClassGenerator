package ast;

import java.util.List;

public class Program extends Node{

    private final ClassStmt classStmt;
    private final List<AttributeDef> attrStmt;
    private final List<ConstructorDef> constStmt;
    private final List<MethodDef> methodStmt;

    public Program(ClassStmt classStmt, List<AttributeDef> attrStmt, List<ConstructorDef> constStmt, List<MethodDef> methodStmt) {
        this.classStmt = classStmt;
        this.attrStmt = attrStmt;
        this.constStmt = constStmt;
        this.methodStmt = methodStmt;
    }

    public ClassStmt getClassStmt() {
        return classStmt;
    }

    public List<AttributeDef> getAttrStmt() {
        return attrStmt;
    }

    public List<ConstructorDef> getConstStmt() {
        return constStmt;
    }

    public List<MethodDef> getMethodStmt() {
        return methodStmt;
    }

    @Override
    public <C, T> T accept(C context, ClassGenVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
