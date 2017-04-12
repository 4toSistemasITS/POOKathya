/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura_geometrica;

/**
 *
 * @author NUC1
 */
public class cuadrado implements Figura_geometrica{
    //se le añade implements y luego en el error se implementa todos
    @Override
    public double area() {
        return 16;
    }

    @Override
    public double perimetro(int valor) {
        return valor * 2;
    }
}
