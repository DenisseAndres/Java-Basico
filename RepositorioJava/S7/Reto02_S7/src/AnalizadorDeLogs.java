import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String archivoLog = "errores.log";
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        // Try-with-resources: lectura segura del archivo
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoLog))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resumen
            System.out.println("📊 Resumen del análisis de logs:");
            System.out.println("🔹 Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Cantidad de errores: " + errores);
            System.out.println("⚠️  Cantidad de advertencias: " + advertencias);

            double porcentaje = totalLineas == 0 ? 0.0 :
                    ((double) (errores + advertencias) / totalLineas) * 100;
            System.out.printf("📈 Porcentaje con errores/advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            // Manejo de excepción: guardar en archivo de fallos
            System.out.println("❌ No se pudo procesar el archivo de logs. Guardando registro del fallo...");
            guardarFallo(e.getMessage());
        }
    }

    // Método para guardar mensajes de error en un archivo
    private static void guardarFallo(String mensaje) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("registro_fallos.txt", true))) {
            writer.println("🛑 Error al procesar logs: " + mensaje);
        } catch (IOException ex) {
            System.out.println("❗ Error adicional al guardar el registro de fallos.");
        }
    }
}
