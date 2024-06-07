import java.util.ArrayList;
import java.util.Scanner;

public class mainMenu {

    public ArrayList<Atracao> atracoes = new ArrayList<>();
    
    public static void main(String[] args) {

        

        Atracoes atracoes = new Atracoes();
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

        Park park = new Park(atracoes);

        int selecao = 0;

        while (selecao != 8) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t====== PARK TUPÃ - A 49 anos levando a diversão até você ======");
            System.out.println("\t\t====== Sistema de gerenciamento de visitantes ======");
            System.out.println("1 - Cadastrar novo visitante");
            System.out.println("2 - Registrar vista a atração");
            System.out.println("3 - Localizar visitante");
            System.out.println("4 - Consultar faturamento");
            System.out.println("5 - Consultar atrações");
            System.out.println("6 - Consultar atrações por dia");
            System.out.println("7 - Listar visitantes");
            System.out.println("8 - Encerrar dia");
            System.out.println("9 - Encerrar sistema");

            selecao = sc.nextInt();
            switch (selecao){
                case 1:
                    //todo método cadastra visitante
                    park.cadastrarNovoVisitante();
                    break;
                case 2:
                    //todo método registrar vista a atração
                    park.registrarVisitaAAtracao();
                    break;
                case 3:
                    //todo método localizar visitante
                    park.localizarVisitante();
                    break;
                case 4:
                    //todo método consultar faturamento
                    park.consultarFaturamento();
                    break;
                case 5:
                    //todo método consultar atrações
                    atracoes.exibirAtracoes();
                    break;
                case 6:
                    //todo método de consultar atrações por dia
                    atracoes.consultarAtracoesPorDia();
                    break;
                case 7:
                    //todo método para listar visitantes
                    park.listarVisitantes();
                    break;
                case 8:
                    //todo método encerrar dia
                    park.encerrarDia();
                    break;
                case 9:
                    System.out.println("Fim.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }
    }
}