/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura2_stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class sTRAK {

//    Stack sta = new Stack();
//     
    public static void main(String[] args) {
        int asd1;
        Stack sta = new Stack();

        ingresar(sta);

        //impresion_al_Reves(sta);
    }

    public static void ingresar(Stack<String> pila_imprimir) {

        Stack sta = new Stack();

        String a = " ";
        String asd1 = "a";
        String asd2 = "a";
        Scanner sc = new Scanner(System.in);

        while (asd2.equals("a")) {

            System.out.println("Desea comprar un moleto: ");
            asd1 = sc.nextLine();
            if (asd1.equals("si")) {
                System.out.println("nombre de la pelicula: ");
                a = sc.nextLine();
                sta.push(a);

            } else {
                asd2 = "b";
            }
        }
        for (Iterator iterator = sta.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
        for (Iterator iterator = sta.iterator(); iterator.hasNext();) {
            System.out.println(sta.pop() + " eliminado");
        }

    }
}
