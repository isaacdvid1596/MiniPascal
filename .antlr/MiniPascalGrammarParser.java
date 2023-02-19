// Generated from /home/jisaacdavid/Documents/repos/ProyectoCompiladoresI/MiniPascal/MiniPascalGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "MiniPascalGrammar.g4"; }

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

	public static class Program_end_markerContext extends ParserRuleContext {
		public Program_end_markerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_end_marker; }
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

	public static class Array_specifierContext extends ParserRuleContext {
		public Index_rangeContext index_range() {
			return getRuleContext(Index_rangeContext.class,0);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
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

	public static class Index_rangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MiniPascalGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiniPascalGrammarParser.NUMBER, i);
		}
		public Index_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_range; }
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MiniPascalGrammarParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
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

	public static class Compound_statementContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
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

	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalGrammarParser.IDENTIFIER, 0); }
		public Index_accessContext index_access() {
			return getRuleContext(Index_accessContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00ef\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\5\6Q\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fs\n"+
		"\f\f\f\16\fv\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00a9\n\24"+
		"\3\24\7\24\u00ac\n\24\f\24\16\24\u00af\13\24\3\25\3\25\3\25\5\25\u00b4"+
		"\n\25\3\25\7\25\u00b7\n\25\f\25\16\25\u00ba\13\25\3\26\3\26\3\26\3\26"+
		"\7\26\u00c0\n\26\f\26\16\26\u00c3\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00cd\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00d8\n\27\3\30\3\30\5\30\u00dc\n\30\3\31\3\31\3\31\3\31\7\31\u00e2"+
		"\n\31\f\31\16\31\u00e5\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"\2\5\3\2&+\3\2,-\3\2.\61\2\u00f1\28\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bC\3"+
		"\2\2\2\nL\3\2\2\2\fR\3\2\2\2\16X\3\2\2\2\20\\\3\2\2\2\22i\3\2\2\2\24k"+
		"\3\2\2\2\26o\3\2\2\2\30~\3\2\2\2\32\u0080\3\2\2\2\34\u0084\3\2\2\2\36"+
		"\u008c\3\2\2\2 \u0091\3\2\2\2\"\u009a\3\2\2\2$\u009f\3\2\2\2&\u00a4\3"+
		"\2\2\2(\u00b0\3\2\2\2*\u00bb\3\2\2\2,\u00d7\3\2\2\2.\u00d9\3\2\2\2\60"+
		"\u00dd\3\2\2\2\62\u00e8\3\2\2\2\64\u00ea\3\2\2\2\66\u00ec\3\2\2\289\7"+
		"\3\2\29:\7\62\2\2:;\7\4\2\2;<\5\6\4\2<=\5\4\3\2=\3\3\2\2\2>?\7\5\2\2?"+
		"\5\3\2\2\2@A\5\b\5\2AB\5\24\13\2B\7\3\2\2\2CI\7\6\2\2DE\5\n\6\2EF\7\4"+
		"\2\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3"+
		"\2\2\2LM\7\62\2\2MN\7\7\2\2NP\5\22\n\2OQ\5\f\7\2PO\3\2\2\2PQ\3\2\2\2Q"+
		"\13\3\2\2\2RS\7\b\2\2ST\7\t\2\2TU\5\16\b\2UV\7\n\2\2VW\7\13\2\2W\r\3\2"+
		"\2\2XY\7\63\2\2YZ\7\f\2\2Z[\7\63\2\2[\17\3\2\2\2\\]\7\63\2\2]\21\3\2\2"+
		"\2^j\7\r\2\2_j\7\16\2\2`j\7\17\2\2aj\7\20\2\2bc\7\b\2\2cd\7\t\2\2de\5"+
		"\16\b\2ef\7\n\2\2fg\7\13\2\2gh\5\22\n\2hj\3\2\2\2i^\3\2\2\2i_\3\2\2\2"+
		"i`\3\2\2\2ia\3\2\2\2ib\3\2\2\2j\23\3\2\2\2kl\7\21\2\2lm\5\26\f\2mn\7\22"+
		"\2\2n\25\3\2\2\2ot\5\30\r\2pq\7\4\2\2qs\5\30\r\2rp\3\2\2\2sv\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vt\3\2\2\2w\177\5\24\13\2x\177\5\32\16"+
		"\2y\177\5\34\17\2z\177\5\36\20\2{\177\5 \21\2|\177\5\"\22\2}\177\5$\23"+
		"\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2"+
		"\2\177\31\3\2\2\2\u0080\u0081\5.\30\2\u0081\u0082\7\23\2\2\u0082\u0083"+
		"\5&\24\2\u0083\33\3\2\2\2\u0084\u0085\7\24\2\2\u0085\u0086\5&\24\2\u0086"+
		"\u0087\7\25\2\2\u0087\u008a\5\30\r\2\u0088\u0089\7\26\2\2\u0089\u008b"+
		"\5\30\r\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\35\3\2\2\2\u008c"+
		"\u008d\7\27\2\2\u008d\u008e\5&\24\2\u008e\u008f\7\30\2\2\u008f\u0090\5"+
		"\30\r\2\u0090\37\3\2\2\2\u0091\u0092\7\31\2\2\u0092\u0093\7\62\2\2\u0093"+
		"\u0094\7\23\2\2\u0094\u0095\5&\24\2\u0095\u0096\7\32\2\2\u0096\u0097\5"+
		"&\24\2\u0097\u0098\7\30\2\2\u0098\u0099\5\30\r\2\u0099!\3\2\2\2\u009a"+
		"\u009b\7\33\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\34\2\2\u009d\u009e"+
		"\5&\24\2\u009e#\3\2\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\7\36\2\2\u00a1"+
		"\u00a2\5&\24\2\u00a2\u00a3\7\37\2\2\u00a3%\3\2\2\2\u00a4\u00ad\5(\25\2"+
		"\u00a5\u00a9\5\62\32\2\u00a6\u00a9\7 \2\2\u00a7\u00a9\7!\2\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\5(\25\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\'\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b8"+
		"\5*\26\2\u00b1\u00b4\5\64\33\2\u00b2\u00b4\7!\2\2\u00b3\u00b1\3\2\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\5*\26\2\u00b6\u00b3"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		")\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c1\5,\27\2\u00bc\u00bd\5\66\34"+
		"\2\u00bd\u00be\5,\27\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2+\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00cc\7\62\2\2\u00c5\u00cd\5\60\31\2\u00c6\u00c7"+
		"\7\36\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9\7\37\2\2\u00c9\u00cd\3\2\2\2"+
		"\u00ca\u00cb\7\"\2\2\u00cb\u00cd\5,\27\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d8\3\2\2\2\u00ce"+
		"\u00d8\7\63\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\7"+
		"\37\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d8\5,\27\2\u00d5"+
		"\u00d8\7#\2\2\u00d6\u00d8\7$\2\2\u00d7\u00c4\3\2\2\2\u00d7\u00ce\3\2\2"+
		"\2\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00db\7\62\2\2\u00da\u00dc\5\60\31\2\u00db"+
		"\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc/\3\2\2\2\u00dd\u00de\7\t\2\2"+
		"\u00de\u00e3\5&\24\2\u00df\u00e0\7%\2\2\u00e0\u00e2\5&\24\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\n\2\2\u00e7\61\3\2\2"+
		"\2\u00e8\u00e9\t\2\2\2\u00e9\63\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb\65\3"+
		"\2\2\2\u00ec\u00ed\t\4\2\2\u00ed\67\3\2\2\2\21IPit~\u008a\u00a8\u00ad"+
		"\u00b3\u00b8\u00c1\u00cc\u00d7\u00db\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}