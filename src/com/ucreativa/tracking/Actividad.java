package com.ucreativa.tracking;

public class Actividad {

    private boolean realizado;
    private int duracion;
    private String animo;

    public Actividad(boolean realizado, int duracion, String animo) {
        this.realizado = realizado;
        this.duracion = duracion;
        this.animo = animo;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getAnimo() {
        return animo;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAnimo(String animo) {
        this.animo = animo;
    }
}