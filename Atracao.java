import java.util.ArrayList;


public class Atracao {
    String nome;
    
    public ArrayList<VisitanteDaAtracao> visitantes;

    public void adicionarVisitante(Visitante visitante, String data){
        VisitanteDaAtracao v = new VisitanteDaAtracao(visitante, data);
        this.visitantes.add(v);
    }

    public String getNome() {
        return nome;
    }

}