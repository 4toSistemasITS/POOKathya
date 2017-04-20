/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_recursivos;

import excepciones.Excepciones;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Metodos_recursivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int lim;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese un numero: ");
        num = sc.nextInt();

        System.out.printf("Ingrese un limite: ");
        lim = sc.nextInt();

        try {
            Excepciones.validar_numero(num, lim);
            recursividad ob1 = new recursividad();
            System.out.println(ob1.recursivo(num, lim));
        } catch (Excepciones ex) {
            System.out.println(ex);
            //Logger.getLogger(Metodos_recursivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
