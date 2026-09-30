import java.util.Scanner;

public class FechamentoCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DESKTOP - FECHAMENTO DE CAIXA ===");
        System.out.print("Digite o valor de vendas em dinheiro (R$): ");
        String dinheiroInput = scanner.nextLine();

        System.out.print("Digite o valor de vendas em cartão (R$): ");
        String cartaoInput = scanner.nextLine();

        // Conversões de tipo
        double dinheiro = Double.parseDouble(dinheiroInput);
        double cartao = Double.parseDouble(cartaoInput);

        // Regra: O caixa não pode aceitar valores negativos
        if (dinheiro < 0 || cartao < 0) {
            System.out.println("ERRO: Valores negativos não são permitidos!");
        } else {
            double totalDia = dinheiro + cartao;
            System.out.printf("Total arrecadado no dia: R$ %.2f%n", totalDia);
        }

        scanner.close();
    }
}