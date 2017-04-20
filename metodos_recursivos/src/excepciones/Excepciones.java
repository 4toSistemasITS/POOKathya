/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author usuario
 */
public class Excepciones extends Exception{

    public Excepciones(String message) {
        super(message);
    }
    
    public static void validar_numero(int num, int lim) throws Excepciones{
        if (num>lim){
            throw new Excepciones("\nNo se puede continuar\nEl numero es mayor al limite");
        }
    }
    
}
