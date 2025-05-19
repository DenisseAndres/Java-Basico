import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public boolean tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Quieres entrar a la cueva oscura? (s/n): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("s");
    }
}
