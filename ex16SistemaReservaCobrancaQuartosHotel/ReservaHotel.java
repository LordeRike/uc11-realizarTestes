import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de diárias reservadas: ");
        int dias = scanner.nextInt();

        double valorDiarias = dias * 150.00;
        double taxaLimpeza = 50.00;
        double valorTotal = valorDiarias + taxaLimpeza;

        // Desconto de 10% para mais de 7 dias
        if (dias > 7) {
            valorTotal = valorTotal - (valorDiarias * 0.10); // Onde é aplicado o desconto?
        }

        System.out.printf("Total das diárias: R$ %.2f%n", valorDiarias);
        System.out.printf("Taxa de limpeza: R$ %.2f%n", taxaLimpeza);
        System.out.printf("VALOR FINAL A PAGAR: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}