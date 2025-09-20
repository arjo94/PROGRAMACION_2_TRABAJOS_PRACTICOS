/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Lopez", "12345678");
        Banco banco1 = new Banco("Banco Nación", "30-12345678-9");

        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "12/27", cliente1, banco1);

        System.out.println(tarjeta1);   
    }
}
