/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import ModuloArchivos.Escritura;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Soporte
 */
public class Funcionalidades {

    SimpleDateFormat cambio_Formato_Fecha = new SimpleDateFormat("dd/MM/yyyy");
    Rodal inicial_Rodal = new Rodal();
    ArrayList<Rodal> Solucion = new ArrayList<>();
    public int MaximoNumeroArboles = 0;
    public String idMaximoArboles = "";

    /*Con una Complejida O(n)
        Este algoritmo resuelbe el problema del maximo numero de rodales permitido  solo posee un
    cliclo for que es del tamaño de la entrada*/
    public ArrayList<Rodal> MaximoNumeroRodales(ArrayList<Rodal> entrada) {
        inicial_Rodal = entrada.get(0);
        Solucion.add(inicial_Rodal);
        /*Variableas temporales Para almacenar maximo numero de Arboles*/
        int maximo = 0;
        String MaxId = "";
        /*Con una Complejida O(n)
        Este algoritmo resuelbe el problema del maximo numero de rodales permitido   */
        for (int i = 1; i < entrada.size(); i++) {
            Date date1 = Solucion.get(Solucion.size() - 1).fecha_fin;
            Date date2 = entrada.get(i).fecha_inicio;
            if (!date2.before(date1)) {
                Solucion.add(entrada.get(i));
                maximo += entrada.get(i).numero_arboles;
                MaxId += " " + entrada.get(i).id;
         
            }
        }
        /*Si el Numero de Arboles Obtenidos es Mayor entoces remplace y siempre almacene 
            al mayor resultado y obtenga los numeros id de esta forma redusco la complejida*/
        if (maximo > MaximoNumeroArboles) {
            MaximoNumeroArboles = maximo;
            idMaximoArboles = MaxId;
            maximo = 0;
            MaxId = "";
        }
        return Solucion;
    }

    public void ImprimirPantalla(ArrayList<Rodal> entrada_arraylist) {

        ArrayList<Rodal> c = entrada_arraylist;
        for (Rodal c1 : c) {
            System.out.println("-- Imprimir --");
            System.out.println("Id " + c1.getId());
            System.out.println("Numero de Arboles " + c1.getNumero_arboles());
            System.out.println("Costo " + c1.getCosto_estimado());
            System.out.println("Inicio fecha " + cambio_Formato_Fecha.format(c1.getFecha_inicio()));
            System.out.println("Fin fecha " + cambio_Formato_Fecha.format(c1.getFecha_fin()));
            System.out.println("Numero empleados " + c1.getNumero_empleados());
        }

    }

    public void ImprimirArchivo(ArrayList<Rodal> entrada_arraylist) {
        Escritura escritura = new Escritura();
        ArrayList<Rodal> c = entrada_arraylist;
        escritura.setAddelement(c.size());
        for (int i = 0; i < c.size(); i++) {
            escritura.setAddelement("id: " + entrada_arraylist.get(i).id);
        }
        escritura.setArchivoWrite();
    }

    /*La complejida de Esta funcion es de O(nlgn) porque la suma de la complejidades internas seria de  n + nlgn + n*/
    public void ListaProbar(List<String> entrada, ArrayList<Rodal> archivo) {
        ArrayList<Rodal> orden = new ArrayList<>();
        /*Complejida O(n)
        Creo un reglo partiendo de los indices que reprecentan los espacionde memoria del lo que he leido en la entrda
        ademas almaceno en el arreglo orden para usar el merge sort para determinar si puedo talar*/
        for (int i = 0; i < entrada.size(); i++) {
            int indice_memoria = Integer.parseInt(entrada.get(i));
            orden.add(archivo.get(indice_memoria));
        }
        /*Complejida O(nlgn)
        Ordeno con respecto a la fecha de finalizacion de tala*/
        Algoritmos algoritmos = new Algoritmos();
        orden = algoritmos.mergeSort(orden);
        /*Complejida O(n) el Calculo del Maximo numero de rodales solo cuenta con un ciclo hasta n*/
        MaximoNumeroRodales(orden);
    }

}
