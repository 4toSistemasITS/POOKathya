/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura2_stack;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class ejercicio {
    public static void main(String[] args) {
        //push agregar y pop remover el ultimo
        Stack ejemplo= new Stack();
        ejemplo.push("Hola");
        ejemplo.push("Mundo");
        ejemplo.push("Que tal");   
        
        ejemplo.pop();
        
        for (Iterator iterator = ejemplo.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                System.out.println(next);
        }
    }    
}
