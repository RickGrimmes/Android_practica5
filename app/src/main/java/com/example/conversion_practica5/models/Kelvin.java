package com.example.conversion_practica5.models;

public class Kelvin extends Grado{

    public Kelvin(Double valor) {
        this.setValor(valor);
        this.setUnidad("K");
    }

        public Kelvin parse(Farenheit F){
            Double valor = (F.getValor() -32) * 5/9;
            return new Kelvin(valor);

        }

        public Kelvin parse(Celsius C){
            Double valor = (C.getValor() -273.15);
            return new Kelvin(valor);
        }
}
