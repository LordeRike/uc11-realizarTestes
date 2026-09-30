public class ExecutarTestesConversor {

    public static void main(String[] args) {
        System.out.println("=== SUÍTE DE TESTES: CONVERSOR DE MOEDAS ===\n");

        ConversorMoeda conversor = new ConversorMoeda();

        // Teste 1: $100 USD -> R$ 500.00 + 2% (R$ 10.00) = R$ 510.00
        double t1 = conversor.converterParaBRL(100.00, "USD");
        assertEquals("Conversão USD com 2% de taxa", 510.00, t1);

        // Teste 2: 100 EUR -> R$ 550.00 + 2% (R$ 11.00) = R$ 561.00
        double t2 = conversor.converterParaBRL(100.00, "EUR");
        assertEquals("Conversão EUR com 2% de taxa", 561.00, t2);
    }

    public static void assertEquals(String nomeTeste, double esperado, double obtido) {
        if (Math.abs(esperado - obtido) < 0.001) {
            System.out.println("✅ [PASSOU] " + nomeTeste);
        } else {
            System.out.println("❌ [FALHOU] " + nomeTeste + " -> Esperado: " + esperado + " | Obtido: " + obtido);
        }
    }
}