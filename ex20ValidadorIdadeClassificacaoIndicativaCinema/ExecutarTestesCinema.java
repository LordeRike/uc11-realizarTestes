public class ExecutarTestesCinema {

    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE TESTES: ENTRADA CINEMA ===\n");

        ValidadorCinema validador = new ValidadorCinema();

        // Teste 1: Cliente 18 anos, Filme 16 anos, Sem acompanhante -> LIBERA
        boolean t1 = validador.permitirEntrada(18, 16, false);
        assertBooleano("Maior de idade sem acompanhante", true, t1);

        // Teste 2: Cliente 14 anos, Filme 16 anos, COM acompanhante -> LIBERA
        boolean t2 = validador.permitirEntrada(14, 16, true);
        assertBooleano("Menor de idade acompanhado", true, t2);

        // Teste 3: Cliente 14 anos, Filme 16 anos, SEM acompanhante -> BLOQUEIA
        boolean t3 = validador.permitirEntrada(14, 16, false);
        assertBooleano("Menor de idade desacompanhado", false, t3);
    }

    public static void assertBooleano(String nomeTeste, boolean esperado, boolean obtido) {
        if (esperado == obtido) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}