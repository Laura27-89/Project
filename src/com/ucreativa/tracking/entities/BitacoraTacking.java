package com.ucreativa.tracking.entities;

import java.util.Date;


public class BitacoraTacking {

    private Actividad actividad;
    private Date fecha;
    private boolean realizado;

    public BitacoraTacking(Actividad actividad, Date fecha, boolean realizado) {
        this.actividad = actividad;
        this.fecha = fecha;
        this.realizado = realizado;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
}
