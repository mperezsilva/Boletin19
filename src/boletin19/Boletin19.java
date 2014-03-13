/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;

/**
 *
 * @author mperezsilva
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumnos obx = new Alumnos();
        ArrayList<Alumnos> alu = new ArrayList<Alumnos>();
        obx.crear(alu);
        obx.ver(alu);
        obx.verA(alu);
        obx.alta(alu);
        obx.baja(alu);
        obx.buscar(alu);
        obx.ordenar(alu);
        obx.ver(alu);
    }
}
