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
public class Arraylist {
    
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            lista.add("vacio");
        }
        
        imprimir_ArrayListadescendenteString(lista);
        
        lista.add(5,"Elemento 1");
        lista.add(3,"Elemento 2");
        lista.add(8,"Elemento 3");
        lista.add(1,"Elemento 4");
        lista.add(6,"Elemento 5");
        
        //para eliminar el de una posicion
        lista.remove(1);
        
        lista.set(8, "Hola");
        
        //para imprimir
        //imprimir_ArrayListascendente(lista);
        //imprimir_ArrayListadescendenteString(lista);
    }
    
    //es la 4ta opcion la imprime normal
    public static void imprimir_ArrayListascendente(ArrayList<String> valor) {
        for (String string : valor) {
            System.out.println(string);
        }
    }
    
    //imprime de abajo hacia arriva
    public static void imprimir_ArrayListadescendenteString(ArrayList<String> lista) {
        for (int i = lista.size()-1; i >= 0; i--) {
            //System.out.println(lista.get(i));
        }
    }
}
