/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp2;

/**
 *
 * @author 87mar
 */
public class Ejercicio12_TP2 {
    public static void main(String[] args) {   
   
        // a. Declarar e inicializar un array con los precios de algunos productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar los valores originales de los precios
        System.out.println("Precios originales: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        
        // c. Modificar el precio de un producto especifico
        // En este caso, vamos a modificar el tercer precio (indice 2)  a 129.99
        precios[2] = 129.99;
        
        // d. Mostrar los valores modificado
        System.out.println("\nPrecios modificados: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
