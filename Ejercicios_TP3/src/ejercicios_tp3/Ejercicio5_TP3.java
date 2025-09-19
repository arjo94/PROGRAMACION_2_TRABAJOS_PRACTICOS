/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Ejercicio5_TP3 {
    public static void main(String[] args) {
         // Crear la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);

        // Mostrar estado inicial
        nave.mostrarEstado();

        // Intentar avanzar sin recargar (supongamos distancia 60)
        nave.avanzar(60);  // debería dar advertencia

        // Recargar combustible
        nave.recargarCombustible(30); // ahora tiene 80

        // Avanzar correctamente
        nave.avanzar(60);

        // Mostrar estado final
        nave.mostrarEstado();
    }
}
