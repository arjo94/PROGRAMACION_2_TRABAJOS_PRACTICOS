/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;
    
    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible = combustibleInicial;
        }
        
    }
    
    // Metodo despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(" " + nombre + " ha despegado! Combustible restante: " + combustible);
        } else {
            System.out.println(" Combustible insuficiente para despegar.");
        }
    } 
        // Metodo avanzar
        public void avanzar(int distancia) {
            if (combustible >= distancia) {
                combustible -= distancia;
                System.out.println(" " + nombre + " avanzo " + distancia + " unidades. Combustible restante: " + combustible);
            } else {
                System.out.println(" Combustible insuficiente para avanzar " + distancia + " unidades.");
            }
        }
        
        // Metodo recargar combustible
        public void recargarCombustible(int cantidad) { 
            if (combustible + cantidad > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
            } else {
                combustible += cantidad;
            }
            System.out.println(" " + nombre + " recargo combustible. Combustible actual: " + combustible);
        }
        
        // Mostrar estado
        public void mostrarEstado() {
            System.out.println("Nave: " + nombre);
            System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
            System.out.println("---------------------------------------------------");
        }
    
}
