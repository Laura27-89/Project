package com.ucreativa.tracking;

public class Personal extends Actividad {

    private String ejercicio;
    private String hogar;

    public Personal(boolean realizado, int duracion, String animo, String ejercicio, String hogar) {
        super(realizado, duracion, animo);
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
