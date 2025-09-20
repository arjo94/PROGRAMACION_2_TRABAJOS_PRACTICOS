/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author 87mar
 */
public class Computadora {
     private String marca;
    private String numeroSerie;

    // Composición: Computadora "tiene" PlacaMadre
    private PlacaMadre placaMadre;

    // Asociación bidireccional: Computadora conoce a su Propietario
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;

        // Asociación bidireccional
        propietario.setComputadora(this);
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public void setPlacaMadre(PlacaMadre placaMadre) { this.placaMadre = placaMadre; }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; }

    @Override
    public String toString() {
        return "Computadora: " + marca + " (NºSerie: " + numeroSerie + ")\n" +
               "PlacaMadre: " + placaMadre + "\n" +
               "Propietario: " + propietario;
    }
}
