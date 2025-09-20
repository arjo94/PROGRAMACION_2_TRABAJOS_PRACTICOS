/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author 87mar
 */
public class Bateria {
    private String modelo;   // Modelo de la batería
    private int capacidad;   // Capacidad en mAh

    // Constructor de la clase
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Representación en texto de la batería
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + "mAh}";
    }
}


