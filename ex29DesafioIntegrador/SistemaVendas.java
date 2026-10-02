public class SistemaVendas {

    // Regra 1: Aniversariante ganha 15% de desconto (multiplica por 0.85)
    public double calcularTotalComDesconto(double valorTotal, boolean ehAniversariante, boolean embalarParaPresente) {
        double valorFinal = valorTotal;

        if (ehAniversariante) {
            valorFinal *= 0.85; // Aplica 15% de desconto
        }

        if (embalarParaPresente) {
            valorFinal += 5.00; // Adiciona taxa de embalagem
        }
        
        return valorFinal;
    }

    // Regra 2: Compras >= R$ 200 tem frete grátis (0.00). Menores pagam R$ 20.00
    public double calcularFrete(double valorTotal) {
        return valorTotal >= 200.00 ? 0.00 : 20.00;
    }

    // Regra 3: Até R$ 1000 comissão 5%. Acima de R$ 1000 comissão 10%
    public double calcularComissaoVendedor(double valorVenda) {
        return valorVenda > 1000.00 ? valorVenda * 0.10 : valorVenda * 0.05;
    }

    // Categorização do Nível de Cliente (Novo Método):
    public String categorizarCLiente(double totalAculumadoCompras) {
        if (totalAculumadoCompras < 500.00) {
            return "CLIENTE BRONZE";
        } else if (totalAculumadoCompras < 1500.00) {
            return "CLIENTE PRATA";
        } else {
            return "CLIENTE OURO";
        }         
    }
}