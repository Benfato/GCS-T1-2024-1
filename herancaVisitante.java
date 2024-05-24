import java.util.Scanner;

public abstract class herancaVisitante {
    Scanner sc = new Scanner(System.in);
    protected String tipo;
    protected String nome;
    protected int anoNascimento;
    protected String responsavel;
    protected int telefone;
    protected Integer ingresso = null;

    interface Atividades {
        public void visitar();
        public Integer setIngresso();
    }

    interface MenorDeIdadde {
        public void setResponsavel(String responsavel);
        public void setTelefoneResponsavel(int telefoneResponsavel);
    }

    public class Adulto extends herancaVisitante implements Atividades {
        // Sobre os visitantes adultos deseja-se armazenar nome, ano de nascimento e telefone.
        public Adulto(String nome, int telefone, int anoNascimento) {
            this.tipo = "Adulto";
            this.nome = nome;
            this.anoNascimento = anoNascimento;
            this.telefone = telefone;
            
        }

        public void visitar() {
            System.out.println(nome + " está visitando.");
        }

        public Integer setIngresso() {
            this.ingresso = new Ingresso.getNextIngresso();
            return ingresso;
        }
    }

    // Para crianças com menos de 12 anos, deve-se armazenar
    // o nome, o ano de nascimento, o nome do responsável e seu telefone de contato. 
    public class Crianca extends herancaVisitante implements Atividades, MenorDeIdadde {
        public Crianca(String nome, int telefone, int anoNascimento) {
            this.tipo = "Crianca";
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
        @Override
        public String setResponsavel() {
            System.out.println("Menores de 12 anos devem estar acompanhados de um responsável.");
            try {
                System.out.println("Insira o nome do responsável: ");
                responsavel = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro: " + e + "\nCancelando registro.");
            }
            return responsavel;
        }

        public void setTelefoneResponsavel(int telefoneResponsavel) {
            System.out.println("Telefone do Responsável: " + telefoneResponsavel);
        }
    }

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
