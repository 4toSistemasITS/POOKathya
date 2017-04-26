/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import Main.Main;

/**
 *
 * @author alexis
 */
public class Excepciones extends Exception{

    public Excepciones(String message) {
        super(message);
    }
    public static void ValidarNumero(int N1)throws Excepciones{
        if(!(N1>0)){
             throw new Excepciones("Solo puede ingresar numeros positivos");
        }
    }
}
