package com.ucreativa.tracking.entities;

public abstract class Actividad {

    private String meta;
    private boolean realizado;
    private int duracion;
    private String animo;

    public Actividad(String meta, boolean realizado, int duracion, String animo) {
        this.meta = meta;
        this.realizado = realizado;
        this.duracion = duracion;
        this.animo = animo;
    }

    public String getMeta() {
        return meta;
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