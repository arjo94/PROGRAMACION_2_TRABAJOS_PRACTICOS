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
public class Ejercicio5_TP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int sumaPares = 0;
        
        System.out.print("Ingrese un numero(0 para terminar): ");
        numero = sc.nextInt();
        
        // Mientras no sea 0, se sigue pidiendo numeros
        while(numero != 0) {
            if (numero % 2 == 0) { // verifica si es par
                sumaPares += numero;
            }
            System.out.print("Ingrese un numero(0 para terminar): ");
            numero = sc.nextInt();
        }
        // Mostrar resultado final
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
        sc.close();
    }
}
