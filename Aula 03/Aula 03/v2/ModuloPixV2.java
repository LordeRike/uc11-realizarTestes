import java.util.Scanner;

public class ModuloPixV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DESKTOP - MÓDULO PIX (V2) ===");
        System.out.print("Digite a chave Pix de destino: ");
        String chavePix = scanner.nextLine();

        System.out.print("Digite o valor da transferência (R$): ");
        double valor = scanner.nextDouble();

        // Tentativa de correção feita pelo desenvolvedor
        if (chavePix.trim().isEmpty()) {
            System.out.println("ERRO: A chave Pix é obrigatória!");
        } else if (valor <= 0) { 
            System.out.println("ERRO: O valor deve ser maior que zero.");
        } else if (valor >= 5000.00) { // NOVO BUG: O que acontece com R$ 5.000,00 exatos?
            System.out.println("ERRO: Limite ultrapassado!");
        } else {
            System.out.printf("SUCESSO: Transferência de R$ %.2f enviada!%n", valor);
        }

        scanner.close();
    }
}