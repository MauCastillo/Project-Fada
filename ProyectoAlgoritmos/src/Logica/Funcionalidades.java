/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Soporte
 */
public class Funcionalidades {

    public static void comb(ArrayList <Rodales> a, ArrayList<Rodales> b, ArrayList<ArrayList<Rodales>> solutions, int depth) {

        Algoritmos algo = new Algoritmos();
        if (a.size() == depth) {
            a = algo.InsertionSort(a);
            if (!solutions.contains(a)) {
                solutions.add(a);
            }

        }

        for (String str : b) {
            ArrayList <Rodales> aux = new ArrayList <Rodales>();
            ArrayList <Rodales> baux = new ArrayList <Rodales>();
            baux.addAll(b);
            baux.remove(str);
            aux.addAll(a);
            aux.add(str);
            comb(aux, baux, solutions, depth);

            if (!solutions.isEmpty()) {
                break;
            }

        }
    }

}
