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
public class Ejercicio9_TP1 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();  // se usa nextLine()

        System.out.println("Hola, " + nombre);

        scanner.close();
    }
}



        