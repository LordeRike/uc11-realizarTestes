public class ConversorMoeda {

    public double converterParaBRL(double valorMoedaEstrangeira, String moeda) {
        double taxaCambio = 0.0;

        if (moeda.equalsIgnoreCase("USD")) {
            taxaCambio = 5.00;
        } else if (moeda.equalsIgnoreCase("EUR")) {
            taxaCambio = 5.50;
        } else {
            return -1.0; // Moeda não suportada
        }

        double valorBruto = valorMoedaEstrangeira * taxaCambio;
       
        // BUG: O desenvolvedor somou 2.00 reais fixos em vez de aplicar 2% (multiplicar por 1.02)
        double valorFinal = valorBruto + (valorBruto * 0.02);

        return valorFinal;
    }
}