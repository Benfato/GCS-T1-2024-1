import java.util.ArrayList;

public class Visitante {
    protected String nome;
    protected String telefone;
    protected int ingresso;
    protected static ArrayList<Visitante> visitantes = new ArrayList<>();

    public Visitante(String nome, String telefone, int ingresso) {
        this.nome = nome;
        this.telefone = telefone;
        this.ingresso = ingresso;
        
        try { // Adiciona o visitante
            if (adicionaVisitante()) {
                visitantes.add(this);
            }
        } catch (Exception error) {
            System.out.println("Erro ao adicionar visitante: " + error);
        }
    }

    public boolean adicionaVisitante() {
        // Verifica se contém o visitante ("this") antes de adicionar
        if (visitantes.contains(this)) {
            return false;
        } else {
            return true;
        }
    }
}