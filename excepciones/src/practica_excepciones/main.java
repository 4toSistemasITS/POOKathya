/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_excepciones;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class main {
    public static void main(String[] args) {
        int result;
        int n1;
        int n2;
    
        Scanner sc= new Scanner(System.in);
        System.out.printf("Ingrese el primer numero: ");
        n1=sc.nextInt();
        System.out.printf("Ingrese el segundo numero: ");
        n2=sc.nextInt();
        
        try {
            excepciones.vereficar_numeros(n1, n2);
            result= n1 + n2;
            System.out.println(n1+" + "+n2+" = "+result);
        } catch (excepciones ex) {
            System.out.println(ex);
            //Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
