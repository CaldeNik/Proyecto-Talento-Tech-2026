package com.store.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Producto> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Producto p) {
        items.add(p);
    }

    public double calculateTotal() {
        double total = 0;
        for (Producto p : items) {
            total += p.getPrecio(); // Aquí funciona el Polimorfismo
        }
        return total;
    }

    public List<Producto> getItems() {
        return items;
    }
}