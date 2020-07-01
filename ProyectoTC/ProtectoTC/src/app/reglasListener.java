// Generated from /home/sofia/Documentos/Facu/LexerSimple (copia) (2)/src/app/reglas.g4 by ANTLR 4.7.1

    package app;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reglasParser}.
 */
public interface reglasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reglasParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(reglasParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(reglasParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(reglasParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(reglasParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void enterTipodato(reglasParser.TipodatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void exitTipodato(reglasParser.TipodatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#asignacionDatos}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionDatos(reglasParser.AsignacionDatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#asignacionDatos}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionDatos(reglasParser.AsignacionDatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#declaracionDatos}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionDatos(reglasParser.DeclaracionDatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#declaracionDatos}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionDatos(reglasParser.DeclaracionDatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprLog}.
	 * @param ctx the parse tree
	 */
	void enterExprLog(reglasParser.ExprLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprLog}.
	 * @param ctx the parse tree
	 */
	void exitExprLog(reglasParser.ExprLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprAND}.
	 * @param ctx the parse tree
	 */
	void enterExprAND(reglasParser.ExprANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprAND}.
	 * @param ctx the parse tree
	 */
	void exitExprAND(reglasParser.ExprANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprNOT}.
	 * @param ctx the parse tree
	 */
	void enterExprNOT(reglasParser.ExprNOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprNOT}.
	 * @param ctx the parse tree
	 */
	void exitExprNOT(reglasParser.ExprNOTContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(reglasParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(reglasParser.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprArit}.
	 * @param ctx the parse tree
	 */
	void enterExprArit(reglasParser.ExprAritContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprArit}.
	 * @param ctx the parse tree
	 */
	void exitExprArit(reglasParser.ExprAritContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(reglasParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(reglasParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(reglasParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(reglasParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(reglasParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(reglasParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion(reglasParser.DefinicionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion(reglasParser.DefinicionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(reglasParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(reglasParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void enterCicloFor(reglasParser.CicloForContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void exitCicloFor(reglasParser.CicloForContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloWhile(reglasParser.CicloWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloWhile(reglasParser.CicloWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#cicloIf}.
	 * @param ctx the parse tree
	 */
	void enterCicloIf(reglasParser.CicloIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#cicloIf}.
	 * @param ctx the parse tree
	 */
	void exitCicloIf(reglasParser.CicloIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#returnDatos}.
	 * @param ctx the parse tree
	 */
	void enterReturnDatos(reglasParser.ReturnDatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#returnDatos}.
	 * @param ctx the parse tree
	 */
	void exitReturnDatos(reglasParser.ReturnDatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPYC}.
	 * @param ctx the parse tree
	 */
	void enterErrorPYC(reglasParser.ErrorPYCContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPYC}.
	 * @param ctx the parse tree
	 */
	void exitErrorPYC(reglasParser.ErrorPYCContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPAFor}.
	 * @param ctx the parse tree
	 */
	void enterErrorPAFor(reglasParser.ErrorPAForContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPAFor}.
	 * @param ctx the parse tree
	 */
	void exitErrorPAFor(reglasParser.ErrorPAForContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPAWhile}.
	 * @param ctx the parse tree
	 */
	void enterErrorPAWhile(reglasParser.ErrorPAWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPAWhile}.
	 * @param ctx the parse tree
	 */
	void exitErrorPAWhile(reglasParser.ErrorPAWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPAIf}.
	 * @param ctx the parse tree
	 */
	void enterErrorPAIf(reglasParser.ErrorPAIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPAIf}.
	 * @param ctx the parse tree
	 */
	void exitErrorPAIf(reglasParser.ErrorPAIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPALlamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterErrorPALlamadaFuncion(reglasParser.ErrorPALlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPALlamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitErrorPALlamadaFuncion(reglasParser.ErrorPALlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPADefFuncion}.
	 * @param ctx the parse tree
	 */
	void enterErrorPADefFuncion(reglasParser.ErrorPADefFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPADefFuncion}.
	 * @param ctx the parse tree
	 */
	void exitErrorPADefFuncion(reglasParser.ErrorPADefFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPCFor}.
	 * @param ctx the parse tree
	 */
	void enterErrorPCFor(reglasParser.ErrorPCForContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPCFor}.
	 * @param ctx the parse tree
	 */
	void exitErrorPCFor(reglasParser.ErrorPCForContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPCWhile}.
	 * @param ctx the parse tree
	 */
	void enterErrorPCWhile(reglasParser.ErrorPCWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPCWhile}.
	 * @param ctx the parse tree
	 */
	void exitErrorPCWhile(reglasParser.ErrorPCWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPCIf}.
	 * @param ctx the parse tree
	 */
	void enterErrorPCIf(reglasParser.ErrorPCIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPCIf}.
	 * @param ctx the parse tree
	 */
	void exitErrorPCIf(reglasParser.ErrorPCIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPCLlamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterErrorPCLlamadaFuncion(reglasParser.ErrorPCLlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPCLlamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitErrorPCLlamadaFuncion(reglasParser.ErrorPCLlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#errorPCDefFuncion}.
	 * @param ctx the parse tree
	 */
	void enterErrorPCDefFuncion(reglasParser.ErrorPCDefFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#errorPCDefFuncion}.
	 * @param ctx the parse tree
	 */
	void exitErrorPCDefFuncion(reglasParser.ErrorPCDefFuncionContext ctx);
}