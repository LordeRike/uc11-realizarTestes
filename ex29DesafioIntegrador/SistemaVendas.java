public class SistemaVendas {

    // Regra 1: Aniversariante ganha 15% de desconto (multiplica por 0.85)
    public double calcularTotalComDesconto(double valorTotal, boolean ehAniversariante, boolean embalarParaPresente) {
        if (ehAniversariante && embalarParaPresente) {
            return (valorTotal * 0.85) + 5;            
        } else if (ehAniversariante) {
            // BUG 1: Aplicou apenas 5% de desconto (0.95) em vez de 15% (0.85)
            return valorTotal * 0.85; // Corrigido para 15% de desconto
        } else if (embalarParaPresente) {
            return valorTotal + 5;
        }
        
        return valorTotal;
    }

    // Regra 2: Compras >= R$ 200 tem frete grátis (0.00). Menores pagam R$ 20.00
    public double calcularFrete(double valorTotal) {
        // BUG 2: Usou '>' em vez de '>=' (Cobrando frete indevido em compras de exatamente R$ 200.00)
        if (valorTotal >= 200.00) { // Corrigido para '>=' para frete grátis em compras de R$ 200.00 ou mais 
            return 0.00;
        }
        return 20.00;
    }

    // Regra 3: Até R$ 1000 comissão 5%. Acima de R$ 1000 comissão 10%
    public double calcularComissaoVendedor(double valorVenta) {
        if (valorVenta > 1000.00) {
            return valorVenta * 0.10;
        } else {
            // BUG 3: Calculou 2% em vez dos 5% acordados
            return valorVenta * 0.05; 
        }
    }

    // Categorização do Nível de Cliente (Novo Método):
    public String categorizarCLiente(double totalAculumadoCompras) {
        if (totalAculumadoCompras < 500.00) {
            return "CLIENTE BRONZE";
        } else if (totalAculumadoCompras >= 500.00 && totalAculumadoCompras <= 1499.99) {
            return "CLIENTE PRATA";
        } else if (totalAculumadoCompras >= 1500.00) {
            return "CLIENTE OURO";
        } else {
            return "Categoria Indefinida";
        }         
    }
}