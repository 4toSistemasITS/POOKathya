/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_excepciones;

/**
 *
 * @author usuario
 */
public class excepciones extends Exception{

    public excepciones(String message) {
        super(message);
    }
    
    public static void vereficar_numeros(int n1, int n2) throws excepciones{
        if (n1<0 || n2<0){
            throw new excepciones("\nNo se puede continuar\nLos numeros ingresados son negativos");
        }
    }
    
}
