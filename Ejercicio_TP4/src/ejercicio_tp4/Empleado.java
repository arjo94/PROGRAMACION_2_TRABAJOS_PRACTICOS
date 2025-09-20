/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_tp4;

/**
 *
 * @author 87mar
 */
public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estatico para contar empleados
    private static int totalEmpleados = 0;
    private static int siguienteId = 1; // para asignar id automatico
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) { 
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor que recibe solo nombre y puesto, asignando id y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; // salario por defecto
        totalEmpleados++;
    }
    
    // Metodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }
    
    public void actualizarSalario(int incrementoFijo) {
        this.salario += incrementoFijo;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id =id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    
    // Metodos toString para mostrar informacion del empleado
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }
    
    // Metodos estatico para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
