public class ExecutarTestesEmprestimo {

    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE TESTES: EMPRÉSTIMO BANCÁRIO ===\n");

        ValidadorEmprestimo validador = new ValidadorEmprestimo();

        // Teste 1: Renda R$ 5.000, Prestação R$ 1.200 (24% da renda -> DEVE APROVAR)
        boolean t1 = validador.ehAprovado(5000.00, 1200.00, 5000.00);
        assertBooleano("Teste Empréstimo Válido (Dentro dos 30%)", true, t1);

        // Teste 2: Renda R$ 5.000, Prestação R$ 2.000 (40% da renda -> DEVE REJEITAR)
        boolean t2 = validador.ehAprovado(5000.00, 2000.00, 5000.00);
        assertBooleano("Teste Empréstimo Inválido (Acima dos 30%)", false, t2);

        // Teste 3: Empréstimo abaixo de R$ 1.000 (DEVE REJEITAR)
        boolean t3 = validador.ehAprovado(5000.00, 100.00, 500.00);
        assertBooleano("Teste Valor Mínimo de Empréstimo", false, t3);
    }

    public static void assertBooleano(String nomeTeste, boolean esperado, boolean obtido) {
        if (esperado == obtido) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}