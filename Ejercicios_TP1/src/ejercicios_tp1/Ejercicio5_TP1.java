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
public class Ejercicio5_TP1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Pedir los dos numeros al usuario
        System.out.print("Ingrese su primer numero entero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese su segundo numero entero: ");
        int num2 = input.nextInt();
        
        // Operaciones
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
                
            // Para la division verifico que num1 sea distnto de 0
                double division = 0;
                if (num2 != 0) {
                    division = (double) num1 / num2;
                    } else { System.out.println("No es posible dividir entre cero");                 
         }
        
       // Mostrar resultados en pantalla
       
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    
    }
}
