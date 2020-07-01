grammar reglas;

@header {
    package app;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

WS : [ \n\t\r] -> skip;

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

COMA : ',';
ASG : '=';
PYC : ';';
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

/*TIPO DE DATOS MAS COMUNES */
INT : 'int';
CHAR : 'char';
DOUBLE : 'double';
VOID : 'void';

/*CICLOS */
FOR : 'for';
IF : 'if';
WHILE : 'while'; 

ID : LETRA+;
NUMERO : DIGITO+ ; 
OTRO : . ;

//-------------------------------------
prog : instrucciones;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion PYC
            | asignacion PYC
            | bucles
            | funcion
            | llamadaFuncion PYC
            ;

bucles : cicloFor
       | cicloWhile
       | cicloIf
       ;

listaInstruccionesBucle : LA (instruccionBucle)* LC
                    ;

instruccionBucle : instruccion
                  | PYC;

cicloFor :  FOR PA declaracion PYC condition PYC exprArit PC listaInstruccionesBucle
          ;

cicloIf: IF condition listaInstruccionesBucle
         ;

cicloWhile : WHILE PA condition PC listaInstruccionesBucle
            ;

funcion : tipodato ID PA parametros PC LA instrucciones LC
        ;

parametros : declaracion parametros
            | COMA parametros
            | ID parametros
            |
            ;

llamadaFuncion : ID PA parametros PC
               ;

asignacion : ID asig 
           ;

declaracion : tipodato ID 
            | tipodato ID asig
            ;

tipodato : INT
         | CHAR
         | DOUBLE
         | VOID
         ;

asig : ASG exprArit;

condition : exprLogica;

exprLogica  : exprLogica AND exprLogica
            | exprLogica OR exprLogica
            | exprComparab
            | PA exprLogica PC
            | entidadLogica
            ;

exprComparab : operanComparab comparaciones operanComparab
                | PA exprComparab PC
                ;

operanComparab : exprArit
                   ;

entidadLogica : (TRUE | FALSE)
               | ID
               ;

comparaciones : EQ 
          | MAY 
          | MAYIG 
          | MEN 
          | MENIG 
          | DIS
          ;

exprArit    : exprArit MUL exprArit 
            | exprArit DIV exprArit
            | exprArit SUM exprArit
            | exprArit RES exprArit
            | exprArit INCREMENT 
            | exprArit DECREMENT 
            | INCREMENT exprArit
            | DECREMENT exprArit
            | PA exprArit PC
            | factor                      
            ;

factor : f NUMERO
       | f ID
       ;

f : SUM
  | RES
  | NOT
  |
  ;