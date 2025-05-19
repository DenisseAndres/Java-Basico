public class MainNarrativa {

    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    // Inyección de dependencias
    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    // Simulación de una escena
    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Estás frente a una cueva misteriosa. El aire es frío.");

        if (decision.tomarDecision()) {
            transicion.siguienteEscena();
            dialogo.mostrarDialogo("Avanzas con cautela hacia lo desconocido...");
        } else {
            dialogo.mostrarDialogo("Decides mantenerte a salvo y dar media vuelta.");
        }
    }

    public static void main(String[] args) {
        // Inyección de las implementaciones concretas (pueden cambiarse fácilmente)
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);
        juego.ejecutarEscena();
    }
}
