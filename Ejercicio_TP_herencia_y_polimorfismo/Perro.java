/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public class Perro extends Animal {
     public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau guau!");
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola felizmente.");
    }
}
