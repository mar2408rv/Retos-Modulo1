public class Entrada {

    String nombreEvento;
    double precioEntrada;


    public Entrada(String evento, double precio) {
        this.nombreEvento = evento;
        this.precioEntrada = precio;
    }


    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }

}
