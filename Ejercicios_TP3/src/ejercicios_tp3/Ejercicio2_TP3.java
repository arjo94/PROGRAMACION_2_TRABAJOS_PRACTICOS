/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Ejercicio2_TP3 {
    public static void main(String[] args) {
    // Crear una mascota
    Mascota mascota1 = new Mascota("Firulais",  "Perro", 3);
    
    // Mostrar informacion inicial
    mascota1.mostrarInfo();
    
    // Simular el paso del tiempo(cumpleaños)
    mascota1.cumplirAnios();
    mascota1.mostrarInfo();
    
    mascota1.cumplirAnios();
    mascota1.mostrarInfo();
}
}