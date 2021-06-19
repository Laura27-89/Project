package com.ucreativa.tracking.service;

import com.ucreativa.tracking.entities.Actividad;
import com.ucreativa.tracking.entities.Estudio;
import com.ucreativa.tracking.entities.Personal;
import com.ucreativa.tracking.repositories.Repository;

import java.util.Date;
import java.util.List;

public class TrackingService {

    private Repository repository;

    public TrackingService(Repository repository){
        this.repository = repository;
    }

    public void save(String meta, String prioridad, String txtduracion,
                     String animo, boolean isEstudio, String materia,
                     String tarea, String ejercicio, String hogar, boolean realizado){

        int duracion = Integer.parseInt(txtduracion);
        Actividad actividad;
        if (isEstudio){
            actividad = new Estudio(meta, prioridad, duracion, animo, materia, tarea);
        }else {
            actividad = new Personal(meta, prioridad, duracion, animo, ejercicio, hogar);
        }
        this.repository.save(actividad, new Date(), realizado);
    }

    public List<String> get(){
        return this.repository.get();
    }
}
