import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> registros = new HashSet<>();
        final int UMBRAL_CRITICO = 95;

        try {
            System.out.println("🔍 Ingrese el consumo de CPU por servidor (escriba 'fin' para terminar):");

            while (true) {
                System.out.print("➡️  Ingrese consumo (%): ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                double valor;

                // Validar si es numérico
                try {
                    valor = Double.parseDouble(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Solo se permiten números válidos.");
                    continue;
                }

                // Validar rango
                if (valor < 0 || valor > 100) {
                    System.out.println("⚠️  Valor fuera de rango (0-100%).");
                    continue;
                }

                // Validar duplicado
                if (!registros.add(valor)) {
                    System.out.println("🔁 Registro duplicado. No se agregará.");
                    continue;
                }

                // Validar umbral crítico
                if (valor > UMBRAL_CRITICO) {
                    throw new ConsumoCriticoException("🔥 ¡Consumo crítico detectado: " + valor + "%!");
                }

                System.out.println("✅ Registro aceptado: " + valor + "%");
            }

            System.out.println("\n📦 Registros únicos de CPU:");
            for (Double cpu : registros) {
                System.out.println(" - " + cpu + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("🚨 Alerta: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\n🔒 Recursos cerrados. Monitoreo finalizado.");
        }
    }
}