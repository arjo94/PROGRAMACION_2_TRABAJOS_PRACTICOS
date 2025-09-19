/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Constructor 
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    // Metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("--------------------------------");
    }
    
    // Metodo para simular cumpleaños
    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " ha cumplido un año mas. Ahora tiene " + " años." );
    }
}
