public class ExecutarTestesFrete {

    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE TESTES: CALCULADORA DE FRETE ===\n");

        CalculadoraFrete calc = new CalculadoraFrete();

        // Teste 1: 5kg para Sudeste -> 10 + (5 * 2) = R$ 20.00
        double t1 = calc.calcular(5.0, "SUD");
        assertEquals("Frete Sudeste 5kg", 20.00, t1);

        // Teste 2: 5kg para Outras -> 20 + (5 * 5) = R$ 45.00
        double t2 = calc.calcular(5.0, "OUTRAS");
        assertEquals("Frete Outras Regiões 5kg", 45.00, t2);

        // Teste 3: Peso inválido
        double t3 = calc.calcular(-2.0, "SUD");
        assertEquals("Peso Negativo Inválido", -1.0, t3);
    }

    public static void assertEquals(String nomeTeste, double esperado, double obtido) {
        if (Math.abs(esperado - obtido) < 0.001) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}