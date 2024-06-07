
/*
 * O sistema deverá permitir que o operador localize um visitante por parte de seu nome ou pela identificação do ingresso. 
 * Ao localizar o visitante, o sistema deverá listar todas as atrações que o visitante foi.
 */

public class LocalizaVisitante {
    public Visitante visitante;
    ControleIngresso controleIngresso = new ControleIngresso();
    String infoNome;
    int infoIngresso;


    public void localizaVisitanteNome(String nome) {
        if (visitante.getNome().contains(nome)) {
            visitanteEncontrado(visitante);
            infoNome = nome;
            infoIngresso = controleIngresso.getIngressoByVisitante(visitante);
        } else {
            System.out.println("Visitante não encontrado!");
        }
    }

    public void localizaVisitanteNumero(int ingresso) {
        Visitante visitante = controleIngresso.getVisitanteByIngresso(ingresso);
        if (visitante != null) {
            visitanteEncontrado(visitante);
            infoNome = visitante.getNome();
            infoIngresso = ingresso;
        } else {
            System.out.println("Visitante não encontrado!");
        }
    }

    public void visitanteEncontrado (Visitante visitante) {
        



        System.out.println("Visitante encontrado!");
            System.out.println("Nome: " + infoNome);
            System.out.println("Ingresso: " + infoIngresso );
            System.out.println("Atrações visitadas: ");

    };
}
