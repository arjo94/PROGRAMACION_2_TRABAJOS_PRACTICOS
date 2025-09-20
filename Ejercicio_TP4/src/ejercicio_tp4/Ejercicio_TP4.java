/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_tp4;

/**
 *
 * @author 87mar
 */
public class Ejercicio_TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Intancio empleados con ambos contructores
        Empleado e1 = new Empleado("Paola Popis", "Analista");
        Empleado e2 = new Empleado("Vanesa Gomez", "Desallorador");
        Empleado e3 = new Empleado(100, "Maria Diaz", "Gerente", 60000.0);
        
        // Aplico metodos actualizarSalario
        e1.actualizarSalario(10.0); // aumento del 10%
        e2.actualizarSalario(5000); // aumento fijo de 5000
        e3.actualizarSalario(5.0); // aumento del 5%

        // Mostrar informacion de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
