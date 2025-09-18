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
public class Ejercicio4_TP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar datos
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        
        System.out.println("Ingrese la categoria del producto (A,  B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0); // convierte a mayuscula
        
        double descuento = 0;
        
        // Determinar descuento segun categoria
        if (categoria == 'A' ) {
            descuento = 0.10;
        } else if (categoria == 'B' ) {
            descuento = 0.15;
        } else if (categoria == 'C' ) {
            descuento = 0.20;
        } else {
                System.out.println("categoria no valida");
                sc.close();
                return; // termina el programa si la categoria no es la correcta
        }
        
        // Calcula precio final
        double montoDescuento = precio * descuento;
        double precioFinal= precio - montoDescuento;
        
        // Muestra resultados
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        
        sc.close();
    }
}
