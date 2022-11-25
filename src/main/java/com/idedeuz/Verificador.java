package com.idedeuz;

import com.parser.MinionBaseVisitor;
import com.parser.MinionParser;

public class Verificador extends MinionBaseVisitor {
    ideDeuzController c = new ideDeuzController();
    Scope memoria = new Scope();

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las instrucciones basicas
    -------------------------------------------------------------------------------------------------------------------
    */
    @Override public Float visitDeclaracionSimple(MinionParser.DeclaracionSimpleContext ctx){
        memoria.declarar(ctx.ID().getText()); //Declaracion
        return null;
    }

    @Override public String visitDeclaracionAsignacion(MinionParser.DeclaracionAsignacionContext ctx) {
        memoria.declarar(ctx.ID().getText());
        memoria.asignar(ctx.ID().getText(),(float) visit(ctx.expr())); //Declaracion Asignacion
        return null;
    }

    @Override public Float visitImpresionString(MinionParser.ImpresionStringContext ctx) {
        return null; }

    @Override public Float visitImpresionExpr(MinionParser.ImpresionExprContext ctx) {
        visit(ctx.expr());
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
        memoria = new Scope(memoria);
        visit(ctx.condicion());
        visit(ctx.instrucciones());
        memoria = memoria.parent();
        if (ctx.elseif() != null){
            for (MinionParser.ElseifContext elseif: ctx.elseif()){
                memoria = new Scope(memoria);
                visit(elseif);
                System.out.println("Verificador");
                memoria = memoria.parent();
                System.out.println("Se regreso el scope");
            }
        }
        if(ctx.elseBasico() != null){
            memoria = new Scope(memoria);
            visit(ctx.elseBasico());
            memoria = memoria.parent();
        }
        return null;
    }

    @Override public Boolean  visitElseChad(MinionParser.ElseChadContext ctx) {
        visit(ctx.instrucciones());
        return true;
    }

    @Override public Boolean visitElseifChad(MinionParser.ElseifChadContext ctx) {
        visit(ctx.condicion());
        visit(ctx.instrucciones());
        return true;
    }

    /*
    -------------------------------------------------------------------------------------------------------------------
        Visitas a las estructuras repetitivas
    -------------------------------------------------------------------------------------------------------------------
    */

    @Override public String visitForChad(MinionParser.ForChadContext ctx) {
        memoria = new Scope(memoria);
        visit(ctx.declaracion2());
        visit(ctx.condicion());
        visit(ctx.instrucciones());
        memoria=memoria.parent();
        return null;
    }

    @Override public String visitIncrementoChad(MinionParser.IncrementoChadContext ctx) {
        memoria.asignar(ctx.ID().getText(),memoria.regresar(ctx.ID().getText())+1);
        return null;
    }

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
