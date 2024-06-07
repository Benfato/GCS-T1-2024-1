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



        Scanner sc = new Scanner(System.in);
        System.out.println("\t====== PARK TUPÃ - A 49 anos levando a diversão até você ======");
        System.out.println("\t\t====== Sistema de gerenciamento de visitantes ======");
        System.out.println("1 - Cadastrar novo visitante");
        System.out.println("2 - Registrar vista a atração");
        System.out.println("3 - Localizar visitante");
        System.out.println("4 - Consultar faturamento");
        System.out.println("5 - Consultar atrações");
        System.out.println("6 - Encerrar dia");
        System.out.println("7 - Encerrar sistema");

        int selecao = sc.nextInt();
        switch (selecao){
            case 1:
                //todo método cadastra visitante
            case 2:
                //todo método registrar vista a atração
            case 3:
                //todo método localizar visitante
            case 4:
                //todo método consultar faturamento
            case 5:
                //todo método consultar atrações
                atracoes.exibirAtracoes();
            case 6:
                //todo método encerrar dia
            case 7:
                sc.close();
                System.exit(0);
        }
    }
}