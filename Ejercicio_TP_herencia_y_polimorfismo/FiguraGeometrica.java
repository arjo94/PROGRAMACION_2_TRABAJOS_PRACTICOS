/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public abstract class FiguraGeometrica {
     private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto que cada subclase debe implementar
    public abstract double calcularArea();

    // Método común para todas las figuras
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
    }
}
