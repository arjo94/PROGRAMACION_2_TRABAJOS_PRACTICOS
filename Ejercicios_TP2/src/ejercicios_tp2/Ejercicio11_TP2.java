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
public class Ejercicio11_TP2 {
    
    // Variable global que almacena el descuento (10%)
    static double descuento = 0.10;
    
    // Metodo para calcular el descuento especial y el precio final
    public static void calcularDescuentoEspecial(double precio) {
        
        // Calculo el descuento aplicado
        double descuentoAplicado = precio * descuento;
        
        // Calculo el precio final con descuento
        double precioFinal = precio - descuentoAplicado;
        
        // Mostrar el descuento y el precio final
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        // Solicitar el precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        
        // Calculo y mostrar el descuento
        calcularDescuentoEspecial(precio);
        
        sc.close();
    }
    
}
