/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Shakira", "Pop");
        Cancion cancion1 = new Cancion("Waka Waka", artista1);

        Reproductor reproductor = new Reproductor();
        // Dependencia de uso: el método reproducir usa un objeto Cancion como parámetro
        reproductor.reproducir(cancion1);
    }
}
