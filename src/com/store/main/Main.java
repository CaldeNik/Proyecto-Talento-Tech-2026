package com.store.main;

import com.store.models.*;
import com.store.exceptions.PrecioInvalidoException;

public class Main {
    public static void main(String[] args) {
        Order miPedido = new Order();

        try {
            miPedido.addProduct(new Producto("Remera Nacional", 2000.0));
            miPedido.addProduct(new ProductoImportado("Campera Importada", 5000.0, 1500.0));
        } catch (PrecioInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("--- Resumen del Pedido ---");
        for (Producto p : miPedido.getItems()) {
            System.out.println("Articulo: " + p.getNombre() + " | Precio: $" + p.getPrecio());
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL A PAGAR: $" + miPedido.calculateTotal());
    }
}