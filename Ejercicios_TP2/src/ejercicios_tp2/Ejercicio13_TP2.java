/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp2;

/**
 *
 * @author 87mar
 */
public class Ejercicio13_TP2 {
    // Funcion recursiva para mostrar los precios originales
    public static void mostrarPreciosOriginales ( double[] precios, int indice) {
        // Caso base: si el indice es igual a la longitud del array, se detiene la recursion
        if (indice >= precios.length) {
            return;
        }
        
        //Mostrar el precio en el indice actual
        System.out.println("Precio: $" + precios[indice]);
        
        // Llamada recursiva para el siguiente indice
        mostrarPreciosOriginales(precios, indice + 1);
    }
    
    // Funcion recursiva para mostrar los precios modificados
    public static void mostrarPreciosModificados(double[] precios, int indice) {
        // caso base: si el indice es igual a la longitud del array, se detiene la 
        
        if(indice >= precios.length) {
            return;
        }
        
        // Mostrar el precio en el indice actual
        System.out.println("Precio: $" + precios[indice]);
        
        // Llamada recursiva para el siguiente indice
        mostrarPreciosModificados(precios, indice + 1);
        
    }
        public static void main(String[] args) {
         // a. Declarar e inicializar el array con los precios de algunos productos
         double[] precios = {199.99, 299.5, 149.75, 399.0, 89.89};
         
           // b. Mostrar los precios originales usando recursión
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);

        // c. Modificar el precio de un producto específico (en este caso el tercero)
        precios[2] = 129.99;

        // d. Mostrar los precios modificados usando recursión
        System.out.println("\nPrecios modificados:");
        mostrarPreciosModificados(precios, 0);
    }
    
}
