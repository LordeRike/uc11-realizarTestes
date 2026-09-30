public class ExecutarTestesRegressaoFrete {
    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE REGRESSÃO: CALCULADORA DE FRETE ===\n");

        CalculadoraFreteLegada calc = new CalculadoraFreteLegada();

        // Cenário 1: Comum até 5kg (R$ 15,00)
        double t1 = calc.calcular(3.0, false);
        assertEquals("Frete Comum <= 5kg", 15.0, t1);

        // Cenário 2: Comum > 5kg (R$ 15 + 2kg * R$ 3 = R$ 21,00)
        double t2 = calc.calcular(7.0, false);
        assertEquals("Frete Comum > 5kg", 21.00, t2);

        // Cenário 3: Expresso até 5kg (R$ 30,00)
        double t3 = calc.calcular(4.0, true);
        assertEquals("Frete Expresso <= 5kg", 30.00, t3);

        // Cenário 4: Expresso > 5kg (R$ 30 + 3kg * R$ 5 = R$ 45,00)
        double t4 = calc.calcular(8.0, true);
        assertEquals("Frete Expresso > 5kg", 45.00, t4);

        // Cenário 5: Expresso <= 0.5kg (R$0,00)
        double t5 = calc.calcular(0.4, true);
        assertEquals("Frete Expresso <= 0.5kg", 0.00, t5);
    }

    public static void assertEquals(String nomeTeste, double esperado, double obtido) {
        if (Math.abs(esperado - obtido) < 0.001) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}
