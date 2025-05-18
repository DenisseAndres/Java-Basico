import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var saldo = 1000.0;
        int opcion = 0;

        do {
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Digite la opción deseada: ");

            if (input.hasNextInt()) {
                opcion = input.nextInt();
            } else {
                System.out.println("❌ Entrada inválida. Por favor ingrese un número.");
                input.next();  // Limpia la entrada no numérica
                System.out.println();
                continue;      // Repite el menú
            }
            //Control de opciones con switch
            switch (opcion) {
                case 1: // Consultar saldo
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 2: // Depositar dinero
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = input.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor que cero");
                        break;
                    }
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 3: // Retirar dinero
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = input.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                        break;
                    }
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes. Su saldo es: $" + saldo);
                    }
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

            System.out.println(); 

        } while (opcion != 4);

        input.close(); // Cerrar el scanner
    }
}
