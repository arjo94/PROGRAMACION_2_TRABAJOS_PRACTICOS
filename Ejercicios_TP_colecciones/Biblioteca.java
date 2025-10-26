/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        System.out.println("\n📚 LISTA DE LIBROS EN LA BIBLIOTECA: " + nombre);
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("✅ Libro con ISBN " + isbn + " eliminado correctamente.");
        } else {
            System.out.println("⚠ Libro no encontrado.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n📖 LIBROS PUBLICADOS EN EL AÑO " + anio + ":");
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n✍️ AUTORES DISPONIBLES EN LA BIBLIOTECA:");
        ArrayList<String> nombres = new ArrayList<>();
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            if (!nombres.contains(nombreAutor)) {
                nombres.add(nombreAutor);
                l.getAutor().mostrarInfo();
            }
        }
    }
}
