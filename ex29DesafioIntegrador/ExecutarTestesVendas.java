public class ExecutarTestesVendas {
    public static void main(String[] args) {
        System.out.println("=== DESAFIO INTEGRADOR DE QUALIDADE ===\n");
        SistemaVendas sv = new SistemaVendas();

        assertTexto("Cliente é Aniversariante",425.00, sv.calcularTotalComDesconto(500.00, true,false));
        assertTexto("Cliente é Aniversariante Com Embalagem",430.00, sv.calcularTotalComDesconto(500.00, true,true));
        assertTexto("Cliente não é aniversariante Com Embalagem",305.00, sv.calcularTotalComDesconto(300.00, false,true));
        
        assertTexto("Frete gratis acima de R$200", 0.00, sv.calcularFrete(200.00));
        assertTexto("Cobrar Frete, compra abaixo de  R$200", 20.00, sv.calcularFrete(199.00));
        
        assertTexto("Comissão sobre venda de R$1000", 50.00, sv.calcularComissaoVendedor(1000.00));
        assertTexto("Comissão sobre venda de R$2000", 200.00, sv.calcularComissaoVendedor(2000.00));
        
        assertTexto("Cliente Bronze", "CLIENTE BRONZE", sv.categorizarCLiente(499.99));
        assertTexto("Cliente Prata", "CLIENTE PRATA", sv.categorizarCLiente(500.00));
        assertTexto("Cliente Ouro", "CLIENTE OURO", sv.categorizarCLiente(1500.00));
    }

    private static void assertTexto(String cenario, String esperado, String obtido) {
       if (esperado != null && esperado.equals(obtido)) {
            System.out.println("✅ [HOMOLOGADO] " + cenario);
        } else {
            System.out.println("❌ [REJEITADO] " + cenario + " -> Esp: " + esperado + " | Obt: " + obtido);
        
       }
    }

    public static void assertTexto(String cenario, double esperado, double obtido) {
        if (esperado == obtido) {
            System.out.println("✅ [HOMOLOGADO] " + cenario);
        } else {
            System.out.println("❌ [REJEITADO] " + cenario + " -> Esp: " + esperado + " | Obt: " + obtido);
        }
    }
}
