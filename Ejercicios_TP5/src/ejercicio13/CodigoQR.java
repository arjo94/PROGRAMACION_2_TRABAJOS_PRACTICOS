/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author 87mar
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional: CodigoQR conoce a su Usuario

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return "QR: " + valor + " para " + usuario;
    }
}
