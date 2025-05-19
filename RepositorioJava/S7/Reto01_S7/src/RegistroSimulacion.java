import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        try {
            guardarParametros();
            leerParametros();
        } catch (IOException e) {
            System.out.println("❌ Error durante el proceso: " + e.getMessage());
        }
    }

    // Método para guardar los parámetros en un archivo
    public static void guardarParametros() throws IOException {
        // Definir la ruta del archivo
        Path carpeta = Paths.get("config");
        Path archivo = carpeta.resolve("parametros.txt");

        // Verificar si la carpeta existe, si no, crearla
        if (!Files.exists(carpeta)) {
            Files.createDirectories(carpeta);
            System.out.println("📁 Carpeta 'config/' creada.");
        }

        // Contenido del archivo
        String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        // Escribir el archivo
        Files.write(archivo, parametros.getBytes());
        System.out.println("✅ Archivo 'parametros.txt' guardado en la carpeta 'config/'.");

        // Verificar existencia del archivo
        if (Files.exists(archivo)) {
            System.out.println("📄 Archivo verificado: existe correctamente.");
        } else {
            System.out.println("❌ El archivo no se creó correctamente.");
        }
    }

    // Método para leer y mostrar el contenido del archivo
    public static void leerParametros() throws IOException {
        Path archivo = Paths.get("config", "parametros.txt");

        if (Files.exists(archivo)) {
            String contenido = Files.readString(archivo);
            System.out.println("\n📋 Contenido del archivo de parámetros:");
            System.out.println(contenido);
        } else {
            System.out.println("❌ No se encontró el archivo para lectura.");
        }
    }
}
