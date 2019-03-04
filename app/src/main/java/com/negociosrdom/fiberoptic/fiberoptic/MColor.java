package com.negociosrdom.fiberoptic.fiberoptic;

public class MColor {
    private int numero;
    private String nombre;

    public MColor() {
        this.numero = 0;
        this.nombre = "empty";
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

}
