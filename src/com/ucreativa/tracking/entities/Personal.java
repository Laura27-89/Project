package com.ucreativa.tracking.entities;

public class Personal extends Actividad {

    private String ejercicio;
    private String hogar;

    public Personal(String meta, String prioridad, int duracion, String animo, String ejercicio, String labor) {
        super(meta, prioridad, duracion, animo);
        this.ejercicio = ejercicio;
        this.hogar = labor;
    }

    public String getEjercicio() {

        return ejercicio;
    }

    public String getLabor() {

        return hogar;
    }

}
