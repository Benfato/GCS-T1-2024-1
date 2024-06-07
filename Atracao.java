import java.util.ArrayList;

public class Atracao {
    private String nome;
    private int capacidadeMaxima;
    private ArrayList<Visitante> visitantes;

    public Atracao(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.visitantes = new ArrayList<>();
    }

    public void adicionarVisitante(Visitante visitante) {
        if (this.visitantes.size() < this.capacidadeMaxima) {
            this.visitantes.add(visitante);
        } else {
            System.out.println("Desculpe, a capacidade máxima desta atração foi alcançada. Não é possível adicionar mais visitantes.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<Visitante> visitantes) {
        this.visitantes = visitantes;
    }
}
