package com.idedeuz;

import com.parser.PacienteBaseVisitor;
import com.parser.PacienteParser;

public class PacienteVisitor extends PacienteBaseVisitor {

    @Override public Float visitFa(PacienteParser.FaContext ctx) {
        float factor;
        switch (ctx.factor.getType()){
            case PacienteParser.SEDENTARIO:
                factor = (float) 1.2;
                return factor;
            case PacienteParser.LIGERO:
                factor = (float) 1.3;
                return factor;
            case PacienteParser.MODERADO:
                factor = (float) 1.5;
                return factor;
            case PacienteParser.ACTIVO:
                factor = (float) 1.7;
                return factor;
            case PacienteParser.VIGOROSO:
                factor = (float) 1.9;
                return factor;
        }
        return null;
    }

    @Override public String visitPaciente(PacienteParser.PacienteContext ctx) { //Aqui tenemos que meter los datos a la tabla, visitando los demas componentes. Asi con los demas
        float tmb; //Obtendremos estos valores con las visitas
        float get;
        String nombre = (String) visit(ctx.nombre());
        String genero = (String) visit(ctx.genero());
        int edad = visitEdad(ctx.edad());
        float peso = visitPeso(ctx.peso());
        float altura = visitTalla(ctx.talla());
        float fa = visitFa(ctx.fa());
        //TMB segun la formula de Miffin-St.Jeor
        if(Integer.valueOf(genero)==1){
            tmb = (float) ((10*peso)+(6.25*altura)-(5*edad)-161);
        }else{
            tmb = (float) ((10*peso)+(6.25*altura)-(5*edad)+5);
        }
        //GET
        get = tmb * fa;
        //Impresion DEBUG
        pacientesController sacar = new pacientesController();
        sacar.listaPacientes.add(new Pacientes(nombre, genero, edad, peso, altura, fa, get, tmb));
        return null; }

    @Override public String visitNombre(PacienteParser.NombreContext ctx) {
        return ctx.ID().getText(); }

    @Override public String visitGenero(PacienteParser.GeneroContext ctx) {
        if(ctx.sexo.getType() == (PacienteParser.FEMENINO)){
            return "1";
        }else{
            return "2";
        }
    }

    @Override public Float visitTalla(PacienteParser.TallaContext ctx) {
        if(ctx.medida.getType() == PacienteParser.METROS){
            return Float.valueOf(ctx.NUMERO().getText())*100;
        }else{
            return Float.valueOf(ctx.NUMERO().getText());
        }
    }

    @Override public Float visitPeso(PacienteParser.PesoContext ctx) {
        return Float.valueOf(ctx.NUMERO().getText()); }

    @Override public Integer visitEdad(PacienteParser.EdadContext ctx) {
        return Integer.valueOf(ctx.NUMERO().getText()); }

}
