import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();


        inventario.add(new Producto("Remera Importada", 25.0));
        inventario.add(new Producto("Pantalon Deportivo", 40.0));
        inventario.add(new Producto("Zapatillas", 80.0));


        System.out.println("Cantidad de productos en inventario: " + inventario.size());

        System.out.println("--- Detalle del Inventario ---");

        for (Producto p : inventario) {
            System.out.println("Producto: " + p.nombre + " | Precio: $" + p.precio);
        }
    }
}