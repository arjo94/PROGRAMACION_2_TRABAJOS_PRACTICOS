/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_interfaces_y_excepciones;

/**
 *
 * @author PC
 */
public class TarjetaCredito implements PagoConDescuento {
     private String titular;
    private String numero;

    public TarjetaCredito(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return 1 - (porcentaje / 100);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito por $" + monto + " realizado correctamente.");
    }
}
