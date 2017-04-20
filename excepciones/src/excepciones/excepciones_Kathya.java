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
public class excepciones_Kathya extends Exception{

  
    //primero creamos un costurctor q recebira un extring mensage
    public excepciones_Kathya(String message) {
        super(message);
    }
    
    //declaramos un metodo tipo void
    //lo creamos estatico para llamarlo directamente
    public static void validar_longitud(String nombre, int cantidad) throws excepciones_Kathya{
        //creamos un objeto de tipo excepcion cuando no cumplamos la regla q pedimos
        if (nombre.length()<cantidad){
            throw new excepciones_Kathya("La longuitud no es valida"); 
        }
    }
    
    public static void validar_letras(String nombre, String letra) throws excepciones_Kathya{
        //para negar un if es !
        if (! nombre.contains(letra)){
            throw new excepciones_Kathya("no se puede continuar\nel nombre contiene la letra "+ letra);
        }
    }
    
    
}
