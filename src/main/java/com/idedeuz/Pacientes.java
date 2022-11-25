package com.idedeuz;

public class Pacientes {
    String nombre;
    String genero;
    int edad;
    float peso;
    float altura;
    float fa;
    float get;
    float tmb;

    public Pacientes(String nombre, String genero, int edad, float peso, float altura, float fa, float get, float tmb) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.fa = fa;
        this.get = get;
        this.tmb = tmb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getFa() {
        return fa;
    }

    public void setFa(float fa) {
        this.fa = fa;
    }

    public float getGet() {
        return get;
    }

    public void setGet(float get) {
        this.get = get;
    }

    public float getTmb() {
        return tmb;
    }

    public void setTmb(float tmb) {
        this.tmb = tmb;
    }
}
