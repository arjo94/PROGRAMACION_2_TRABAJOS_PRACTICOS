/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public abstract class Empleado {
     protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada subclase debe implementarlo
    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo: $" + calcularSueldo());
        System.out.println("-----------------------------");
    }
    }

