/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author 87mar
 */
public class Reserva {
    private String fecha;
    private Cliente cliente;  // Asociación unidireccional: Reserva conoce al Cliente
    private Mesa mesa;        // Agregación: Reserva "usa" Mesa, pero la Mesa existe independientemente

    public Reserva(String fecha, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }

    @Override
    public String toString() {
        return "Reserva para " + cliente + " en " + mesa + " el día " + fecha;
    }
}
