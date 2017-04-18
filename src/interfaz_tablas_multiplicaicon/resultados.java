/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_tablas_multiplicaicon;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class resultados implements tablas{
    
    public static void main(String[] args) {
        resultados r= new resultados();
        int op;
        System.out.println("1 tabla de multiplicar del 5");
        System.out.println("2 tabla de multiplicar del 10");
        System.out.println("3 tabla de multiplicar del 12");
        Scanner sc= new Scanner(System.in);
        System.out.printf("Seleccione una opcion: ");
        op=sc.nextInt();
        
        switch (op){
            case 1:
                r.tabla_multiplicar_5();
                break;
            case 2:
                r.tabla_multiplicar_10();
                break;
            case 3:
                r.tabla_multiplicar_12();
                break;
            default:
                System.out.println("La opcion que ingresastes no existe.");
        }
        
    }
    
    int result=0;
    
    @Override
    public void tabla_multiplicar_5() {
        for (int i=1; i<=12; i++){
            result= 5 * i;
            System.out.println("5 * "+i+" = "+result);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tabla_multiplicar_10() {
        for (int i=1; i<=12; i++){
            result=10 * i;
            System.out.println("10 * "+i+" = "+result);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tabla_multiplicar_12() {
        for (int i=1; i<=12; i++){
            result=12 * i;
            System.out.println("12 * "+i+" = "+result);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
