public class ExecutarHomologacaoCaixa {

    public static void main(String[] args) {
        System.out.println("=== TERMO DE HOMOLOGAÇÃO: MÓDULO DE FECHAMENTO DE CAIXA ===\n");

        FechamentoCaixa caixa = new FechamentoCaixa();

        // Cenário 1 (Exemplo do Professor): Tudo exato -> APROVADO
        String r1 = caixa.homologarFechamento(1000.00, 1000.00, 0);
        assertTexto("Cenário 1 - Fechamento Perfeito", "APROVADO: Caixa encerrado com sucesso", r1);

        // TODO (Aluno): Escreva o Cenário 2 para testar uma divergência de R$ 3,00 (Deve retornar APROVADO COM RESSALVA)
        String r2 = caixa.homologarFechamento(1000.00, 997.00, 0);
        assertTexto("Cenário 2 - Divergência de R$ 3,00", "APROVADO COM RESSALVA: Divergência aceitável de até R$ 5,00", r2);

        // TODO (Aluno): Escreva o Cenário 3 para testar 1 sangria pendente (Deve retornar REPROVADO)
        String r3 = caixa.homologarFechamento(1000.00, 1000.00, 1);
        assertTexto("Cenário 3 - 1 sangria pendente ", "REPROVADO: Existem sangrias pendentes de confirmação", r3);
    }

    public static void assertTexto(String cenario, String esperado, String obtido) {
        if (esperado.equals(obtido)) {
            System.out.println("✅ [HOMOLOGADO] " + cenario);
        } else {
            System.out.println("❌ [REJEITADO] " + cenario + "\n   Esperado: " + esperado + "\n   Obtido:   " + obtido);
        }
    }
}