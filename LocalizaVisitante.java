
/*
 * O sistema deverá permitir que o operador localize um visitante por parte de seu nome ou pela identificação do ingresso. 
 * Ao localizar o visitante, o sistema deverá listar todas as atrações que o visitante foi.
 */

public class LocalizaVisitante {
    public Visitante visitante;

    // Aguardando *Identificação do INGRESSO*, para concluir código. Classe Ingresso.
    // Aguardando método "getNumeroIngresso()", para concluir código. Classe Ingresso.
    // Aguardando método "getNome()", para concluir código. Classe Atracao.
    // Aguardando método "getAtracoes()", para concluir código. Classe Atracao.


    public void localizaVisitante(String nome, String ingresso) {
        if (visitante.getNome().contains(nome) || (visitante.getIngresso()).contains(ingresso)) {
            visitanteEncontrado(visitante);
        } else {
            System.out.println("Visitante não encontrado!");
        }
    }

    public void visitanteEncontrado (Visitante visitante) {
        System.out.println("Visitante encontrado!");
            System.out.println("Nome: " + visitante.getNome());
            System.out.println("Ingresso: " + visitante.getIngresso());
            System.out.println("Atrações visitadas: ");
            for (Atracao atracoesVisitadas : visitante.getAtracoes()) {
                System.out.println(atracoesVisitadas.getNome());
            }
    };
}
