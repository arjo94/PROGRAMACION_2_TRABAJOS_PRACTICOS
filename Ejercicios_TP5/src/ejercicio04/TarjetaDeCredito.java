/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author 87mar
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;

    // Asociación bidireccional: Tarjeta conoce al Cliente
    private Cliente cliente;

    // Agregación: Tarjeta tiene referencia a Banco
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;

        // Vinculación bidireccional
        cliente.setTarjeta(this);
    }

    // Getters y Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    @Override
    public String toString() {
        return "Tarjeta: " + numero + " | Vence: " + fechaVencimiento + " | Cliente: " + cliente + " | Banco: " + banco;
    }
}
