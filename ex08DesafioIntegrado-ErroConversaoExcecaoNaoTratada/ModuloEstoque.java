import java.util.Scanner;

public class ModuloEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONTROLO DE STOCK DESKTOP ===");
        System.out.print("Digite a quantidade de itens a adicionar: ");
        String quantidadeInput = scanner.nextLine();

        // Conversao direta sem tratamento de excecao
        int quantidade = Integer.parseInt(quantidadeInput);

        if (quantidade > 0) {
            System.out.println("Sucesso: " + quantidade + " itens adicionados ao stock.");
        } else {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
        }

        scanner.close();
    }
}