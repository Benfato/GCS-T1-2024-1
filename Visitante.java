//Imports.
import java.util.ArrayList;

//Criação da classe Visitante.
public class Visitante
{
    //Criação das variáveis.
    private int cpf, idade, telefone;
    private String nome;
    private ArrayList<Visitante> visitantes;

    //Construtor.
    public Visitante(int cpf, int idade, int telefone, String nome)
    {
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;
        visitantes = new ArrayList<>();
    }

    //Getters.
    public int getIdade()
    {
        return idade;
    }

    public int getTelefone()
    {
        return telefone;
    }

    public String getNome()
    {
        return nome;
    }

    //Método para cadastro de visitantes.
}
