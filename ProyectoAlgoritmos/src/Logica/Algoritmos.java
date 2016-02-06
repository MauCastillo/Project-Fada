/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
/**
 *
 * En esta Clase esta diseñada para la implementacion de los algoritmos no para
 * la resolucion de los problemas.
 *
 * @author Soporte
 */
public class Algoritmos {

    /* Este algoritmo de ordenamieto tiene una complejida de O(n) */
    /**
     * Counting Sort function de ordenamieto de arboles adaptada Mauro Castillo
     * Este algoritmo lo hize basado en el webSite
     * http://www.sanfoundry.com/java-program-implement-counting-sort/ *
     * @param entrada
     */    /*InsertionSort  Implementado para rodales partiendo de la caracteristica numero arboles*/
    public ArrayList<Rodales> InsertionSort(ArrayList<Rodales> entrada) {
        ArrayList<Rodales> temporal = entrada;
        Rodales key = new Rodales();
        temporal.add(0, key);

        int i = 0;
        for (int j = 0; j < temporal.size(); j++) {
            key = temporal.get(j);
            i = j - 1;

            while (i > 0 && (temporal.get(i).fecha_fin.compareTo(key.fecha_fin) > 0)) {
                temporal.set(i + 1, temporal.get(i));
                i -= 1;
            }
            temporal.set(i + 1, key);
        }
        temporal.remove(0);
        return temporal;
    }

}
