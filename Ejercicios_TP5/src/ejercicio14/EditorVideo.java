/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author 87mar
 */
public class EditorVideo {
    // Método exportar: dependencia de creación de Render
    public void exportar(String formato, Proyecto proyecto) {
        // Se crea un objeto Render dentro del método, pero no se guarda como atributo
        Render render = new Render(formato, proyecto);
        System.out.println("Exportado: " + render);
    }
}
