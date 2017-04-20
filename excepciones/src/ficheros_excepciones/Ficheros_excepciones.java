/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros_excepciones;

import excepciones.excepciones_Kathya;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modelo_ficheros;

/**
 *
 * @author usuario
 */
public class Ficheros_excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo=new File("excep_ficheros.txt");
        try {
            //excepciones_Kathya.validar_longitud(archivo.getName(), 20);
            excepciones_Kathya.validar_letras(archivo.getName(), "z");
        } catch (excepciones_Kathya ex) {
            System.out.println(ex);
        }
        
//        String cadena="";
//        Scanner sc= new Scanner(System.in);
//        System.out.printf("Ingrese una Cadena para guardar en el archivo: ");
//        cadena=sc.nextLine();
//        modelo.modelo_ficheros ob1= new modelo_ficheros();
//        //ob1.escribir_fichero(archivo, cadena);
//        ob1.escribir_lineas(archivo, cadena);
//        System.out.println("El contenido de ficero es: \n"+ob1.leer_ficheros(archivo));
    }
    
}
