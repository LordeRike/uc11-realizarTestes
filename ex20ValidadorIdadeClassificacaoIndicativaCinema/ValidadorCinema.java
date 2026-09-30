public class ValidadorCinema {

    public boolean permitirEntrada(int idadeCliente, int classificacaoFilme, boolean acompanhado) {
        if (idadeCliente >= classificacaoFilme) {
            return true;
        }

        // BUG: O desenvolvedor usou '&&' (E) em vez de validar apenas a flag 'acompanhado'
        if (idadeCliente < 10 || acompanhado) {
            return true;
        }

        return false;
    }
}