/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author 87mar
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
        // Crear la batería del celular
        Bateria bateria = new Bateria("Bat-5000", 4000);

        // Crear el usuario
        Usuario usuario = new Usuario("Ana Lopez", "98765432");

        // Crear el celular y asociarlo con la batería y el usuario
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S23", bateria, usuario);

        // Mostrar información completa del celular (incluyendo usuario y batería)
        System.out.println(celular);
    }
}
  
