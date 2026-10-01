public class FechamentoCaixa {

    // Critério de Aceite: O caixa só pode ser fechado se o saldo informado bater com o saldo calculado
    // e não houver sangrias pendentes de confirmação.
    public String homologarFechamento(double saldoCalculado, double saldoInformado, int sangriasPendentes) {
        if (sangriasPendentes > 0) {
            return "REPROVADO: Existem sangrias pendentes de confirmação";
        }

        double diferenca = Math.abs(saldoCalculado - saldoInformado);
        
        if (diferenca == 0.0) {
            return "APROVADO: Caixa encerrado com sucesso";
        } else if (diferenca <= 5.00) {
            return "APROVADO COM RESSALVA: Divergência aceitável de até R$ 5,00";
        } else {
            return "REPROVADO: Divergência de caixa acima do limite permitido";
        }
    }
}