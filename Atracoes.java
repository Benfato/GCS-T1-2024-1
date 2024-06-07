import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Atracoes {
    public ArrayList<Atracao> atracoes;

    public Atracoes() {
        atracoes = new ArrayList<>();
    }

    public void cadastrarAtracao(String nome) {
        atracoes.add(new Atracao(nome));
    }

    public void exibirAtracoes() {
        System.out.println("Atrações do Parque:");
        for (Atracao atracao : atracoes) {
            System.out.println("- " + atracao.getNome());
            
        }
    }

    /*
    O sistema deverá permitir ao operador consultar, para uma determinada data,
    todas as atrações do parque e a quantidade de visitantes 
    que utilizou cada uma delas, ordenadas da mais visitada à menos visitada. 
    */

    public void consultarAtracoesPorDia(){
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite a data(Dia/Mes/Ano): ");
        String dataString = scan.nextLine();

        DateTimeFormatter f = new DateTimeFormatterBuilder().parseCaseInsensitive()
        .append(DateTimeFormatter.ofPattern("yyyy-MMM-dd")).toFormatter();
        try {
            LocalDate data = LocalDate.parse(dataString, f);
            
            for(Atracao atracao : atracoes){
                int contadorAux = 0;
                for(VisitanteDaAtracao visitante: atracao.visitantes){
                    if(visitante.data == data) {
                        contadorAux++;
                    }
                    
                }
                System.out.println(atracao.nome + "" + contadorAux);
                contadorAux = 0;
            }

        } catch (DateTimeParseException e) {
            System.out.println("Erro");
        }   

        System.out.println();
    }
}