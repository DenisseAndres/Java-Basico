public class vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Al principio, sin reserva
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false; // Ya hay un pasajero
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevo = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevo); // Usa el otro método
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.getNombre();
        } else {
            info += "Pasajero: [Sin reserva]";
        }
        return info;
    }
}
