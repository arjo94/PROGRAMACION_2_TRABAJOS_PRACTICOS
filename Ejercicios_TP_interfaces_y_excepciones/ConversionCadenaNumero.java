/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_interfaces_y_excepciones;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
        } finally {
            sc.close();
            System.out.println("Fin del programa Conversión de Cadena a Número.");
        }
    }
}
