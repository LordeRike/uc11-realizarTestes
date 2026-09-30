import java.util.Scanner;

public class EmprestimoEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DESKTOP - EMPRÉSTIMO ESTUDANTIL ===");
        System.out.print("Digite o valor desejado (R$): ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a quantidade de parcelas (6 a 48): ");
        int parcelas = scanner.nextInt();

        // Código com regras de negócio implementadas
        if (valor < 1000.00 || valor > 20000.00) {
            System.out.println("ERRO: Valor fora do limite permitido (R$ 1.000 a R$ 20.000)!");
        } else if (parcelas < 6 || parcelas > 48) { // BUG Oculto: aceita 60 parcelas se a pessoa digitar!
            // O programador esqueceu de bloquear parcelas acima de 48 no 'if' abaixo
            if (parcelas < 6) {
                System.out.println("ERRO: Mínimo de 6 parcelas!");
            } else {
                System.out.println("SUCESSO: Empréstimo APROVADO em " + parcelas + "x!");
            }
        } else {
            System.out.println("SUCESSO: Empréstimo APROVADO em " + parcelas + "x!");
        }

        scanner.close();
    }
}