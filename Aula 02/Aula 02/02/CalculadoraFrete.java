import java.util.Scanner;

public class CalculadoraFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do pacote (kg): ");
        double peso = scanner.nextDouble();

        double valorFrete;

        // Análise Estrutural (Caixa Branca)
        if (peso <= 0) {
            System.out.println("Erro: Peso inválido.");
            valorFrete = 0;
        } else if (peso <= 5) {
            valorFrete = 15.00; // Frete Leve
        } else if (peso <= 20) {
            valorFrete = 30.00; // Frete Médio
        } else {
            // Regra da empresa: Pacotes acima de 20kg pagam R$ 50,00
            // Mas o programador digitou a mensagem/valor errado no código!
            valorFrete = 100.00; 
        }

        System.out.printf("Valor do frete: R$ %.2f%n", valorFrete);
        scanner.close();
    }
}