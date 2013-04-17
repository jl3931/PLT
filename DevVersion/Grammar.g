grammar Grammar;

line returns [LOGONode node]
		: conditional_statement EOF
		| expression EOF {$node = $expression.node; LOGOPP.io.debug("line->expr");}
		| command_list EOF {$node = $command_list.node; LOGOPP.io.debug("line->comdlist");}
		;

command_list returns [LOGONode node]
        : command_noarg l=command_list {$node = new LOGOCommandNode("commandList", $command_noarg.node, $l.node);}
        | command_expr l=command_list {$node = new LOGOCommandNode("commandList",$command_expr.node, $l.node);}
        | command_noarg {$node = $command_noarg.node;}
		| command_expr {$node = $command_expr.node;}
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
        : and_expression
        | or_expression '||' and_expression
        ;

and_expression returns [LOGONode node]
        : equality_expression
        | and_expression '&&' equality_expression
        ;

equality_expression returns [LOGONode node]
        : relational_expression
        | equality_expression '=' relational_expression
        | equality_expression '!=' relational_expression
        ;

relational_expression returns [LOGONode node]
        : additive_expression
        | relational_expression '<' additive_expression
        | relational_expression '>' additive_expression
        | relational_expression '>=' additive_expression
        | relational_expression '<=' additive_expression
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
        ;

id returns [LOGONode node]
        : Identifier {$node = new LOGOLeaf($Identifier.text);}
        ;

assignment_expression returns [LOGONode node]
        : Set id expression {$node = new LOGOSetNode($id.node.id, $expression.node);}
        ;

/* -------------- conditional and iterations (implementation still in progress -----*/
// statement list should be a list of statement that can be any statement or command list
conditional_statement returns [LOGONode node]
		: If LPARAN expression RPARAN LBRACKET statement_list RBRACKET
		| If LPARAN expression RPARAN LBRACKET statement_list RBRACKET Else LBRACKET statement_list RBRACKET
		;

iteration_statement returns [LOGONode node]
        : While LPARAN expression RPARAN LBRACKET statement_list RBRACKET
        | For Identifier '=' for_expression LBRACKET statement_list RBRACKET  
        | For LPARAN Identifier '=' for_expression RPARAN LBRACKET statement_list RBRACKET  
        ;

for_expression
    :   expression ':' expression
    |   expression ':' expression ':' expression
    ;
		
/* ----------------------- function (grammar still in progress)------------------------ */

function
		: Function function_declare LBRACKET statement_list RBRACKET
    	;

function_declare
        : function_declare_noret
        | func_return_list '=' function_declare_noret
        ;

function_declare_noret
        : Identifier LPARAN RPARAN
        | Identifier LPARAN func_Identifier_list RPARAN
        ;

func_Identifier_list
        : Identifier
        | func_Identifier_list ',' Identifier
        ;

func_return_list
        : Identifier
        | LPARAN func_Identifier_list RPARAN
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

LPARAN
		: '('
		;

RPARAN
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
        :(' ' | '\t' | '\r'| '\n') -> skip
		;
