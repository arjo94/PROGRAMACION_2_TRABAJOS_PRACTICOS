/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana Gomez", "ana@email.com");
        GeneradorQR generador = new GeneradorQR();

        // Dependencia de creación: GeneradorQR genera un CodigoQR dentro del método
        generador.generar("ABC123XYZ", usuario1);
    }
}
