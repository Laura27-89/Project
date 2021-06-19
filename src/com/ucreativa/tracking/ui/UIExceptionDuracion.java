package com.ucreativa.tracking.ui;

public class UIExceptionDuracion extends Exception {

    public UIExceptionDuracion(String duracion){
        super ("El tiempo de duración esta incorrecto: " + duracion);
    }
}
