public class ExecutarRegressaoTelefone {

    public static void main(String[] args) {
        System.out.println("=== REGRESSÃO: FORMATADOR DE TELEFONE ===\n");

        FormatadorTelefone f = new FormatadorTelefone();

        assertString("Limpar máscara completa", "51999998888", f.limparMascara("(51) 99999-8888"));
        assertString("Limpar apenas traço", "51999998888", f.limparMascara("5199999-8888"));
        assertString("Texto limpo mantido", "51999998888", f.limparMascara("51999998888"));
    }

    public static void assertString(String nome, String esp, String obt) {
        if (esp.equals(obt)) System.out.println("✅ [PASSOU] " + nome);
        else System.out.println("❌ [FALHOU] " + nome + " -> Esp: " + esp + " | Obt: " + obt);
    }
}