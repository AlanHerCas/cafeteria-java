import java.util.ArrayList;
import java.util.List;

public class Orden {
    // Colección para almacenar los productos (Bebidas o Alimentos)
    private List<Producto> listaProductos;

    // Constructor: Inicializa la lista vacía cuando se crea una orden
    public Orden() {
        this.listaProductos = new ArrayList<>();
    }

    // 1. Método para Agregar productos
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println(producto.getNombre() + " ha sido agregado a la orden.");
    }

    // 2. Método para Mostrar los productos agregados
    public void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("La orden está vacía.");
            return;
        }
        System.out.println("--- Productos en la Orden ---");
        for (Producto prod : listaProductos) {
            // Llama al método mostrarInformacion de cada producto
            prod.mostrarInformacion();
        }
        System.out.println("-----------------------------");
    }

    // 3. Método para Calcular el total
    public double calcularTotal() {
        double total = 0.0;
        for (Producto prod : listaProductos) {
            // OJO: Si tus productos implementan "Vendible" y tienen "calcularPrecioFinal()",
            // lo ideal es usar ese método aquí para incluir extras (como el tamaño de la bebida).
            if (prod instanceof Vendible) {
                total += ((Vendible) prod).calcularPrecioFinal();
            } else {
                total += prod.getPrecio(); // Respaldo por si Producto no implementa Vendible directamente
            }
        }
        return total;
    }

    // 4. Método para Mostrar la cantidad de productos
    public int obtenerCantidadProductos() {
        return listaProductos.size();
    }
}
