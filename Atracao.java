import java.util.ArrayList;
public class Atracao {
    String nome;
    
    private ArrayList<Visitante> visitante;

    public void adicionarVisitante(Visitante visitante){
        this.visitante.add(visitante);
    }
}
