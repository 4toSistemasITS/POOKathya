/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos3_arraylist;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Arraylist_ejer {
    
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            System.out.println("vacio");
        }
        
        
        lista.add(4,"Cálculo III");
        lista.add(5,"ingles IV");
        lista.add(3,"Programación IV");
        lista.add(0, "Análisis de Sistemas II");
        lista.add(1,"Base de Datos II");
        lista.add(2,"Cálculo Hardware");
        
        imprimir_ArrayListascendente(lista);
        
        
    }
    
    public static void imprimir_ArrayListascendente(ArrayList<String> valor) {
        for (String string : valor) {
            System.out.println(string);
        }
    }
    
    public static void imprimir_ArrayListadescendenteString(ArrayList<String> lista) {
        for (int i = lista.size()-1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
    
}
