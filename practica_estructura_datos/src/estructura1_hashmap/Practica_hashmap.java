/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura1_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Practica_hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // primer valor la clave, segundo valor el valor en si
        HashMap <String, String> hola= new HashMap<>();
        hola.put("Nombre", "Kathya");
        hola.put("Apellido", "Neira");
        
        //sale directo
        for (Map.Entry<String, String> entrySet : hola.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println("Clave: "+key+" valor: "+value);
        }
        System.out.println(hola.get("Nombre"));
        //metodos
        System.out.println(hola.containsValue("Kathya"));
        hola.replace("Nombre", "aaa");
        System.out.println(hola.get("Nombre"));
    }
    
}
