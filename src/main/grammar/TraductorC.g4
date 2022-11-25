grammar TraductorC;

    programa: encabezado LA instrucciones LC;
       encabezado: VOID MAIN PA PC #encabechad;

           instrucciones:
           (asignacion|declaracion|declaracion2|impresion|impresion2|ifCuck|forBasico)*;

            //Instrucciones chad
           declaracion: tipo_dato ID ';' #declarachad;
           declaracion2:tipo_dato ID '=' expr ';'  #declarachad2;
           impresion2: PRINT PA STRING PC ';' #imprechad2;
           impresion: PRINT PA expr PC ';' #imprechad;

           asignacion: ID IGUAL expr ';' #asignachad;
            // Control
           ifCuck: IF PA condicion PC LA instrucciones LC elseifCuck* elseCuck? #ifChad;
           elseCuck: ELSE LA instrucciones LC #elsechad;
           elseifCuck:ELSE IF  PA condicion PC LA instrucciones LC #elseifChad;

            //Ciclos
           forBasico: FOR PA declaracion2 condicion ';' incremento PC LA instrucciones LC #forChad;

           //Expr
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
                     TRUE #trueChad
                     |
                     FALSE #falseChad
                     |
                     '!'condicion #negacion
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


            tipo_dato: INT;
            incremento: ID SUM SUM #incrementoChad;
            //Palabras reservadas

            INT: 'dul';
            VOID: 'papoi';
            MAIN: 'banana';
            PRINT: 'poopaye';
            FOR: 'chasy';
            IF:'hana';
            ELSE:'sae';
            TRUE: 'True';
            FALSE: 'False';


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