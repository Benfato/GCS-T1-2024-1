import java.time.LocalDate;

public class Ingresso {
    private Visitante visitante;
    private int contadorIngressos = 0;
    private int ingresso;
    private LocalDate data;

    public Ingresso(Visitante visitante) {
        if (contadorIngressos < 500) {
            this.visitante = visitante;
            this.ingresso = contadorIngressos;
            this.data = LocalDate.now();

            ControleIngresso.addVisitante(contadorIngressos, visitante);
            this.contadorIngressos++;

            System.out.println("Ingresso cadastrado com sucesso!");
        } else {
            ControleIngresso.encerraDia();
            contadorIngressos = 0;
            System.out.println("Limite de ingressos atingido, encerrando o dia.");
        }
    }

    public int getCodigoIngresso() {
        return ingresso;
    }

    public LocalDate getData() {
        return data;
    }

    public Visitante getVisitante() {
        return visitante;
    }
}
