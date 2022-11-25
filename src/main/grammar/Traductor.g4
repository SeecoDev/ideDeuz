grammar Traductor;

    programa: encabezado LA instrucciones LC;
       encabezado: VOID MAIN PA PC #encabechad;

           instrucciones:
           (asignacion|declaracion2|declaracion|impresion|impresion2|ifBasico|forBasico)*;

            //Instrucciones chad
           declaracion: tipo_dato ID ';' #declarachad;
           declaracion2:tipo_dato ID '=' expr ';'  #declarachad2;
           impresion2: PRINT PA STRING PC ';' #imprechad2;
           impresion: PRINT PA expr PC ';' #imprechad;

           asignacion: ID IGUAL expr ';' #asignachad;

            // Estructuras de Control
            ifBasico: IF PA condicion PC LA instrucciones LC elseif* elseBasico? #ifChad;
            elseBasico: ELSE LA instrucciones LC #elseChad;
            elseif:ELSE IF  PA condicion PC LA instrucciones LC #elseifChad;

            //Estructuras repetitivas
            forBasico: FOR PA declaracion2 condicion ';' incremento PC LA instrucciones LC #forChad;

            //Expr de condicion
            condicion:
            condicion op =AND condicion #and
            |
            condicion op =OR condicion #or
            |
            expr op = (IGUALACION|DIFERENTE) expr #igualacion
            |
            expr op = (MAYOR|MENOR) expr #mayorMenor
            |
            expr op = (MAYORIGUAL|MENORIGUAL) expr #mayorIgual
            |
            '!'condicion #negacion
            |
            TRUE #trueChad
            |
            FALSE #falseChad
            |
            ID #idCondicion
            ;

            expr:
             '('expr')' #parentesis
             |
             expr op=(POW|SQRT) expr #potenciaRaiz
             |
             expr op = (MUL|DIV) expr #mulDiv
             |
             expr op = (SUM|RES) expr #sumRes
             |
             NUMERO #int
             |
             '-'NUMERO #negativo
             |
             ID #id;


           tipo_dato: FLOAT;
           incremento: ID SUM SUM #incrementoChad;

           //Palabras reservadas
           IF: 'if';
           ELSE: 'else';
           FOR: 'for';
           FLOAT: 'float';
           VOID: 'void';
           MAIN: 'main';
           PRINT: 'printf';
           TRUE : 'True';
           FALSE : 'False';


           //Simbolos
           OR: '||';
           AND: '&&';
           IGUALACION : '==';
           DIFERENTE : '!=';
           MAYOR : '>';
           MENOR : '<';
           MAYORIGUAL: '>=';
           MENORIGUAL: '<=';
           IGUAL: '=';
           POW:'**';
           SQRT:'*/';
           SUM: '+';
           RES: '-';
           MUL: '*';
           DIV: '/';
           PA: '(';
           PC: ')';
           LA:'{';
           LC:'}';

           COMMENT:   '/*' .*? '*/' -> skip;
           COMMENTLINEA:   '//' ~[\r\n]* -> skip;
           ID: [a-zA-Z][a-zA-Z0-9]*;
           NUMERO: ([0-9]*[.])?[0-9]+;
           STRING : '"' ( '\\"' | . )*? '"' ;
           WS:[ \t\r\n]+ -> skip;