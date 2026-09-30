public class CalculadoraFrete {

    public double calcular(double pesoKg, String regiao) {
        if (pesoKg <= 0) {
            return -1.0;
        }

        if (regiao.equalsIgnoreCase("SUD")) {
            return 10.00 + (pesoKg * 2.00);
        } else {
            // BUG: O desenvolvedor esqueceu-se de somar a taxa fixa de R$ 20.00
            return (pesoKg * 5.00) + 20.0;
        }
    }
}