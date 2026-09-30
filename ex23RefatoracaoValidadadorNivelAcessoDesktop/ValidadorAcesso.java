public class ValidadorAcesso {

    public boolean podeExcluirVenta(String perfil, boolean ehDonoDoCaixa) {
        return "ADMIN".equalsIgnoreCase(perfil) 
        || ("SUPERVISOR".equalsIgnoreCase(perfil) && ehDonoDoCaixa);
    }
}