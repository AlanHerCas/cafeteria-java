public class bebida extends Producto{

     public enum Tamano {
        SMALL, MEDIUM, LARGE
    }

    public enum Temperatura {
        FRIA, CALIENTE
    }

    private Tamano tamano;
    private Temperatura temperatura;

    public Bebida(String nombre, double precio, boolean disponible, Tamano tamano, Temperatura temperatura) {
        super(nombre, precio,disponible);
        this.tamano = tamano;
        this.temperatura = temperatura;
    }

    public Tamano getTamano() { 
        return tamano; 
    }
    public void setTamano(Tamano tamano) { 
        this.tamano = tamano; 
    }
    public Temperatura getTemperatura() {
         return temperatura; 
    }
    public void setTemperatura(Temperatura temperatura) { 
        this.temperatura = temperatura; 
    }

     @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); //muestra nombre, precio y 'disponible'
        System.out.println(" Tipo: Bebida | Tamaño: " + tamano + " | Temperatura: " + temperatura);
    }

}