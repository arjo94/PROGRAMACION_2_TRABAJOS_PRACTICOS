/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_colecciones;

/**
 *
 * @author PC
 */
public class Ejercicio_01 {
      public static void main(String[] args) {
          Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("P001", "Pan", 500, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa", 15000, 12, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Cafetera", 40000, 7, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Yerba", 3500, 25, CategoriaProducto.ALIMENTOS);

        // Agregarlos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        inventario.listarProductos();

        // Buscar por ID
        System.out.println("\n--- BUSCAR POR ID (P003) ---");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Eliminar producto
        inventario.eliminarProducto("P002");

        // Actualizar Stock
        inventario.actualizarStock("P001", 50);

        // Mostrar total del stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // Filtrar productos por precio
        inventario.filtrarProductosPorPrecio(1000, 30000);

        // Mostrar categorías
        inventario.mostrarCategoriasDisponibles();
      }
}
