// Generated from /home/sofia/Documentos/Facu/LexerSimple (copia) (2)/src/app/reglas.g4 by ANTLR 4.7.1

    package app;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class reglasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PA=2, PC=3, LA=4, LC=5, CA=6, CC=7, SUM=8, RES=9, MUL=10, DIV=11, 
		MOD=12, INCREMENT=13, DECREMENT=14, EQ=15, MAY=16, MEN=17, MAYIG=18, MENIG=19, 
		DIS=20, OR=21, AND=22, NOT=23, TRUE=24, FALSE=25, MASIGUAL=26, MENOSIGUAL=27, 
		PORIGUAL=28, BARRAIGUAL=29, MODULOIGUAL=30, IGUAL=31, INT=32, CHAR=33, 
		DOUBLE=34, VOID=35, FOR=36, IF=37, WHILE=38, ELSE=39, COMA=40, PYC=41, 
		RETURN=42, ID=43, NUMERO=44, CARACTER=45, VALORCHAR=46, NUMDOUBLE=47;
	public static final int
		RULE_prog = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_tipodato = 4, RULE_asignacionDatos = 5, RULE_declaracionDatos = 6, 
		RULE_asignacion = 7, RULE_exprLog = 8, RULE_exprAND = 9, RULE_exprNOT = 10, 
		RULE_exprComp = 11, RULE_exprArit = 12, RULE_factor = 13, RULE_expresion = 14, 
		RULE_f = 15, RULE_definicionFuncion = 16, RULE_parametros = 17, RULE_llamadaFuncion = 18, 
		RULE_cicloFor = 19, RULE_cicloWhile = 20, RULE_cicloIf = 21, RULE_returnDatos = 22, 
		RULE_errorPYC = 23, RULE_errorPAFor = 24, RULE_errorPAWhile = 25, RULE_errorPAIf = 26, 
		RULE_errorPALlamadaFuncion = 27, RULE_errorPADefFuncion = 28, RULE_errorPCFor = 29, 
		RULE_errorPCWhile = 30, RULE_errorPCIf = 31, RULE_errorPCLlamadaFuncion = 32, 
		RULE_errorPCDefFuncion = 33;
	public static final String[] ruleNames = {
		"prog", "instrucciones", "instruccion", "bloque", "tipodato", "asignacionDatos", 
		"declaracionDatos", "asignacion", "exprLog", "exprAND", "exprNOT", "exprComp", 
		"exprArit", "factor", "expresion", "f", "definicionFuncion", "parametros", 
		"llamadaFuncion", "cicloFor", "cicloWhile", "cicloIf", "returnDatos", 
		"errorPYC", "errorPAFor", "errorPAWhile", "errorPAIf", "errorPALlamadaFuncion", 
		"errorPADefFuncion", "errorPCFor", "errorPCWhile", "errorPCIf", "errorPCLlamadaFuncion", 
		"errorPCDefFuncion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'++'", "'--'", "'=='", "'>'", "'<'", "'=>'", "'<='", "'!='", 
		"'||'", "'&&'", "'!'", "'true'", "'false'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'='", "'int'", "'char'", "'double'", "'void'", "'for'", "'if'", 
		"'while'", "'else'", "','", "';'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "PA", "PC", "LA", "LC", "CA", "CC", "SUM", "RES", "MUL", "DIV", 
		"MOD", "INCREMENT", "DECREMENT", "EQ", "MAY", "MEN", "MAYIG", "MENIG", 
		"DIS", "OR", "AND", "NOT", "TRUE", "FALSE", "MASIGUAL", "MENOSIGUAL", 
		"PORIGUAL", "BARRAIGUAL", "MODULOIGUAL", "IGUAL", "INT", "CHAR", "DOUBLE", 
		"VOID", "FOR", "IF", "WHILE", "ELSE", "COMA", "PYC", "RETURN", "ID", "NUMERO", 
		"CARACTER", "VALORCHAR", "NUMDOUBLE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public reglasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(reglasParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			instrucciones();
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case LA:
			case SUM:
			case RES:
			case NOT:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case FOR:
			case IF:
			case WHILE:
			case PYC:
			case RETURN:
			case ID:
			case NUMERO:
			case VALORCHAR:
			case NUMDOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				instruccion();
				setState(72);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclaracionDatosContext declaracionDatos() {
			return getRuleContext(DeclaracionDatosContext.class,0);
		}
		public TerminalNode PYC() { return getToken(reglasParser.PYC, 0); }
		public AsignacionDatosContext asignacionDatos() {
			return getRuleContext(AsignacionDatosContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DefinicionFuncionContext definicionFuncion() {
			return getRuleContext(DefinicionFuncionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public CicloForContext cicloFor() {
			return getRuleContext(CicloForContext.class,0);
		}
		public CicloWhileContext cicloWhile() {
			return getRuleContext(CicloWhileContext.class,0);
		}
		public CicloIfContext cicloIf() {
			return getRuleContext(CicloIfContext.class,0);
		}
		public ReturnDatosContext returnDatos() {
			return getRuleContext(ReturnDatosContext.class,0);
		}
		public ErrorPYCContext errorPYC() {
			return getRuleContext(ErrorPYCContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				declaracionDatos();
				setState(79);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				asignacionDatos();
				setState(82);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				expresion();
				setState(85);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				definicionFuncion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				llamadaFuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				cicloFor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				cicloWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				cicloIf();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				returnDatos();
				setState(93);
				match(PYC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				match(PYC);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(96);
				errorPYC();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(reglasParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(reglasParser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LA);
			setState(100);
			instrucciones();
			setState(101);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipodatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(reglasParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(reglasParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(reglasParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(reglasParser.VOID, 0); }
		public TipodatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterTipodato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitTipodato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitTipodato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipodato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << DOUBLE) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionDatosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsignacionDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionDatos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAsignacionDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAsignacionDatos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAsignacionDatos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionDatosContext asignacionDatos() throws RecognitionException {
		AsignacionDatosContext _localctx = new AsignacionDatosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacionDatos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(106);
			asignacion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionDatosContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionDatos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterDeclaracionDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitDeclaracionDatos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitDeclaracionDatos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionDatosContext declaracionDatos() throws RecognitionException {
		DeclaracionDatosContext _localctx = new DeclaracionDatosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracionDatos);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				tipodato();
				setState(109);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				tipodato();
				setState(112);
				match(ID);
				setState(113);
				asignacion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(reglasParser.IGUAL, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode MASIGUAL() { return getToken(reglasParser.MASIGUAL, 0); }
		public TerminalNode MENOSIGUAL() { return getToken(reglasParser.MENOSIGUAL, 0); }
		public TerminalNode PORIGUAL() { return getToken(reglasParser.PORIGUAL, 0); }
		public TerminalNode BARRAIGUAL() { return getToken(reglasParser.BARRAIGUAL, 0); }
		public TerminalNode MODULOIGUAL() { return getToken(reglasParser.MODULOIGUAL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(IGUAL);
				setState(118);
				exprLog(0);
				}
				break;
			case MASIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(MASIGUAL);
				setState(120);
				exprLog(0);
				}
				break;
			case MENOSIGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(MENOSIGUAL);
				setState(122);
				exprLog(0);
				}
				break;
			case PORIGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(PORIGUAL);
				setState(124);
				exprLog(0);
				}
				break;
			case BARRAIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(BARRAIGUAL);
				setState(126);
				exprLog(0);
				}
				break;
			case MODULOIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(MODULOIGUAL);
				setState(128);
				exprLog(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprLogContext extends ParserRuleContext {
		public ExprANDContext exprAND() {
			return getRuleContext(ExprANDContext.class,0);
		}
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode OR() { return getToken(reglasParser.OR, 0); }
		public ExprLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogContext exprLog() throws RecognitionException {
		return exprLog(0);
	}

	private ExprLogContext exprLog(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprLogContext _localctx = new ExprLogContext(_ctx, _parentState);
		ExprLogContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exprLog, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			exprAND(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprLogContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprLog);
					setState(134);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(135);
					match(OR);
					setState(136);
					exprAND(0);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprANDContext extends ParserRuleContext {
		public ExprNOTContext exprNOT() {
			return getRuleContext(ExprNOTContext.class,0);
		}
		public ExprANDContext exprAND() {
			return getRuleContext(ExprANDContext.class,0);
		}
		public TerminalNode AND() { return getToken(reglasParser.AND, 0); }
		public ExprANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprAND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprANDContext exprAND() throws RecognitionException {
		return exprAND(0);
	}

	private ExprANDContext exprAND(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprANDContext _localctx = new ExprANDContext(_ctx, _parentState);
		ExprANDContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exprAND, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			exprNOT();
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprANDContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprAND);
					setState(145);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(146);
					match(AND);
					setState(147);
					exprNOT();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprNOTContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(reglasParser.NOT, 0); }
		public ExprNOTContext exprNOT() {
			return getRuleContext(ExprNOTContext.class,0);
		}
		public ExprCompContext exprComp() {
			return getRuleContext(ExprCompContext.class,0);
		}
		public ExprNOTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNOT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprNOT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNOTContext exprNOT() throws RecognitionException {
		ExprNOTContext _localctx = new ExprNOTContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprNOT);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(NOT);
				setState(154);
				exprNOT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				exprComp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCompContext extends ParserRuleContext {
		public List<ExprAritContext> exprArit() {
			return getRuleContexts(ExprAritContext.class);
		}
		public ExprAritContext exprArit(int i) {
			return getRuleContext(ExprAritContext.class,i);
		}
		public TerminalNode EQ() { return getToken(reglasParser.EQ, 0); }
		public TerminalNode MAY() { return getToken(reglasParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(reglasParser.MEN, 0); }
		public TerminalNode MAYIG() { return getToken(reglasParser.MAYIG, 0); }
		public TerminalNode MENIG() { return getToken(reglasParser.MENIG, 0); }
		public TerminalNode DIS() { return getToken(reglasParser.DIS, 0); }
		public ExprCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCompContext exprComp() throws RecognitionException {
		ExprCompContext _localctx = new ExprCompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprComp);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				exprArit(0);
				setState(159);
				match(EQ);
				setState(160);
				exprArit(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				exprArit(0);
				setState(163);
				match(MAY);
				setState(164);
				exprArit(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				exprArit(0);
				setState(167);
				match(MEN);
				setState(168);
				exprArit(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				exprArit(0);
				setState(171);
				match(MAYIG);
				setState(172);
				exprArit(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				exprArit(0);
				setState(175);
				match(MENIG);
				setState(176);
				exprArit(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				exprArit(0);
				setState(179);
				match(DIS);
				setState(180);
				exprArit(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				exprArit(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAritContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExprAritContext> exprArit() {
			return getRuleContexts(ExprAritContext.class);
		}
		public ExprAritContext exprArit(int i) {
			return getRuleContext(ExprAritContext.class,i);
		}
		public TerminalNode SUM() { return getToken(reglasParser.SUM, 0); }
		public TerminalNode RES() { return getToken(reglasParser.RES, 0); }
		public TerminalNode MUL() { return getToken(reglasParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(reglasParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(reglasParser.MOD, 0); }
		public ExprAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprArit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprArit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprArit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritContext exprArit() throws RecognitionException {
		return exprArit(0);
	}

	private ExprAritContext exprArit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprAritContext _localctx = new ExprAritContext(_ctx, _parentState);
		ExprAritContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exprArit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprArit);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189);
						match(SUM);
						setState(190);
						exprArit(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprArit);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						match(RES);
						setState(193);
						exprArit(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprAritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprArit);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(MUL);
						setState(196);
						exprArit(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprAritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprArit);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(DIV);
						setState(199);
						exprArit(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprAritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprArit);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						match(MOD);
						setState(202);
						exprArit(3);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(reglasParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode NUMDOUBLE() { return getToken(reglasParser.NUMDOUBLE, 0); }
		public TerminalNode VALORCHAR() { return getToken(reglasParser.VALORCHAR, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				f();
				setState(209);
				match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				f();
				setState(212);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				f();
				setState(215);
				match(NUMDOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				f();
				setState(218);
				match(VALORCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(PA);
				setState(221);
				expresion();
				setState(222);
				match(PC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode MASIGUAL() { return getToken(reglasParser.MASIGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode MENOSIGUAL() { return getToken(reglasParser.MENOSIGUAL, 0); }
		public TerminalNode PORIGUAL() { return getToken(reglasParser.PORIGUAL, 0); }
		public TerminalNode BARRAIGUAL() { return getToken(reglasParser.BARRAIGUAL, 0); }
		public TerminalNode MODULOIGUAL() { return getToken(reglasParser.MODULOIGUAL, 0); }
		public TerminalNode INCREMENT() { return getToken(reglasParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(reglasParser.DECREMENT, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expresion);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				setState(227);
				match(MASIGUAL);
				setState(228);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(ID);
				setState(230);
				match(MENOSIGUAL);
				setState(231);
				expresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(ID);
				setState(233);
				match(PORIGUAL);
				setState(234);
				expresion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(ID);
				setState(236);
				match(BARRAIGUAL);
				setState(237);
				expresion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(ID);
				setState(239);
				match(MODULOIGUAL);
				setState(240);
				expresion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				match(ID);
				setState(242);
				match(INCREMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				match(ID);
				setState(244);
				match(DECREMENT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				exprLog(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(reglasParser.SUM, 0); }
		public TerminalNode RES() { return getToken(reglasParser.RES, 0); }
		public TerminalNode NOT() { return getToken(reglasParser.NOT, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_f);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(SUM);
				}
				break;
			case RES:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(RES);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(NOT);
				}
				break;
			case ID:
			case NUMERO:
			case VALORCHAR:
			case NUMDOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPADefFuncionContext errorPADefFuncion() {
			return getRuleContext(ErrorPADefFuncionContext.class,0);
		}
		public ErrorPCDefFuncionContext errorPCDefFuncion() {
			return getRuleContext(ErrorPCDefFuncionContext.class,0);
		}
		public DefinicionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterDefinicionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitDefinicionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitDefinicionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionFuncionContext definicionFuncion() throws RecognitionException {
		DefinicionFuncionContext _localctx = new DefinicionFuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definicionFuncion);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				tipodato();
				setState(255);
				match(ID);
				setState(256);
				match(PA);
				setState(257);
				parametros();
				setState(258);
				match(PC);
				setState(259);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				errorPADefFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				errorPCDefFuncion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode COMA() { return getToken(reglasParser.COMA, 0); }
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametros);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				tipodato();
				setState(266);
				match(ID);
				setState(267);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(COMA);
				setState(270);
				tipodato();
				setState(271);
				match(ID);
				setState(272);
				parametros();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(COMA);
				setState(275);
				match(ID);
				setState(276);
				parametros();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(ID);
				setState(278);
				parametros();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public ErrorPALlamadaFuncionContext errorPALlamadaFuncion() {
			return getRuleContext(ErrorPALlamadaFuncionContext.class,0);
		}
		public ErrorPCLlamadaFuncionContext errorPCLlamadaFuncion() {
			return getRuleContext(ErrorPCLlamadaFuncionContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamadaFuncion);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(ID);
				setState(283);
				match(PA);
				setState(284);
				parametros();
				setState(285);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				errorPALlamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				errorPCLlamadaFuncion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(reglasParser.FOR, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public DeclaracionDatosContext declaracionDatos() {
			return getRuleContext(DeclaracionDatosContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(reglasParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(reglasParser.PYC, i);
		}
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPAForContext errorPAFor() {
			return getRuleContext(ErrorPAForContext.class,0);
		}
		public ErrorPCForContext errorPCFor() {
			return getRuleContext(ErrorPCForContext.class,0);
		}
		public CicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterCicloFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitCicloFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitCicloFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloForContext cicloFor() throws RecognitionException {
		CicloForContext _localctx = new CicloForContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cicloFor);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(FOR);
				setState(292);
				match(PA);
				setState(293);
				declaracionDatos();
				setState(294);
				match(PYC);
				setState(295);
				exprLog(0);
				setState(296);
				match(PYC);
				setState(297);
				expresion();
				setState(298);
				match(PC);
				setState(299);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				errorPAFor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				errorPCFor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(reglasParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPAWhileContext errorPAWhile() {
			return getRuleContext(ErrorPAWhileContext.class,0);
		}
		public ErrorPCWhileContext errorPCWhile() {
			return getRuleContext(ErrorPCWhileContext.class,0);
		}
		public CicloWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterCicloWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitCicloWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitCicloWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloWhileContext cicloWhile() throws RecognitionException {
		CicloWhileContext _localctx = new CicloWhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cicloWhile);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(WHILE);
				setState(306);
				match(PA);
				setState(307);
				exprLog(0);
				setState(308);
				match(PC);
				setState(309);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				errorPAWhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				errorPCWhile();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(reglasParser.IF, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(reglasParser.ELSE, 0); }
		public ErrorPAIfContext errorPAIf() {
			return getRuleContext(ErrorPAIfContext.class,0);
		}
		public ErrorPCIfContext errorPCIf() {
			return getRuleContext(ErrorPCIfContext.class,0);
		}
		public CicloIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterCicloIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitCicloIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitCicloIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloIfContext cicloIf() throws RecognitionException {
		CicloIfContext _localctx = new CicloIfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cicloIf);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(IF);
				setState(316);
				match(PA);
				setState(317);
				exprLog(0);
				setState(318);
				match(PC);
				setState(319);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(IF);
				setState(322);
				match(PA);
				setState(323);
				exprLog(0);
				setState(324);
				match(PC);
				setState(325);
				instruccion();
				setState(326);
				match(ELSE);
				setState(327);
				instruccion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				errorPAIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				errorPCIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnDatosContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(reglasParser.RETURN, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public ReturnDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDatos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterReturnDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitReturnDatos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitReturnDatos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDatosContext returnDatos() throws RecognitionException {
		ReturnDatosContext _localctx = new ReturnDatosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnDatos);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(RETURN);
				setState(334);
				exprLog(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(RETURN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPYCContext extends ParserRuleContext {
		public DeclaracionDatosContext declaracionDatos() {
			return getRuleContext(DeclaracionDatosContext.class,0);
		}
		public AsignacionDatosContext asignacionDatos() {
			return getRuleContext(AsignacionDatosContext.class,0);
		}
		public DefinicionFuncionContext definicionFuncion() {
			return getRuleContext(DefinicionFuncionContext.class,0);
		}
		public ReturnDatosContext returnDatos() {
			return getRuleContext(ReturnDatosContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(reglasParser.PYC, 0); }
		public ErrorPYCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPYC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPYC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPYC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPYC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPYCContext errorPYC() throws RecognitionException {
		ErrorPYCContext _localctx = new ErrorPYCContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_errorPYC);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				declaracionDatos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				asignacionDatos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				definicionFuncion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				returnDatos();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				expresion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPAForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(reglasParser.FOR, 0); }
		public DeclaracionDatosContext declaracionDatos() {
			return getRuleContext(DeclaracionDatosContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(reglasParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(reglasParser.PYC, i);
		}
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPAForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPAFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPAFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPAFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPAFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPAForContext errorPAFor() throws RecognitionException {
		ErrorPAForContext _localctx = new ErrorPAForContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_errorPAFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(FOR);
			setState(347);
			declaracionDatos();
			setState(348);
			match(PYC);
			setState(349);
			exprLog(0);
			setState(350);
			match(PYC);
			setState(351);
			expresion();
			setState(352);
			match(PC);
			setState(353);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPAWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(reglasParser.WHILE, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPAWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPAWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPAWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPAWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPAWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPAWhileContext errorPAWhile() throws RecognitionException {
		ErrorPAWhileContext _localctx = new ErrorPAWhileContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_errorPAWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(WHILE);
			setState(356);
			exprLog(0);
			setState(357);
			match(PC);
			setState(358);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPAIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(reglasParser.IF, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(reglasParser.ELSE, 0); }
		public ErrorPAIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPAIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPAIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPAIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPAIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPAIfContext errorPAIf() throws RecognitionException {
		ErrorPAIfContext _localctx = new ErrorPAIfContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_errorPAIf);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(IF);
				setState(361);
				exprLog(0);
				setState(362);
				match(PC);
				setState(363);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(IF);
				setState(366);
				exprLog(0);
				setState(367);
				match(PC);
				setState(368);
				instruccion();
				setState(369);
				match(ELSE);
				setState(370);
				instruccion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPALlamadaFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPALlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPALlamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPALlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPALlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPALlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPALlamadaFuncionContext errorPALlamadaFuncion() throws RecognitionException {
		ErrorPALlamadaFuncionContext _localctx = new ErrorPALlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_errorPALlamadaFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			tipodato();
			setState(375);
			match(ID);
			setState(376);
			parametros();
			setState(377);
			match(PC);
			setState(378);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPADefFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPADefFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPADefFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPADefFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPADefFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPADefFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPADefFuncionContext errorPADefFuncion() throws RecognitionException {
		ErrorPADefFuncionContext _localctx = new ErrorPADefFuncionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_errorPADefFuncion);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				tipodato();
				setState(381);
				match(ID);
				setState(382);
				parametros();
				setState(383);
				match(PC);
				setState(384);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				tipodato();
				setState(387);
				match(ID);
				setState(388);
				parametros();
				setState(389);
				match(PC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPCForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(reglasParser.FOR, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public DeclaracionDatosContext declaracionDatos() {
			return getRuleContext(DeclaracionDatosContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(reglasParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(reglasParser.PYC, i);
		}
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPCForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPCFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPCFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPCFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPCFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPCForContext errorPCFor() throws RecognitionException {
		ErrorPCForContext _localctx = new ErrorPCForContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_errorPCFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(FOR);
			setState(394);
			match(PA);
			setState(395);
			declaracionDatos();
			setState(396);
			match(PYC);
			setState(397);
			exprLog(0);
			setState(398);
			match(PYC);
			setState(399);
			expresion();
			setState(400);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPCWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(reglasParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPCWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPCWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPCWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPCWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPCWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPCWhileContext errorPCWhile() throws RecognitionException {
		ErrorPCWhileContext _localctx = new ErrorPCWhileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_errorPCWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(WHILE);
			setState(403);
			match(PA);
			setState(404);
			exprLog(0);
			setState(405);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPCIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(reglasParser.IF, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(reglasParser.ELSE, 0); }
		public ErrorPCIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPCIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPCIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPCIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPCIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPCIfContext errorPCIf() throws RecognitionException {
		ErrorPCIfContext _localctx = new ErrorPCIfContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_errorPCIf);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(IF);
				setState(408);
				match(PA);
				setState(409);
				exprLog(0);
				setState(410);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(IF);
				setState(413);
				match(PA);
				setState(414);
				exprLog(0);
				setState(415);
				instruccion();
				setState(416);
				match(ELSE);
				setState(417);
				instruccion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPCLlamadaFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPCLlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPCLlamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPCLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPCLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPCLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPCLlamadaFuncionContext errorPCLlamadaFuncion() throws RecognitionException {
		ErrorPCLlamadaFuncionContext _localctx = new ErrorPCLlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_errorPCLlamadaFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			tipodato();
			setState(422);
			match(ID);
			setState(423);
			match(PA);
			setState(424);
			parametros();
			setState(425);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorPCDefFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ErrorPCDefFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorPCDefFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterErrorPCDefFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitErrorPCDefFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitErrorPCDefFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorPCDefFuncionContext errorPCDefFuncion() throws RecognitionException {
		ErrorPCDefFuncionContext _localctx = new ErrorPCDefFuncionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_errorPCDefFuncion);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				tipodato();
				setState(428);
				match(ID);
				setState(429);
				match(PA);
				setState(430);
				parametros();
				setState(431);
				instruccion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(ID);
				setState(434);
				match(PA);
				setState(435);
				parametros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exprLog_sempred((ExprLogContext)_localctx, predIndex);
		case 9:
			return exprAND_sempred((ExprANDContext)_localctx, predIndex);
		case 12:
			return exprArit_sempred((ExprAritContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprLog_sempred(ExprLogContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprAND_sempred(ExprANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprArit_sempred(ExprAritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01b9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bv\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\f\3\f\3\f"+
		"\5\f\u009f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e3"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00ff\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010a"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u011b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0124"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0132\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u014e\n\27\3\30\3\30\3\30\5\30\u0153\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u015b\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0177\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018a\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u01a6\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u01b7\n#\3#\2\5\22\24\32$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2\"%\2\u01dd\2F\3\2"+
		"\2\2\4M\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16u\3\2\2"+
		"\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u0090\3\2\2\2\26\u009e\3\2\2\2"+
		"\30\u00b9\3\2\2\2\32\u00bb\3\2\2\2\34\u00e2\3\2\2\2\36\u00f8\3\2\2\2 "+
		"\u00fe\3\2\2\2\"\u0109\3\2\2\2$\u011a\3\2\2\2&\u0123\3\2\2\2(\u0131\3"+
		"\2\2\2*\u013b\3\2\2\2,\u014d\3\2\2\2.\u0152\3\2\2\2\60\u015a\3\2\2\2\62"+
		"\u015c\3\2\2\2\64\u0165\3\2\2\2\66\u0176\3\2\2\28\u0178\3\2\2\2:\u0189"+
		"\3\2\2\2<\u018b\3\2\2\2>\u0194\3\2\2\2@\u01a5\3\2\2\2B\u01a7\3\2\2\2D"+
		"\u01b6\3\2\2\2FG\5\4\3\2GH\7\2\2\3H\3\3\2\2\2IJ\5\6\4\2JK\5\4\3\2KN\3"+
		"\2\2\2LN\3\2\2\2MI\3\2\2\2ML\3\2\2\2N\5\3\2\2\2Od\5\b\5\2PQ\5\16\b\2Q"+
		"R\7+\2\2Rd\3\2\2\2ST\5\f\7\2TU\7+\2\2Ud\3\2\2\2VW\5\36\20\2WX\7+\2\2X"+
		"d\3\2\2\2Yd\5\"\22\2Zd\5&\24\2[d\5(\25\2\\d\5*\26\2]d\5,\27\2^_\5.\30"+
		"\2_`\7+\2\2`d\3\2\2\2ad\7+\2\2bd\5\60\31\2cO\3\2\2\2cP\3\2\2\2cS\3\2\2"+
		"\2cV\3\2\2\2cY\3\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2"+
		"\2\2ca\3\2\2\2cb\3\2\2\2d\7\3\2\2\2ef\7\6\2\2fg\5\4\3\2gh\7\7\2\2h\t\3"+
		"\2\2\2ij\t\2\2\2j\13\3\2\2\2kl\7-\2\2lm\5\20\t\2m\r\3\2\2\2no\5\n\6\2"+
		"op\7-\2\2pv\3\2\2\2qr\5\n\6\2rs\7-\2\2st\5\20\t\2tv\3\2\2\2un\3\2\2\2"+
		"uq\3\2\2\2v\17\3\2\2\2wx\7!\2\2x\u0084\5\22\n\2yz\7\34\2\2z\u0084\5\22"+
		"\n\2{|\7\35\2\2|\u0084\5\22\n\2}~\7\36\2\2~\u0084\5\22\n\2\177\u0080\7"+
		"\37\2\2\u0080\u0084\5\22\n\2\u0081\u0082\7 \2\2\u0082\u0084\5\22\n\2\u0083"+
		"w\3\2\2\2\u0083y\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\b\n\1\2\u0086\u0087"+
		"\5\24\13\2\u0087\u008d\3\2\2\2\u0088\u0089\f\4\2\2\u0089\u008a\7\27\2"+
		"\2\u008a\u008c\5\24\13\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\23\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\b\13\1\2\u0091\u0092\5\26\f\2\u0092\u0098\3\2\2\2\u0093"+
		"\u0094\f\4\2\2\u0094\u0095\7\30\2\2\u0095\u0097\5\26\f\2\u0096\u0093\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\25\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\31\2\2\u009c\u009f\5\26"+
		"\f\2\u009d\u009f\5\30\r\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\27\3\2\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5\32"+
		"\16\2\u00a3\u00ba\3\2\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\7\22\2\2\u00a6"+
		"\u00a7\5\32\16\2\u00a7\u00ba\3\2\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa"+
		"\7\23\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ba\3\2\2\2\u00ac\u00ad\5\32\16"+
		"\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\5\32\16\2\u00af\u00ba\3\2\2\2\u00b0"+
		"\u00b1\5\32\16\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00ba"+
		"\3\2\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\32\16"+
		"\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00a0\3\2\2\2\u00b9"+
		"\u00a4\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9\u00b0\3\2"+
		"\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00bc"+
		"\b\16\1\2\u00bc\u00bd\5\34\17\2\u00bd\u00cf\3\2\2\2\u00be\u00bf\f\b\2"+
		"\2\u00bf\u00c0\7\n\2\2\u00c0\u00ce\5\32\16\t\u00c1\u00c2\f\7\2\2\u00c2"+
		"\u00c3\7\13\2\2\u00c3\u00ce\5\32\16\b\u00c4\u00c5\f\6\2\2\u00c5\u00c6"+
		"\7\f\2\2\u00c6\u00ce\5\32\16\7\u00c7\u00c8\f\5\2\2\u00c8\u00c9\7\r\2\2"+
		"\u00c9\u00ce\5\32\16\6\u00ca\u00cb\f\4\2\2\u00cb\u00cc\7\16\2\2\u00cc"+
		"\u00ce\5\32\16\5\u00cd\u00be\3\2\2\2\u00cd\u00c1\3\2\2\2\u00cd\u00c4\3"+
		"\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\7.\2\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6"+
		"\5 \21\2\u00d6\u00d7\7-\2\2\u00d7\u00e3\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\7\61\2\2\u00da\u00e3\3\2\2\2\u00db\u00dc\5 \21\2\u00dc\u00dd\7"+
		"\60\2\2\u00dd\u00e3\3\2\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\5\36\20\2"+
		"\u00e0\u00e1\7\5\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e2\u00d5"+
		"\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3"+
		"\35\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\u00e6\7\34\2\2\u00e6\u00f9\5\36\20"+
		"\2\u00e7\u00e8\7-\2\2\u00e8\u00e9\7\35\2\2\u00e9\u00f9\5\36\20\2\u00ea"+
		"\u00eb\7-\2\2\u00eb\u00ec\7\36\2\2\u00ec\u00f9\5\36\20\2\u00ed\u00ee\7"+
		"-\2\2\u00ee\u00ef\7\37\2\2\u00ef\u00f9\5\36\20\2\u00f0\u00f1\7-\2\2\u00f1"+
		"\u00f2\7 \2\2\u00f2\u00f9\5\36\20\2\u00f3\u00f4\7-\2\2\u00f4\u00f9\7\17"+
		"\2\2\u00f5\u00f6\7-\2\2\u00f6\u00f9\7\20\2\2\u00f7\u00f9\5\22\n\2\u00f8"+
		"\u00e4\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f8\u00ed\3\2"+
		"\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00ff\7\n\2\2\u00fb\u00ff\7\13\2"+
		"\2\u00fc\u00ff\7\31\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe"+
		"\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff!\3\2\2\2"+
		"\u0100\u0101\5\n\6\2\u0101\u0102\7-\2\2\u0102\u0103\7\4\2\2\u0103\u0104"+
		"\5$\23\2\u0104\u0105\7\5\2\2\u0105\u0106\5\6\4\2\u0106\u010a\3\2\2\2\u0107"+
		"\u010a\5:\36\2\u0108\u010a\5D#\2\u0109\u0100\3\2\2\2\u0109\u0107\3\2\2"+
		"\2\u0109\u0108\3\2\2\2\u010a#\3\2\2\2\u010b\u010c\5\n\6\2\u010c\u010d"+
		"\7-\2\2\u010d\u010e\5$\23\2\u010e\u011b\3\2\2\2\u010f\u0110\7*\2\2\u0110"+
		"\u0111\5\n\6\2\u0111\u0112\7-\2\2\u0112\u0113\5$\23\2\u0113\u011b\3\2"+
		"\2\2\u0114\u0115\7*\2\2\u0115\u0116\7-\2\2\u0116\u011b\5$\23\2\u0117\u0118"+
		"\7-\2\2\u0118\u011b\5$\23\2\u0119\u011b\3\2\2\2\u011a\u010b\3\2\2\2\u011a"+
		"\u010f\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b%\3\2\2\2\u011c\u011d\7-\2\2\u011d\u011e\7\4\2\2\u011e\u011f"+
		"\5$\23\2\u011f\u0120\7\5\2\2\u0120\u0124\3\2\2\2\u0121\u0124\58\35\2\u0122"+
		"\u0124\5B\"\2\u0123\u011c\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\'\3\2\2\2\u0125\u0126\7&\2\2\u0126\u0127\7\4\2\2\u0127\u0128"+
		"\5\16\b\2\u0128\u0129\7+\2\2\u0129\u012a\5\22\n\2\u012a\u012b\7+\2\2\u012b"+
		"\u012c\5\36\20\2\u012c\u012d\7\5\2\2\u012d\u012e\5\6\4\2\u012e\u0132\3"+
		"\2\2\2\u012f\u0132\5\62\32\2\u0130\u0132\5<\37\2\u0131\u0125\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132)\3\2\2\2\u0133\u0134\7(\2\2\u0134"+
		"\u0135\7\4\2\2\u0135\u0136\5\22\n\2\u0136\u0137\7\5\2\2\u0137\u0138\5"+
		"\6\4\2\u0138\u013c\3\2\2\2\u0139\u013c\5\64\33\2\u013a\u013c\5> \2\u013b"+
		"\u0133\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c+\3\2\2\2"+
		"\u013d\u013e\7\'\2\2\u013e\u013f\7\4\2\2\u013f\u0140\5\22\n\2\u0140\u0141"+
		"\7\5\2\2\u0141\u0142\5\6\4\2\u0142\u014e\3\2\2\2\u0143\u0144\7\'\2\2\u0144"+
		"\u0145\7\4\2\2\u0145\u0146\5\22\n\2\u0146\u0147\7\5\2\2\u0147\u0148\5"+
		"\6\4\2\u0148\u0149\7)\2\2\u0149\u014a\5\6\4\2\u014a\u014e\3\2\2\2\u014b"+
		"\u014e\5\66\34\2\u014c\u014e\5@!\2\u014d\u013d\3\2\2\2\u014d\u0143\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e-\3\2\2\2\u014f\u0150"+
		"\7,\2\2\u0150\u0153\5\22\n\2\u0151\u0153\7,\2\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153/\3\2\2\2\u0154\u015b\5\16\b\2\u0155\u015b\5\f\7\2"+
		"\u0156\u015b\5\"\22\2\u0157\u015b\5.\30\2\u0158\u015b\5\36\20\2\u0159"+
		"\u015b\7+\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2"+
		"\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\61\3\2\2\2\u015c\u015d\7&\2\2\u015d\u015e\5\16\b\2\u015e\u015f\7+\2\2"+
		"\u015f\u0160\5\22\n\2\u0160\u0161\7+\2\2\u0161\u0162\5\36\20\2\u0162\u0163"+
		"\7\5\2\2\u0163\u0164\5\6\4\2\u0164\63\3\2\2\2\u0165\u0166\7(\2\2\u0166"+
		"\u0167\5\22\n\2\u0167\u0168\7\5\2\2\u0168\u0169\5\6\4\2\u0169\65\3\2\2"+
		"\2\u016a\u016b\7\'\2\2\u016b\u016c\5\22\n\2\u016c\u016d\7\5\2\2\u016d"+
		"\u016e\5\6\4\2\u016e\u0177\3\2\2\2\u016f\u0170\7\'\2\2\u0170\u0171\5\22"+
		"\n\2\u0171\u0172\7\5\2\2\u0172\u0173\5\6\4\2\u0173\u0174\7)\2\2\u0174"+
		"\u0175\5\6\4\2\u0175\u0177\3\2\2\2\u0176\u016a\3\2\2\2\u0176\u016f\3\2"+
		"\2\2\u0177\67\3\2\2\2\u0178\u0179\5\n\6\2\u0179\u017a\7-\2\2\u017a\u017b"+
		"\5$\23\2\u017b\u017c\7\5\2\2\u017c\u017d\5\6\4\2\u017d9\3\2\2\2\u017e"+
		"\u017f\5\n\6\2\u017f\u0180\7-\2\2\u0180\u0181\5$\23\2\u0181\u0182\7\5"+
		"\2\2\u0182\u0183\5\6\4\2\u0183\u018a\3\2\2\2\u0184\u0185\5\n\6\2\u0185"+
		"\u0186\7-\2\2\u0186\u0187\5$\23\2\u0187\u0188\7\5\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u017e\3\2\2\2\u0189\u0184\3\2\2\2\u018a;\3\2\2\2\u018b\u018c"+
		"\7&\2\2\u018c\u018d\7\4\2\2\u018d\u018e\5\16\b\2\u018e\u018f\7+\2\2\u018f"+
		"\u0190\5\22\n\2\u0190\u0191\7+\2\2\u0191\u0192\5\36\20\2\u0192\u0193\5"+
		"\6\4\2\u0193=\3\2\2\2\u0194\u0195\7(\2\2\u0195\u0196\7\4\2\2\u0196\u0197"+
		"\5\22\n\2\u0197\u0198\5\6\4\2\u0198?\3\2\2\2\u0199\u019a\7\'\2\2\u019a"+
		"\u019b\7\4\2\2\u019b\u019c\5\22\n\2\u019c\u019d\5\6\4\2\u019d\u01a6\3"+
		"\2\2\2\u019e\u019f\7\'\2\2\u019f\u01a0\7\4\2\2\u01a0\u01a1\5\22\n\2\u01a1"+
		"\u01a2\5\6\4\2\u01a2\u01a3\7)\2\2\u01a3\u01a4\5\6\4\2\u01a4\u01a6\3\2"+
		"\2\2\u01a5\u0199\3\2\2\2\u01a5\u019e\3\2\2\2\u01a6A\3\2\2\2\u01a7\u01a8"+
		"\5\n\6\2\u01a8\u01a9\7-\2\2\u01a9\u01aa\7\4\2\2\u01aa\u01ab\5$\23\2\u01ab"+
		"\u01ac\5\6\4\2\u01acC\3\2\2\2\u01ad\u01ae\5\n\6\2\u01ae\u01af\7-\2\2\u01af"+
		"\u01b0\7\4\2\2\u01b0\u01b1\5$\23\2\u01b1\u01b2\5\6\4\2\u01b2\u01b7\3\2"+
		"\2\2\u01b3\u01b4\7-\2\2\u01b4\u01b5\7\4\2\2\u01b5\u01b7\5$\23\2\u01b6"+
		"\u01ad\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b7E\3\2\2\2\33Mcu\u0083\u008d\u0098"+
		"\u009e\u00b9\u00cd\u00cf\u00e2\u00f8\u00fe\u0109\u011a\u0123\u0131\u013b"+
		"\u014d\u0152\u015a\u0176\u0189\u01a5\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}