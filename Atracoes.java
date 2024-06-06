import java.util.ArrayList;

public class Atracoes {
    private ArrayList<Atracao> atracoes;

    public Atracoes() {
        atracoes = new ArrayList<>();
    }

    public void cadastrarAtracao(String nome) {
        atracoes.add(new Atracao(nome));
    }

    public void exibirAtracoes() {
        System.out.println("Atrações do Parque:");
        for (Atracao atracao : atracoes) {
            System.out.println("- " + atracao.getNome());
            
        }
    }
}