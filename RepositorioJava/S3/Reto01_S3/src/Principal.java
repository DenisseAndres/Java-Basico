public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero y un vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");
        vuelo vuelo = new vuelo("UX123", "París", "14:30");

        // Reservar asiento
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.");
        }

        // Mostrar itinerario
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("\n❌ Cancelando reserva...");
        vuelo.cancelarReserva();

        // Mostrar itinerario después de cancelar
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        // Hacer nueva reserva usando nombre y pasaporte
        System.out.println();
        vuelo.reservarAsiento("Mario Gonzalez", "P654321");
        System.out.println(vuelo.obtenerItinerario());
    }
}
