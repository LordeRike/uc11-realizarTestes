import java.util.Scanner;

public class BilheteCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("É estudante? (true/false): ");
        boolean ehEstudante = scanner.nextBoolean();

        double valorBilhete;

        // Estrutura de decisao a ser testada
        if (ehEstudante) {
            valorBilhete = 15.00;
        } else if (idade < 12) {
            valorBilhete = 10.00;
        } else if (idade >= 60) {
            valorBilhete = 12.00;
        } else {
            valorBilhete = 30.00;
        }

        System.out.printf("Valor do bilhete: R$ %.2f%n", valorBilhete);
        scanner.close();
    }
}