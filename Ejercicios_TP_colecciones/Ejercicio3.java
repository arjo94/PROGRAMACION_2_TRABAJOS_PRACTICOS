/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_colecciones;

/**
 *
 * @author PC
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Nacional de Mendoza");

        // Crear profesores
        Profesor p1 = new Profesor("P001", "Ana López", "Programación");
        Profesor p2 = new Profesor("P002", "Carlos Pérez", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "María Gómez", "Estadística");

        // Crear cursos
        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Base de Datos I");
        Curso c4 = new Curso("C004", "Estadística I");
        Curso c5 = new Curso("C005", "Metodología de la Investigación");

        // Agregar profesores y cursos de la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a curso
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C002", "P001");
        uni.asignarProfesorACurso("C003", "P002");
        uni.asignarProfesorACurso("C004", "P003");

        // Listar cursos y profesores
        uni.listarCursos();
        uni.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("\n🔄 Cambiando profesor del curso C004...");
        uni.asignarProfesorACurso("C004", "P001");

        // Eliminar curso y profesor
        uni.eliminarCurso("C005");
        uni.eliminarProfesor("P002");

        // Reporte final
        uni.reporteCursosPorProfesor();
    }
}
