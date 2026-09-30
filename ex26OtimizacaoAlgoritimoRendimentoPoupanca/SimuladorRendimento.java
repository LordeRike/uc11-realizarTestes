public class SimuladorRendimento {

    public double calcularRendimentoSimples(double valorInicial, double taxaMensal, int meses) {
       
        // Código ineficiente usando laço
        return valorInicial * Math.pow(1 + taxaMensal, meses);
    }
}