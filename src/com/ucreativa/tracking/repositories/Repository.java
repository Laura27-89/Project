package com.ucreativa.tracking.repositories;

import com.ucreativa.tracking.entities.Actividad;

import java.util.Date;
import java.util.List;

public interface Repository {

    void save(Actividad actividad, Date fecha, boolean realizado);

    List<String> get();


}
