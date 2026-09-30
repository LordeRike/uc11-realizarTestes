import java.util.Scanner;

public class BonusFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo de empresa (em anos): ");
        int anosEmpresa = scanner.nextInt();

        System.out.print("Digite o salário atual (R$): ");
        double salario = scanner.nextDouble();

        // Regra: Anos de empresa > 5 E Salario <= 3000.00
        if (anosEmpresa >= 5 && salario < 3000.00) {
            System.out.println(">>> BÔNUS CONCEDIDO! <<<");
        } else {
            System.out.println(">>> Bônus NÃO concedido. <<<");
        }

        scanner.close();
    }
}