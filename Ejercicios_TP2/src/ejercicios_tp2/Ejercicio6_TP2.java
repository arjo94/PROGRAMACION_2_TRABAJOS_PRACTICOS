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
public class Ejercicio6_TP2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        // Pedir 10 numeros
        for (int i = 0; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = input.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        // Mostrar resultados
        System.out.println("\nResultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        input.close();
                
            
    }
}
