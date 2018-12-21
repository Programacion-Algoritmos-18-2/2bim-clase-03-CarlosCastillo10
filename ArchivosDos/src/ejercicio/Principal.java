/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Principal {
    
    public static void main(String[] args) {
        

        
        LeerArchivo lectura = new LeerArchivo(); // Creamos el objeto de tipo LeerArchivo
        
        OperacionesData operacion = new OperacionesData(); // Creamos el objeto de tipo OperacionesData
        
        lectura.abrirArchivo(); // Llamamos al metodo
       
        operacion.agregarInformacion(lectura.leerRegistros());
        
        System.out.printf("\n\nEl promedio de capacidades es: %.2f\n",operacion.obtener_promedio());
        
        lectura.cerrarArchivo(); // Cerramos el archivo.
        
        
    }
    
}
