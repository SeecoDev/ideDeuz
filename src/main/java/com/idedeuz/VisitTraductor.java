package com.idedeuz;

import com.parser.TraductorBaseVisitor;
import com.parser.TraductorParser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VisitTraductor extends TraductorBaseVisitor {
    String godines="";
    File archivo=new File("src/main/traduccion.txt");
    PrintWriter pw= null;


    @Override public String visitEncabechad(TraductorParser.EncabechadContext ctx) {
        godines=godines+"papoi banana(){\n";
        return null;
    }

    @Override public String visitDeclarachad2(TraductorParser.Declarachad2Context ctx) {
        godines= godines+ "dul "+ctx.ID().getText() + " = " + ctx.expr().getText() + ";\n";
        return null;
    }

    @Override public String visitDeclarachad(TraductorParser.DeclarachadContext ctx) {
        godines=godines+"dul " + ctx.ID().getText() + ";\n";
        return null;
    }

    @Override public String visitImprechad(TraductorParser.ImprechadContext ctx) {
        godines=godines+"poopaye("+ctx.expr().getText()+");\n";
        return null;
    }

    @Override public String visitImprechad2(TraductorParser.Imprechad2Context ctx) {
        godines= godines+ "poopaye("+ctx.STRING().getText()+");\n";
        return null; }

    @Override public String  visitAsignachad(TraductorParser.AsignachadContext ctx) {
        godines=godines+ctx.ID().getText() +"="+ ctx.expr().getText()+";\n";
        return null;
    }

    // Visitas a la estructura de control IF - ELSE - ELSEIF - ELSEIF ELSE
    @Override public String visitElseChad(TraductorParser.ElseChadContext ctx) {
        godines= godines + "sae{ \n" ;
        if (ctx.instrucciones()!=null){
            visit(ctx.instrucciones());
        }
        godines= godines + "\n}";
        return null; }

    @Override public String visitIfChad(TraductorParser.IfChadContext ctx) {
        {
            godines=godines+"hana(" +ctx.condicion().getText()+ "){\n";
            if(ctx.instrucciones()!=null) {
               visit(ctx.instrucciones());
            } godines=godines+" }\n";
            if (ctx.elseif() != null) {
                for (TraductorParser.ElseifContext elseif: ctx.elseif()) {
                    visit(elseif);
                }
            }
            if(ctx.elseBasico() !=null){
                visit(ctx.elseBasico());
            }
            return null;
        }
    }
    @Override public Boolean visitElseifChad(TraductorParser.ElseifChadContext ctx)
    {
        godines=godines+"sae hana(" +ctx.condicion().getText()+ "){\n";
        if(ctx.instrucciones()!=null){
            visit(ctx.instrucciones());
        }
        godines=godines+"}\n";
        return null;
    }

    @Override public String visitForChad(TraductorParser.ForChadContext ctx) {
        godines= godines+"chasy("+ctx.declaracion2().getText()+ctx.condicion().getText()+ctx.incremento().getText()+"){\n";
        if(ctx.instrucciones()!=null){
            visit(ctx.instrucciones());
        }
        godines=godines+"}\n";
        return null; }

    public void cerrar(){
        try {
            FileWriter fichero =  new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            pw.println(godines+"\n}");
            pw.close();
            godines="";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

