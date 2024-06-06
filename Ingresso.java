import java.time.LocalDate;

public class Ingresso {
    ControleIngresso controladorIngresso = new ControleIngresso();
    private int contadorIngressos = 0;

    public Ingresso(Visitante visitante) {
        if (contadorIngressos < 500) {
            int ingresso = this.contadorIngressos;
            LocalDate data = LocalDate.now();
            controladorIngresso.addVisitante(contadorIngressos, visitante);
            this.contadorIngressos++;
            System.out.println("Ingresso cadastrado com sucesso!");
        } else {
            controladorIngresso.encerraDia();
            contadorIngressos = 0;
            System.out.println("Limite de ingressos atingido, encerrando o dia.");
        }
    }
}
