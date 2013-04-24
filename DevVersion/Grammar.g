grammar Grammar;

line returns [LOGONode node]
        : statement_list EOF {$node = $statement_list.node; LOGOPP.io.debug("line->stmt_list");}
        ;
        
statement_list returns [LOGONode node]
        : n=statement_list statement {$n.node.children.add(0, $statement.node); $node = $n.node; LOGOPP.io.debug("stmt_list->stmt_list");}
        | statement {$node = $statement.node; LOGOPP.io.debug("stmt_list->stmt");}
        | challenge
        ;

statement returns [LOGONode node]
        : command {$node = new LOGOStatementNode("statement_list",$command.node); LOGOPP.io.debug("stmt->cmd_list");}
        | expression {$node = new LOGOStatementNode("statement_list",$expression.node); LOGOPP.io.debug("stmt->expr");}
        | conditional_statement {$node = new LOGOStatementNode("statement_list",$conditional_statement.node); LOGOPP.io.debug("stmt->cond");}
        | iteration_statement {$node = new LOGOStatementNode("statement_list",$iteration_statement.node); LOGOPP.io.debug("stmt->iter");}
        | function {$node = new LOGOStatementNode("statement_list",$function.node); LOGOPP.io.debug("stmt->func");}
        | String {$node = null; LOGOPP.io.debug("stmt->str");}
        ;

command returns [LOGONode node]
        : command_noarg {$node = new LOGOCommandNode("command",$command_noarg.node);}
        | command_expr {$node = new LOGOCommandNode("command",$command_expr.node);}
        ;

command_noarg returns [LOGONode node]
    :   Getx {$node =  new LOGOCommandNode("GETX");}
    |   Gety {$node =  new LOGOCommandNode("GETY");}
    |   Getxy {$node =  new LOGOCommandNode("GETXY");}
    |   Clearscreen {$node =  new LOGOCommandNode("CLEARSCREEN");}
    |   Origin {$node =  new LOGOCommandNode("ORIGIN");}
    |   Wrap {$node =  new LOGOCommandNode("WRAP");}
    |   Fence {$node =  new LOGOCommandNode("FENCE");}
    |   Penup {$node =  new LOGOCommandNode("PENUP");}
    |   Pendown {$node =  new LOGOCommandNode("PENDOWN");}
    |   Showturtle {$node =  new LOGOCommandNode("SHOWTURTLE");}
    |   Hideturtle {$node =  new LOGOCommandNode("HIDETURTLE");}
    ;
    
command_expr returns [LOGONode node]
    :   command_onearg additive_expression {$node = new LOGOCommandNode($command_onearg.text, $additive_expression.node);}
    |   command_twoarg additive_expression additive_expression {$node = new LOGOCommandNode($command_twoarg.text, $additive_expression.node);} //two expr
    |   command_content  String {$node = new LOGOCommandNode($command_content.text, null);}
    ;

command_onearg returns [String text]
    :   Forward {$text = new String("FORWARD");}
    |   Back {$text = new String("BACK");}
    |   Left {$text = new String("LEFT");}
    |   Right {$text = new String("RIGHT");}
    |   Setx {$text = new String("SETX");}
    |   Sety {$text = new String("SETY");}
    |   Speed {$text = new String("SPEED");}
    ;

command_twoarg returns [String text]
    :   Setxy {$text = new String("SETXY");}
    ;

command_content returns [String text]
    :   Print {$text = new String("PRINT");}
    ;

expression returns [LOGONode node]
       : or_expression {$node = $or_expression.node; LOGOPP.io.debug("expr->or");}
       //| expression ':' or_expression
       | assignment_expression {$node = $assignment_expression.node; LOGOPP.io.debug("expr->assign");}
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
        : atom {$node = $atom.node; LOGOPP.io.debug("unary->postfix " + $node.id);}
        | Unary_operator atom {$node = new LOGOOperatorNode("u-", $atom.node); LOGOPP.io.debug("unary->primary " + $node.id);}
        ;
        
atom returns [LOGONode node]
        : Number {$node = new LOGOLeaf($Number.text); LOGOPP.io.debug("Number " + $node.id);}
        | id {$node = $id.node; LOGOPP.io.debug("ID");}
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

function returns [LOGONode node]
    :   Function function_declare '{' statement_list '}' 
    //How to create function node?
    {$node = new LOGOFunctionNode($function_declare.node, "define",  null, $function_declare.node);LOGOPP.io.debug("func_noarg");}
    |   function_call {$node = new LOGOFunctionNode($function_call.node, "define",  null, $function_call.node);LOGOPP.io.debug("funcall");}
    ;

function_declare returns [LOGONode node]
        : id '(' ')' {$node = new LOGOFunctionNode($id.node, "define",  null, $id.node);LOGOPP.io.debug("func_noarg");}
        | id '(' func_Identifier_list ')' 
        {$node = new LOGOFunctionNode($id.node, "define", $func_Identifier_list.list, $id.node);LOGOPP.io.debug("func_arg");}
        ;

func_Identifier_list returns [LOGOIdList list]
        : id {$list = new LOGOIdList($id.text); LOGOPP.io.debug("ID_list tail");} //ID first or ID_list first?
        | n = func_Identifier_list ',' id {$list = new LOGOIdList($id.text, $n.list); LOGOPP.io.debug("ID_list");}
        ;

function_call returns [LOGONode node]
    :   id '(' ')' {$node = new LOGOFunctionNode($id.node, "execute", $id.node); LOGOPP.io.debug("funcall test");}
    |   id '('  func_argument_list ')'{$node = new LOGOFunctionNode($id.node, "execute", $func_argument_list.node); LOGOPP.io.debug("funcall test");}
    ;

func_argument_list returns [LOGONode node]
        : additive_expression {$node = new LOGOExprListNode($additive_expression.node); LOGOPP.io.debug("func_argument_list tail");}
        | n = func_argument_list ',' additive_expression {$n.node.children.add($additive_expression.node); $node = $n.node; LOGOPP.io.debug("func_argument_list");}
        ;
        
/* -------------------------- challenge ---------------------------*/
challenge returns [LOGONode node]
        : Challenge String { System.out.println($String.text); $node = null;}
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
        :   '"' (.)*? '"'
        ;
    
WS
        :[ \t\r\n]+ -> skip
        ;
