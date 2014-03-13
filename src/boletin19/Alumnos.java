/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mperezsilva
 */
public class Alumnos implements Comparable{

    private int nota;
    private String nombre;
    Scanner sca = new Scanner(System.in);

    public Alumnos() {
    }

    public Alumnos(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void crear(ArrayList<Alumnos> alu) {
        System.out.println("cuantos alumnos deseas introducir?");
        int nAl = sca.nextInt();
        for (int i = 0; i <= nAl - 1; i++) {
            System.out.println("introduce nombre");
            nombre = sca.next();
            do {
                System.out.println("introduce nota (entre 1 y 10)");
                nota = sca.nextInt();
            } while (nota <= 0 || nota > 10);
            alu.add(new Alumnos(nota, nombre));
        }
    }

    public void ver(ArrayList<Alumnos> alu) {
        for (Alumnos i : alu) {
            System.out.println(i.getNombre()+" "+i.getNota());
        }

    }

    public void verA(ArrayList<Alumnos> alu) {
        System.out.println("introduce el nombre del alumno deseado");
        String nom = sca.next();
        for (Alumnos o : alu) {
            if (o.getNombre().equals(nom)) {
                System.out.println("este alumno tiene un " + o.getNota());
            }else{
                System.out.println("no hay alumnos con ese nombre");
        }}
    }

    public void alta(ArrayList<Alumnos> alu) {
        System.out.println("introduce nombre");
            nombre = sca.next();
            nota=0;
            alu.add(new Alumnos(nota, nombre));
    }
    public void baja(ArrayList<Alumnos> alu) {
        System.out.println("introduce el nombre del alumno deseado");
        String nom = sca.next();
        for (Alumnos o : alu) {
           if (o.getNombre().equals(nom)) {
                alu.remove(o);
                break;
            }
        }
    }
    public void buscar(ArrayList<Alumnos> alu) {
        System.out.println("introduce el nombre del alumno deseado");
        String nom = sca.next();
        for (Alumnos o : alu) {
            if (o.getNombre().equals(nom)) {
                System.out.println(alu.contains(o));
            }else{
                System.out.println("Alumno no nencontrado, busquelo");
            }
        }
    }
    public void ordenar(ArrayList alums) {
        Collections.sort(alums);
    }

    @Override
    public int compareTo(Object o) {
        Alumnos al = (Alumnos) o;
        if (this.nombre.compareToIgnoreCase(al.nombre) == 0) {
            return 0;
        } else if (this.nombre.compareToIgnoreCase(al.nombre) < 1) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
