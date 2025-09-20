/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Cortometraje", 15);
        EditorVideo editor = new EditorVideo();

        // Dependencia de creación: EditorVideo genera un Render dentro del método
        editor.exportar("MP4", proyecto1);
    }
}
