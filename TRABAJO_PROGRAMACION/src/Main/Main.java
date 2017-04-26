/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Excepciones.Excepciones;
import interfaz.Primos;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op, num;
        Scanner sc= new Scanner(System.in);
        System.out.println("1 Nùmero Primo");
        System.out.println("2 Serie Primos");
        System.out.println("2 Serie Fibonaci");

        System.out.printf("Escoja una opcion: ");
        op=sc.nextInt();
        
        
        switch (op){
            case 1:
                System.out.printf("Ingrese un numero: ");
                num=sc.nextInt();
        
            try {
                Excepciones.ValidarNumero(num);
                Primos mp= new Primos();
                mp.numeros_primos(num);
            } catch (Excepciones ex) {
                System.out.println(ex);
            }
            break;
            case 2:
                System.out.printf("Ingrese un limite: ");
                num=sc.nextInt();
        
            try {
                Excepciones.ValidarNumero(num);
                Primos mps=new Primos();
                mps.serie_primos(num);
            } catch (Excepciones ex) {
                System.out.println(ex);
            }
      
            break;
            case 3:
                num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite"));       
            try {
                Excepciones.ValidarNumero(num);
                Primos objeto1= new Primos();
                objeto1.fibonacis(num);
            } catch (Excepciones ex) {
                System.out.println(ex);
            }    
            break;
            default:
                System.out.println("La opcion que ingresastes no exciste");
        }
    }
    
}
