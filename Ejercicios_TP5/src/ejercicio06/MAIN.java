/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana López", "12345678");
        Mesa mesa1 = new Mesa(5, 4);

        Reserva reserva1 = new Reserva("2025-09-25", cliente1, mesa1);

        System.out.println(reserva1);
    }
}
