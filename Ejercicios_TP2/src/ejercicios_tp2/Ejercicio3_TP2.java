/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp2;

import java.util.Scanner;

/**
 *
 * @author 87mar
 */
public class Ejercicio3_TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        // Pedir la edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        
        // Clasificar edad
        if (edad < 12 ) {
            System.out.println("Eres un niño. ");   
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente. ");
        } else if (edad > 17 && edad < 60) {
            System.out.println("Eres un adulto. ");
        } else if (edad >= 60) {
            System.out.println("Eres un adulto mayor. ");
        } else {
            System.out.println("Edad no es valida. ");
        }
        input.close();
    }
}
