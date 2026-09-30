import java.util.Scanner;

public class ModuloPixDesktop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DESKTOP - MÓDULO PIX ===");
        System.out.print("Digite a chave Pix de destino: ");
        String chavePix = scanner.nextLine();

        System.out.print("Digite o valor da transferência (R$): ");
        double valor = scanner.nextDouble();

        // Regras implementadas no código
        if (chavePix.trim().isEmpty()) {
            System.out.println("ERRO: A chave Pix é obrigatória!");
        } else if (valor < 0) { // BUG Oculto: O código aceita R$ 0.00 exatos!
            System.out.println("ERRO: O valor deve ser positivo.");
        } else if (valor > 5000.00) {
            System.out.println("ERRO: Limite máximo por transação é R$ 5.000,00.");
        } else {
            System.out.printf("SUCESSO: Transferência de R$ %.2f enviada para '%s'!%n", valor, chavePix);
        }

        scanner.close();
    }
}