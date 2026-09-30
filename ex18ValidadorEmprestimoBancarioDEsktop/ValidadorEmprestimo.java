public class ValidadorEmprestimo {

    public boolean ehAprovado(double rendaMensal, double valorPrestacao, double valorTotalEmprestimo) {
        if (valorTotalEmprestimo < 1000.00) {
            return false;
        }

        // BUG: O desenvolvedor usou '>' em vez de '<=' para verificar se a prestação cabe no orçamento
        double limitePrestacao = rendaMensal * 0.30;
        if (valorPrestacao >= limitePrestacao) {
            return false;
        }

        return true;
    }
}