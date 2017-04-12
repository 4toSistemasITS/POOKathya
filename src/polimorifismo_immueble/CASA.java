/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorifismo_immueble;

/**
 *
 * @author usuario
 */
public class CASA extends POLIMORIFISMO_IMMUEBLE{
    
    private int numero_pisos;
    private String material;
    private boolean zona_verde;
    private String tipo_techo;

    public CASA() {
    }

    public CASA(int numero_pisos, String material, boolean zona_verde, String tipo_techo) {
        this.numero_pisos = numero_pisos;
        this.material = material;
        this.zona_verde = zona_verde;
        this.tipo_techo = tipo_techo;
    }

    public int getNumero_pisos() {
        return numero_pisos;
    }

    public void setNumero_pisos(int numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isZona_verde() {
        return zona_verde;
    }

    public void setZona_verde(boolean zona_verde) {
        this.zona_verde = zona_verde;
    }

    public String getTipo_techo() {
        return tipo_techo;
    }

    public void setTipo_techo(String tipo_techo) {
        this.tipo_techo = tipo_techo;
    }
    
    
    
//    public static void main(String[] args) {
//        CASA ob3= new CASA();
//        ob3.setDimension(300);
//        ob3.setNumero_pisos(2);
//        
//        double avaluar_casa=ob3.avaluar();
//        System.out.println(avaluar_casa);
//        System.out.println(ob3.comisionar_venta(avaluar_casa));
//        
//    }
    
    public double avaluar() {

        double res;

        res = (dimension*500) * numero_pisos;      
        
        return res;
    }
    //se lo llama directamente al metodo avaluo double res_Avaluo
    public double comisionar_venta(double res_avaluo) {
      
       
        double porcentaje_comision;
        
        
       
        
        if (res_avaluo>100000){
            porcentaje_comision=(res_avaluo*13)/100;
            
        } 
        else{
            porcentaje_comision=(res_avaluo*7)/100;
        }
        
        return porcentaje_comision;
    }
}
