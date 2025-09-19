/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_tp3;

/**
 *
 * @author 87mar
 */
public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    // Constructor
    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
        
    }
    
    
    //  Metodo para poner un huevo
    public void ponerHuevo() { 
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo.");
    }
    
    // Metodo para envejecer
    public void envejecer() { 
        edad++;
        System.out.println("Gallina " + idGallina + " cumplio un año mas.");
    }
    
    // Mostrar estado
    public void mostarEstado() { 
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------------------------");
    }
}
