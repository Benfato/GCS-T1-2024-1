import java.util.ArrayList;

public class Atracao {
    String nome;
    
    private ArrayList<herancaAtracao> atracoes;
    private ArrayList<Visitante> visitantes;

    public Atracao() {
        atracoes = new ArrayList<>();
        visitantes = new ArrayList<>();
    }

    public void adicionarAtracao(herancaAtracao atracao) {
        atracoes.add(atracao);
    }

    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }
}
