public class Alimento extends Producto implements Vendible {
    private boolean esVegetariano;
    private int calorias;

    // Constructor ahora incluye 'disponible'
    public Alimento(String nombre, double precio, boolean disponible, boolean esVegetariano, int calorias) {
        super(nombre, precio, disponible);
        this.esVegetariano = esVegetariano;
        this.calorias = calorias;
    }

    // Getters y Setters
    public boolean isVegetariano(){ 
        return esVegetariano; 
    }
    public void setVegetariano(boolean vegetariano){
         esVegetariano = vegetariano; 
    }
    public int getCalorias(){ 
        return calorias; 
    }

    public void setCalorias(int calorias){ 
        this.calorias = calorias; 
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        String tipoDieta = esVegetariano ? "Sí" : "No";
        System.out.println("Tipo: Alimento | Vegetariano: " + tipoDieta + " | Calorías: " + calorias);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = getPrecio();
        if (calorias > 500) {
            precioFinal += 1.0; // Aumenta 1.0 si las calorías son mayores a 500
        }
        return precioFinal;
    }

}