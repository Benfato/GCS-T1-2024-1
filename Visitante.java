//Criação da classe Visitante
public class Visitante
{
    //Criação das variáveis.
    private int idade, telefone;
    private String nome;

    //Construtor.
    public Visitante(int idade, int telefone, String nome)
    {
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;
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
}
