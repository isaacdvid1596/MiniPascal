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
		T__45=46, T__46=47, IDENTIFIER=48, NUMBER=49, COMMENT=50, WS=51;
	public static final int
		RULE_program = 0, RULE_program_end_marker = 1, RULE_block = 2, RULE_var_declaration = 3, 
		RULE_variable_declaration = 4, RULE_array_specifier = 5, RULE_index_range = 6, 
		RULE_index = 7, RULE_type = 8, RULE_compound_statement = 9, RULE_statement_list = 10, 
		RULE_statement = 11, RULE_assignment_statement = 12, RULE_if_statement = 13, 
		RULE_while_statement = 14, RULE_for_statement = 15, RULE_repeat_statement = 16, 
		RULE_write_statement = 17, RULE_expression = 18, RULE_simple_expression = 19, 
		RULE_term = 20, RULE_factor = 21, RULE_variable = 22, RULE_index_access = 23, 
		RULE_relop = 24, RULE_addop = 25, RULE_mulop = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_end_marker", "block", "var_declaration", "variable_declaration", 
			"array_specifier", "index_range", "index", "type", "compound_statement", 
			"statement_list", "statement", "assignment_statement", "if_statement", 
			"while_statement", "for_statement", "repeat_statement", "write_statement", 
			"expression", "simple_expression", "term", "factor", "variable", "index_access", 
			"relop", "addop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'var'", "':'", "'array'", "'['", "']'", 
			"'of'", "'..'", "'integer'", "'real'", "'boolean'", "'char'", "'begin'", 
			"'end'", "':='", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"'to'", "'repeat'", "'until'", "'write'", "'('", "')'", "'and'", "'or'", 
			"'not'", "'true'", "'false'", "','", "'='", "'<>'", "'<'", "'>'", "'<='", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "NUMBER", "COMMENT", "WS"
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
			setState(54);
			match(T__0);
			setState(55);
			match(IDENTIFIER);
			setState(56);
			match(T__1);
			setState(57);
			block();
			setState(58);
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
			setState(60);
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
			setState(62);
			var_declaration();
			setState(63);
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
			setState(65);
			match(T__3);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(66);
				variable_declaration();
				setState(67);
				match(T__1);
				}
				}
				setState(73);
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
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(T__4);
			setState(76);
			type();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(77);
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
			setState(80);
			match(T__5);
			setState(81);
			match(T__6);
			setState(82);
			index_range();
			setState(83);
			match(T__7);
			setState(84);
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
			setState(86);
			match(NUMBER);
			setState(87);
			match(T__9);
			setState(88);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(T__13);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(T__5);
				setState(97);
				match(T__6);
				setState(98);
				index_range();
				setState(99);
				match(T__7);
				setState(100);
				match(T__8);
				setState(101);
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
			setState(105);
			match(T__14);
			setState(106);
			statement_list();
			setState(107);
			match(T__15);
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
			setState(109);
			statement();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(110);
				match(T__1);
				setState(111);
				statement();
				}
				}
				setState(116);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				compound_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				assignment_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				if_statement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				while_statement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				for_statement();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				repeat_statement();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				write_statement();
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
			setState(126);
			variable();
			setState(127);
			match(T__16);
			setState(128);
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
			setState(130);
			match(T__17);
			setState(131);
			expression();
			setState(132);
			match(T__18);
			setState(133);
			statement();
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__19);
				setState(135);
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
			setState(138);
			match(T__20);
			setState(139);
			expression();
			setState(140);
			match(T__21);
			setState(141);
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
			setState(143);
			match(T__22);
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(T__16);
			setState(146);
			expression();
			setState(147);
			match(T__23);
			setState(148);
			expression();
			setState(149);
			match(T__21);
			setState(150);
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
			setState(152);
			match(T__24);
			setState(153);
			statement_list();
			setState(154);
			match(T__25);
			setState(155);
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
			setState(157);
			match(T__26);
			setState(158);
			match(T__27);
			setState(159);
			expression();
			setState(160);
			match(T__28);
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
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			simple_expression();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4332548259840L) != 0) {
				{
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(163);
					relop();
					}
					break;
				case T__29:
					{
					setState(164);
					match(T__29);
					}
					break;
				case T__30:
					{
					setState(165);
					match(T__30);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168);
				simple_expression();
				}
				}
				setState(173);
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
		enterRule(_localctx, 38, RULE_simple_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			term();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__41:
					case T__42:
						{
						setState(175);
						addop();
						}
						break;
					case T__30:
						{
						setState(176);
						match(T__30);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179);
					term();
					}
					} 
				}
				setState(184);
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
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			factor();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0) {
				{
				{
				setState(186);
				mulop();
				setState(187);
				factor();
				}
				}
				setState(193);
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
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(IDENTIFIER);
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(195);
					index_access();
					}
					break;
				case T__27:
					{
					setState(196);
					match(T__27);
					setState(197);
					expression();
					setState(198);
					match(T__28);
					}
					break;
				case T__31:
					{
					{
					setState(200);
					match(T__31);
					setState(201);
					factor();
					}
					}
					break;
				case T__1:
				case T__7:
				case T__15:
				case T__18:
				case T__19:
				case T__21:
				case T__23:
				case T__25:
				case T__28:
				case T__29:
				case T__30:
				case T__34:
				case T__35:
				case T__36:
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
					break;
				default:
					break;
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(NUMBER);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(T__27);
				setState(206);
				expression();
				setState(207);
				match(T__28);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__31);
				setState(210);
				factor();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(T__33);
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
		enterRule(_localctx, 44, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(216);
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
		enterRule(_localctx, 46, RULE_index_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__6);
			setState(220);
			expression();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(221);
				match(T__34);
				setState(222);
				expression();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
		enterRule(_localctx, 48, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0) ) {
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
		enterRule(_localctx, 50, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
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
		enterRule(_localctx, 52, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0) ) {
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
		"\u0004\u00013\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bh\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\nq\b\n\n\n\f\nt\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b}\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0089\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00a7\b\u0012\u0001\u0012\u0005\u0012\u00aa\b\u0012\n\u0012\f\u0012"+
		"\u00ad\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b2\b"+
		"\u0013\u0001\u0013\u0005\u0013\u00b5\b\u0013\n\u0013\f\u0013\u00b8\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00be\b\u0014"+
		"\n\u0014\f\u0014\u00c1\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00cb"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d6\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00da\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u00e0\b\u0017\n\u0017\f\u0017\u00e3\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.024\u0000\u0003\u0001\u0000$)\u0001\u0000*+\u0001\u0000,/\u00ef"+
		"\u00006\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004>"+
		"\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bJ\u0001\u0000"+
		"\u0000\u0000\nP\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e"+
		"Z\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012i\u0001"+
		"\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000"+
		"\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000"+
		"\u001c\u008a\u0001\u0000\u0000\u0000\u001e\u008f\u0001\u0000\u0000\u0000"+
		" \u0098\u0001\u0000\u0000\u0000\"\u009d\u0001\u0000\u0000\u0000$\u00a2"+
		"\u0001\u0000\u0000\u0000&\u00ae\u0001\u0000\u0000\u0000(\u00b9\u0001\u0000"+
		"\u0000\u0000*\u00d5\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000"+
		".\u00db\u0001\u0000\u0000\u00000\u00e6\u0001\u0000\u0000\u00002\u00e8"+
		"\u0001\u0000\u0000\u00004\u00ea\u0001\u0000\u0000\u000067\u0005\u0001"+
		"\u0000\u000078\u00050\u0000\u000089\u0005\u0002\u0000\u00009:\u0003\u0004"+
		"\u0002\u0000:;\u0003\u0002\u0001\u0000;\u0001\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0003\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0003\u0006"+
		"\u0003\u0000?@\u0003\u0012\t\u0000@\u0005\u0001\u0000\u0000\u0000AG\u0005"+
		"\u0004\u0000\u0000BC\u0003\b\u0004\u0000CD\u0005\u0002\u0000\u0000DF\u0001"+
		"\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0007\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u00050\u0000\u0000KL\u0005\u0005"+
		"\u0000\u0000LN\u0003\u0010\b\u0000MO\u0003\n\u0005\u0000NM\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0006\u0000\u0000QR\u0005\u0007\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005"+
		"\b\u0000\u0000TU\u0005\t\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VW"+
		"\u00051\u0000\u0000WX\u0005\n\u0000\u0000XY\u00051\u0000\u0000Y\r\u0001"+
		"\u0000\u0000\u0000Z[\u00051\u0000\u0000[\u000f\u0001\u0000\u0000\u0000"+
		"\\h\u0005\u000b\u0000\u0000]h\u0005\f\u0000\u0000^h\u0005\r\u0000\u0000"+
		"_h\u0005\u000e\u0000\u0000`a\u0005\u0006\u0000\u0000ab\u0005\u0007\u0000"+
		"\u0000bc\u0003\f\u0006\u0000cd\u0005\b\u0000\u0000de\u0005\t\u0000\u0000"+
		"ef\u0003\u0010\b\u0000fh\u0001\u0000\u0000\u0000g\\\u0001\u0000\u0000"+
		"\u0000g]\u0001\u0000\u0000\u0000g^\u0001\u0000\u0000\u0000g_\u0001\u0000"+
		"\u0000\u0000g`\u0001\u0000\u0000\u0000h\u0011\u0001\u0000\u0000\u0000"+
		"ij\u0005\u000f\u0000\u0000jk\u0003\u0014\n\u0000kl\u0005\u0010\u0000\u0000"+
		"l\u0013\u0001\u0000\u0000\u0000mr\u0003\u0016\u000b\u0000no\u0005\u0002"+
		"\u0000\u0000oq\u0003\u0016\u000b\u0000pn\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s\u0015\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000u}\u0003\u0012"+
		"\t\u0000v}\u0003\u0018\f\u0000w}\u0003\u001a\r\u0000x}\u0003\u001c\u000e"+
		"\u0000y}\u0003\u001e\u000f\u0000z}\u0003 \u0010\u0000{}\u0003\"\u0011"+
		"\u0000|u\u0001\u0000\u0000\u0000|v\u0001\u0000\u0000\u0000|w\u0001\u0000"+
		"\u0000\u0000|x\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0017\u0001\u0000\u0000"+
		"\u0000~\u007f\u0003,\u0016\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080"+
		"\u0081\u0003$\u0012\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\u0012\u0000\u0000\u0083\u0084\u0003$\u0012\u0000\u0084\u0085\u0005"+
		"\u0013\u0000\u0000\u0085\u0088\u0003\u0016\u000b\u0000\u0086\u0087\u0005"+
		"\u0014\u0000\u0000\u0087\u0089\u0003\u0016\u000b\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u001b\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0015\u0000\u0000\u008b\u008c\u0003"+
		"$\u0012\u0000\u008c\u008d\u0005\u0016\u0000\u0000\u008d\u008e\u0003\u0016"+
		"\u000b\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0017"+
		"\u0000\u0000\u0090\u0091\u00050\u0000\u0000\u0091\u0092\u0005\u0011\u0000"+
		"\u0000\u0092\u0093\u0003$\u0012\u0000\u0093\u0094\u0005\u0018\u0000\u0000"+
		"\u0094\u0095\u0003$\u0012\u0000\u0095\u0096\u0005\u0016\u0000\u0000\u0096"+
		"\u0097\u0003\u0016\u000b\u0000\u0097\u001f\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u0019\u0000\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u009b"+
		"\u0005\u001a\u0000\u0000\u009b\u009c\u0003$\u0012\u0000\u009c!\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u001b\u0000\u0000\u009e\u009f\u0005\u001c"+
		"\u0000\u0000\u009f\u00a0\u0003$\u0012\u0000\u00a0\u00a1\u0005\u001d\u0000"+
		"\u0000\u00a1#\u0001\u0000\u0000\u0000\u00a2\u00ab\u0003&\u0013\u0000\u00a3"+
		"\u00a7\u00030\u0018\u0000\u00a4\u00a7\u0005\u001e\u0000\u0000\u00a5\u00a7"+
		"\u0005\u001f\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003&\u0013\u0000\u00a9\u00a6\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac%\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b6\u0003(\u0014"+
		"\u0000\u00af\u00b2\u00032\u0019\u0000\u00b0\u00b2\u0005\u001f\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003(\u0014\u0000\u00b4"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\'\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bf"+
		"\u0003*\u0015\u0000\u00ba\u00bb\u00034\u001a\u0000\u00bb\u00bc\u0003*"+
		"\u0015\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0)\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00ca\u00050\u0000\u0000"+
		"\u00c3\u00cb\u0003.\u0017\u0000\u00c4\u00c5\u0005\u001c\u0000\u0000\u00c5"+
		"\u00c6\u0003$\u0012\u0000\u00c6\u00c7\u0005\u001d\u0000\u0000\u00c7\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00cb\u0003"+
		"*\u0015\u0000\u00ca\u00c3\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00d6\u0001\u0000\u0000\u0000\u00cc\u00d6\u00051\u0000"+
		"\u0000\u00cd\u00ce\u0005\u001c\u0000\u0000\u00ce\u00cf\u0003$\u0012\u0000"+
		"\u00cf\u00d0\u0005\u001d\u0000\u0000\u00d0\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u00d6\u0003*\u0015\u0000\u00d3\u00d6"+
		"\u0005!\u0000\u0000\u00d4\u00d6\u0005\"\u0000\u0000\u00d5\u00c2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6+\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d9\u00050\u0000\u0000\u00d8\u00da\u0003.\u0017\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da-\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0007\u0000\u0000\u00dc"+
		"\u00e1\u0003$\u0012\u0000\u00dd\u00de\u0005#\u0000\u0000\u00de\u00e0\u0003"+
		"$\u0012\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\b\u0000\u0000\u00e5/\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0007\u0000\u0000\u0000\u00e71\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0007\u0001\u0000\u0000\u00e93\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0007\u0002\u0000\u0000\u00eb5\u0001\u0000\u0000\u0000\u000fGN"+
		"gr|\u0088\u00a6\u00ab\u00b1\u00b6\u00bf\u00ca\u00d5\u00d9\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}