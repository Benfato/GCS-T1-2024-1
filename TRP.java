import java.util.Scanner;

//Tupã Resource Planning
public class TRP {
    //O operador informar o código do ingresso e o código da atração
    public void registrarVisitanteNaAtracao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código do ingresso:");
        //verifica se o se o ingresso válido. se for ingresso do dia, é válido. se for de outro dia é inválido

        int códigoIngresso = sc.nextInt();
        Visitante visitante = getVisitanteByIngresso();
        if (consultarIngresso(códigoIngresso)) {
            System.out.println("Selecione a atração:");
            System.out.println("1 - Roda Gigante");
            System.out.println("2 - Montanha Russa");
            System.out.println("3 - Carossel");
            System.out.println("4 - Retornar para menu");

            while (true) {
                int seletor = sc.nextInt();
                try {
                    if (seletor == 4) {
                        //volta pro menu
                    }
                    getAtracaoById(seletor).adicionarVisitante(visitante);
                    break;
                } catch (Exception e) {
                    System.out.println("Seleção inválida");
                }
            }
        }
    }
}
