/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author 87mar
 */
public class GeneradorQR {
    // Método generar: dependencia de creación de CodigoQR
    public void generar(String valor, Usuario usuario) {
        // Se crea un objeto CodigoQR dentro del método, pero no se guarda como atributo
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Generado: " + qr);
    }
}
