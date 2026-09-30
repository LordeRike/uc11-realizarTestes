import java.util.Scanner;

// https://trello.com/c/ATJKBiX4

public class CheckoutLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o cupom de desconto (ou Pressione Enter para nenhum): ");
        String cupom = scanner.nextLine().trim().toUpperCase();

        double valorComDesconto = valorCompra;

        if (cupom.equals("SENAC10")) {
            valorComDesconto = valorCompra - (valorCompra * 0.10);
        } else if (cupom.equals("SENAC20")) {
            valorComDesconto = valorCompra - (valorCompra * 0.20);
        }

        double frete = 20.00;
        // Regra de Frete Grátis: compra com desconto maior que 200.00
        if (valorCompra > 200.00) { // O código analisa a variável certa para o frete grátis?
            frete = 0.00;
        }

        double totalPagar = valorComDesconto + frete;

        System.out.printf("Valor das Mercadorias: R$ %.2f%n", valorComDesconto);
        System.out.printf("Valor do Frete: R$ %.2f%n", frete);
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", totalPagar);

        scanner.close();
    }
}