/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Ejercicio3_TP3 {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", 1967);
        
        // Mostrar informacion inicial
        libro1.mostrarInfo();
        
        // Intentar cambiar a un año invalido
        libro1.setAnioPublicacion(-1500);
        
        // Intentar camviar a un año valido
        libro1.setAnioPublicacion(1982);
        
        // Mostar informacion final
        libro1.mostrarInfo();
    }
}
