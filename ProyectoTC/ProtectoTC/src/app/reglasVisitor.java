// Generated from /home/sofia/Documentos/Facu/LexerSimple (copia) (2)/src/app/reglas.g4 by ANTLR 4.7.1

    package app;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reglasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reglasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reglasParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(reglasParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(reglasParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#tipodato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodato(reglasParser.TipodatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#asignacionDatos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionDatos(reglasParser.AsignacionDatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#declaracionDatos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionDatos(reglasParser.DeclaracionDatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLog(reglasParser.ExprLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprAND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAND(reglasParser.ExprANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprNOT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNOT(reglasParser.ExprNOTContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(reglasParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArit(reglasParser.ExprAritContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(reglasParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(reglasParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(reglasParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#definicionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionFuncion(reglasParser.DefinicionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(reglasParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#cicloFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFor(reglasParser.CicloForContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#cicloWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(reglasParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#cicloIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloIf(reglasParser.CicloIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#returnDatos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDatos(reglasParser.ReturnDatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPYC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPYC(reglasParser.ErrorPYCContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPAFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPAFor(reglasParser.ErrorPAForContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPAWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPAWhile(reglasParser.ErrorPAWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPAIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPAIf(reglasParser.ErrorPAIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPALlamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPALlamadaFuncion(reglasParser.ErrorPALlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPADefFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPADefFuncion(reglasParser.ErrorPADefFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPCFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPCFor(reglasParser.ErrorPCForContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPCWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPCWhile(reglasParser.ErrorPCWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPCIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPCIf(reglasParser.ErrorPCIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPCLlamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPCLlamadaFuncion(reglasParser.ErrorPCLlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#errorPCDefFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorPCDefFuncion(reglasParser.ErrorPCDefFuncionContext ctx);
}