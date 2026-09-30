import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Nota 1 (Peso 2): ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a Nota 2 (Peso 3): ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a Nota 3 (Peso 5): ");
        double n3 = scanner.nextDouble();

        // Fórmula da média ponderada: (N1*P1 + N2*P2 + N3*P3) / Soma dos Pesos
        // Erro oculta de precedência de operadores ou divisão de soma dos pesos!
        double media = n1 * 2 + n2 * 3 + n3 * 5 / 10;

        System.out.printf("Média Ponderada Calculada: %.2f%n", media);

        if (media >= 6.0) {
            System.out.println("Resultado: APROVADO");
        } else {
            System.out.println("Resultado: REPROVADO");
        }

        scanner.close();
    }
}