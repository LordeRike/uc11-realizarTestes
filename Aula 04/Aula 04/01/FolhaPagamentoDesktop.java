import java.util.Scanner;

public class FolhaPagamentoDesktop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DESKTOP - FOLHA DE PAGAMENTO ===");
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto (R$): ");
        String salarioInput = scanner.nextLine();

        // BUG 1: Sem tratamento de exceção ao converter texto para double
        double salarioBruto = Double.parseDouble(salarioInput);

        // Regra de Negócio de Desconto de INSS:
        // Salário até R$ 2.000,00 -> Desconto de 8%
        // Salário acima de R$ 2.000,00 -> Desconto de 12%
        double inss;
        
        // BUG 2: O desenvolvedor errou o cálculo de porcentagem (multiplicou por 8 em vez de 0.08)
        if (salarioBruto <= 0) {
            System.out.println("Salario não pode ser zerado ou negativo"); // Validação de número zerado ou negativo
            return ;
        } else if (salarioBruto <= 2000.00) {
            inss = salarioBruto * 0.08; // Alterado para 0.08
        } else {
            inss = salarioBruto * 0.12;
        }

        double salarioLiquido = salarioBruto - inss;

        System.out.println("\n--- COMPROVANTE DE PAGAMENTO ---");
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}