/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp1;

import java.util.Scanner;

/**
 *
 * @author 87mar
 */
public class Ejercicio4_TP1 {
    public static void main(String[] args) {
        
        //  Crear objeto Scanner para leer datos desde el teclado
        Scanner input = new Scanner(System.in);
        
        // Solicitar nombre al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        // Solicitar edad al usuario
        System.out.print("Ingre su edad: ");
        int edad = input.nextInt();
        
        // Mostrar resultados}
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        // Cerrar Scanner
        input.close();
        
    
    }
}
