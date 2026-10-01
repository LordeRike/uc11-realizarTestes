public class FormatadorTelefone {

    public String limparMascara(String telefone) {
        if (telefone == null) return "";
       
        // Código poluído
        return telefone.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        
    }
}