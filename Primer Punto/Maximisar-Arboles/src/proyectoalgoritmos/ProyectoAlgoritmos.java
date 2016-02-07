/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import Logica.Algoritmos;
import Logica.Funcionalidades;
import java.util.ArrayList;
import Logica.IteradorCombinacion;
import Logica.Rodal;
import ModuloArchivos.Escritura;
import ModuloArchivos.Lectura;
import java.util.Iterator;
import java.util.List;

/**
 * Este Proyecto no cumple con las especificaciones del paradigma orientado a
 * objetos Se puede encontrar cosas incomprensibles para otros programadores.
 *
 * @author Soporte
 */
public class ProyectoAlgoritmos {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        Lectura lectura = new Lectura();
        Funcionalidades funcionalidades = new Funcionalidades();
        ArrayList<Rodal> entrada = lectura.ReadFile();
         long time_start, time_end;
        time_start = System.currentTimeMillis();
        Algoritmos ordenamieto = new Algoritmos();
        List<String> elementos = new ArrayList<>();
        for (int i = 0; i < entrada.size(); i++) {
            elementos.add(""+i);
        }
        int N = entrada.size()/2;
        IteradorCombinacion it = new IteradorCombinacion(elementos, N);
        Iterator s = it.iterator();
        ArrayList l2 = new ArrayList();
        
        while (s.hasNext()) {
            List<String> listares;
            listares = (List<String>) s.next();
            l2.add(listares);
        }
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(" Lista " + l2.get(i));
            funcionalidades.ListaProbar((List<String>) l2.get(i), entrada);
            System.out.println("Maximo Valor: " + funcionalidades.MaximoNumeroArboles +" Id: " + funcionalidades.idMaximoArboles );
        }
         time_end = System.currentTimeMillis();
         System.out.println("the task has taken " + (time_end - time_start) + " milliseconds");
        
        Escritura escribir = new Escritura();
        escribir.StringToken(funcionalidades.idMaximoArboles);
        escribir.setArchivoWrite();
        
        
    }

}
