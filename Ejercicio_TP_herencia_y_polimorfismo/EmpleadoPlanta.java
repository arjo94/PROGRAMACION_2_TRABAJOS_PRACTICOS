/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

/**
 *
 * @author PC
 */
public class EmpleadoPlanta extends Empleado {
      private double sueldoBase;
    private double bono;

    public EmpleadoPlanta(String nombre, double sueldoBase, double bono) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bono;
    }
}
