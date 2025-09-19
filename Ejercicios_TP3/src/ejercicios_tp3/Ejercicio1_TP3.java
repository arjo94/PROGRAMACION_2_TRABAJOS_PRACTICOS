/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * 
 * 
 * @author 87mar
 */
public class Ejercicio1_TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancio un estudiante
        Estudiante est1 = new Estudiante("Martin", "Arjona", "Programacion", 8.5);
        
           // Mostrar informacion inicial
                est1.mostrarInfo();
                
         // Subo calificacion
         est1.subirCalificacion(1.0);
         est1.mostrarInfo();
         
         // Bajo calificacion
         est1.bajarCalificacion(2.5);
         est1.mostrarInfo();
         
               
    }
    
}
