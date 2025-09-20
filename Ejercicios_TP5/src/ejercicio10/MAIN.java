/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Laura Gómez", "12345678");
        ClaveSeguridad clave1 = new ClaveSeguridad("ABCD1234", "2025-09-19");
        CuentaBancaria cuenta1 = new CuentaBancaria("123-456-789", 50000.0, clave1, titular1);

        System.out.println(cuenta1);
    }
}
