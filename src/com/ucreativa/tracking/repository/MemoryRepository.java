package com.ucreativa.tracking.repository;

import com.ucreativa.tracking.entities.Actividad;
import com.ucreativa.tracking.entities.BitacoraTacking;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemoryRepository {

    private List<BitacoraTacking> db;

    public MemoryRepository() {
        this.db = new ArrayList<>();
    }

    public void save(Actividad actividad, Date fecha, String prioridad) {
        this.db.add(new BitacoraTacking(actividad, fecha, prioridad));

    }

    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        for(BitacoraTacking item : db){
            lines.add(item.getActividad().getMeta()
                    + " - Tiene prioridad: " + item.getPrioridad()
                    +" - " + format.format(item.getFecha()));
        }
        return lines;
    }
}
