/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura1_hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicio2 {
     public static void main(String[] args) {
        String usuarioi, contraseñai;
        Scanner sc= new Scanner(System.in);
        HashMap<Integer, String> ejemplo= new HashMap<>();
        
        ejemplo.put(1, "12345kn");
        ejemplo.put(2, "kathya");
        
        ejemplo.put(3, "Personales");
        ejemplo.put(4, "Kathya Yadira");
        ejemplo.put(5, "Neira Neira");
        ejemplo.put(6, "1105187049");
        ejemplo.put(7, "Análisis de Sistemas");
        ejemplo.put(8, "4to");
        
        System.out.printf("Ingrese su usuario: ");
        usuarioi=sc.nextLine();
        
        System.out.printf("Ingrese su contraseña: ");
        contraseñai=sc.nextLine();
        
        if (usuarioi.equals(ejemplo.get(2)) && contraseñai.equals(ejemplo.get(1))){
            System.out.println("------------------------------------------");
            System.out.println("Datos: "+ejemplo.get(3));
            System.out.println("Nombres: "+ejemplo.get(4));
            System.out.println("Apellidos: "+ejemplo.get(5));
            System.out.println("Cedula: "+ejemplo.get(6));
            System.out.println("Especialidad: "+ejemplo.get(7));
            System.out.println("Ciclo: "+ejemplo.get(8));
            System.out.println("------------------------------------------");
        }
        else{
            System.out.println("El usuario o contraseña son incorrectos");
        }
    }
}
