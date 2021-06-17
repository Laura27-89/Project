package com.ucreativa.tracking;

public class Estudio extends Actividad {

    private String materia;
    private String tarea;

    public Estudio(boolean realizado, int duracion, String animo, String materia, String tarea) {
        super(realizado, duracion, animo);
        this.materia = materia;
        this.tarea = tarea;
    }

    public String getMateria() {
        return materia;
    }

    public String getTarea() {
        return tarea;
    }
}
