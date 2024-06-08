import java.util.ArrayList;
import java.time.LocalDate;

public class Atracao {
    private String nome;
    private int capacidadeMaxima;
    public ArrayList<VisitanteDaAtracao> visitantes;

    public Atracao(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.visitantes = new ArrayList<>();
    }

    public void adicionarVisitante(Visitante visitante, LocalDate data) {
        if (this.visitantes.size() < this.capacidadeMaxima) {
            this.visitantes.add(new VisitanteDaAtracao(visitante, data));
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

    public ArrayList<VisitanteDaAtracao> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<VisitanteDaAtracao> visitantes) {
        this.visitantes = visitantes;
    }

    public void encerrarDia() {
        this.visitantes = new ArrayList<>();
        this.capacidadeMaxima = 0;
    }
}
