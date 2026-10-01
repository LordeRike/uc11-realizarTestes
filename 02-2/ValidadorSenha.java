public class ValidadorSenha {

    public boolean ehValida(String senha) {
        if (senha == null) {
            return false;
        }

        // BUG 1: Usou '<=' em vez de '< 8' (Rejeita senhas de 8 caracteres)
        if (senha.length() <= 8) { 
            return false;
        }

        // BUG 2: Não validou se a senha contém espaços em branco

        return true;
    }
}