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
    public int getCpf()
    {
        return cpf;
    }
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
    //Método para consultar um visitante pelo cpf.
    public Visitante consultaVisitante(int cpf)
    {
        for (Visitante v : visitantes)
        {
            if (v.getCpf() == cpf)
            {
                return v;
            }
        }
        return null;
    }

    //Método para cadastrar um novo visitante.
    public boolean cadastraVisitante(Visitante visitante)
    {
        if (consultaVisitante(visitante.getCpf()) != null)
        {
            return false;
        }
        visitantes.add(visitante);
        return true;
    }

    /*
     * Listagem de todos os visitantes já cadastrados no sistema
     */
    private String formatarVisitante(Visitante visitante) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(visitante.getNome()).append("\n");
        sb.append("Ano de Nascimento: ").append(visitante.getIdade()).append("\n");
    
        if (visitante instanceof Crianca) {
            Crianca crianca = (Crianca) visitante;
            sb.append("Responsável: ").append(crianca.getResponsavel()).append("\n");
            sb.append("Telefone do Responsável: ").append(crianca.getTelefone()).append("\n");
        } else {
            sb.append("Telefone: ").append(visitante.getTelefone()).append("\n");
        }
    
        sb.append("Ingresso: ").append(visitante.getIngresso()).append("\n");
        sb.append("-------------------------\n");
        return sb.toString();
    }

    public void listarVisitantes() {
        if (visitantes.isEmpty()) {
            System.out.println("Nenhum visitante cadastrado.");
        } else {
            System.out.println("Lista de visitantes cadastrados:");
            for (Visitante visitante : visitantes) {
                System.out.print(formatarVisitante(visitante));
            }
        }
    }
}
