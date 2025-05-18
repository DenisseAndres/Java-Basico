import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;

        // Si el RFC es null, usar Optional.empty()
        if (rfc == null) {
            this.rfc = Optional.empty();
        } else {
            this.rfc = Optional.of(rfc);
        }
    }

    // Método para mostrar resumen
    public String getResumen() {
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";
        if (rfc.isPresent()) {
            resumen += "RFC: " + rfc.get();
        } else {
            resumen += "RFC: [No proporcionado]";
        }
        return resumen;
    }
}
