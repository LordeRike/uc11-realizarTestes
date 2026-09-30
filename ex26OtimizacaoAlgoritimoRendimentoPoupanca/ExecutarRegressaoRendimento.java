public class ExecutarRegressaoRendimento {

    public static void main(String[] args) {
        System.out.println("=== REGRESSÃO: RENDIMENTO DE POUPANÇA ===\n");

        SimuladorRendimento s = new SimuladorRendimento();

        assertEquals("Rendimento 1 Mês a 1%", 1010.00, s.calcularRendimentoSimples(1000.00, 0.01, 1));
        assertEquals("Rendimento 2 Meses a 1%", 1020.10, s.calcularRendimentoSimples(1000.00, 0.01, 2));
    }

    public static void assertEquals(String nome, double esp, double obt) {
        if (Math.abs(esp - obt) < 0.001) System.out.println("✅ [PASSOU] " + nome);
        else System.out.println("❌ [FALHOU] " + nome + " -> Esp: " + esp + " | Obt: " + obt);
    }
}