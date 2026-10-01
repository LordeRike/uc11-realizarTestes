public class ExecutarTestesVendas {
    public static void main(String[] args) {
        System.out.println("=== DESAFIO INTEGRADOR DE QUALIDADE ===\n");
        SistemaVendas sv = new SistemaVendas();

        assertTexto("Cliente é Aniversariante",425.00, sv.calcularTotalComDesconto(500.00, true));
        assertTexto("Frete gratis acima de R$200", 0, sv.calcularFrete(200));
        assertTexto("Cobrar Frete, compra abaixo de  R$200", 20, sv.calcularFrete(199));
        assertTexto("Comissão sobre venda de R$1000", 50, sv.calcularComissaoVendedor(1000));
        assertTexto("Comissão sobre venda de R$2000", 200, sv.calcularComissaoVendedor(2000));
    }

    public static void assertTexto(String cenario, double esperado, double obtido) {
        if (esperado == obtido) {
            System.out.println("✅ [HOMOLOGADO] " + cenario);
        } else {
            System.out.println("❌ [REJEITADO] " + cenario + " -> Esp: " + esperado + " | Obt: " + obtido);
        }
    }
}
