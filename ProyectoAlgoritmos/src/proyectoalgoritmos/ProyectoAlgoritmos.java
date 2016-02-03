/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import Logica.Algoritmos;
import Logica.Rodales;
import ModuloArchivos.Lectura;
import java.util.ArrayList;
/**
 *Este Proyecto no cumple con las especificaciones del paradigma orientado a objetos
 * Se puede encontrar cosas incomprensibles para otros programadores.
 * @author Soporte
 */
public class ProyectoAlgoritmos {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Lectura lectura = new Lectura();
        Algoritmos funcionalidades = new Algoritmos();
        int numero_maximo = 1000;
        /*Eliminar prueba de lectura posteriormente*/
        ArrayList<Rodales> c = lectura.ReadFile();
        for (Rodales c1 : c) {
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Id " + c1.getId());
            System.out.println("Numero de Arboles " + c1.getNumero_arboles());
            System.out.println("Costo " + c1.getCosto_estimado());
            System.out.println("Inicio fecha " + c1.getFecha_inicio());
            System.out.println("Fin fecha " + c1.getFecha_fin());
            System.out.println("Numero empleados " + c1.getNumero_empleados());
        }
        ImprimirPantalla( funcionalidades.InsertionSort(c));
    }

    public static void ImprimirPantalla(ArrayList <Rodales> entrada_arraylist) {

        ArrayList<Rodales> c =  entrada_arraylist;
        for (Rodales c1 : c) {
            System.out.println("-- Funcion Llamado InsrtionSort--");
            System.out.println("Id " + c1.getId());
            System.out.println("Numero de Arboles " + c1.getNumero_arboles());
            System.out.println("Costo " + c1.getCosto_estimado());
            System.out.println("Inicio fecha " + c1.getFecha_inicio());
            System.out.println("Fin fecha " + c1.getFecha_fin());
            System.out.println("Numero empleados " + c1.getNumero_empleados());
        }

    }

}
