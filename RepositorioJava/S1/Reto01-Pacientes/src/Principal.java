import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //clase Scanner
        Scanner input = new Scanner(System.in);  // Crear el objeto Scanner
        //objeto 1
        Paciente paciente1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        paciente1.nombre = input.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente1.edad = input.nextInt();
        input.nextLine();

        System.out.print("Ingresa el numero de expediente: ");
        paciente1.NumExpediente = input.nextLine();

        paciente1.mostrarInformacion();

        input.close();
    }
}
