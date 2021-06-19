package com.ucreativa.tracking.entities;

public class Personal extends Actividad {

    private String ejercicio;
    private String hogar;

    public Personal(String meta, String prioridad, int duracion, String animo, String ejercicio, String hogar) {
        super(meta, prioridad, duracion, animo);
        this.ejercicio = ejercicio;
        this.hogar = hogar;
    }

    public String getEjercicio() {

        return ejercicio;
    }

    public String getHogar() {

        return hogar;
    }

}
