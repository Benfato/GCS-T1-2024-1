import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    
    public Atracoes atracoes;
    public ControleIngresso controleIngresso;


    public Park(Atracoes atracoes) {
        this.atracoes = new Atracoes();
        atracoes.cadastrarAtracao("Montanha Russa");
        atracoes.cadastrarAtracao("Roda Gigante");
        atracoes.cadastrarAtracao("Casa de Espelhos");
        atracoes.cadastrarAtracao("Carrossel");
        atracoes.cadastrarAtracao("Barco Viking");
        atracoes.cadastrarAtracao("Carrinho de Bate-Bate");
        atracoes.cadastrarAtracao("Trem Fantasma");
        atracoes.cadastrarAtracao("Cinema 4D");
        atracoes.cadastrarAtracao("Tiro ao Alvo");
        atracoes.cadastrarAtracao("Torre de Queda Livre");
        atracoes.cadastrarAtracao("Torre de Escalada");
        atracoes.cadastrarAtracao("Jogo de Laser Tag");
        atracoes.cadastrarAtracao("Piscina de Bolinhas");
        atracoes.cadastrarAtracao("Parede de Escalada");
        atracoes.cadastrarAtracao("Pista de Kart");

        this.controleIngresso = new ControleIngresso();
    }

    //Opções do menu
    public void cadastrarNovoVisitante() {
        Scanner scan = new Scanner(System.in);

        String nome;
        int cpf, idade, telefone;


        System.out.println("Digite o nome: ");
        nome = scan.nextLine();

        System.out.println("Digite o cpf: ");
        cpf = scan.nextInt();

        System.out.println("Digite a idade: ");
        idade = scan.nextInt();

        System.out.println("Digite o telefone: ");
        telefone = scan.nextInt();

        controleIngresso.addVisitante(new Visitante(cpf, idade, telefone, nome)  , LocalDate.now());

        System.out.println("Visitante adicionado.");

    }

    public void registrarVisitaAAtracao() {
        Scanner scan = new Scanner(System.in);

        String nomeAtracao = "";
        int numIngresso;

        System.out.println("Digite o codigo do ingresso: ");
        numIngresso = scan.nextInt();
        
        System.out.println("Digite o nome da atração: ");
        nomeAtracao = scan.nextLine();

        Visitante visitante = controleIngresso.getVisitanteByIngresso(numIngresso);

        for(Atracao atracao: this.atracoes.atracoes){
            if(atracao.getNome() == nomeAtracao) {
                atracao.adicionarVisitante(visitante, LocalDate.now());
                visitante.atracoesVisitadas.add(atracao);
                break;
            }
        }

    }

    public void localizarVisitante() {
        Scanner scan = new Scanner(System.in);

        int numIngresso;

        System.out.println("Digite o Ingresso: ");
        numIngresso = scan.nextInt();

        Visitante visitante = controleIngresso.getVisitanteByIngresso(numIngresso);

        System.out.println("Nome: "+ visitante.getNome());
        System.out.println("CPF: "+ visitante.getCpf());
        System.out.println("Idade: "+ visitante.getIdade());
        System.out.println("Telefone: "+ visitante.getCpf());
        for(Atracao atracao : visitante.atracoesVisitadas) {
            System.out.println(atracao.getNome());
        }


    }

    public void consultarFaturamento() {
        controleIngresso.getFaturamentoPeriodo();
    }

    public void consultarAtracoes() {
        atracoes.exibirAtracoes();
    }

    public void consultarAtracoesPorDia() {
        atracoes.consultarAtracoesPorDia();
    }

    public void listarVisitantes() {
        ArrayList<Visitante> visitantes = controleIngresso.getVisitantes();

        for(Visitante v : visitantes){
            System.out.println("Nome: " + v.getNome());
            System.out.println("CPF: " + v.getCpf());
        }

    }

    public void encerrarDia() {
        controleIngresso.encerraDia();
        atracoes.encerarDia();
    }

}
