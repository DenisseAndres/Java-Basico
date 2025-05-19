public class Main {
    public static void main(String[] args) {
        // Crear dos facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        // Mostrar facturas
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        // Comparar si son iguales
        boolean iguales = f1.equals(f2);
        System.out.println("¿Las facturas son iguales?: " + iguales);
    }
}
