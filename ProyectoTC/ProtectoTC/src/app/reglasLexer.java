// Generated from /home/sofia/Documentos/Facu/LexerSimple (copia) (2)/src/app/reglas.g4 by ANTLR 4.7.1

    package app;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class reglasLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETRA", "DIGITO", "WS", "PA", "PC", "LA", "LC", "CA", "CC", "SUM", "RES", 
		"MUL", "DIV", "MOD", "INCREMENT", "DECREMENT", "EQ", "MAY", "MEN", "MAYIG", 
		"MENIG", "DIS", "OR", "AND", "NOT", "TRUE", "FALSE", "MASIGUAL", "MENOSIGUAL", 
		"PORIGUAL", "BARRAIGUAL", "MODULOIGUAL", "IGUAL", "INT", "CHAR", "DOUBLE", 
		"VOID", "FOR", "IF", "WHILE", "ELSE", "COMA", "PYC", "RETURN", "ID", "NUMERO", 
		"CARACTER", "VALORCHAR", "NUMDOUBLE"
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


	public reglasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u010b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\5.\u00f2\n"+
		".\3.\3.\3.\6.\u00f7\n.\r.\16.\u00f8\5.\u00fb\n.\3/\6/\u00fe\n/\r/\16/"+
		"\u00ff\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\2\2\63\3\2\5"+
		"\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37"+
		"A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61\3\2\5\4\2C\\c|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\2\u010e\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tm\3\2\2\2\13o\3\2\2"+
		"\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2"+
		"\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0086"+
		"\3\2\2\2#\u0089\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2"+
		"+\u0093\3\2\2\2-\u0096\3\2\2\2/\u0099\3\2\2\2\61\u009c\3\2\2\2\63\u009f"+
		"\3\2\2\2\65\u00a1\3\2\2\2\67\u00a6\3\2\2\29\u00ac\3\2\2\2;\u00af\3\2\2"+
		"\2=\u00b2\3\2\2\2?\u00b5\3\2\2\2A\u00b8\3\2\2\2C\u00bb\3\2\2\2E\u00bd"+
		"\3\2\2\2G\u00c1\3\2\2\2I\u00c6\3\2\2\2K\u00cd\3\2\2\2M\u00d2\3\2\2\2O"+
		"\u00d6\3\2\2\2Q\u00d9\3\2\2\2S\u00df\3\2\2\2U\u00e4\3\2\2\2W\u00e6\3\2"+
		"\2\2Y\u00e8\3\2\2\2[\u00f1\3\2\2\2]\u00fd\3\2\2\2_\u0101\3\2\2\2a\u0103"+
		"\3\2\2\2c\u0107\3\2\2\2ef\t\2\2\2f\4\3\2\2\2gh\t\3\2\2h\6\3\2\2\2ij\t"+
		"\4\2\2jk\3\2\2\2kl\b\4\2\2l\b\3\2\2\2mn\7*\2\2n\n\3\2\2\2op\7+\2\2p\f"+
		"\3\2\2\2qr\7}\2\2r\16\3\2\2\2st\7\177\2\2t\20\3\2\2\2uv\7]\2\2v\22\3\2"+
		"\2\2wx\7_\2\2x\24\3\2\2\2yz\7-\2\2z\26\3\2\2\2{|\7/\2\2|\30\3\2\2\2}~"+
		"\7,\2\2~\32\3\2\2\2\177\u0080\7\61\2\2\u0080\34\3\2\2\2\u0081\u0082\7"+
		"\'\2\2\u0082\36\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085\7-\2\2\u0085 \3"+
		"\2\2\2\u0086\u0087\7/\2\2\u0087\u0088\7/\2\2\u0088\"\3\2\2\2\u0089\u008a"+
		"\7?\2\2\u008a\u008b\7?\2\2\u008b$\3\2\2\2\u008c\u008d\7@\2\2\u008d&\3"+
		"\2\2\2\u008e\u008f\7>\2\2\u008f(\3\2\2\2\u0090\u0091\7?\2\2\u0091\u0092"+
		"\7@\2\2\u0092*\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095,\3"+
		"\2\2\2\u0096\u0097\7#\2\2\u0097\u0098\7?\2\2\u0098.\3\2\2\2\u0099\u009a"+
		"\7~\2\2\u009a\u009b\7~\2\2\u009b\60\3\2\2\2\u009c\u009d\7(\2\2\u009d\u009e"+
		"\7(\2\2\u009e\62\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\64\3\2\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\66\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad"+
		"\u00ae\7?\2\2\u00ae:\3\2\2\2\u00af\u00b0\7/\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		"<\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7?\2\2\u00b4>\3\2\2\2\u00b5\u00b6"+
		"\7\61\2\2\u00b6\u00b7\7?\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9"+
		"\u00ba\7?\2\2\u00baB\3\2\2\2\u00bb\u00bc\7?\2\2\u00bcD\3\2\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0F\3\2\2\2\u00c1\u00c2"+
		"\7e\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"H\3\2\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7w\2\2\u00c9"+
		"\u00ca\7d\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00ccJ\3\2\2\2\u00cd"+
		"\u00ce\7x\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7f\2\2"+
		"\u00d1L\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5N\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8P\3\2\2\2"+
		"\u00d9\u00da\7y\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7n\2\2\u00dd\u00de\7g\2\2\u00deR\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3T\3\2\2\2\u00e4\u00e5"+
		"\7.\2\2\u00e5V\3\2\2\2\u00e6\u00e7\7=\2\2\u00e7X\3\2\2\2\u00e8\u00e9\7"+
		"t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7p\2\2\u00eeZ\3\2\2\2\u00ef\u00f2\5\3\2\2\u00f0\u00f2"+
		"\7a\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00fa\3\2\2\2\u00f3"+
		"\u00f7\5\3\2\2\u00f4\u00f7\5]/\2\u00f5\u00f7\7a\2\2\u00f6\u00f3\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\\\3\2\2\2\u00fc\u00fe\5\5\3\2\u00fd\u00fc\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100^\3"+
		"\2\2\2\u0101\u0102\4\2\0\2\u0102`\3\2\2\2\u0103\u0104\7)\2\2\u0104\u0105"+
		"\5_\60\2\u0105\u0106\7)\2\2\u0106b\3\2\2\2\u0107\u0108\5]/\2\u0108\u0109"+
		"\7\60\2\2\u0109\u010a\5]/\2\u010ad\3\2\2\2\b\2\u00f1\u00f6\u00f8\u00fa"+
		"\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}