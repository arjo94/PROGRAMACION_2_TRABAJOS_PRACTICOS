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
public class Ejercicio2_TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su primer numero: ");
         int num1 = input.nextInt();
         
        System.out.print("Ingrese su segundo numero: ");
         int num2 = input.nextInt();
         
        System.out.print("Ingrese su tercer numero: ");
         int num3 = input.nextInt();
       
     
        // Determina el mayor
        int mayor = num1;
     
        if (num2 > mayor ) {
            mayor = num2;
        }  
        if (num3 > mayor ) {
            mayor = num3;
        }
        // Mostrar resultado
        System.out.println("El mayor es: " + mayor);
        
        input.close();
    }
}
