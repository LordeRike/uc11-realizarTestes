// https://trello.com/c/zQiRH0eF/3-ex-01-m%C3%B3dulo-de-c%C3%A1lculo-de-comiss%C3%A3o-de-vendas-desktop

import java.util.Scanner;

public class CalculoComissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DESKTOP - CÁLCULO DE COMISSÃO ===");
        System.out.print("Digite o valor total de vendas (R$): ");
        double totalVendas = scanner.nextDouble();

        System.out.print("Digite os anos de empresa do vendedor: ");
        int anosEmpresa = scanner.nextInt();

        double comissao = 0;
        double tcomissao = 0;

        if (totalVendas <= 5000.00) {
            comissao = totalVendas * 0.05;
            tcomissao = comissao;
        } else if (totalVendas <= 15000.00) {
            comissao = totalVendas * 0.08;
            tcomissao = comissao;
        } else {
            comissao = totalVendas * 0.12;
            tcomissao = comissao;
        }

        // Bónus por tempo de empresa
        if (anosEmpresa > 3) {
            tcomissao = comissao + 200.00; // Analisa este ponto durante a execução!
        }

        System.out.printf("Valor total da comissão: R$ %.2f%n", tcomissao);
        scanner.close();
    }
}