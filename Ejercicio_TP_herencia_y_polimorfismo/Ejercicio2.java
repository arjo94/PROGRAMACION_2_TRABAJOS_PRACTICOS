/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public class Ejercicio2 {
     public static void main(String[] args) {
        FiguraGeometrica f1 = new Circulo("Círculo", 5.0);
        FiguraGeometrica f2 = new Rectangulo("Rectángulo", 4.0, 6.0);

        f1.mostrarInfo();
        System.out.println();
        f2.mostrarInfo();
    }
}
