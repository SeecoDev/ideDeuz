package com.idedeuz;

import com.parser.TraductorCBaseVisitor;
import com.parser.TraductorCParser;
import com.parser.TraductorParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VisitTraductorC extends TraductorCBaseVisitor {
    String godines="";
    File archivo=new File("src/main/traduccion.txt");
    PrintWriter pw= null;

    @Override public String visitEncabechad(TraductorCParser.EncabechadContext ctx) {
        godines=godines+"void main(){\n";
        return null;
    }

    @Override public String visitDeclarachad2(TraductorCParser.Declarachad2Context ctx) {
        godines= godines+ "float "+ctx.ID().getText() + " = " + ctx.expr().getText() + ";\n";
        return null;
    }

    @Override public String visitDeclarachad(TraductorCParser.DeclarachadContext ctx) {
        godines=godines+"float " + ctx.ID().getText() + ";\n";
        return null;
    }

    @Override public String visitImprechad(TraductorCParser.ImprechadContext ctx) {
        godines=godines+"printf("+ctx.expr().getText()+");\n";
        return null;
    }

    @Override public String visitImprechad2(TraductorCParser.Imprechad2Context ctx) {
        godines= godines+ "printf("+ctx.STRING().getText()+");\n";
        return null; }

    @Override public String  visitAsignachad(TraductorCParser.AsignachadContext ctx) {
        godines=godines+ctx.ID().getText() +"="+ ctx.expr().getText()+";\n";
        return null;
    }

    @Override public String visitElsechad(TraductorCParser.ElsechadContext ctx) {
        godines= godines + "else{ \n" ;
        if (ctx.instrucciones()!=null){
            visit(ctx.instrucciones());
        }
        godines= godines + "\n}";
        return null; }

    @Override public String visitIfChad(TraductorCParser.IfChadContext ctx) {
        {
            godines=godines+"if(" +ctx.condicion().getText()+ "){\n";
            if(ctx.instrucciones()!=null) {
                visit(ctx.instrucciones());
            } godines=godines+" }\n";
            if (ctx.elseifCuck() != null) {
                for (TraductorCParser.ElseifCuckContext elseif: ctx.elseifCuck()) {
                    visit(elseif);
                }
            }
            if(ctx.elseCuck() !=null){
                visit(ctx.elseCuck());
            }
            return null;
        }
    }

    @Override public Boolean visitElseifChad(TraductorCParser.ElseifChadContext ctx)
    {
        godines=godines+"else if(" +ctx.condicion().getText()+ "){\n";
        if(ctx.instrucciones()!=null){
            visit(ctx.instrucciones());
        }
        godines=godines+"}\n";
        return null;
    }

    @Override public String visitForChad(TraductorCParser.ForChadContext ctx) {
        godines= godines+"for("+ctx.declaracion2().getText()+";"+ctx.condicion().getText()+";"+ctx.incremento().getText()+"){\n";
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

