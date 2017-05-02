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
public class ejercicio_hashmap {
    public static void main(String[] args) {
        String usuarioi, contraseñai;
        Scanner sc= new Scanner(System.in);
        HashMap<String, String> ejemplo= new HashMap<>();
        
        ejemplo.put("Contraseña", "12345kn");
        ejemplo.put("Usuario", "kathya");
        
        ejemplo.put("Datos", "Personales");
        ejemplo.put("Nombres", "Kathya Yadira");
        ejemplo.put("Apellidos", "Neira Neira");
        ejemplo.put("Cedula", "1105187049");
        ejemplo.put("Especialidad", "Análisis de Sistemas");
        ejemplo.put("Ciclo", "4to");
        
        System.out.printf("Ingrese su usuario: ");
        usuarioi=sc.nextLine();
        
        System.out.printf("Ingrese su contraseña: ");
        contraseñai=sc.nextLine();
        
        if (usuarioi.equals(ejemplo.get("Usuario")) && contraseñai.equals(ejemplo.get("Contraseña"))){
            System.out.println("------------------------------------------");
            System.out.println("Datos: "+ejemplo.get("Datos"));
            System.out.println("Nombres: "+ejemplo.get("Nombres"));
            System.out.println("Apellidos: "+ejemplo.get("Apellidos"));
            System.out.println("Cedula: "+ejemplo.get("Cedula"));
            System.out.println("Especialidad: "+ejemplo.get("Especialidad"));
            System.out.println("Ciclo: "+ejemplo.get("Ciclo"));
            System.out.println("------------------------------------------");
        }
        else{
            System.out.println("El usuario o contraseña son incorrectos");
        }
    }
    
}
