import java.lang.reflect.Array;
import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    O sistema deverá permitir ao operador consultar, para uma determinada data,
    todas as atrações do parque e a quantidade de visitantes 
    que utilizou cada uma delas, ordenadas da mais visitada à menos visitada. 
 */

public class ConsultarAtracoesPorDia {

    public static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite a data(Dia/Mes/Ano): ");
        String data = scan.nextLine();

        for(Atracao atracao : mainMenu.atracoes){
            int contadorAux = 0;
            for(VisitanteDaAtracao visitante: atracao.visitantes){
                if(visitante.data == data) {
                    contadorAux++;
                }
                
            }
            System.out.println(atracao.nome + "" + contadorAux);
            contadorAux = 0;
        }

        System.out.println();

    }
}
