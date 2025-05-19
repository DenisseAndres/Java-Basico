public class Factura {
    String folio;
    String cliente;
    double total;

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString()
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    // Método hashCode()
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
