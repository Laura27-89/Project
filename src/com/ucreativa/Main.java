package com.ucreativa;

import java.util.*;

import com.ucreativa.tracking.entities.Actividad;
import com.ucreativa.tracking.entities.Estudio;
import com.ucreativa.tracking.entities.Personal;
import com.ucreativa.tracking.repository.MemoryRepository;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MemoryRepository repo = new MemoryRepository();
        String meta, realizado, duracion, animo, isEstudio, materia, tarea, ejercicio, hogar, prioridad, print;
        Actividad actividad;

        while (true) {
            System.out.println("Meta:");
            meta = in.nextLine();
            System.out.println("Realizado(S/N):");
            realizado = in.nextLine();
            System.out.println("Duracion:");
            duracion = in.nextLine();
            System.out.println("Ánimo:");
            animo = in.nextLine();
            System.out.println("Estudio(E)/Personal(P):");
            isEstudio = in.nextLine();
            if (isEstudio.equals("E")) {
                System.out.println("Materia:");
                materia = in.nextLine();
                System.out.println("Tarea:");
                tarea = in.nextLine();

                actividad = new Estudio(meta, realizado.equals("S"), Integer.parseInt(duracion), animo, materia, tarea);
            } else {
                System.out.println("Ejercicio:");
                ejercicio = in.nextLine();
                System.out.println("Hogar:");
                hogar = in.nextLine();
                actividad = new Personal(meta, realizado.equals("S"), Integer.parseInt(duracion), animo, ejercicio, hogar);
            }
            System.out.println("Prioridad:");
            prioridad = in.nextLine();
            repo.save(actividad, new Date(), prioridad);
            System.out.println("Desea imprimir el tracking (S)");
            print = in.nextLine();
            if (print.equals("S")) {
                for (String item : repo.get()) {
                    System.out.println(item);
                }
            }
        }//While
    }//Metodo Main
}//Class