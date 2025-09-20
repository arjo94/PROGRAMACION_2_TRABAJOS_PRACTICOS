/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author 87mar
 */
public class MAIN {
    public static void main(String[] args) {
        Motor motor1 = new Motor("V6", "M12345");
        Conductor conductor1 = new Conductor("Juan Perez", "LIC1234");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", motor1, conductor1);

        System.out.println(vehiculo1);
    }
}
