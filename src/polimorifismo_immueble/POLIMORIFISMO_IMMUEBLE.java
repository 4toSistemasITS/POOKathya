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
public class POLIMORIFISMO_IMMUEBLE {
   
    protected String ubicacion;
    protected double dimension;
    protected double avaluo;
    protected double numero_inmueble;
    protected boolean servicios_basicos;
    protected double latitud;
    protected double longitud;

    public POLIMORIFISMO_IMMUEBLE() {
    }

    public POLIMORIFISMO_IMMUEBLE(String ubicacion, double dimension, double avaluo, double numero_inmueble, boolean servicios_basicos, double latitud, double longitud) {
        this.ubicacion = ubicacion;
        this.dimension = dimension;
        this.avaluo = avaluo;
        this.numero_inmueble = numero_inmueble;
        this.servicios_basicos = servicios_basicos;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    public double getNumero_inmueble() {
        return numero_inmueble;
    }

    public void setNumero_inmueble(double numero_inmueble) {
        this.numero_inmueble = numero_inmueble;
    }

    public boolean isServicios_basicos() {
        return servicios_basicos;
    }

    public void setServicios_basicos(boolean servicios_basicos) {
        this.servicios_basicos = servicios_basicos;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
    }
    
    public double avaluar(){
        
     return 0; 
    }
    
    public double comisionar_venta(){
        
        
       return 0;
    }
    
    
}
