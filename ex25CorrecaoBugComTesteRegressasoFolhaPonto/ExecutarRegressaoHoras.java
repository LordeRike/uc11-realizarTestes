public class ExecutarRegressaoHoras {

    public static void main(String[] args) {
        System.out.println("=== REGRESSÃO: HORAS EXTRAS ===\n");

        CalculadoraHorasExtras c = new CalculadoraHorasExtras();

        // Dia normal: R$ 20/h * 1.5 * 2h = R$ 60.00
        assertEquals("Hora Extra Dia Normal", 60.00, c.calcularValorHoraExtra(20.00, 2, false));

        // Domingo: R$ 20/h * 2.0 * 2h = R$ 80.00
        assertEquals("Hora Extra Domingo", 80.00, c.calcularValorHoraExtra(20.00, 2, true));
    }

    public static void assertEquals(String nome, double esp, double obt) {
        if (Math.abs(esp - obt) < 0.001) System.out.println("✅ [PASSOU] " + nome);
        else System.out.println("❌ [FALHOU] " + nome + " -> Esp: " + esp + " | Obt: " + obt);
    }
}