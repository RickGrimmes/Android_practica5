package com.example.conversion_practica5.models;

public class Celsius extends Grado{

    public Celsius(Double valor) {
        this.setValor(valor);
        this.setUnidad("C");
    }

    public Celsius parse(Farenheit F){
        Double valor = (F.getValor() -32) * 5/9;
        return new Celsius(valor);

    }

    public Celsius parse(Kelvin K){
        Double valor = (K.getValor() -273.15);
        return new Celsius(valor);
    }
}
