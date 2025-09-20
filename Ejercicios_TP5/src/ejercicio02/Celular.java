/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author 87mar
 */
public class Celular {
    private String imei;       // IMEI del celular
    private String marca;      // Marca del celular
    private String modelo;     // Modelo del celular
    private Bateria bateria;   // Relación de agregación con Bateria
    private Usuario usuario;   // Asociación bidireccional con Usuario

    // Constructor de Celular
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;

        // Establecer la relación bidireccional
        usuario.setCelular(this);
    }

    // Getter de la batería
    public Bateria getBateria() {
        return bateria;
    }

    // Getter del usuario
    public Usuario getUsuario() {
        return usuario;
    }

    // Representación en texto del celular
    @Override
    public String toString() {
        return "Celular{" +
                "imei=" + imei +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
}
