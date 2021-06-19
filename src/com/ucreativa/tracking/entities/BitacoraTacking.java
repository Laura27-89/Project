package com.ucreativa.tracking.entities;

import java.util.Date;


public class BitacoraTacking {

    private Actividad actividad;
    private Date fecha;
    private String prioridad;

    public BitacoraTacking(Actividad actividad, Date fecha, String prioridad ) {
        this.actividad = actividad;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }
}
