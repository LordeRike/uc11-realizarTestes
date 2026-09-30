import java.util.Scanner;

public class ValidadorAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1; 

        /*System.out.print("Digite a idade do usuário para liberar o módulo: ");
        int idade = scanner.nextInt();*/

        // Regra de Negócio: Permitir acesso para maiores ou iguais a 18 anos
        /*if (idade > 18) { // codigo permite apenas maiores de 18, deve ser alterado para >=
            System.out.println("Acesso PERMITIDO ao módulo Desktop!");
        } else {
            System.out.println("Acesso NEGADO. Permitido apenas para maiores de 18 anos.");
        }*/

       do {
            System.out.print("Digite a idade do usuário para liberar o módulo: ");
            int idade = scanner.nextInt();

            if (idade < 18) { // codigo permite apenas maiores de 18, deve ser alterado para >=
                System.out.println("Acesso NEGADO. Permitido apenas para maiores de 18 anos.");
                contador++;                
            } else {
                System.out.println("Acesso PERMITIDO ao módulo Desktop!");
                //contador = 3;
                break;
                
            }
            System.out.println("Tentativas excedidas ");
        }  while (contador <= 3);

        

        scanner.close();
    }
}