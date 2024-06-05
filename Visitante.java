import java.util.ArrayList;
import java.util.Scanner;

public abstract class Visitante {
    Scanner sc = new Scanner(System.in);
    protected String nome;
    protected int anoNascimento;
    protected String responsavel;
    protected int telefone;
    protected Integer ingresso = null;
    protected static ArrayList<Visitante> visitantes = new ArrayList<>();

    interface Atividades {
        public void visitar();
        public Integer setIngresso();
    }

    interface MenorDeIdade {
        public String getResponsavel();
        public void setResponsavel(String responsavel);
        public void setTelefoneResponsavel(int telefoneResponsavel);
        
    }

    /*
     * Armazenamento dos dados (nome, ano de nascimento e telefone) dos visitantes cadastrados no sistema 
     */
    public class Adulto extends Visitante implements Atividades {
        // Sobre os visitantes adultos deseja-se armazenar nome, ano de nascimento e telefone.
        public Adulto(String nome, int telefone, int anoNascimento) {
            this.nome = nome;
            this.anoNascimento = anoNascimento;
            this.telefone = telefone;
            
        }

        public void visitar() {
            System.out.println(nome + " está visitando.");
        }

        public Integer setIngresso() {
            this.ingresso = Ingresso.getNextIngresso();
            return ingresso;
        }
    }

    /*
     * Armazenamento dos dados (nome, ano de nascimento, nome do responsável e telefone de contato) de crianças menores de 12 anos.
     */
    public class Crianca extends Visitante implements Atividades, MenorDeIdade {
        public Crianca(String nome, int telefone, int anoNascimento) {
            this.nome = nome;
            this.anoNascimento = anoNascimento;
            this.responsavel = setResponsavel();
            this.telefone = telefone;
        }

        public void visitar() {
            System.out.println("Child " + nome + " is visiting.");
        }

        public Integer setIngresso() {
            this.ingresso = Ingresso.getNextIngresso();
            return ingresso;
        }

        public String getResponsavel(String responsavel) {
            //TODO: Ajustar para busca por nome
            System.out.println("Responsável: " + responsavel);
            return responsavel;
        }

        public String setResponsavel() {
            System.out.println("Menores de 12 anos devem estar acompanhados de um responsável.");
            try {
                
                System.out.println("Insira o nome do responsável: ");
                String responsavel = getResponsavel(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Erro: " + e + "\nCancelando registro.");
            }
            return responsavel;
        }

        public void setTelefoneResponsavel(int telefoneResponsavel) {
            System.out.println("Telefone do Responsável: " + telefoneResponsavel);
        }
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
    /*
     * GETTERS && SETTERS
     */

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return anoNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public Integer getIngresso() {
        return ingresso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.anoNascimento = idade;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    } 

}
