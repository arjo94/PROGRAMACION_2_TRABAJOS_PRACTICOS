/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Juan Pérez", "20-12345678-9");
        Impuesto impuesto1 = new Impuesto(1500.50, contribuyente1);

        Calculadora calculadora = new Calculadora();
        // Dependencia de uso: el método calcular usa un objeto Impuesto como parámetro
        calculadora.calcular(impuesto1);
    }
}
