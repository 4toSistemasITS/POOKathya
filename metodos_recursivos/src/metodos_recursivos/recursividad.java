/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_recursivos;

/**
 *
 * @author usuario
 */
public class recursividad {
   
    public int recursivo(int num, int lim){
        int valor;
        if (num<lim){
            num= num + 1;
            System.out.println("llamar metodo recursivo");
            valor=recursivo(num, lim);
            
        }
        else{
            valor=num;
        }
        return valor;
    }
}
