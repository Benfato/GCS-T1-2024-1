
//Imports.
import java.time.LocalDate;

//Criação da classe Ingresso.
public class Ingresso {
    TRP trp = new TRP();
    private int contadorIngressos = 0;

    // Construtor.
    public Ingresso(Visitante visitante) {
        if (contadorIngressos < 500) {
            int ingresso = this.contadorIngressos;
            LocalDate data = LocalDate.now();
            trp.addVisitante(contadorIngressos, visitante);
            this.contadorIngressos++;
            System.out.println("Ingresso cadastrado com sucesso!");
        } else {
            trp.encerraDia();
            contadorIngressos = 0;
            System.out.println("Limite de ingressos atingido, encerrando o dia.");
        }
    }
}
