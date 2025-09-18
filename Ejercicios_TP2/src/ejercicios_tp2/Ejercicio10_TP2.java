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
public class Ejercicio10_TP2 {
    
   // Metodo para actualizar el stock segun la cantidad vendida y la cantidad recibida
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        // calculo el nuevo stock
        return stockActual - cantidadVendida + cantidadRecibida;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        
        // Calculo nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        // Mostrar el stock nuevo
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        scanner.close();
        
        
        
    }
}
