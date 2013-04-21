grammar Grammar;

line returns [LOGONode node]
		: statement_list EOF {$node = $statement_list.node; LOGOPP.io.debug("line->stmt_list");}
		;
		
statement_list returns [LOGONode node]
		: command_list statement_list {$node = $command_list.node; LOGOPP.io.debug("stmt->cmd_list");}
		| expression statement_list {$node = $expression.node; LOGOPP.io.debug("stmt->expr");}
		| conditional_statement statement_list {$node = $conditional_statement.node; LOGOPP.io.debug("stmt->cond");}
		| iteration_statement statement_list {$node = $iteration_statement.node; LOGOPP.io.debug("stmt->iter");}
		| function_definition {$node = $function_definition.node; LOGOPP.io.debug("stmt->func");}
		| command_list {$node = $command_list.node; LOGOPP.io.debug("stmt->cmd_list");}
		| expression {$node = $expression.node; LOGOPP.io.debug("stmt->expr");}
		| conditional_statement {$node = $conditional_statement.node; LOGOPP.io.debug("stmt->cond");}
		| iteration_statement {$node = $iteration_statement.node; LOGOPP.io.debug("stmt->iter");}
		;

command_list returns [LOGONode node]
        : command_noarg l=command_list {$l.node.children.add(0,$command_noarg.node); $node = $l.node;LOGOPP.io.debug("new child:" + $command_noarg.node.id);}
        | command_expr l=command_list {$l.node.children.add(0,$command_expr.node); $node = $l.node;LOGOPP.io.debug("new child:" + $command_expr.node.id);}
        | command_noarg {$node = new LOGOCommandNode("commandList",$command_noarg.node);}
		| command_expr {$node = new LOGOCommandNode("commandList",$command_expr.node);}
		;

command_noarg returns [LOGONode node]
    :   Getx {$node =  new LOGOCommandNode("GETX");}
    |   Gety {$node =  new LOGOCommandNode("GETY");}
    |   Getxy {$node =  new LOGOCommandNode("GETXY");}
    |   Clearscreen {$node =  new LOGOCommandNode("CLEARSCREEN");}
    |   Origin {$node =  new LOGOCommandNode("ORIGIN");}
    |	Wrap {$node =  new LOGOCommandNode("WRAP");}
    |	Fence {$node =  new LOGOCommandNode("FENCE");}
    |	Penup {$node =  new LOGOCommandNode("PENUP");}
    |	Pendown {$node =  new LOGOCommandNode("PENDOWN");}
    |	Showturtle {$node =  new LOGOCommandNode("SHOWTURTLE");}
    |	Hideturtle {$node =  new LOGOCommandNode("HIDETURTLE");}
    ;
    
command_expr returns [LOGONode node]
	:	command expression {$node = new LOGOCommandNode($command.text, $expression.node);}
	;

command returns [String text]
	:	Forward {$text = new String("FORWARD");}
	|	Back {$text = new String("BACK");}
	|	Left {$text = new String("LEFT");}
	|	Right {$text = new String("RIGHT");}
	|	Setx {$text = new String("SETX");}
    |	Sety {$text = new String("SETY");}
    |	Setxy {$text = new String("SETXY");}
    |	Speed {$text = new String("SPEED");}
    |	Print {$text = new String("PRINT");}
	;

expression returns [LOGONode node]
        : or_expression {$node = $or_expression.node; LOGOPP.io.debug("expr->or");}
        ;

or_expression returns [LOGONode node]
        : n=or_expression '||' and_expression {$node = new LOGOOperatorNode("||", $n.node, $and_expression.node); LOGOPP.io.debug("or -> or || and " + $node.id);}
        | and_expression {$node = $and_expression.node; LOGOPP.io.debug("or->and " + $node.id);}
        ;

and_expression returns [LOGONode node]
        : n=and_expression '&&' equality_expression {$node = new LOGOOperatorNode("&&", $n.node, $equality_expression.node); LOGOPP.io.debug("and-> and && eq " + $node.id);}
        | equality_expression {$node = $equality_expression.node; LOGOPP.io.debug("and->eq " + $node.id);}
        ;

equality_expression returns [LOGONode node]
        : n=equality_expression '=' relational_expression {$node = new LOGOOperatorNode("=", $n.node, $relational_expression.node); LOGOPP.io.debug("eq-> eq = rel " + $node.id);}
        | n=equality_expression '!=' relational_expression {$node = new LOGOOperatorNode("!=", $n.node, $relational_expression.node); LOGOPP.io.debug("eq-> eq != rel " + $node.id);}
        | relational_expression {$node = $relational_expression.node; LOGOPP.io.debug("eq->rel " + $node.id);}
        ;

relational_expression returns [LOGONode node]
        : n=relational_expression '<' additive_expression {$node = new LOGOOperatorNode("<", $n.node, $additive_expression.node); LOGOPP.io.debug("rel->rel<add " + $node.id);}
        | n=relational_expression '>' additive_expression {$node = new LOGOOperatorNode(">", $n.node, $additive_expression.node); LOGOPP.io.debug("rel->rel>add " + $node.id);}
        | n=relational_expression '>=' additive_expression {$node = new LOGOOperatorNode(">=", $n.node, $additive_expression.node); LOGOPP.io.debug("rel->rel>=add " + $node.id);}
        | n=relational_expression '<=' additive_expression {$node = new LOGOOperatorNode("<=", $n.node, $additive_expression.node); LOGOPP.io.debug("rel->rel<=add " + $node.id);}
        | additive_expression {$node = $additive_expression.node; LOGOPP.io.debug("rel->add " + $node.id);}
        ;

additive_expression returns [LOGONode node]
        : n=additive_expression '+' multiplicative_expression {$node = new LOGOOperatorNode("+", $n.node, $multiplicative_expression.node); LOGOPP.io.debug("add->add+mul " + $node.id);}
        | n=additive_expression '-' multiplicative_expression {$node = new LOGOOperatorNode("-", $n.node, $multiplicative_expression.node); LOGOPP.io.debug("add->add-mul " + $node.id);}
        | multiplicative_expression {$node = $multiplicative_expression.node; LOGOPP.io.debug("add->mul " + $node.id);}
        ;

multiplicative_expression returns [LOGONode node]
        : n=multiplicative_expression '*' unary_expression {$node = new LOGOOperatorNode("*", $n.node, $unary_expression.node); LOGOPP.io.debug("mul->mul*unary " + $node.id);}
        | n=multiplicative_expression '/' unary_expression {$node = new LOGOOperatorNode("/", $n.node, $unary_expression.node); LOGOPP.io.debug("mul->mul/unary " + $node.id);}
        | n=multiplicative_expression '^' unary_expression {$node = new LOGOOperatorNode("^", $n.node, $unary_expression.node); LOGOPP.io.debug("mul->mul^unary " + $node.id);}
        | unary_expression {$node = $unary_expression.node; LOGOPP.io.debug("mul->unary " + $node.id);}
        ;

unary_expression returns [LOGONode node]
        : primary_expression {$node = $primary_expression.node; LOGOPP.io.debug("unary->primary " + $node.id);}
        | Unary_operator primary_expression {$node = new LOGOOperatorNode("u-", $primary_expression.node); LOGOPP.io.debug("unary->primary " + $node.id);}
        ;
        
primary_expression returns [LOGONode node]
        : Number {$node = new LOGOLeaf($Number.text); LOGOPP.io.debug("Number " + $node.id);}
        | '(' expression ')' {$node = $expression.node; LOGOPP.io.debug("parentheses");}
        | assignment_expression {$node = $assignment_expression.node; LOGOPP.io.debug("SET");}
        | id {$node = $id.node; LOGOPP.io.debug("ID");}
        | funcall {$node = $funcall.node;}
        ;

id returns [LOGONode node]
        : Identifier {$node = new LOGOLeaf($Identifier.text);}
        ;

assignment_expression returns [LOGONode node]
        : Set id expression {$node = new LOGOSetNode($id.node.id, $expression.node);}
        ;

/* -------------- conditional and iterations (implementation still in progress) -----*/
conditional_statement returns [LOGONode node]
		: If LPAREN expression RPAREN LBRACKET statement_list RBRACKET {$node = new LOGOConditionalNode("if", $expression.node, $statement_list.node); LOGOPP.io.debug("if" + $node.id);}
		| If LPAREN expression RPAREN LBRACKET n = statement_list RBRACKET Else LBRACKET m = statement_list RBRACKET{$node = new LOGOConditionalNode("if_else", $expression.node, $n.node, $m.node); LOGOPP.io.debug("if_else" + $node.id);}
		;

iteration_statement returns [LOGONode node]
        : While LPAREN expression RPAREN LBRACKET statement_list RBRACKET {$node = new LOGOIterationNode("while", $expression.node, $statement_list.node); LOGOPP.io.debug("while" + $node.id);}
        | For id '=' for_expression LBRACKET statement_list RBRACKET {$node = new LOGOIterationNode("for", $id.node, $for_expression.node, $statement_list.node); LOGOPP.io.debug("for" + $node.id);}
        | For LPAREN id '=' for_expression RPAREN LBRACKET statement_list RBRACKET {$node = new LOGOIterationNode("for", $id.node, $for_expression.node, $statement_list.node); LOGOPP.io.debug("for" + $node.id);}
        | Repeat expression LBRACKET statement_list RBRACKET
        ;

for_expression returns [LOGONode node]
    :   o = expression ':' q = expression {$node = new LOGOIterationNode("for_expr1", $o.node, $q.node); LOGOPP.io.debug("for_expr1" + $node.id);}
    |   o = expression ':' p = expression ':' q = expression {$node = new LOGOIterationNode("for_expr2", $o.node, $p.node, $q.node); LOGOPP.io.debug("for_expr2" + $node.id);}
    ;

/* ----------------------- function------------------------ */

function_definition returns [LOGONode node]
		: Function id LPAREN RPAREN LBRACKET statement_list RBRACKET {$node = new LOGOFunctionNode($id.node.id, "define",  null, $statement_list.node);}
		| Function id LPAREN identifier_list RPAREN LBRACKET statement_list RBRACKET {$node = new LOGOFunctionNode($id.node.id, "define", $identifier_list.list, $statement_list.node);}
    	;

identifier_list returns [LOGOIdList list]
        : Identifier ',' n=identifier_list {$list = new LOGOIdList($Identifier.text, $n.list);}
        | Identifier {$list = new LOGOIdList($Identifier.text);}
        ;

funcall returns [LOGONode node]
		: id LPAREN expression_list RPAREN {$node = new LOGOFunctionNode($id.node.id, "execute", $expression_list.node);}
		;
		
expression_list returns [LOGONode node]
        : l=expression_list ',' expression {$l.node.children.add($expression.node); $node = $l.node;}
        | expression {$node = new LOGOExprListNode($expression.node);}
        | {$node = null;}
        ;

/* -------------------------- challenge ---------------------------*/
challenge returns [LOGONode node]
		: Challenge String
		;

match returns [LOGONode node]
		: Match
		;

catch[RecognitionException e] {throw e;}

Unary_operator
        : '-'
        ;

Forward
        : ('Forward' | 'FORWARD' | 'FD')
        ;

Back
        : ('Back' | 'BACK' | 'BK')
        ;

Left
        : ('Left' | 'LEFT' | 'LT')
        ;

Right
        : ('Right' | 'RIGHT' | 'RT')
        ;

Setx
        : ('SetX' | 'SETX')
        ;

Sety
        : ('SetY' | 'SETY')
        ;

Setxy
        : ('SetXY' | 'SETXY' | 'Teleport' | 'TELEPORT')
        ;

Speed
        : ('Speed' | 'SPEED')
        ;

Print
        : ('Print' | 'PRINT')
        ;

Clearscreen
        : ('Clearscreen' | 'CLEARSCREEN' | 'CS')
        ;

Origin
        : ('Origin' | 'ORIGIN' | 'Home' | 'HOME')
        ;

Wrap
        : ('Wrap' | 'WRAP')
        ;

Fence
        : ('Fence' | 'FENCE')
        ;

Getx
        : ('Getx' | 'GETX')
        ;

Gety
        : ('Gety' | 'GETY')
        ;

Getxy
        : ('Getxy' | 'GETXY' | 'GPS')
        ;

Penup
        : ('Penup' | 'PENUP' | 'PU')
        ;

Pendown
        : ('Pendown' | 'PENDOWN' | 'PD')
        ;

Hideturtle
        : ('Hideturtle' | 'HIDETURTLE' | 'HT')
        ;

Showturtle
        : ('Showturtle' | 'SHOWTURTLE' |'ST')
        ;
		
Set
		: ('Set' | 'SET' | 'set')
		;
		
If
		: 'if'
		;

Else
		: 'else'
		;

LPAREN
		: '('
		;

RPAREN
		: ')'
		;

LBRACKET
		: '['
		;

RBRACKET
		: ']'
		;
		
While
        : 'while'
        ;

For
        : 'for'
        ;
        
Repeat
		: ('Repeat' | 'repeat' | 'REPEAT')
		;

Function
    	: ('FUNCTION' | 'function')
    	;
    	
Challenge
		: ('Challenge' | 'CHALLENGE' | 'challenge')
		;

Match
		: ('Match' | 'MATCH' | 'match')
		;

Number
        : ('0'..'9')+ ('.' ('0'..'9')+)?
        ;

Identifier
        : [A-Za-z_] [a-zA-z0-9_]*
        ;

String
    	:   [a-zA-z0-9_\"\\\:\;]+
    	;

WS
        :[ \t\r\n]+ -> skip
		;
