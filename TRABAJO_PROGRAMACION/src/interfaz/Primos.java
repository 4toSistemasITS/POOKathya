/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class Primos implements INTERFACES{

    @Override
    public void numeros_primos(int numero) {
        int d=1;
        int cont=0;
        while (d<=numero){
            if (numero%d==0){
                cont+=1;
            }
            d+=1;
        }
        if (cont<=2){
            System.out.println("El numero ingresado, es un numero primo");
        }
        else{
            System.out.println("El numero ingresado, no es un numero primo");
        }
    }

    @Override
    public void serie_primos(int numero) {
        int d=1;
        int c_d=0;
        int c_n_p=0;
        int nu=1;
        String ca="";
        while (c_n_p<numero){
            while (d<=nu){
                if (nu%d==0){
                    c_d+=1;
                }
                d+=1;
            }
            if (c_d<=2){
                c_n_p+=1;
                ca=ca+"  "+nu;
            }
            d=1;
            c_d=0;
            nu+=1;
        }
        System.out.println("La serie es: \n"+ca);
    }

    @Override
    public void fibonacis(int numero) {
        String f="";
        int a=0;
        int b=1;
        int c=1;
        int fib=0;
        while (c<=numero){
            f=f+fib+"  ";
            fib=a+b;
            b=a;
            a=fib;
            c+=1;
            //System.out.println(f);          
        }
        JOptionPane.showMessageDialog(null, f);
    
    }
  
}
