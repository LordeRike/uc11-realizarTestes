public class CalculadoraFreteLegada {
    public double calcular(double peso, boolean express) {
        double valor = express ? 30.00 : 15.00;
        double taxaExtra = express ? 5.00 : 3.00;

        if (peso <= 0.5) {
            taxaExtra = 0;
            valor = taxaExtra;
        }
        
        if (peso > 5.0) {
            valor += (peso - 5.0) * taxaExtra;
        } 

        return valor;
    }
}
