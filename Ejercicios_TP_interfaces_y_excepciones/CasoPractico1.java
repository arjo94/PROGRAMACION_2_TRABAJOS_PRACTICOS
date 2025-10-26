/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_interfaces_y_excepciones;

/**
 *
 * @author PC
 */
public class CasoPractico1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Martín Arjona", "martin@example.com");

        Pedido pedido = new Pedido(cliente1);
        pedido.agregarProducto(new Producto("Mouse inalámbrico", 5000));
        pedido.agregarProducto(new Producto("Teclado mecánico", 12000));
        pedido.agregarProducto(new Producto("Monitor 24\"", 45000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        PagoConDescuento tarjeta = new TarjetaCredito("Martín Arjona", "1234-5678-9012-3456");
        double totalConDescuento = pedido.calcularTotal() * tarjeta.aplicarDescuento(10);

        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Pagado");
    }
}
