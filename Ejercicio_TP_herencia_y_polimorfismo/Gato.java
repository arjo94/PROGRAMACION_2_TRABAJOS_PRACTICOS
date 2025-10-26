/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }
}
