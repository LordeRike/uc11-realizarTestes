import java.util.Scanner;

public class ReservaEstacionamento {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ESTACIONAMENTO DESKTOP ===");
        System.out.print("Digite o tipo do veículo (carro / moto / caminhao): ");
        String tipoVeiculo = scanner.nextLine().toLowerCase();

        System.out.print("Digite a hora de entrada (6 a 22): ");
        int hora = scanner.nextInt();

        // Validando o horário e o tipo do veículo
        if (hora < 6 || hora > 22) {
            System.out.println("ERRO: Estacionamento fechado! Funcionamento das 06h às 22h.");
        } else if (tipoVeiculo.equals("caminhao")) { // BUG Oculto: Não bloqueou ônibus nem tratou erro de tipo correto
            System.out.println("ERRO: Veículos de grande porte não são permitidos!");
        } else {
            System.out.println("SUCESSO: Entrada LIBERADA para " + tipoVeiculo + " às " + hora + "h.");
        }

        scanner.close();
    }
    
}
