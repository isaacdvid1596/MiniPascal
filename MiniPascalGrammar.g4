grammar MiniPascalGrammar;

program : 'program' ID ';' block '.';
block : var_declaration compound_statement;
var_declaration : 'var' (ID ':' type ';')*;
type : 'integer' | 'real' | 'boolean' | 'char';
compound_statement : 'begin' statement_list 'end';
statement_list : statement (';' statement)*;
statement : compound_statement | assignment_statement | if_statement | while_statement | write_statement;
assignment_statement : variable ':=' expression;
if_statement : 'if' expression 'then' statement ('else' statement)?;
while_statement : 'while' expression 'do' statement;
write_statement : 'write' '(' expression ')';
expression : simple_expression (relop simple_expression)?;
simple_expression : term (addop term)*;
term : factor (mulop factor)*;
factor : ID | NUMBER | '(' expression ')' | 'not' factor;
variable : ID;
ID : [a-zA-Z][a-zA-Z0-9]*;
NUMBER : [0-9]+ ('.' [0-9]+)?;
relop : '=' | '<>' | '<' | '>' | '<=' | '>=';
addop : '+' | '-';
mulop : '*' | '/' | 'div' | 'mod';

COMMENT : '{' ~('{' | '}')* '}';
WS : [ \t\r\n]+ -> skip;
