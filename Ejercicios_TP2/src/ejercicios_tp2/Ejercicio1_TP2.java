/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp2;

import java.util.Scanner;

/**
 *
 * @author 87mar
 */
public class Ejercicio1_TP2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Ingrese el año deseado: ");
          int anio = input.nextInt();
          
          // Condicion para el año bisiesto
          if (( anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0 ) ) { 
              System.out.println("El año " + anio + " es bisiesto ");
          } else { 
              System.out.println("El año " + anio + " no es bisiesto");
        }
            
    }
}
