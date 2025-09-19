/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); //uso el setter para validar
        
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
        
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    
    // Setter con validadacion
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else { 
            System.out.println("Año invalido: " + anioPublicacion + ". No se actualizo.");
        }
    }
    
    // Metodo para mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Titulo " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("---------------------------------------");
        
    }
}
