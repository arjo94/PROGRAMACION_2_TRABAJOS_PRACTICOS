/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_interfaces_y_excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");

        try {
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe o la ruta es incorrecta.");
        }
    }
}
