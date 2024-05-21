public abstract class herancaVisitante {
    protected String nome;
    protected int anoNascimento;
    protected int telefone;
    protected Integer ingresso = null;

    interface Atividades {
        public void visitar();
        public Integer setIngresso();
    }

    public class Adulto extends herancaVisitante implements Atividades {
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

    // Para crianças com menos de 12 anos, deve-se armazenar
    // o nome, o ano de nascimento, o nome do responsável e seu telefone de contato. 
    public class Crianca extends herancaVisitante implements Atividades {
        public Crianca(String nome, int telefone, int anoNascimento) {
            this.nome = nome;
            this.anoNascimento = anoNascimento;
            this.telefone = telefone;
        }

        public void visitar() {
            System.out.println("Child " + nome + " is visiting.");
        }

        public Integer setIngresso() {
            this.ingresso = Ingresso.getNextIngresso();
            return ingresso;
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




/*
public abstract class FiguraBidimensional
{
    private double posX;
    private double posY;
    
    public FiguraBidimensional (double x, double y) {
        this.posX = x;
        this.posY = y;
    }
    
    public double getX () { return this.posX; }
    
    public double getY () { return this.posY; }
    
    
    public abstract double getArea ();
    
}
*/