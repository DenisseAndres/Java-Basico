public class PagoEfectivo extends MetodoPago implements Autenticable {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true; // Efectivo no necesita validación
    }

    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
