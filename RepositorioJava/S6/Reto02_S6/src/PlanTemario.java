import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class PlanTemario {

    public static void main(String[] args) {
        // Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregamos temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Tecnología educativa", 2));

        // Repositorio concurrente de recursos por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Tecnología educativa", "https://recursos.edu/tecnologia");

        // Mostrar lista ordenada por título (orden natural)
        System.out.println("🔤 Temas ordenados por título:");
        Collections.sort(temas);
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Ordenar por prioridad ascendente usando Comparator
        System.out.println("\n📊 Temas ordenados por prioridad:");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Mostrar recursos asociados a cada tema
        System.out.println("\n📎 Repositorio de recursos por tema:");
        for (Tema tema : temas) {
            String enlace = recursos.get(tema.getTitulo());
            System.out.println("- " + tema.getTitulo() + " → " + enlace);
        }
    }
}
