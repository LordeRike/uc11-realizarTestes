public class CalculadoraHorasExtras {

    public double calcularValorHoraExtra(double valorHoraNormal, int quantidadeHoras, boolean ehDomingo) {
        // BUG: Ignorava o parâmetro ehDomingo
        
        if (ehDomingo == true) {
            return valorHoraNormal * 2.0 * quantidadeHoras;
        } else {
            return valorHoraNormal * 1.5 * quantidadeHoras;
        }
    }
}