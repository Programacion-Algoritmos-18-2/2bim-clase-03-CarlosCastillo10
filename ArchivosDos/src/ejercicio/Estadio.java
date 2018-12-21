/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author carlos
 */
public class Estadio {
    
    private String nombre_estadio;
    private String tipo_de_deporte;
    private int capacidad;
    
    
    public Estadio(){
        this("","",0);
    }
    
    public Estadio(String n, String tipo, int c){
        agregar_nombre_estadio(n);
        agregar_tipo_de_deporte(tipo);
        agregar_capacidad(c);
            
    }
    
    public void agregar_nombre_estadio(String n){
        
        nombre_estadio = n;
    }
    
    public void agregar_tipo_de_deporte(String tipo){
        
        tipo_de_deporte = tipo;
    }
    
    public void agregar_capacidad(int c){
        
        capacidad = c;
    }   
    
    public String obtener_nombre_estadio(){
        
        return nombre_estadio;
    }
    
     public String obtener_tipo_de_deporte(){
        
        return tipo_de_deporte;
    }
     
    public int obtener_capacidad(){
        
        return capacidad;
    }
    
   
    
    @Override
    public String toString(){
        return String.format("\nNombre de estadio: %s\nTipo de deporte: %s\nCapacidad: %d\n", 
                obtener_nombre_estadio(),obtener_tipo_de_deporte(),obtener_capacidad());
    }
}
