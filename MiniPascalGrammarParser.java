// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPascalGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, IDENTIFIER=50, NUMBER=51, STRING=52, 
		COMMENT=53, WS=54;
	public static final int
		RULE_program = 0, RULE_program_end_marker = 1, RULE_block = 2, RULE_var_declaration = 3, 
		RULE_variable_declaration = 4, RULE_array_specifier = 5, RULE_index_range = 6, 
		RULE_index = 7, RULE_type = 8, RULE_compound_statement = 9, RULE_statement_list = 10, 
		RULE_statement = 11, RULE_assignment_statement = 12, RULE_if_statement = 13, 
		RULE_while_statement = 14, RULE_for_statement = 15, RULE_repeat_statement = 16, 
		RULE_write_statement = 17, RULE_read_statement = 18, RULE_expression = 19, 
		RULE_simple_expression = 20, RULE_term = 21, RULE_factor = 22, RULE_variable = 23, 
		RULE_index_access = 24, RULE_relop = 25, RULE_addop = 26, RULE_mulop = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_end_marker", "block", "var_declaration", "variable_declaration", 
			"array_specifier", "index_range", "index", "type", "compound_statement", 
			"statement_list", "statement", "assignment_statement", "if_statement", 
			"while_statement", "for_statement", "repeat_statement", "write_statement", 
			"read_statement", "expression", "simple_expression", "term", "factor", 
			"variable", "index_access", "relop", "addop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'var'", "':'", "'array'", "'['", "']'", 
			"'of'", "'..'", "'integer'", "'real'", "'boolean'", "'char'", "'string'", 
			"'begin'", "'end'", "':='", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'for'", "'to'", "'repeat'", "'until'", "'write'", "'('", "')'", "'read'", 
			"','", "'and'", "'or'", "'not'", "'true'", "'false'", "'='", "'<>'", 
			"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "NUMBER", "STRING", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalGrammarParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Program_end_markerContext program_end_marker() {
			return getRuleContext(Program_end_markerContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(IDENTIFIER);
			setState(58);
			match(T__1);
			setState(59);
			block();
			setState(60);
			program_end_marker();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Program_end_markerContext extends ParserRuleContext {
		public Program_end_markerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_end_marker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterProgram_end_marker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitProgram_end_marker(this);
		}
	}

	public final Program_end_markerContext program_end_marker() throws RecognitionException {
		Program_end_markerContext _localctx = new Program_end_markerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_end_marker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			var_declaration();
			setState(65);
			compound_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declarationContext extends ParserRuleContext {
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__3);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(68);
				variable_declaration();
				setState(69);
				match(T__1);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalGrammarParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(T__4);
			setState(78);
			type();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(79);
				array_specifier();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_specifierContext extends ParserRuleContext {
		public Index_rangeContext index_range() {
			return getRuleContext(Index_rangeContext.class,0);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitArray_specifier(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			match(T__6);
			setState(84);
			index_range();
			setState(85);
			match(T__7);
			setState(86);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Index_rangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MiniPascalGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiniPascalGrammarParser.NUMBER, i);
		}
		public Index_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterIndex_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitIndex_range(this);
		}
	}

	public final Index_rangeContext index_range() throws RecognitionException {
		Index_rangeContext _localctx = new Index_rangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_index_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NUMBER);
			setState(89);
			match(T__9);
			setState(90);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MiniPascalGrammarParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Index_rangeContext index_range() {
			return getRuleContext(Index_rangeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(T__14);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(T__5);
				setState(100);
				match(T__6);
				setState(101);
				index_range();
				setState(102);
				match(T__7);
				setState(103);
				match(T__8);
				setState(104);
				type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__15);
			setState(109);
			statement_list();
			setState(110);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			statement();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(113);
				match(T__1);
				setState(114);
				statement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				compound_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				assignment_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				if_statement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				while_statement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				for_statement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				repeat_statement();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				write_statement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				read_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			variable();
			setState(131);
			match(T__17);
			setState(132);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__18);
			setState(135);
			expression();
			setState(136);
			match(T__19);
			setState(137);
			statement();
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(138);
				match(T__20);
				setState(139);
				statement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__21);
			setState(143);
			expression();
			setState(144);
			match(T__22);
			setState(145);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalGrammarParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__23);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(T__17);
			setState(150);
			expression();
			setState(151);
			match(T__24);
			setState(152);
			expression();
			setState(153);
			match(T__22);
			setState(154);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_statementContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitRepeat_statement(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__25);
			setState(157);
			statement_list();
			setState(158);
			match(T__26);
			setState(159);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__27);
			setState(162);
			match(T__28);
			setState(163);
			expression();
			setState(164);
			match(T__29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Read_statementContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_read_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__30);
			setState(167);
			match(T__28);
			setState(168);
			variable();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(169);
				match(T__31);
				setState(170);
				variable();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<RelopContext> relop() {
			return getRuleContexts(RelopContext.class);
		}
		public RelopContext relop(int i) {
			return getRuleContext(RelopContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			simple_expression();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17343077941248L) != 0) {
				{
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
					{
					setState(179);
					relop();
					}
					break;
				case T__32:
					{
					setState(180);
					match(T__32);
					}
					break;
				case T__33:
					{
					setState(181);
					match(T__33);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				simple_expression();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitSimple_expression(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simple_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			term();
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__43:
					case T__44:
						{
						setState(191);
						addop();
						}
						break;
					case T__33:
						{
						setState(192);
						match(T__33);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(195);
					term();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			factor();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0) {
				{
				{
				setState(202);
				mulop();
				setState(203);
				factor();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalGrammarParser.IDENTIFIER, 0); }
		public Index_accessContext index_access() {
			return getRuleContext(Index_accessContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MiniPascalGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalGrammarParser.STRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(IDENTIFIER);
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(211);
					index_access();
					}
					break;
				case T__28:
					{
					setState(212);
					match(T__28);
					setState(213);
					expression();
					setState(214);
					match(T__29);
					}
					break;
				case T__34:
					{
					{
					setState(216);
					match(T__34);
					setState(217);
					factor();
					}
					}
					break;
				case T__1:
				case T__7:
				case T__16:
				case T__19:
				case T__20:
				case T__22:
				case T__24:
				case T__26:
				case T__29:
				case T__31:
				case T__32:
				case T__33:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
					break;
				default:
					break;
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(STRING);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__28);
				setState(223);
				expression();
				setState(224);
				match(T__29);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(T__34);
				setState(227);
				factor();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(T__36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalGrammarParser.IDENTIFIER, 0); }
		public Index_accessContext index_access() {
			return getRuleContext(Index_accessContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(IDENTIFIER);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(233);
				index_access();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Index_accessContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Index_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterIndex_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitIndex_access(this);
		}
	}

	public final Index_accessContext index_access() throws RecognitionException {
		Index_accessContext _localctx = new Index_accessContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_index_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__6);
			setState(237);
			expression();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(238);
				match(T__31);
				setState(239);
				expression();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalGrammarListener ) ((MiniPascalGrammarListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0) ) {
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

	public static final String _serializedATN =
		"\u0004\u00016\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003"+
		"K\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"Q\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nt\b\n\n\n\f\nw\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u008d\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ac"+
		"\b\u0012\n\u0012\f\u0012\u00af\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b7\b\u0013\u0001\u0013"+
		"\u0005\u0013\u00ba\b\u0013\n\u0013\f\u0013\u00bd\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00c2\b\u0014\u0001\u0014\u0005\u0014\u00c5"+
		"\b\u0014\n\u0014\f\u0014\u00c8\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00ce\b\u0015\n\u0015\f\u0015\u00d1\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00db\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00e7\b\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00eb\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00f1\b\u0018\n\u0018\f\u0018\u00f4\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0003\u0001"+
		"\u0000&+\u0001\u0000,-\u0001\u0000.1\u0103\u00008\u0001\u0000\u0000\u0000"+
		"\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006C"+
		"\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010"+
		"j\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014p\u0001"+
		"\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0082\u0001"+
		"\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u008e\u0001"+
		"\u0000\u0000\u0000\u001e\u0093\u0001\u0000\u0000\u0000 \u009c\u0001\u0000"+
		"\u0000\u0000\"\u00a1\u0001\u0000\u0000\u0000$\u00a6\u0001\u0000\u0000"+
		"\u0000&\u00b2\u0001\u0000\u0000\u0000(\u00be\u0001\u0000\u0000\u0000*"+
		"\u00c9\u0001\u0000\u0000\u0000,\u00e6\u0001\u0000\u0000\u0000.\u00e8\u0001"+
		"\u0000\u0000\u00000\u00ec\u0001\u0000\u0000\u00002\u00f7\u0001\u0000\u0000"+
		"\u00004\u00f9\u0001\u0000\u0000\u00006\u00fb\u0001\u0000\u0000\u00008"+
		"9\u0005\u0001\u0000\u00009:\u00052\u0000\u0000:;\u0005\u0002\u0000\u0000"+
		";<\u0003\u0004\u0002\u0000<=\u0003\u0002\u0001\u0000=\u0001\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0003\u0000\u0000?\u0003\u0001\u0000\u0000\u0000"+
		"@A\u0003\u0006\u0003\u0000AB\u0003\u0012\t\u0000B\u0005\u0001\u0000\u0000"+
		"\u0000CI\u0005\u0004\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\u0002\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0007"+
		"\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u00052\u0000\u0000"+
		"MN\u0005\u0005\u0000\u0000NP\u0003\u0010\b\u0000OQ\u0003\n\u0005\u0000"+
		"PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0006\u0000\u0000ST\u0005\u0007\u0000\u0000TU\u0003\f\u0006"+
		"\u0000UV\u0005\b\u0000\u0000VW\u0005\t\u0000\u0000W\u000b\u0001\u0000"+
		"\u0000\u0000XY\u00053\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u00053\u0000"+
		"\u0000[\r\u0001\u0000\u0000\u0000\\]\u00053\u0000\u0000]\u000f\u0001\u0000"+
		"\u0000\u0000^k\u0005\u000b\u0000\u0000_k\u0005\f\u0000\u0000`k\u0005\r"+
		"\u0000\u0000ak\u0005\u000e\u0000\u0000bk\u0005\u000f\u0000\u0000cd\u0005"+
		"\u0006\u0000\u0000de\u0005\u0007\u0000\u0000ef\u0003\f\u0006\u0000fg\u0005"+
		"\b\u0000\u0000gh\u0005\t\u0000\u0000hi\u0003\u0010\b\u0000ik\u0001\u0000"+
		"\u0000\u0000j^\u0001\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000j`\u0001"+
		"\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000"+
		"jc\u0001\u0000\u0000\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0005\u0010"+
		"\u0000\u0000mn\u0003\u0014\n\u0000no\u0005\u0011\u0000\u0000o\u0013\u0001"+
		"\u0000\u0000\u0000pu\u0003\u0016\u000b\u0000qr\u0005\u0002\u0000\u0000"+
		"rt\u0003\u0016\u000b\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0015\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x\u0081\u0003\u0012\t\u0000"+
		"y\u0081\u0003\u0018\f\u0000z\u0081\u0003\u001a\r\u0000{\u0081\u0003\u001c"+
		"\u000e\u0000|\u0081\u0003\u001e\u000f\u0000}\u0081\u0003 \u0010\u0000"+
		"~\u0081\u0003\"\u0011\u0000\u007f\u0081\u0003$\u0012\u0000\u0080x\u0001"+
		"\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000"+
		"\u0000\u0080{\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080"+
		"}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0017\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		".\u0017\u0000\u0083\u0084\u0005\u0012\u0000\u0000\u0084\u0085\u0003&\u0013"+
		"\u0000\u0085\u0019\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0013\u0000"+
		"\u0000\u0087\u0088\u0003&\u0013\u0000\u0088\u0089\u0005\u0014\u0000\u0000"+
		"\u0089\u008c\u0003\u0016\u000b\u0000\u008a\u008b\u0005\u0015\u0000\u0000"+
		"\u008b\u008d\u0003\u0016\u000b\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u001b\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0090\u0003&\u0013\u0000\u0090"+
		"\u0091\u0005\u0017\u0000\u0000\u0091\u0092\u0003\u0016\u000b\u0000\u0092"+
		"\u001d\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0018\u0000\u0000\u0094"+
		"\u0095\u00052\u0000\u0000\u0095\u0096\u0005\u0012\u0000\u0000\u0096\u0097"+
		"\u0003&\u0013\u0000\u0097\u0098\u0005\u0019\u0000\u0000\u0098\u0099\u0003"+
		"&\u0013\u0000\u0099\u009a\u0005\u0017\u0000\u0000\u009a\u009b\u0003\u0016"+
		"\u000b\u0000\u009b\u001f\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001a"+
		"\u0000\u0000\u009d\u009e\u0003\u0014\n\u0000\u009e\u009f\u0005\u001b\u0000"+
		"\u0000\u009f\u00a0\u0003&\u0013\u0000\u00a0!\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u001c\u0000\u0000\u00a2\u00a3\u0005\u001d\u0000\u0000\u00a3"+
		"\u00a4\u0003&\u0013\u0000\u00a4\u00a5\u0005\u001e\u0000\u0000\u00a5#\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u001f\u0000\u0000\u00a7\u00a8\u0005"+
		"\u001d\u0000\u0000\u00a8\u00ad\u0003.\u0017\u0000\u00a9\u00aa\u0005 \u0000"+
		"\u0000\u00aa\u00ac\u0003.\u0017\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001e\u0000\u0000"+
		"\u00b1%\u0001\u0000\u0000\u0000\u00b2\u00bb\u0003(\u0014\u0000\u00b3\u00b7"+
		"\u00032\u0019\u0000\u00b4\u00b7\u0005!\u0000\u0000\u00b5\u00b7\u0005\""+
		"\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0003(\u0014\u0000\u00b9\u00b6\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\'\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c6\u0003*\u0015\u0000\u00bf"+
		"\u00c2\u00034\u001a\u0000\u00c0\u00c2\u0005\"\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003*\u0015\u0000\u00c4\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7)\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cf\u0003,\u0016"+
		"\u0000\u00ca\u00cb\u00036\u001b\u0000\u00cb\u00cc\u0003,\u0016\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0+\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00da\u00052\u0000\u0000\u00d3\u00db\u0003"+
		"0\u0018\u0000\u00d4\u00d5\u0005\u001d\u0000\u0000\u00d5\u00d6\u0003&\u0013"+
		"\u0000\u00d6\u00d7\u0005\u001e\u0000\u0000\u00d7\u00db\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005#\u0000\u0000\u00d9\u00db\u0003,\u0016\u0000\u00da"+
		"\u00d3\u0001\u0000\u0000\u0000\u00da\u00d4\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00e7\u0001\u0000\u0000\u0000\u00dc\u00e7\u00053\u0000\u0000\u00dd\u00e7"+
		"\u00054\u0000\u0000\u00de\u00df\u0005\u001d\u0000\u0000\u00df\u00e0\u0003"+
		"&\u0013\u0000\u00e0\u00e1\u0005\u001e\u0000\u0000\u00e1\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005#\u0000\u0000\u00e3\u00e7\u0003,\u0016\u0000"+
		"\u00e4\u00e7\u0005$\u0000\u0000\u00e5\u00e7\u0005%\u0000\u0000\u00e6\u00d2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00dc\u0001\u0000\u0000\u0000\u00e6\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e6\u00de\u0001\u0000\u0000\u0000\u00e6\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7-\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005"+
		"2\u0000\u0000\u00e9\u00eb\u00030\u0018\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb/\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005\u0007\u0000\u0000\u00ed\u00f2\u0003&\u0013\u0000\u00ee"+
		"\u00ef\u0005 \u0000\u0000\u00ef\u00f1\u0003&\u0013\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\b\u0000\u0000\u00f61\u0001\u0000\u0000\u0000\u00f7\u00f8\u0007\u0000"+
		"\u0000\u0000\u00f83\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0001\u0000"+
		"\u0000\u00fa5\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0002\u0000\u0000"+
		"\u00fc7\u0001\u0000\u0000\u0000\u0010IPju\u0080\u008c\u00ad\u00b6\u00bb"+
		"\u00c1\u00c6\u00cf\u00da\u00e6\u00ea\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}