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

public class Ejercicio8_TP2 {
    
    // Metodo para calcular el precio final
    public static double calcularPrecioFinal (double precioBase, double impuesto, double descuento) {
        // Convierto el impiesto y el descuento de porcentaje a decimal
        double impDecimal = impuesto / 100;
        double descDecimal = descuento / 100;
        
        // Formula: PrecioFinal = PrecioBase + (PrecioBasexImpuesto) -  (PrecioBasexDescuento)
        
        double precioFinal = precioBase + (precioBase * impDecimal) - (precioBase * descDecimal);
        
        return precioFinal;
        
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // Pido los datos al usuario
            System.out.print("Ingrese el precio base del producto: ");
            double precioBase = sc.nextDouble();
            
            System.out.print("Ingrese el impuesto en porcentaje: ");
            double impuesto = sc.nextDouble();
            
            System.out.print("Ingrese el descuento en porcentaje: ");
            double descuento = sc.nextDouble();
            
           // Llamo al metodo del inicio
           double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
           
           // Mostrar el resultado
            System.out.println("El precio final del producto es: " + precioFinal);
        }
    }
    
    
