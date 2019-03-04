package com.negociosrdom.fiberoptic.fiberoptic;

public class MLimite {
    private String nombre;
    private int limite;
    private int noBuffer;
    private int noBuffer2;

    public MLimite() {
        this.nombre = "empty";
        this.limite = 0;
        this.noBuffer = 0;
        this.noBuffer2 = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setNoBuffer(int noBuffer) {
        this.noBuffer = noBuffer;
    }

    public int getNoBuffer() {return noBuffer; }

    public void setNoBuffer2(int buffer2){this.noBuffer2 = buffer2;}

    public int getNoBuffer2(){return this.noBuffer2;}
}
