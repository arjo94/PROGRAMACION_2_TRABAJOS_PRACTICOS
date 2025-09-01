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
public class Ejercicio8b_TP1 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Solicito numero al usuario
        
        System.out.print("Ingrese un primer numero: ");
        double num1 = input.nextInt();
        
        System.out.print("Ingrese un segundo numero: ");
       double num2 = input.nextInt();
        
        // Division con enteros
           
        double division = num1 / num2;
        
        // Muestra el resultado
        System.out.println("Resultado de la division decimal : " + division);
                
      input.close();
    }
}

