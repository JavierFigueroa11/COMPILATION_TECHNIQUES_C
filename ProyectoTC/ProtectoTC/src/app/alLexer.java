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
public class alLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PA=3, PC=4, LA=5, LC=6, CA=7, CC=8, PYC=9, EQ=10, INT=11, 
		CHAR=12, DOUBLE=13, FOR=14, MENOR=15, NUMERO=16, ID=17, OTRO=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "LETRA", "DIGITO", "PA", "PC", "LA", "LC", "CA", "CC", 
		"PYC", "EQ", "INT", "CHAR", "DOUBLE", "FOR", "MENOR", "NUMERO", "ID", 
		"OTRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'='", 
		"'int'", "'char'", "'double'", "'for'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "PA", "PC", "LA", "LC", "CA", "CC", "PYC", "EQ", "INT", 
		"CHAR", "DOUBLE", "FOR", "MENOR", "NUMERO", "ID", "OTRO"
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


	public alLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\23\6\23[\n\23\r\23\16\23\\\3\24\3\24\5"+
		"\24a\n\24\3\24\3\24\3\24\7\24f\n\24\f\24\16\24i\13\24\3\25\3\25\2\2\26"+
		"\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\21%\22\'\23)\24\3\2\4\4\2C\\c|\3\2\62;\2n\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17"+
		"\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2"+
		"\2\33C\3\2\2\2\35G\3\2\2\2\37L\3\2\2\2!S\3\2\2\2#W\3\2\2\2%Z\3\2\2\2\'"+
		"`\3\2\2\2)j\3\2\2\2+,\7-\2\2,\4\3\2\2\2-.\7/\2\2.\6\3\2\2\2/\60\t\2\2"+
		"\2\60\b\3\2\2\2\61\62\t\3\2\2\62\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2\65"+
		"\66\7+\2\2\66\16\3\2\2\2\678\7}\2\28\20\3\2\2\29:\7\177\2\2:\22\3\2\2"+
		"\2;<\7]\2\2<\24\3\2\2\2=>\7_\2\2>\26\3\2\2\2?@\7=\2\2@\30\3\2\2\2AB\7"+
		"?\2\2B\32\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F\34\3\2\2\2GH\7e\2\2HI\7"+
		"j\2\2IJ\7c\2\2JK\7t\2\2K\36\3\2\2\2LM\7f\2\2MN\7q\2\2NO\7w\2\2OP\7d\2"+
		"\2PQ\7n\2\2QR\7g\2\2R \3\2\2\2ST\7h\2\2TU\7q\2\2UV\7t\2\2V\"\3\2\2\2W"+
		"X\7>\2\2X$\3\2\2\2Y[\5\t\5\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]&\3\2\2\2^a\5\7\4\2_a\7a\2\2`^\3\2\2\2`_\3\2\2\2ag\3\2\2\2bf\5\7\4"+
		"\2cf\5\t\5\2df\7a\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h(\3\2\2\2ig\3\2\2\2jk\13\2\2\2k*\3\2\2\2\7\2\\`eg\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}