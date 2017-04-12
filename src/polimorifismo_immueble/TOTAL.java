/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorifismo_immueble;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TOTAL {
    
   
    
    public static void main(String[] args) {
        
        int ingresar;
        
        
        //codigo para poder preguntar y al,acenar algo q esscribes de3 un programa
        
        System.out.println("Inmuhebles");
        System.out.println("1 Terreno");
        System.out.println("2 Casa");
        System.out.println("3 Departamento");
        
        Scanner sc=new Scanner(System.in);
        System.out.printf("escoja un aopcion: ");
        ingresar=sc.nextInt();
        
        switch(ingresar){
            case 1:
                System.out.printf("Ingrese la dimension: ");
                int dimension=sc.nextInt();
                
                TERRENO ob1=new TERRENO();
                ob1.setDimension(dimension);
                
                double avaluo=ob1.avaluar();
                System.out.println(avaluo);
                System.out.println(ob1.comisionar_venta(avaluo));
                break;
                
            case 2:
                System.out.printf("Ingrese la dimension: ");
                int dimension1=sc.nextInt();
                System.out.printf("Ingrese el numero de pisos: ");
                int n_pisos=sc.nextInt();
                
                CASA ob3= new CASA();
                ob3. setDimension(dimension1);
                ob3.setNumero_pisos(n_pisos);
                
                double avaluar_casa=ob3.avaluar();
                System.out.println(avaluar_casa);
                System.out.println(ob3.comisionar_venta(avaluar_casa));
                break;
                
            case 3:
                System.out.printf("Ingrese la dimension: ");
                int dimension2=sc.nextInt();
                System.out.printf("Ingrese los metros de construcción: ");
                int m_construccion=sc.nextInt();
                System.out.printf("Ingrese si su departamento es amuheblado(true o false): ");
                boolean amuheblado=sc.nextBoolean();
                
                DEPARTAMENTO ob2=new DEPARTAMENTO();
                ob2.setDimension(dimension2);
                ob2.setMetros_construccion(m_construccion);
                ob2.setAmoblado(amuheblado);
                
                double avaluar_depa=ob2.avaluar();
                System.out.println(avaluar_depa);
                System.out.println(ob2.comisionar_venta(avaluar_depa));
                break;
                
            default:
                System.out.println("La opción que ingresastes no existe");
                
        } 
    }
}
