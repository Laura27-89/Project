package com.ucreativa.tracking.entities;

public abstract class Actividad {

    private String meta;
    private String prioridad;
    private int duracion;
    private String animo;

    public Actividad(String meta, String prioridad, int duracion, String animo) {
        this.meta = meta;
        this.prioridad = prioridad;
        this.duracion = duracion;
        this.animo = animo;
    }

    public String getMeta() {
        return meta;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getAnimo() {
        return animo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAnimo(String animo) {
        this.animo = animo;
    }
}