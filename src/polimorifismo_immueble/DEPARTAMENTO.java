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
public class DEPARTAMENTO extends POLIMORIFISMO_IMMUEBLE {
    
    private double metros_construccion;
    private boolean amoblado;
    private int subdivision;
    private String garaje;

    public DEPARTAMENTO() {
    }

    public DEPARTAMENTO(double metros_construccion, boolean amoblado, int subdivision, String garaje) {
        this.metros_construccion = metros_construccion;
        this.amoblado = amoblado;
        this.subdivision = subdivision;
        this.garaje = garaje;
    }

    public double getMetros_construccion() {
        return metros_construccion;
    }

    public void setMetros_construccion(double metros_construccion) {
        this.metros_construccion = metros_construccion;
    }

    public boolean isAmoblado() {
        return amoblado;
    }

    public void setAmoblado(boolean amoblado) {
        this.amoblado = amoblado;
    }

    public int getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(int subdivision) {
        this.subdivision = subdivision;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }
    
    
    
//    public static void main(String[] args) {
//        DEPARTAMENTO ob2=new DEPARTAMENTO();
//        ob2.setDimension(150);
//        ob2.setMetros_construccion(60);
//        ob2.setAmoblado(true);
//        
//        double avaluar_depa=ob2.avaluar();
//        
//        System.out.println(avaluar_depa);
//        System.out.println(ob2.comisionar_venta(avaluar_depa));
//        
//    }
     public double avaluar() {

        double res_deparatmento;
        int valor_amueblado=0;
        if (amoblado==true){
            
            valor_amueblado=2000;
            
            
        }
            res_deparatmento = (dimension*100)+(metros_construccion*200)+valor_amueblado;  

            
        
        return res_deparatmento;
    }
    //se lo llama directamente al metodo avaluo double res_Avaluo
    public double comisionar_venta(double res_avaluo) {
      
       
        double porcentaje_comision;
        
        
       
        
        if (res_avaluo>80000){
            porcentaje_comision=(res_avaluo*11)/100;
            
        } 
        else{
            porcentaje_comision=(res_avaluo*6)/100;
        }
        
        return porcentaje_comision;
    }
}
