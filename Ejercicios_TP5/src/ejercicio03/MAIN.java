/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial1 = new Editorial("Editorial Sudamericana", "Buenos Aires");

        Libro libro1 = new Libro("Cien Años de Soledad", "123456789", autor1, editorial1);

        System.out.println(libro1);
        }
    }

