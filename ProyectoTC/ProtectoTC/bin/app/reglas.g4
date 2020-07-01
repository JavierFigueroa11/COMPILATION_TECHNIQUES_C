grammar reglas;

@header {
    package app;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

WS : [ \n\t\r] -> skip;

//Simbolos de apertura
PA: '(';
PC: ')';
LA : '{';
LC : '}';
CA : '[';
CC: ']';

/*OPERACIONES ARITMETICAS */
SUM : '+';
RES : '-';
MUL : '*';
DIV : '/';
MOD : '%';
INCREMENT : '++';
DECREMENT : '--';

/*OPERACIONES DE COMPARACION */
EQ : '==';
MAY : '>';
MEN : '<';
MAYIG: '=>';
MENIG : '<=';
DIS : '!=';

/* OPERADORES LOGICOS */
OR : '||';
AND : '&&';
NOT : '!';
TRUE  : 'true' ;
FALSE : 'false';

/* ASIGNACIONES */
MASIGUAL : '+=';
MENOSIGUAL : '-=';
PORIGUAL : '*=';
BARRAIGUAL : '/=';
MODULOIGUAL : '%=';
IGUAL : '=';

/*TIPO DE DATOS MAS COMUNES */
INT : 'int';
CHAR : 'char';
DOUBLE : 'double';
VOID : 'void';

/*CICLOS */
FOR : 'for';
IF : 'if';
WHILE : 'while'; 
ELSE : 'else';

/*VARIOS */
COMA : ',';
PYC : ';';
RETURN : 'return';

/* ID Y NUMERO */
ID:(LETRA|'_')((LETRA|NUMERO|'_')+)?;
NUMERO : DIGITO+ ; 
CARACTER : '\u0000'..'\uFFFE' ;
VALORCHAR: '\'' CARACTER '\''  ;
NUMDOUBLE: NUMERO '.' NUMERO;  

//-------------------------------------
prog : instrucciones EOF;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : bloque
            | declaracionDatos PYC
            | asignacionDatos PYC
            | expresion PYC
            | definicionFuncion
            | llamadaFuncion
            | cicloFor
            | cicloWhile
            | cicloIf
            | returnDatos PYC
            | PYC
            | errorPYC
            ;

bloque : LA instrucciones LC 
        ;

tipodato : INT | CHAR | DOUBLE | VOID ;

asignacionDatos : ID asignacion//x = 0
                ;

declaracionDatos : tipodato ID //int x
                |  tipodato ID asignacion//int x = 0
                ;

// = += -= *= /= %=
asignacion : IGUAL exprLog
           | MASIGUAL exprLog
           | MENOSIGUAL exprLog
           | PORIGUAL exprLog
           | BARRAIGUAL exprLog
           | MODULOIGUAL exprLog
           ;

//OR
exprLog : exprLog OR exprAND 
        | exprAND
        ;

//AND
exprAND : exprAND AND exprNOT
        | exprNOT
        ;

//NOT
exprNOT : NOT exprNOT
        | exprComp 
        ;

// == > < >= <= !=
exprComp : exprArit EQ exprArit
        | exprArit MAY exprArit
        | exprArit MEN exprArit
        | exprArit MAYIG exprArit
        | exprArit MENIG exprArit
        | exprArit DIS exprArit
        | exprArit
        ;

// + - * / %
exprArit : exprArit SUM exprArit
        | exprArit RES exprArit
        | exprArit MUL exprArit
        | exprArit DIV exprArit
        | exprArit MOD exprArit
        | factor
        ;   

factor : f NUMERO
       | f ID
       | f NUMDOUBLE 
       | f VALORCHAR
       | PA expresion PC
       ;

// x++ 
expresion : ID MASIGUAL expresion
          | ID MENOSIGUAL expresion
          | ID PORIGUAL expresion
          | ID BARRAIGUAL expresion
          | ID MODULOIGUAL expresion
          | ID INCREMENT
          | ID DECREMENT
          | exprLog
          ;

f : SUM
  | RES
  | NOT
  |
  ;

definicionFuncion : tipodato ID PA parametros PC instruccion
                  | errorPADefFuncion
                  | errorPCDefFuncion
                  ;

parametros : tipodato ID parametros
            | COMA tipodato ID parametros
            | COMA ID parametros
            | ID parametros
            |
            ;

llamadaFuncion : ID PA parametros PC
                |errorPALlamadaFuncion
                |errorPCLlamadaFuncion
               ;


cicloFor : FOR PA declaracionDatos PYC exprLog PYC expresion PC instruccion
        |errorPAFor
        |errorPCFor
        ;

cicloWhile : WHILE PA exprLog PC instruccion
           |errorPAWhile
           |errorPCWhile
            ;
 
cicloIf : IF PA exprLog PC instruccion
        | IF PA exprLog PC instruccion ELSE instruccion
        | errorPAIf
        | errorPCIf
         ;

returnDatos: RETURN exprLog
        | RETURN
        ;

/* Errores sintácticos */

/*Punto y coma */
errorPYC : declaracionDatos 
         | asignacionDatos
         | definicionFuncion
         | returnDatos
         | expresion
         | PYC
         ;

/* Parentesis PC*/
errorPAFor : FOR declaracionDatos PYC exprLog PYC expresion PC instruccion
        ;

errorPAWhile: WHILE exprLog PC instruccion
             ;


errorPAIf : IF exprLog PC instruccion
        | IF exprLog PC instruccion ELSE instruccion
        ;

errorPALlamadaFuncion : tipodato ID parametros PC instruccion;

errorPADefFuncion : tipodato ID parametros PC instruccion
        | tipodato ID parametros PC ;


/* Parentesis PC*/
errorPCFor : FOR PA declaracionDatos PYC exprLog PYC expresion instruccion
        ;

errorPCWhile: WHILE PA exprLog instruccion
             ;


errorPCIf : IF PA exprLog instruccion
        | IF PA exprLog instruccion ELSE instruccion
        ;

errorPCLlamadaFuncion : tipodato ID PA parametros instruccion;

errorPCDefFuncion : tipodato ID PA parametros instruccion
        | ID PA parametros 
        ;