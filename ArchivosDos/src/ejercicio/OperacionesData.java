/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesData {
    
    ArrayList<Estadio> informacion;
    
    public void agregarInformacion(ArrayList<Estadio> info){
        informacion = info;
    }
    
    public ArrayList<Estadio> obtenerInformacion(){
       
        return informacion;
    }
    
    public double obtener_promedio(){
        
        int suma = 0;
        
        for (int x = 0; x < obtenerInformacion().size(); x++) {
            
            suma += obtenerInformacion().get(x).obtener_capacidad();
        }
        
        return suma / informacion.size();
    }
    
}
