import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0.0 a 10.0): ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else if (nota >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        scanner.close();
    }
}