/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class modelo_imc {
    public double peso,altura;

    public modelo_imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void c_imc(){
        double imc;
        imc= this.peso/(this.altura*this.altura);
        if (imc<16){
            JOptionPane.showMessageDialog(null, "Criterio de ingreso en hospital");
        }
        if (imc>=16 && imc<17){
            JOptionPane.showMessageDialog(null, "Infrapeso");
        }
        if (imc>=17 && imc<18){
            JOptionPane.showMessageDialog(null, "Bajo peso");
        }
        if (imc>=18 && imc<25){
            JOptionPane.showMessageDialog(null, "Peso normal (saludable)");
        }
        if (imc>=25 && imc<30){
            JOptionPane.showMessageDialog(null, "Sobre peso (Obesidad de grado I)");
        }
        if (imc>=30 && imc<35){
            JOptionPane.showMessageDialog(null, "Sobre cronico (Obesidad de grado II)");
        }
        if (imc>=35 && imc<40){
            JOptionPane.showMessageDialog(null, "Sobre premorbida (Obesidad de grado III)");
        }
        if (imc>40){
            JOptionPane.showMessageDialog(null, "Sobre morbida (Obesidad de grado IV)");
        }
    }
}
