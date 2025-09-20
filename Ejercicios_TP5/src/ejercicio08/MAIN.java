/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana Lopez", "ana@example.com");
        FirmaDigital firma1 = new FirmaDigital("HASH123456", "2025-09-19", usuario1);
        Documento doc1 = new Documento("Contrato", "Contenido del contrato", firma1);

        System.out.println(doc1);
    }
}
