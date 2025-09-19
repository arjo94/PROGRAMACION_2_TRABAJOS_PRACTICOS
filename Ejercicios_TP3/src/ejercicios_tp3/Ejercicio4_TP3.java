/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Ejercicio4_TP3 {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);
        
        // Mostrar estado inicial
        gallina1.mostarEstado();
        gallina2.mostarEstado();
        
        // Simular acciones
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        // Mostrar estado final 
        gallina1.mostarEstado();
        gallina2.mostarEstado();
    }
}
