/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorifismo_immueble;

import java.awt.Dimension;

/**
 *
 * @author usuario
 */
public class TERRENO extends POLIMORIFISMO_IMMUEBLE {

    private String tipo_de_suelo;
    private double codigo_catastral;
    private boolean cerramiento;

    public TERRENO() {
    }

    public TERRENO(String tipo_de_suelo, double codigo_catastral, boolean cerramiento) {
        this.tipo_de_suelo = tipo_de_suelo;
        this.codigo_catastral = codigo_catastral;
        this.cerramiento = cerramiento;
    }

    public String getTipo_de_suelo() {
        return tipo_de_suelo;
    }    

    public void setTipo_de_suelo(String tipo_de_suelo) {
        this.tipo_de_suelo = tipo_de_suelo;
    }

    public double getCodigo_catastral() {
        return codigo_catastral;
    }

    public void setCodigo_catastral(double codigo_catastral) {
        this.codigo_catastral = codigo_catastral;
    }

    public boolean isCerramiento() {
        return cerramiento;
    }

    public void setCerramiento(boolean cerramiento) {
        this.cerramiento = cerramiento;
    }

//    public static void main(String[] args) {
// 
//         
//        TERRENO ob1=new TERRENO();
//        //aqui fijo la cantidad del terron con el set dimension 
//        ob1.setDimension(200);
//        //aqui almaceno mi mentodo con una variabe normal double 
//        double avaluo=ob1.avaluar();
//        
//        System.out.println(avaluo);
//        
//        
//        System.out.println(ob1.comisionar_venta(avaluo));
//        
//    }

    public double avaluar() {

        double res;

        res = dimension*500;      
        
        return res;
    }
    //se lo llama directamente al metodo avaluo double res_Avaluo
    public double comisionar_venta(double res_avaluo) {
      
       
        double porcentaje_comision;
        
        
       
        
        if (res_avaluo>50000){
            porcentaje_comision=(res_avaluo*10)/100;
            
        } 
        else{
            porcentaje_comision=(res_avaluo*5)/100;
        }
        
        return porcentaje_comision;
    }

}
