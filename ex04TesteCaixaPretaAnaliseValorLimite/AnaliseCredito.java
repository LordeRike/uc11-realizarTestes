import java.util.Scanner;

public class AnaliseCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o score do cliente (0 a 1000): ");
        int score = scanner.nextInt();

        // Regra: Permitido de 300 ate 700 inclusive
        if (score >= 300 && score <= 700) {
            System.out.println("Crédito APROVADO!");
        } else {
            System.out.println("Crédito NEGADO.");
        }

        scanner.close();
    }
}