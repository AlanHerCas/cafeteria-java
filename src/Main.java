public class Main {
    public static void main(String[] args) {


        Menu menuCafeteria = new Menu();

        Bebida espresso = new Bebida("Espresso", 2.00, true, Bebida.Tamano.SMALL, Bebida.Temperatura.CALIENTE);
        Bebida latte = new Bebida("Café Latte", 3.50, true, Bebida.Tamano.MEDIUM, Bebida.Temperatura.CALIENTE);
        Bebida téIced = new Bebida("Té Helado", 2.80, true, Bebida.Tamano.LARGE, Bebida.Temperatura.FRIA);

        Alimento croissant = new Alimento("Croissant de Mantequilla", 2.50, true, true, 340);
        Alimento dona = new Alimento("Dona Glaseada", 1.80, true, true, 420);
        Alimento sándwich = new Alimento("Sándwich de Jamón y Queso", 4.50, true, false, 550);

        System.out.println("--- Cargando productos al sistema ---");
        menuCafeteria.agregarProducto(espresso);
        menuCafeteria.agregarProducto(latte);
        menuCafeteria.agregarProducto(téIced);
        menuCafeteria.agregarProducto(croissant);
        menuCafeteria.agregarProducto(dona);
        menuCafeteria.agregarProducto(sándwich);

        menuCafeteria.mostrarMenu();
        System.out.println("\n[INFO] Creando una nueva orden para el cliente...");
        Orden ordenCliente = new Orden();
        System.out.println("\n--- Agregando productos al carrito ---");
        ordenCliente.agregarProducto(latte);
        ordenCliente.agregarProducto(téIced);
        ordenCliente.agregarProducto(croissant);
        ordenCliente.agregarProducto(sándwich);
        System.out.println();
        ordenCliente.mostrarProductos();
        System.out.println("Cantidad de artículos comprados: " + ordenCliente.obtenerCantidadProductos());
        System.out.println("TOTAL FINAL A PAGAR: $" + ordenCliente.calcularTotal());
    }
}