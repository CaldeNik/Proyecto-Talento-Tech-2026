package com.store.models;

public class ProductoImportado extends Producto {
    private double impuesto;

    public ProductoImportado(String nombre, double precio, double impuesto) {

        super(nombre, precio);
        this.impuesto = impuesto;
    }


    @Override
    public double getPrecio() {
        return super.getPrecio() + impuesto;
    }

    @Override
    public String toString() {
        return super.toString() + " [Importado - Impuesto: $" + impuesto + "]";
    }
}