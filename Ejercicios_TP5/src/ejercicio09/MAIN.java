/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Juan Perez", "OSDE");
        Profesional profesional1 = new Profesional("Dra. Ana Lopez", "Cardiología");

        CitaMedica cita1 = new CitaMedica("2025-09-19", "10:30", paciente1, profesional1);

        System.out.println(cita1);
    }
}
