/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class modelo_ficheros {
    
    //contructor por defecto
    public modelo_ficheros() {
    }
    
    //metodo para escribir un fichero, en una sola linea true
    public void escribir_fichero(File archivo, String cadena){
        try {
            FileWriter fw= new FileWriter(archivo, true);
            fw.write(cadena);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(modelo_ficheros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No se a podido escribir en el archivo \nverifique la ruta");
        }
    }
    
    //metdo para escribir en diferentes lineas
    //recorre el archivo busca el ultimo caracter y escribe en la otra line
    public String escribir_lineas(File archivo, String cadena){
        String nom_file="";
        try {
            FileWriter fw= new FileWriter(archivo, true);
            BufferedWriter dw= new BufferedWriter(fw);
            dw.write(cadena);
            dw.newLine();
            //fw.close();
            dw.close();
            nom_file=archivo.getName();
        } catch (IOException ex) {
            Logger.getLogger(modelo_ficheros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No se a podido escribir en el archivo \nverifique la ruta");
        }
        return nom_file;
    }
    
    //metodo para leer ficheros
    @SuppressWarnings("empty-statement")
    public String leer_ficheros(File archivo){
        String salida1="";
        String salida2="";
        try {
            FileReader fr= new FileReader(archivo);
            BufferedReader bf= new BufferedReader(fr);
            while ((salida1=bf.readLine())!=null){
                //System.out.println(salida1);
                salida2+=salida1+"\n";
            }
        }
//        catch (IOException ex) {
//            Logger.getLogger(modelo_ficheros.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo \nverifique la ruta");
//        }
        catch (FileNotFoundException fd) {
            Logger.getLogger(modelo_ficheros.class.getName()).log(Level.SEVERE, null, fd);
            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo \nverifique la ruta");
        } catch (IOException ex) {
            Logger.getLogger(modelo_ficheros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "errores");
        }
        //
        return salida2;
    }
}
