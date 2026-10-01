import java.util.Scanner;

public class TentativasLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "senac123";
        int tentativas = 1;
        boolean acessoConcedido = false;

        // O sistema deve permitir no maximo 3 tentativas
        while (tentativas <= 3 && !acessoConcedido) {
            System.out.print("Digite a senha de acesso: ");
            String senhaDigitada = scanner.nextLine();
            tentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                acessoConcedido = true;
                System.out.println("Acesso liberado!");
            } else {
                System.out.println("Senha incorreta. Tentativa " + tentativas + " de 3.");
            }
        }

        if (!acessoConcedido) {
            System.out.println(">>> CONTA BLOQUEADA por excesso de tentativas! <<<");
        }

        scanner.close();
    }
}