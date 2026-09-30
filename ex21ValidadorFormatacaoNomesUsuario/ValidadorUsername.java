public class ValidadorUsername {

    public boolean ehValido(String username) {
        if (username == null) {
            return false;
        }

        // Remove espaços nas pontas para testar se havia espaço originalmente
        if (username.startsWith(" ") || username.endsWith(" ")) {
            return false;
        }

        // BUG: O desenvolvedor colocou limite máximo de 10 caracteres em vez de 12
        if (username.length() < 4 || username.length() > 12) {
            return false;
        }

        return true;
    }
}