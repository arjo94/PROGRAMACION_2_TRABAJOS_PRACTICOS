/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_colecciones;

/**
 *
 * @author PC
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        // Si ya tiene profesor, quitarlo de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = p;

        // Si se asigna un nuevo profesor, agregar el curso a su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor != null) ? profesor.getNombre() : "(Sin profesor)";
        System.out.println("Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + prof +
                '}');
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}
