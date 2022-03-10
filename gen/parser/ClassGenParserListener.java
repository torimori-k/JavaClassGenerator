// Generated from /Users/torimori/personal_project/java/JavaClassGenerator/src/parser/ClassGenParser.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClassGenParser}.
 */
public interface ClassGenParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ClassGenParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ClassGenParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass_stmt(ClassGenParser.Class_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass_stmt(ClassGenParser.Class_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(ClassGenParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(ClassGenParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(ClassGenParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(ClassGenParser.Attr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#attr_defs}.
	 * @param ctx the parse tree
	 */
	void enterAttr_defs(ClassGenParser.Attr_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#attr_defs}.
	 * @param ctx the parse tree
	 */
	void exitAttr_defs(ClassGenParser.Attr_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#opt_attr_defs}.
	 * @param ctx the parse tree
	 */
	void enterOpt_attr_defs(ClassGenParser.Opt_attr_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#opt_attr_defs}.
	 * @param ctx the parse tree
	 */
	void exitOpt_attr_defs(ClassGenParser.Opt_attr_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#attr_def}.
	 * @param ctx the parse tree
	 */
	void enterAttr_def(ClassGenParser.Attr_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#attr_def}.
	 * @param ctx the parse tree
	 */
	void exitAttr_def(ClassGenParser.Attr_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#getter_setter_options}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_options(ClassGenParser.Getter_setter_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#getter_setter_options}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_options(ClassGenParser.Getter_setter_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#const_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConst_stmt(ClassGenParser.Const_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#const_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConst_stmt(ClassGenParser.Const_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#const_defs}.
	 * @param ctx the parse tree
	 */
	void enterConst_defs(ClassGenParser.Const_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#const_defs}.
	 * @param ctx the parse tree
	 */
	void exitConst_defs(ClassGenParser.Const_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#opt_const_defs}.
	 * @param ctx the parse tree
	 */
	void enterOpt_const_defs(ClassGenParser.Opt_const_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#opt_const_defs}.
	 * @param ctx the parse tree
	 */
	void exitOpt_const_defs(ClassGenParser.Opt_const_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#const_def}.
	 * @param ctx the parse tree
	 */
	void enterConst_def(ClassGenParser.Const_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#const_def}.
	 * @param ctx the parse tree
	 */
	void exitConst_def(ClassGenParser.Const_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#method_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMethod_stmt(ClassGenParser.Method_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#method_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMethod_stmt(ClassGenParser.Method_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#method_defs}.
	 * @param ctx the parse tree
	 */
	void enterMethod_defs(ClassGenParser.Method_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#method_defs}.
	 * @param ctx the parse tree
	 */
	void exitMethod_defs(ClassGenParser.Method_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#opt_method_defs}.
	 * @param ctx the parse tree
	 */
	void enterOpt_method_defs(ClassGenParser.Opt_method_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#opt_method_defs}.
	 * @param ctx the parse tree
	 */
	void exitOpt_method_defs(ClassGenParser.Opt_method_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#method_def}.
	 * @param ctx the parse tree
	 */
	void enterMethod_def(ClassGenParser.Method_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#method_def}.
	 * @param ctx the parse tree
	 */
	void exitMethod_def(ClassGenParser.Method_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#name_exp}.
	 * @param ctx the parse tree
	 */
	void enterName_exp(ClassGenParser.Name_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#name_exp}.
	 * @param ctx the parse tree
	 */
	void exitName_exp(ClassGenParser.Name_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#class_visibility_mod}.
	 * @param ctx the parse tree
	 */
	void enterClass_visibility_mod(ClassGenParser.Class_visibility_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#class_visibility_mod}.
	 * @param ctx the parse tree
	 */
	void exitClass_visibility_mod(ClassGenParser.Class_visibility_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#visibility_mod}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_mod(ClassGenParser.Visibility_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#visibility_mod}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_mod(ClassGenParser.Visibility_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#arr_type}.
	 * @param ctx the parse tree
	 */
	void enterArr_type(ClassGenParser.Arr_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#arr_type}.
	 * @param ctx the parse tree
	 */
	void exitArr_type(ClassGenParser.Arr_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#attr_type}.
	 * @param ctx the parse tree
	 */
	void enterAttr_type(ClassGenParser.Attr_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#attr_type}.
	 * @param ctx the parse tree
	 */
	void exitAttr_type(ClassGenParser.Attr_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#method_type}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type(ClassGenParser.Method_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#method_type}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type(ClassGenParser.Method_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#return_basic_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_basic_type(ClassGenParser.Return_basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#return_basic_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_basic_type(ClassGenParser.Return_basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassGenParser#var_basic_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_basic_type(ClassGenParser.Var_basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassGenParser#var_basic_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_basic_type(ClassGenParser.Var_basic_typeContext ctx);
}