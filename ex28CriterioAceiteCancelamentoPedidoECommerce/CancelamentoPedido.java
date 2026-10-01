public class CancelamentoPedido {

    public String avaliarCancelamento(String statusPedido) {
        if (statusPedido.equalsIgnoreCase("AGUARDANDO_PAGAMENTO") || statusPedido.equalsIgnoreCase("PAGAMENTO_CONFIRMADO")) {
            return "CANCELAMENTO_DIRETO";
        }
       
        // BUG: Esqueceu de tratar o status EM_TRANSPORTE e mandou direto para DEVOLUCAO
        if (statusPedido.equalsIgnoreCase("EM_TRANSPORTE")) {
            return "ABRIR_CHAMADO_SUPORTE";
        }
        if (statusPedido.equalsIgnoreCase("ENTREGUE")) {
            return "POLITICA_DEVOLUCAO";
        }

        return "STATUS_INVALIDO";
    }
}