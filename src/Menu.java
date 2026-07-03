import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, Producto> catalogo;


    public Menu() {
        this.catalogo = new HashMap<>();
    }


    public void agregarProducto(Producto producto) {
        catalogo.put(producto.getNombre().toLowerCase(), producto);
        System.out.println("Sistema: '" + producto.getNombre() + "' ha sido añadido al menú de la cafetería.");
    }


    public void mostrarMenu() {
        if (catalogo.isEmpty()) {
            System.out.println("El menú está vacío actualmente.");
            return;
        }
        System.out.println("\n============ MENÚ DE LA CAFETERÍA ============");
        for (Producto prod : catalogo.values()) {
            prod.mostrarInformacion();
        }
        System.out.println("==============================================");
    }


    public Producto buscarProducto(String nombre) {

        Producto encontrado = catalogo.get(nombre.toLowerCase());

        if (encontrado != null) {
            System.out.println("¡Producto encontrado!");
            encontrado.mostrarInformacion();
            return encontrado;
        } else {
            System.out.println("Lo sentimos, '" + nombre + "' no está en el menú.");
            return null;
        }
    }
}