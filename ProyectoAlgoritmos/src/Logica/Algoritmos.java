/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import sun.nio.cs.StreamDecoder;

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
    public ArrayList<Rodales> ContingSort(ArrayList<Rodales> A, int numero_maximo) {
        ArrayList<Rodales> B = new ArrayList<>();
        ArrayList<Rodales> C = new ArrayList<>();
        
       /* for (int i = 0; i < numero_maximo; i++) {
            C.get(i).numero_arboles = 0;
            
        }*/
        
        for (int j = 0; j < A.size(); j++) {
            C.set(A.get(j).numero_arboles, A.get(j+1));            
        }
        
        for (int j = 1; j < numero_maximo ; j++) {
            C.get(j).numero_arboles = (C.get(j).numero_arboles + C.get(j-1).numero_arboles );           
        }
        for (int j = A.size(); j > 0; j--) {
            int indice =  C.get(A.get(j).numero_arboles).numero_arboles;
            B.set(indice, A.get(j));
            int indice2 = A.get(j).numero_arboles;
            C.get(indice2).numero_arboles -= 1;
            C.set(indice2, C.get(indice2));
        }
        
        return B;
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
}
