import java.util.ArrayList;

public class Visitante {
    private String nome;
    private int ingresso;
    public ArrayList<Visitante> visitantes = new ArrayList<Visitante>();

    public Visitante(String nome, int ingresso) {
        this.nome = nome;
        this.ingresso = ingresso;
        
        try { // Verifica se o visitante já foi adicionado
            this.adicionaVisitante();
            if (adicionaVisitante() == true) {
                visitantes.add(this);
            }
        } catch (Exception error) {
            System.out.println("Erro ao adicionar visitante: " + error);
        }
    }

    public boolean adicionaVisitante() {
        if (visitantes.contains(this)) {
            return false;
        } else {
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIngresso() {
        return ingresso;
    }
    
}
