public class ExecutarHomologacaoCancelamento {

    public static void main(String[] args) {
        System.out.println("=== HOMOLOGAÇÃO: CANCELAMENTO DE PEDIDO ===\n");

        CancelamentoPedido cp = new CancelamentoPedido();

        assertTexto("Cancelamento Direto", "CANCELAMENTO_DIRETO", cp.avaliarCancelamento("AGUARDANDO_PAGAMENTO"));
        assertTexto("Exige Chamado Suporte", "ABRIR_CHAMADO_SUPORTE", cp.avaliarCancelamento("EM_TRANSPORTE"));
        assertTexto("Política de Devolução", "POLITICA_DEVOLUCAO", cp.avaliarCancelamento("ENTREGUE"));
    }

    public static void assertTexto(String cenario, String esperado, String obtido) {
        if (esperado.equals(obtido)) {
            System.out.println("✅ [HOMOLOGADO] " + cenario);
        } else {
            System.out.println("❌ [REJEITADO] " + cenario + " -> Esp: " + esperado + " | Obt: " + obtido);
        }
    }
}