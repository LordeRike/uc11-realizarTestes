import java.util.Scanner;

public class AtualizacaoPerfilV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ATUALIZAÇÃO DE PERFIL (V2.0) ===");
        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite a nova senha (mínimo 8 caracteres): ");
        String senha = scanner.nextLine();

        System.out.print("Confirme a nova senha: ");
        String confirmaSenha = scanner.nextLine();

        // Validações no código
        if (!email.contains("@")) {
            System.out.println("ERRO: E-mail inválido! Deve conter '@'.");
        } else if (senha.length() < 8) {
            System.out.println("ERRO: A senha deve ter no mínimo 8 caracteres.");
        } else if (!senha.equals(confirmaSenha)) { // BUG Oculto: O desenvolvedor comparou a senha com o E-MAIL em vez de confirmar com a confirmaSenha!
            System.out.println("ERRO: As senhas não conferem!");
        } else {
            System.out.println("SUCESSO: Perfil atualizado com sucesso!");
        }

        scanner.close();
    }
}