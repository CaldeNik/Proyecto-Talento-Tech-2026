package com.store.models;
import com.store.exceptions.PrecioInvalidoException;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) throws PrecioInvalidoException {
        if (precio < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo: " + precio);
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio base: $" + precio;
    }
}