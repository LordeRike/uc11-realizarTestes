public class CalculadoraDescontoProgressivo {

    public double calcularValorFinal(double valorTotal) {
        if (valorTotal >= 1000.00){
            return valorTotal * 0.85; // 15% de desconto
        } else if(valorTotal >= 500.00) {
            return valorTotal * 0.90; // 10% desconto
        } else if (valorTotal >= 100.00) {
            return valorTotal * 0.95; // 5% desconto
        }
        return valorTotal;

    }
}