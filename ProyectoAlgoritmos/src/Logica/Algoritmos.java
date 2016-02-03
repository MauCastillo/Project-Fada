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
     */
    public ArrayList<Rodales> ContingSort(ArrayList<Rodales> arr, int numero_maximo) {
        for
        
        
    }

    /*InsertionSort  Implementado para rodales partiendo de la caracteristica numero arboles*/
    public ArrayList<Rodales> InsertionSort(ArrayList<Rodales> entrada) {
        ArrayList<Rodales> temporal = entrada;
        Rodales key = new Rodales();
        temporal.add(0, key);

        int i = 0;
        for (int j = 0; j < temporal.size(); j++) {
            key = temporal.get(j);
            i = j - 1;

            while (i > 0 && temporal.get(i).numero_arboles > key.numero_arboles) {
                System.out.println("entro " + i);
                temporal.set(i + 1, temporal.get(i));
                i -= 1;
            }
            temporal.set(i + 1, key);
        }
        temporal.remove(0);
        return temporal;
    }
/*No lo termine*/
    public ArrayList<Rodales> BuquetSort(ArrayList<Rodales> entrada) {
        int n = entrada.size();
        ArrayList<Rodales> temporal = entrada;
        ArrayList<ArrayList<Rodales>> B;
        for (int i = 0; i < n; i++) {

        }
        return entrada;
    }
/*No los termine*/
    public ArrayList<ArrayList<Rodales>> Token(ArrayList<Rodales> entrada, int numero_particiones) {
        int size_particiones = entrada.size() / numero_particiones;
        int inicial = 0;
        int parada = 0;

        for (int i = 0; i < numero_particiones; i++) {
            
        }

    }

}
