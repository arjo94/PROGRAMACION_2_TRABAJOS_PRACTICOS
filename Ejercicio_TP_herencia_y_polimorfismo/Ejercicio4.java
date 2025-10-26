/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        // Polimorfismo: referencias del tipo Animal apuntan a distintos objetos
        Animal a1 = new Perro("Firulais");
        Animal a2 = new Gato("Michi");
        Animal a3 = new Vaca("Lola");

        a1.hacerSonido();
        a2.hacerSonido();
        a3.hacerSonido();

        System.out.println();

        // Downcasting para acceder a métodos específicos
        if (a1 instanceof Perro) {
            ((Perro) a1).moverCola();
        }

        if (a2 instanceof Gato) {
            ((Gato) a2).ronronear();
        }

        if (a3 instanceof Vaca) {
            ((Vaca) a3).darLeche();
        }
    }
}
