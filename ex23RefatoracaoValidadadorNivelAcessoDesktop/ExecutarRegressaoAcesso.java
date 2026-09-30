public class ExecutarRegressaoAcesso {

    public static void main(String[] args) {
        System.out.println("=== REGRESSÃO: VALIDADOR DE ACESSO ===\n");

        ValidadorAcesso v = new ValidadorAcesso();

        assertBooleano("ADMIN pode excluir", true, v.podeExcluirVenta("ADMIN", false));
        assertBooleano("SUPERVISOR no próprio caixa pode excluir", true, v.podeExcluirVenta("SUPERVISOR", true));
        assertBooleano("SUPERVISOR fora do próprio caixa NÃO pode", false, v.podeExcluirVenta("SUPERVISOR", false));
        assertBooleano("OPERADOR NÃO pode excluir", false, v.podeExcluirVenta("OPERADOR", true));
    }

    public static void assertBooleano(String nome, boolean esp, boolean obt) {
        if (esp == obt) System.out.println("✅ [PASSOU] " + nome);
        else System.out.println("❌ [FALHOU] " + nome + " -> Esp: " + esp + " | Obt: " + obt);
    }
}