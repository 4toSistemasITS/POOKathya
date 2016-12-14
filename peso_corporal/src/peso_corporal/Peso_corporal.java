/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peso_corporal;

import imc.modelo_imc;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Peso_corporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double peso,altura;
        peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en Kg: "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en m: "));
        modelo_imc objeto1= new modelo_imc(peso, altura);
        objeto1.c_imc();
    }
    
}
