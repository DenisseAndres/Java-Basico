public class Entrada {
    //Atributos
    String NombreEvento;
    double PrecioEntrada;

    // Constructor que inicializa el producto con nombre y precio
    public Entrada(String NombreEvento, double PrecioEntrada) {
        this.NombreEvento = NombreEvento;
        this.PrecioEntrada = PrecioEntrada;
    }

    // Método que muestra la información del producto en consola
    public void mostrarInformacion() {
        System.out.println("Evento: " + NombreEvento + " | Precio: $" + PrecioEntrada);
    }
}
