/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Estudiante {
    // Atributos
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
    }
    
    // Metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("-----------------------------------------");
    }
    
    // Metodo para subir calificacion
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("La calificacion subio en " + puntos + " puntos.");
    }
    
    // Metodo para bajar calificacion
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        if(this.calificacion < 0) {
            this.calificacion = 0; // evito calificacion negativa
      
        }
        System.out.println("La calificacion bajo en " + puntos + " puntos.");
    }
}

