public class SimuladorFarmacia {
    //Atributos
    String nombreMedicamento;
    double PrecioUnitario;
    int Piezas;
    double TotalSinDesc = 0;
    boolean AplicaDescuento;
    double Descuento;
    double TotalConDescuento;


    //métodos
    public void mostrarInformacion(){
        System.out.println("Medicamento: "+ nombreMedicamento);
        System.out.println("Cantidad: "+ Piezas);
        System.out.println("Precio unitario: $"+ PrecioUnitario);
        TotalSinDesc = Piezas * PrecioUnitario;
        System.out.println("Total sin descuento: $" + TotalSinDesc);
        AplicaDescuento = TotalSinDesc > 500;
        System.out.println("¿Aplica descuento? " + AplicaDescuento);
        Descuento = AplicaDescuento ?/*se cumple? sí-->*/ TotalSinDesc * 0.15 :/*no se cumple-->*/ 0;
        System.out.println("Descuento: $" + Descuento);
        TotalConDescuento = TotalSinDesc - Descuento;
        System.out.println("Total a pagar: $" + TotalConDescuento);
    }
}

