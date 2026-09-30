public class ExecutarTestesUsername {

    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE TESTES: VALIDADOR DE USERNAME ===\n");

        ValidadorUsername validador = new ValidadorUsername();

        // Teste 1: Username com 12 caracteres "usuario_test" (DEVE SER VÁLIDO)
        boolean t1 = validador.ehValido("usuario_test");
        assertBooleano("Username de 12 caracteres", true, t1);

        // Teste 2: Username muito curto "abc" (DEVE SER INVÁLIDO)
        boolean t2 = validador.ehValido("abc");
        assertBooleano("Username com 3 caracteres", false, t2);

        // Teste 3: Username com espaço no início " user123" (DEVE SER INVÁLIDO)
        boolean t3 = validador.ehValido(" user123");
        assertBooleano("Username com espaço no início", false, t3);
    }

    public static void assertBooleano(String nomeTeste, boolean esperado, boolean obtido) {
        if (esperado == obtido) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}