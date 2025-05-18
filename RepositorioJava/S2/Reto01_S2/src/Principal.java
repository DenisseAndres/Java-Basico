import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //clase Scanner
        Scanner input = new Scanner(System.in);  // Crear el objeto Scanner

        //objeto 1
        SimuladorFarmacia producto = new SimuladorFarmacia();

        System.out.print("Ingresa el nombre del medicamento: ");
        producto.nombreMedicamento = input.nextLine();

        System.out.print("Ingresa la cantidad de medicamentos: ");
        producto.Piezas = input.nextInt();
        input.nextLine();

        System.out.print("Ingresa el precio unitario: ");
        producto.PrecioUnitario = input.nextDouble();

        producto.mostrarInformacion();

        input.close();


    }

}
