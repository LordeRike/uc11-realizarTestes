import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
  
        System.out.print("Digite o preço do produto (ex: 15.50): ");
        String precoInput = scanner.nextLine(); // Preço setado como String

        try {
            
            double preco = Double.parseDouble(precoInput);
            
            System.out.println("\n--- Produto Cadastrado com Sucesso ---");
            System.out.println("Item: " + nome);
            System.out.printf("Preço: R$ %.2f%n", preco);
        } catch (NumberFormatException e) {
            System.out.println("\n[ERRO] Preço inválido! Por favor, insira apenas números usando ponto como separador decimal (ex: 15.50).");
        }

        scanner.close();
    }
}