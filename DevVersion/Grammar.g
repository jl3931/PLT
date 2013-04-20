grammar Grammar;

line returns [LOGONode node]
		: statement_list EOF {$node = $command_list.node; LOGOPP.io.debug("line->comdlist");}
		;
		
statement_list returns [LOGONode node]
		: statement_list command_noarg {$node = new LOGOCommandNode("commandList",$command_noarg.node);}
		| statement_list command_expr {$node = new LOGOCommandNode("commandList",$command_expr.node);}
		| statement_list expression {$node = expression.node;}
		| statement_list conditional_statement {$node = $conditional_statement.node;}
		| statement_list iteration_statement {$node = $iteration_statement.node;}
		| function_definition {$node = $function_definition.node;}
		;

command_list returns [LOGONode node]
        : l=command_list command_noarg {$l.node.children.add($command_noarg.node); $node = $l.node);}
        | l=command_list command_expr {$l.node.children.add($command_expr.node); $node = $l.node);}
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
		: If LPAREN expression RPAREN LBRACKET command_list RBRACKET {$node = new LOGOConditionalNode("if", $expression.node, $command_list.node); LOGOPP.io.debug("if" + $node.id}
		| If LPAREN expression RPAREN LBRACKET n = command_list RBRACKET Else LBRACKET m = command_list RBRACKET{$node = new LOGOConditionalNode("if_else", $expression.node, $n.node, $m.node); LOGOPP.io.debug("if_else" + $node.id}
		;

iteration_statement returns [LOGONode node]
        : While LPAREN expression RPAREN LBRACKET command_list RBRACKET {$node = new LOGOIterationNode("while", $expression.node, $command_list.node); LOGOPP.io.debug("while" + $node.id}
        | For id '=' for_expression LBRACKET command_list RBRACKET {$node = new LOGOIterationNode("for", $id.node, $for_expression.node, $command_list.node); LOGOPP.io.debug("for" + $node.id}
        | For LPAREN id '=' for_expression RPAREN LBRACKET command_list RBRACKET {$node = new LOGOIterationNode("for", $id.node, $for_expression.node, $command_list.node); LOGOPP.io.debug("for" + $node.id}
        ;

for_expression returns [LOGONode node]
    :   expression ':' expression
    |   expression ':' expression ':' expression
    ;

/* ----------------------- function------------------------ */

function_definition returns [LOGONode node]
		: Function id LPAREN RPAREN LBRACKET command_list RBRACKET {$node = new LOGOFunction($id.node.id, "define",  null, $command_list.node);}
		| Function id LPAREN identifier_list RPAREN LBRACKET command_list RBRACKET {$node = new LOGOFunction($id.node.id, "define", $identifier_list.list, $command_list.node);}
    	;

identifier_list returns [LOGOIdList list]
        : Identifier ',' n=identifier_list {$list = new LOGOIdList($Identifier.text, $n.list);}
        | Identifier {$list = new LOGOIdList($Identifier.text);}
        ;

funcall returns [LOGONode node]
		: id LPAREN expression_list RPAREN {$node = new LOGOFunction($id.node.id, "execute", $expression_list.node);}
		;
		
expression_list returns [LOGONodo node]
        : l=expression_list ',' expression {$l.node.children.add($expression.node); $node = $l.node;}
        | expression {$node = new LOGOExpreListNode($expression.node);}
        | {$node = null;}
        ;

/* -------------------------------------------------------------*/

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
		: ('Set' | 'Set' | 'set')
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

Function
    	: ('FUNCTION' | 'function')
    	;

Number
        : ('0'..'9')+ ('.' ('0'..'9')+)?
        ;

Identifier
        : [A-Za-z_] [a-zA-z0-9_]*
        ;

WS
        :[ \t\r\n]+ -> skip
		;
