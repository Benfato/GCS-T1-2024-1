import java.util.ArrayList;
import java.time.LocalDate;

public class Atracao {
    String nome;
    
    public ArrayList<VisitanteDaAtracao> visitantesDaAtracao;

    public Atracao(String nome){
        this.nome = nome;
    }

    public void adicionarVisitante(Visitante visitante, LocalDate data){
        VisitanteDaAtracao v = new VisitanteDaAtracao(visitante, data);
        this.visitantesDaAtracao.add(v);
    }

    public String getNome() {
        return nome;
    }

}