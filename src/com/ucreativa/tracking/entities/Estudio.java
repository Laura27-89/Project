package com.ucreativa.tracking.entities;

public class Estudio extends Actividad {

    private String materia;
    private String tarea;

    public Estudio(String meta, String prioridad, int duracion, String animo, String materia, String tarea) {
        super(meta, prioridad, duracion, animo);
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
