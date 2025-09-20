/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
         Foto foto = new Foto("imagen123.jpg", "JPEG");
        Titular titular = new Titular("Juan Perez", "12345678");
        Pasaporte pasaporte = new Pasaporte("P123456", "2025-09-19", foto, titular);

        System.out.println(pasaporte);
    }
}
