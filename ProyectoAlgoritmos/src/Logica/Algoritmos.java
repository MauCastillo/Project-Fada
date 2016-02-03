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
        int N = arr.size();
        if (N == 0) {
            return arr;
        }
        /**
         * find max and min values *
         */
        int max = arr.get(0).numero_arboles, min = arr.get(0).numero_arboles;
        for (int i = 1; i < N; i++) {
            if (arr.get(i).numero_arboles > max) {
                max = arr.get(i).numero_arboles;
            }
            if (arr.get(i).numero_arboles < min) {
                min = arr.get(i).numero_arboles;
            }
        }
        int range = max - min + 1;

        /**
         * check if range is small enough for count array *
         */
        /**
         * else it might give out of memory exception while allocating memory
         * for array *
         */
        if (range > numero_maximo) {
            System.out.println("\nError : Range too large for sort");
            return arr;
        }

        int[] count = new int[range];
        /**
         * make count/frequency array for each element *
         */
        for (int i = 0; i < N; i++) {
            count[arr.get(i).numero_arboles - min]++;
        }
        /**
         * modify count so that positions in final array is obtained *
         */
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        /**
         * modify original array *
         */
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (j < count[i]) {
                arr.get(j++).numero_arboles = i + min;
            }
        }
        return arr;
    }

}
