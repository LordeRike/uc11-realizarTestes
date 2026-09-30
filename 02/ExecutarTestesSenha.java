public class ExecutarTestesSenha {

    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE TESTES: VALIDADOR DE SENHAS ===\n");

        ValidadorSenha validador = new ValidadorSenha();

        // Cenário 1: Senha válida com 8 caracteres exatos (Deve ser TRUE)
        boolean r1 = validador.ehValida("12345678");
        assertBooleano("Teste Senha de 8 Caracteres", true, r1);

        // Cenário 2: Senha curta com 5 caracteres (Deve ser FALSE)
        boolean r2 = validador.ehValida("12345");
        assertBooleano("Teste Senha Curta", false, r2);

        // Cenário 3: Senha com espaços (Deve ser FALSE)
        boolean r3 = validador.ehValida("1234 5678");
        assertBooleano("Teste Senha com Espaços", false, r3);
    }

    public static void assertBooleano(String nomeTeste, boolean esperado, boolean obtido) {
        if (esperado == obtido) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}