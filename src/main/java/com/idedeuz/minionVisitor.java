package com.idedeuz;

import com.parser.MinionBaseVisitor;
import com.parser.MinionParser;

import java.util.HashMap;

public class minionVisitor extends MinionBaseVisitor {
    ideDeuzController c = new ideDeuzController();
    Scope memoria = new Scope();

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las instrucciones basicas
    -------------------------------------------------------------------------------------------------------------------
    */
    @Override public Float visitDeclaracionSimple(MinionParser.DeclaracionSimpleContext ctx){
        memoria.declarar(ctx.ID().getText());
        return null;
        }

    @Override public String visitDeclaracionAsignacion(MinionParser.DeclaracionAsignacionContext ctx) {
        memoria.declarar(ctx.ID().getText());
        memoria.asignar(ctx.ID().getText(),(float)visit(ctx.expr()));
        return null;
    }

    @Override public Float visitImpresionString(MinionParser.ImpresionStringContext ctx) {
        c.sacarConsola(ctx.STRING().getText());
        return null; }

    @Override public Float visitImpresionExpr(MinionParser.ImpresionExprContext ctx) {
        c.sacarConsola(String.valueOf((float)visit(ctx.expr())));
        return null;
    }

    @Override public Float visitAsignacionChad(MinionParser.AsignacionChadContext ctx) {
        memoria.asignar(ctx.ID().getText(),(float)visit(ctx.expr()));
        return null;
    }

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las estructuras de control
    -------------------------------------------------------------------------------------------------------------------
    */
    @Override public Integer visitIfChad(MinionParser.IfChadContext ctx) {
        //Se crea el scope local, con el scope global como parent memoria = new Scope(memoria);
        memoria = new Scope(memoria);
        boolean condicion= (boolean) visit(ctx.condicion());
        if (condicion){
            visit(ctx.instrucciones());
            //Si la condicion se cumple se devuelve el scope al global
            memoria= memoria.parent();
            return null;
        }else if(ctx.elseif() != null ){
            //Si no se cumple el if, en caso de tener un else if
            for(MinionParser.ElseifContext elseif: ctx.elseif()) {
                //Se visita el nivel del else If
                boolean cond = (boolean) visit(elseif);
                //Visita el ElseIF para saber si la condicion se cumple
                if(cond == true){
                    //Si la condicion se cumple, despues de realizar las instrucciones, se regresa al scope padre
                    memoria = memoria.parent();
                    return null;
                }
            }
        }if(ctx.elseBasico()!=null) {
            //De no cumplise ninguno de las otras condiciones se realiza el else (de existir)
            visit(ctx.elseBasico());
        }
        //Por ultimo regresa el scope global y termina con la ejecucion de la estructura
        memoria= memoria.parent();
        return null;
    }

    @Override public Boolean  visitElseChad(MinionParser.ElseChadContext ctx) {
        visit(ctx.instrucciones());
        return true;
    }

    @Override public Boolean visitElseifChad(MinionParser.ElseifChadContext ctx) {
        boolean condicion= (boolean) visit(ctx.condicion());
        if(condicion) {
            // Si la condicion se cumple se visitan las instrucciones
            visit(ctx.instrucciones());
            return true;
        } else {
            return false;
        }
    }

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las estructuras repetitivas
    -------------------------------------------------------------------------------------------------------------------
    */

    @Override public String visitForChad(MinionParser.ForChadContext ctx) {
        visit(ctx.declaracion2());
        //Se visita la declaracion implicita en el for para la asignacion de valor en el scope
        while(((boolean) visit(ctx.condicion()))){
            //Mientras la condicion no se cumpla se crea el scope cada vez que se empieza el recorrido para evitar errores
            memoria = new Scope(memoria);
            //Se visitan las instrucciones
            visit(ctx.instrucciones());
            //Se incrementa el valor en la variable declarada en el scope
            visit(ctx.incremento());
            //Se regresa el scope global para volver a iniciar
            memoria=memoria.parent();

        }
        return null;
    }

    @Override public String visitIncrementoChad(MinionParser.IncrementoChadContext ctx) {
        memoria.asignar(ctx.ID().getText(),memoria.regresar(ctx.ID().getText())+1);

        return null; }

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las expresiones de condicion
    -------------------------------------------------------------------------------------------------------------------
    */

    @Override public Boolean visitIgualacion(MinionParser.IgualacionContext ctx) {
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.IGUALACION){
            if (izq==der) {
                return true;
            }else{
                return false;
            }
        }else{
            if (izq!=der) {
                return true;
            }else{
                return false;
            }
        }
    }

    @Override public Boolean visitMayorMenor(MinionParser.MayorMenorContext ctx) {
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.MAYOR){
            if (izq>der) {
                return true;
            }else{
                return false;
            }
        }else{
            if (izq<der) {
                return true;
            }else{
                return false;
            }
        }
    }

    @Override public Boolean visitMayorIgual(MinionParser.MayorIgualContext ctx) {
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.MAYORIGUAL){
            if (izq>=der) {
                return true;
            }else{
                return false;
            }
        }else{
            if (izq<=der) {
                return true;
            }else{
                return false;
            }
        }
    }


    @Override public Boolean visitAnd(MinionParser.AndContext ctx) {
        boolean izq = (boolean) visit(ctx.condicion(0));
        boolean der = (boolean) visit(ctx.condicion(1));
        if (izq==true && der==true){
            return true;
        }else{
            return false;
        }
    }

    @Override public Boolean visitOr(MinionParser.OrContext ctx) {
        boolean izq = (boolean) visit(ctx.condicion(0));
        boolean der = (boolean) visit(ctx.condicion(1));
        if (izq==true || der==true){
            return true;
        }else{
            return false;
        }
    }

    @Override public Boolean visitTrueChad(MinionParser.TrueChadContext ctx) { return true; }

    @Override public Boolean visitFalseChad(MinionParser.FalseChadContext ctx) { return false; }

    @Override public Boolean visitIdCondicion(MinionParser.IdCondicionContext ctx) {
        if (memoria.regresar(ctx.ID().getText())==0){
            return true;
        }else{
            return false;
        }

    }
/*
    @Override public Boolean visitNegacion(MinionParser.NegacionContext ctx) {
        if((boolean) visit(ctx.condicion())){
            return false;
        }else{
            return true;
        }
    }
*/
    @Override public Boolean visitParentesisCondicion(MinionParser.ParentesisCondicionContext ctx) {
        return (boolean) visit(ctx.condicion());
    }

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las expresiones aritmeticas
    -------------------------------------------------------------------------------------------------------------------
    */

    @Override public Float visitMulDiv(MinionParser.MulDivContext ctx) {
        //Visitas para obtener el valor
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));

        if(ctx.op.getType() == MinionParser.MUL){
            return izq * der; //Multiplicacion
        }else{
            return izq / der; //Division
        }
    }

    @Override public Float visitSumRes(MinionParser.SumResContext ctx) {
        //Visitas para obtener el valor
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.SUM){
            return izq + der; //Suma
        }else{
            return izq - der; //Resta
        }
    }

    @Override public Float visitPotenciaRaiz(MinionParser.PotenciaRaizContext ctx) {
        //Visitas para obtener el valor
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.POW){
            return  (float)Math.pow(izq,der);
        }else{
            return  (float)Math.pow(izq,1/der);
        }
    }

    @Override public Float visitParentesis(MinionParser.ParentesisContext ctx) {
        return (float) visit(ctx.expr());
    }

    @Override public Float visitInt(MinionParser.IntContext ctx) {
        return Float.valueOf(ctx.NUMERO().getText()); //Se devuelve el valor
    }

    @Override public Float visitId(MinionParser.IdContext ctx) {
       return memoria.regresar(ctx.ID().getText());
    }

}
