grammar Logo;

prog : eval EOF;

eval returns [String value]
    :   core {$value =  $core.value; System.out.println($value);}
    |   a = addExp {$value = Double.toString($a.value); System.out.println($value);}
    |
;

/* ------------------------------------- core ------------------------------------- */

core returns [String value]
    :   forward ' ' e = addExp {$value =  $forward.value + ' ' + $e.value;}
    |   back ' ' e = addExp {$value =  $back.value + ' ' + $e.value;}
    |   left ' ' e = addExp {$value =  $left.value + ' ' + $e.value;}
    |   right ' ' e = addExp {$value =  $right.value + ' ' + $e.value;}

    |   setx ' ' e = addExp {$value =  $setx.value + ' ' + $e.value;}
    |   sety ' ' e = addExp {$value =  $sety.value + ' ' + $e.value;}
    |   setxy ' ' e1 = addExp ' ' e2 = addExp {$value =  $setxy.value + ' ' + $e1.value + ' ' + $e2.value;}
    |   getx {$value =  $getx.value;}
    |   gety {$value =  $gety.value;}
    |   getxy {$value =  $getxy.value;}

    |   speed ' ' e = addExp {$value =  $speed.value + ' ' + $e.value;}
    |   print ' ' str = .* {$value =  $print.value + ' ' + $str.getText();} //only match number...
    
    |   clearscreen {$value =  $clearscreen.value;}
    |   origin {$value =  $origin.value;}
    |   showturtle {$value =  $showturtle.value;}SSS
    |   hideturtle {$value =  $hideturtle.value;}
    |   wrap {$value =  $wrap.value;}
    |   fence {$value =  $fence.value;}
    |   penup {$value =  $penup.value;}
    |   pendown {$value =  $pendown.value;}
    
    //|   iter
    //|   repeat addExp
    //|   forever addExp
    ;

forward returns [String value]
    :   c = 'FORWARD' {$value =  $c.getText();}
    |   c = 'FD' {$value =  $c.getText();}
    ;

back returns [String value]
    :   c = 'BACK' {$value =  $c.getText();}
    |   c = 'BK' {$value =  $c.getText();}
    ;

left returns [String value]
    :   c = 'LEFT' {$value =  $c.getText();}
    |   c = 'LT' {$value =  $c.getText();}
    ;

right returns [String value]
    :   c = 'RIGHT' {$value =  $c.getText();}
    |   c = 'RT' {$value =  $c.getText();}
    ;


setx returns [String value]
    :   c = 'SETX' {$value =  $c.getText();}
    ;

sety returns [String value]
    :   c = 'SETY' {$value =  $c.getText();}
    ;

setxy returns [String value]
    :   c = 'SETXY' {$value =  $c.getText();}
    |   c = 'TELEPORT' {$value =  $c.getText();}
    ;

getx returns [String value]
    :   c = 'GETX' {$value =  $c.getText();}
    ;

gety returns [String value]
    :   c = 'GETY' {$value =  $c.getText();}
    ;

getxy returns [String value]
    :   c = 'GETXY' {$value =  $c.getText();}
    |   c = 'GPS' {$value =  $c.getText();}
    ;

speed returns [String value]
    :   c = 'SPEED' {$value =  $c.getText();}
    ;

print returns [String value]
    :   c = 'PRINT' {$value =  $c.getText();}
    ;

clearscreen returns [String value]
    :   c = 'CLEARSCREEN' {$value =  $c.getText();}
    |   c = 'CS' {$value =  $c.getText();}
    ;

origin returns [String value]
    :   c = 'ORIGIN' {$value =  $c.getText();}
    |   c = 'HOME' {$value =  $c.getText();}
    ;

showturtle returns [String value]
    :   c = 'SHOW_TURTLE' {$value =  $c.getText();}
    |   c = 'ST' {$value =  $c.getText();}
    ;

hideturtle returns [String value]
    :   c = 'HIDE_TURTLE' {$value =  $c.getText();}
    |   c = 'HT' {$value =  $c.getText();}
    ;

wrap returns [String value]
    :   c = 'WRAP' {$value =  $c.getText();}
    ;

fence returns [String value]
    :   c = 'FENCE' {$value =  $c.getText();}
    ;

penup returns [String value]
    :   c = 'PEN_UP' {$value =  $c.getText();}
    |   c = 'PU' {$value =  $c.getText();}
    ;

pendown returns [String value]
    :   c = 'PEN_DOWN' {$value =  $c.getText();}
    |   c = 'PD' {$value =  $c.getText();}
    ;

/* ------------------------------------- core ------------------------------------- */

addExp returns [double value]
    :    m1 = multiplyExp       {$value =  $m1.value;}
         ( '+' m2=multiplyExp {$value += $m2.value;}
         | '-' m2=multiplyExp {$value -= $m2.value;}
         )*
    ;

multiplyExp returns [double value]
    :    a1 = atomExp       {$value =  $a1.value;}
         ( '*' a2=atomExp {$value *= $a2.value;}
         | '/' a2=atomExp {$value /= $a2.value;}
         )*
    ;

atomExp returns [double value]
    :   n = Number          {$value = Double.parseDouble($n.text);}
    |   '-' n = Number      {$value = -1 * Double.parseDouble($n.text);}   //unary minus
    |   '(' exp=addExp ')' {$value = $exp.value;}
    |   '-' '(' exp=addExp ')' {$value = -1 * $exp.value;}  //unary minus
    ;

Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;

WS
    :   (' ' | '\t' | '\r'| '\n')+ -> skip

    ;
