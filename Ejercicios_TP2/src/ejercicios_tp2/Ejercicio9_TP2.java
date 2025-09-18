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
public class Ejercicio9_TP2 {
        // Funcion para calcular el costo de envio basado en el peso y la zona
        public static double calcularCostoEnvio(double peso, String zona) {
            double costoEnvio = 0;
            
            
            // Determino el costo segun la zona
            if (zona.equalsIgnoreCase("Nacional")) {
                costoEnvio = peso * 5; // $5 por kg para envios nacionales
            } else if (zona.equalsIgnoreCase("Internacional")) {
                costoEnvio = peso * 10; // $10 por kg para envios internacionales
            } else {
                System.out.println("Zona de envio no valida");
            }
            return costoEnvio;
        }
        
        
        // Funcion para calcular el total de la compra 
        public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
            return precioProducto + costoEnvio;
        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Solicitar datos al usuario
            System.out.print("Ingrese el precio:  ");
            double precioProducto = scanner.nextDouble();
            
            System.out.print("Ingrese el peso del paquete en kg: ");
            double peso = scanner.nextDouble();
            
            System.out.print("Ingrese la zona de envio (Nacional/Internacional):  ");
            scanner.nextLine(); // Limpia el buffer
            String zona = scanner.nextLine();
            
            // Calcular costo de envio
            double costoEnvio = calcularCostoEnvio(peso, zona);
            
            // Calcular total a pagar
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            
            // Mostrar resultados
            System.out.println("El costo de envio es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
            
            scanner.close();
          
        }
    }
    

