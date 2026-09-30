import java.util.Scanner;

//https://trello.com/c/fMkas9ZZ

public class ControleAcessoPerfil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o perfil do usuário (ADMIN / GERENTE / OPERADOR): ");
        String perfil = scanner.next();

        System.out.print("Digite a ação desejada (CRIAR / EDITAR / APAGAR): ");
        String acao = scanner.next();

        boolean permissaoConcedida = false;

        if (perfil.equals("ADMIN")) {
            permissaoConcedida = true;
        } else if (perfil.equals("GERENTE")) {
            if (acao.equals("CRIAR") || acao.equals("EDITAR")) {
                permissaoConcedida = true;
            }
        } else if (perfil.equals("OPERADOR")) {
            if (acao.equals("CRIAR")) {
                permissaoConcedida = true;
            }
        }

        if (permissaoConcedida) {
            System.out.println(">>> AÇÃO LIBERADA no sistema Desktop! <<<");
        } else {
            System.out.println(">>> ACESSO NEGADO: Perfil sem permissão para esta ação. <<<");
        }

        scanner.close();
    }
}