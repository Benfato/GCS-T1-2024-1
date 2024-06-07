import java.util.ArrayList;

public class Atracao {
    private String nome;
    private ArrayList<Visitante> visitante;

    public Atracao(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

}