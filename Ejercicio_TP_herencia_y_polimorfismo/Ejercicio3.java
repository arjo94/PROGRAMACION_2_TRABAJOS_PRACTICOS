/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_herencia_y_polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Ejercicio3 {
    public static void main(String[] args) {
          // Lista polimórfica de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Martín Arjona", 250000, 40000));
        empleados.add(new EmpleadoTemporal("Lucía Pérez", 20, 9000));
        empleados.add(new EmpleadoPlanta("Carlos Gómez", 300000, 50000));
        empleados.add(new EmpleadoTemporal("Sofía Díaz", 15, 8500));

        // Recorremos la lista aplicando polimorfismo
        for (Empleado e : empleados) {
            e.mostrarDatos();
        }
    }
}