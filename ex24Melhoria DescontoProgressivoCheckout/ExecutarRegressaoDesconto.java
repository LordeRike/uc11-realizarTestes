public class ExecutarRegressaoDesconto {

    public static void main(String[] args) {
        System.out.println("=== REGRESSÃO: DESCONTO PROGRESSIVO ===\n");

        CalculadoraDescontoProgressivo c = new CalculadoraDescontoProgressivo();

        assertEquals("Compra R$ 50 (Sem desconto)", 50.00, c.calcularValorFinal(50.00));
        assertEquals("Compra R$ 200 (5% desconto)", 190.00, c.calcularValorFinal(200.00));
        assertEquals("Compra R$ 600 (10% desconto)", 540.00, c.calcularValorFinal(600.00));
       
        // ADICIONE AQUI O NOVO TESTE DE R$ 1.000 (15% -> Esperado: R$ 850.00)
        assertEquals("Compra R$ 1000 (15% desconto)", 850.00, c.calcularValorFinal(1000.00));
    }

    public static void assertEquals(String nome, double esp, double obt) {
        if (Math.abs(esp - obt) < 0.001) System.out.println("✅ [PASSOU] " + nome);
        else System.out.println("❌ [FALHOU] " + nome + " -> Esp: " + esp + " | Obt: " + obt);
    }
}