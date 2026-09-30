import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regra: Compras acima de 100,00 ganham 10% de desconto

        System.out.print("Digite o valor total da compra (R$): ");
        double valorCompra = scanner.nextDouble();
        double valorFinal = 0.0 ; 
        // Sem validação de número negativo
        // Valor final sem inicialização

        if (valorCompra <= 0) {
            System.out.println("Valor inválido. O valor da compra deve ser maior que zero.");
            return; 
        } else if (valorCompra > 100.0) { //por "acima de 100,00" se entende "maior que 100,00"
            double desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado!");
        } else {
            valorFinal = valorCompra;
            System.out.println("Sem desconto aplicado.");
            
        }

        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}