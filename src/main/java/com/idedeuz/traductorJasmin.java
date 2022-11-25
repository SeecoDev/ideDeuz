package com.idedeuz;

import com.parser.MinionBaseVisitor;
import com.parser.MinionParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

public class traductorJasmin extends MinionBaseVisitor {

    String godines="";
    File archivo=new File("Jasmin.j");
    PrintWriter pw= null;
    boolean ifj=false;

    /**
     * Variable para el control de tipo de if
     * 1= Mayor que
     * 2= Menor que
     * 3=Mayor o Igual
     * 4=Menor o Igual
     */
    int TipoIf=0;

    Scope memoriaPila = new Scope();
    HashMap<String,Integer> mapa = new HashMap<>();
    ArrayList<String> posiciones = new ArrayList<>();
    ArrayList<Integer> posicionesIf = new ArrayList<>();
    ArrayList<Integer> posicionesFor = new ArrayList<>();


    @Override public String visitAsignacionChad(MinionParser.AsignacionChadContext ctx) {

        memoriaPila.asignar(ctx.ID().getText(),(Float)visit(ctx.expr()));
        mapa.put(ctx.ID().getText(), posiciones.indexOf(ctx.ID().getText()));
        if(!mapa.containsKey(ctx.ID().getText())){
            godines = godines + "\n\tistore_"+posiciones.indexOf(ctx.ID().getText());
        }else{
            godines = godines+"\n\tistore_"+mapa.get(ctx.ID().getText());
        }
        return null; }

    @Override public String visitDeclaracionAsignacion(MinionParser.DeclaracionAsignacionContext ctx) {

        memoriaPila.declarar(ctx.ID().getText());
        posiciones.add(ctx.ID().getText());
        memoriaPila.asignar(ctx.ID().getText(),(Float)visit(ctx.expr()));
        mapa.put(ctx.ID().getText(), posiciones.indexOf(ctx.ID().getText()));
        if(!mapa.containsKey(ctx.ID().getText())){
            godines = godines + "\n\tistore_"+posiciones.indexOf(ctx.ID().getText());
        }else{
            godines = godines+"\n\tistore_"+mapa.get(ctx.ID().getText());
        }
        return null;
    }

    @Override public String visitDeclaracionSimple(MinionParser.DeclaracionSimpleContext ctx) {
        memoriaPila.declarar(ctx.ID().getText());
        posiciones.add(ctx.ID().getText());
        return null; }

    @Override public String visitEncabechad(MinionParser.EncabechadContext ctx) {
        godines=
                ".class public Jasmin\n" +
                        ".super java/lang/Object\n\n" +
                        ".method public static main([Ljava/lang/String;)V\n"+
                        "\t.limit stack 10\n\t.limit locals 10\n"
        ;
        return null; }

    @Override public Float visitImpresionString(MinionParser.ImpresionStringContext ctx) {
        godines = godines+ "\n\tgetstatic java/lang/System/out Ljava/io/PrintStream; ";
        godines = godines+ "\n\tldc "+ctx.STRING().getText();
        godines = godines+ "\n\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V";

        return null; }

    @Override public Float visitImpresionExpr(MinionParser.ImpresionExprContext ctx) {
        godines = godines+ "\n\tgetstatic java/lang/System/out Ljava/io/PrintStream; ";
        visit(ctx.expr());
        godines = godines+"\n\tinvokevirtual java/io/PrintStream/println(I)V";
        return null;
    }

    @Override public Integer visitIfChad(MinionParser.IfChadContext ctx) {
        posicionesIf.add(posicionesIf.size());
        ifj = true;
        //Se crea el scope local, con el scope global como parent memoria = new Scope(memoria);
        memoriaPila = new Scope(memoriaPila);
        boolean condicion= (boolean) visit(ctx.condicion());
        if(ctx.elseBasico() != null){
            memoriaPila = new Scope(memoriaPila);
            visit(ctx.elseBasico());
            memoriaPila=memoriaPila.parent();
        }else{
            godines=godines+"\n\tgoto SEGUIR"+(posicionesIf.size()-1);
        }

        godines=godines+"\n\n\tEJEMPLO"+(posicionesIf.size()-1)+":";
        visit(ctx.instrucciones());
        memoriaPila=memoriaPila.parent();

        if(ctx.elseif()!=null){
            for(MinionParser.ElseifContext elseif:ctx.elseif()){
                memoriaPila = new Scope(memoriaPila);
                visit(elseif);
                memoriaPila = memoriaPila.parent();
            }
        }
        godines = godines+"\n\n\tSEGUIR"+(posicionesIf.size()-1)+":";
        return null;
    }

    @Override public Boolean  visitElseChad(MinionParser.ElseChadContext ctx) {
        visit(ctx.instrucciones());
        godines=godines+"\n\tgoto SEGUIR"+(posicionesIf.size()-1);
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

    @Override public Boolean visitForChad(MinionParser.ForChadContext ctx) {
        ifj=false;
        memoriaPila = new Scope(memoriaPila);
        posicionesFor.add(posicionesFor.size());
        visit(ctx.declaracion2());
        godines = godines+"\n\n\tFOR"+(posicionesFor.size()-1)+":";
        visit(ctx.condicion());
        godines=godines+"\n\n\tgoto SEGUIRFOR"+(posicionesFor.size()-1);
        godines=godines+"\n\n\tREPETIR"+(posicionesFor.size()-1)+":";
        visit(ctx.instrucciones());
        visit(ctx.incremento());
        godines=godines+"\n\n\tgoto FOR"+(posicionesFor.size()-1);
        memoriaPila= memoriaPila.parent();
        godines=godines+"\n\n\tSEGUIRFOR"+(posicionesFor.size()-1)+":";
        return null; }

    @Override public String visitIncrementoChad(MinionParser.IncrementoChadContext ctx) {
        godines = godines + "\n\tiload_"+posiciones.indexOf(ctx.ID().getText());
        godines = godines + "\n\tldc 1";
        godines = godines + "\n\tiadd";
        godines = godines + "\n\tistore_"+posiciones.indexOf(ctx.ID().getText());
        return null;
    }



    @Override public Float visitMulDiv(MinionParser.MulDivContext ctx) {
        //Visitas para obtener el valor
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));

        if(ctx.op.getType() == MinionParser.MUL){
            godines=godines+"\n\timul";
            return izq * der; //Multiplicacion
        }else{
            godines=godines+"\n\tidiv";
            return izq / der; //Division
        }
    }

    @Override public Float visitSumRes(MinionParser.SumResContext ctx) {
        //Visitas para obtener el valor
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.SUM){
            godines=godines+"\n\tiadd";
            return izq + der; //Suma
        }else{
            godines=godines+"\n\tisub";
            return izq - der; //Resta
        }
    }

    @Override public Float visitParentesis(MinionParser.ParentesisContext ctx) {
        return (float) visit(ctx.expr());
    }

    @Override public Float visitInt(MinionParser.IntContext ctx) {
        godines=godines+"\n\tldc "+ctx.NUMERO().getText();
        return Float.valueOf(ctx.NUMERO().getText()); //Se devuelve el valor
    }

    @Override public Float visitId(MinionParser.IdContext ctx) {
        godines=godines+"\n\tiload_"+mapa.get(ctx.ID().getText());
        return memoriaPila.regresar(ctx.ID().getText());
    }

    @Override public Boolean visitMayorMenor(MinionParser.MayorMenorContext ctx) {
        float izq = (float) visit(ctx.expr(0));
        float der = (float) visit(ctx.expr(1));
        if(ctx.op.getType() == MinionParser.MAYOR){
            //Si es Mayor
            if(ifj){
                godines = godines+"\n\n\tif_icmpgt EJEMPLO"+(posicionesIf.size()-1);
                ifj=false;
            }else{
                godines = godines+"\n\n\tif_icmpgt REPETIR"+(posicionesFor.size()-1);
            }
            return izq>der;
        }else{
            //Si es Menor
            if(ifj){
                godines = godines+"\n\tif_icmplt EJEMPLO"+(posicionesIf.size()-1);
                ifj=false;
            }else{
                godines = godines+"\n\n\tif_icmplt REPETIR"+(posicionesFor.size()-1);
            }
            return izq<der;
        }
    }

    @Override public Boolean visitIdCondicion(MinionParser.IdCondicionContext ctx) {
        godines=godines+"\n\tiload_"+mapa.get(ctx.ID().getText());
        if(memoriaPila.regresar(ctx.ID().getText())==0){
            godines = godines+"\n\tifeq EJEMPLO"+(posicionesIf.size()-1);
            ifj=false;
            return false;
        }else{
            return true;
        }
    }

    public void cerrar(){
        try {
            godines=godines+"\n\treturn" +
                    "\n.end method";
            FileWriter fichero =  new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            pw.println(godines);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
