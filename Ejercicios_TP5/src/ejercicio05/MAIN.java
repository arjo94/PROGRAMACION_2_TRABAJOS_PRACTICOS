/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
         PlacaMadre placa = new PlacaMadre("ASUS ROG STRIX", "Z590");
        Propietario dueño = new Propietario("Carlos Gómez", "12345678");

        Computadora pc = new Computadora("Dell", "SN123456789", placa, dueño);

        System.out.println(pc);
    }
}
