import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto("Remera Nacional", 2000.0));

        inventario.add(new ProductoImportado("Campera Importada", 5000.0, 1500.0));

        System.out.println("--- Reporte de Inventario ---");

        for (Producto p : inventario) {

            System.out.println("Articulo: " + p.getNombre());
            System.out.println("Precio Final: $" + p.getPrecio());
            System.out.println("Detalles: " + p.toString());
            System.out.println("---------------------------");
        }
    }
}