/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_colecciones;

/**
 *
 * @author PC
 */
public class Ejercicio_02 {
    public static void main(String[] args) {

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Gabriel García Márquez", "Colombia");
        Autor a3 = new Autor("A003", "Julio Cortázar", "Argentina");

        // Agregar libros
        biblioteca.agregarLibro("L001", "El Aleph", 1949, a1);
        biblioteca.agregarLibro("L002", "Cien Años de Soledad", 1967, a2);
        biblioteca.agregarLibro("L003", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("L004", "Ficciones", 1944, a1);
        biblioteca.agregarLibro("L005", "El amor en los tiempos del cólera", 1985, a2);

        // Listar libros
        biblioteca.listarLibros();

        // Buscar libro por ISBN
        System.out.println("\n🔎 BUSCAR LIBRO POR ISBN (L003):");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar libros por año
        biblioteca.filtrarLibrosPorAnio(1967);

        // Eliminar libro
        biblioteca.eliminarLibro("L004");

        // Mostrar cantidad total
        System.out.println("\n📊 Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
