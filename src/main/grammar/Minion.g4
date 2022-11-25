grammar Minion;
   programa: encabezado LA instrucciones LC;
   encabezado: VOID MAIN PA PC #encabechad;

       instrucciones:
       (asignacion|declaracion|declaracion2|impresion|impresion2|ifBasico|forBasico)*;

        //Set de Instrucciones basicas
       declaracion: tipo_dato ID ';' #declaracionSimple;
       declaracion2:tipo_dato ID '=' expr ';'  #declaracionAsignacion;

       impresion2: PRINT PA STRING PC ';' #impresionString;
       impresion: PRINT PA expr PC ';' #impresionExpr;
       asignacion: ID IGUAL expr ';' #asignacionChad;

        // Estructuras de Control
       ifBasico: IF PA condicion PC LA instrucciones LC elseif* elseBasico? #ifChad;
       elseBasico: ELSE LA instrucciones LC #elseChad;
       elseif:ELSE IF  PA condicion PC LA instrucciones LC #elseifChad;

       //Ciclos
       forBasico: FOR PA (declaracion2|asignacion) condicion ';' incremento PC LA instrucciones LC #forChad;

       //Expr logico
       condicion:
                 '(' condicion ')' #parentesisCondicion
                 |
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

       //Expr aritmetica
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
       FLOAT: 'dul';
       VOID: 'papoi';
       MAIN: 'banana';
       PRINT: 'poopaye';
       IF: 'hana';
       FOR: 'chasy';
       ELSE: 'sae';
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
       POW: '**';
       SQRT: '*/';
       SUM: '+';
       RES: '-';
       MUL: '*';
       DIV: '/';
       PA: '(';
       PC: ')';
       LA: '{';
       LC: '}';

       COMMENT:   '/*' .*? '*/' -> skip;
       COMMENTLINEA:   '//' ~[\r\n]* -> skip;
       ID: [a-zA-Z][a-zA-Z0-9]*;
       NUMERO: ([0-9]*[.])?[0-9]+;
       STRING : '"' ( '\\"' | . )*? '"' ;
       WS:[ \t\r\n]+ -> skip;