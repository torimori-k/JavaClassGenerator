// Generated from /Users/torimori/personal_project/java/JavaClassGenerator/src/parser/ClassGenParser.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassGenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClassGenParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ClassGenParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#class_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_stmt(ClassGenParser.Class_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(ClassGenParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_stmt(ClassGenParser.Attr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#attr_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_defs(ClassGenParser.Attr_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#attr_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_def(ClassGenParser.Attr_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#getter_setter_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_options(ClassGenParser.Getter_setter_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#const_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_stmt(ClassGenParser.Const_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#const_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_defs(ClassGenParser.Const_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#const_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_def(ClassGenParser.Const_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#method_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_stmt(ClassGenParser.Method_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#method_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_defs(ClassGenParser.Method_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#method_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_def(ClassGenParser.Method_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#class_visibility_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_visibility_mod(ClassGenParser.Class_visibility_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#visibility_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility_mod(ClassGenParser.Visibility_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#default_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_type(ClassGenParser.Default_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#arr_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_type(ClassGenParser.Arr_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassGenParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ClassGenParser.TypeContext ctx);
}