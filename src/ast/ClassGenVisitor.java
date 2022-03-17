package ast;

public interface ClassGenVisitor <C, T>{
    T visit(C context, AttributeDef attributeDef);
    T visit(C context, ClassStmt classStmt);
    T visit(C context, ConstructorDef constDef);
    T visit(C context, MethodDef methodDef);
    T visit(C context, Program program);
    T visit(C context, Name name);
}
