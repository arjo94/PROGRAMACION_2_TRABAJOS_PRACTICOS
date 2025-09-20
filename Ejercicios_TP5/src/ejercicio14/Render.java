/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author 87mar
 */
public class Render {
     private String formato;
    private Proyecto proyecto; // Asociación unidireccional: Render conoce al Proyecto

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters
    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }

    @Override
    public String toString() {
        return "Render en formato " + formato + " del proyecto: " + proyecto;
    }
}
