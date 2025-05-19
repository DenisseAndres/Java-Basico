import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class RegistroMuestrasBiotecnologia {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        List<String> especiesRegistradas = new ArrayList<>();
        especiesRegistradas.add("Homo sapiens");
        especiesRegistradas.add("Mus musculus");
        especiesRegistradas.add("Arabidopsis thaliana");
        especiesRegistradas.add("Homo sapiens"); // Muestra replicada
        especiesRegistradas.add("Drosophila melanogaster");

        // Paso 2: HashSet para filtrar especies únicas
        Set<String> especiesUnicas = new HashSet<>(especiesRegistradas);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        Map<String, String> idMuestraInvestigador = new HashMap<>();
        idMuestraInvestigador.put("M-001", "Dra. López");
        idMuestraInvestigador.put("M-002", "Dr. Hernández");
        idMuestraInvestigador.put("M-003", "Dra. García");
        idMuestraInvestigador.put("M-004", "Dr. Pérez");

        // Paso 4: Mostrar resultados

        // Mostrar todas las especies en orden de llegada
        System.out.println("📥 Lista de especies registradas (orden de llegada):");
        for (String especie : especiesRegistradas) {
            System.out.println("- " + especie);
        }

        // Mostrar las especies únicas
        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Mostrar relación ID de muestra → investigador
        System.out.println("\n🧑‍🔬 Relación de ID de muestra e investigador:");
        for (Map.Entry<String, String> entrada : idMuestraInvestigador.entrySet()) {
            System.out.println("- ID " + entrada.getKey() + " → " + entrada.getValue());
        }

        // Buscar investigador por ID de muestra específica
        String idBuscado = "M-002";
        System.out.println("\n🔍 Búsqueda del investigador responsable de la muestra con ID " + idBuscado + ":");
        if (idMuestraInvestigador.containsKey(idBuscado)) {
            System.out.println("✅ Responsable: " + idMuestraInvestigador.get(idBuscado));
        } else {
            System.out.println("❌ No se encontró una muestra con ese ID.");
        }
    }
}
