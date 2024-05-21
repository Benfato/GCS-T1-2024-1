import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

    /* Cada ingresso tem um número identificador sequencial daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc)
     * e deve estar associado ao registro de um visitante (seja adulto ou criança).
     */

public class Ingresso {
    private int sequencial = primeiroIngressoDia();
    private int controleIng = sequencial - 1;
    private String identificador;
    private herancaVisitante visitante;
    private String dataStart = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now());
    private String dataControle = dataStart;
    

    public Ingresso(String data, herancaVisitante visitante) {
        // Incrementa o sequencial. Ingresso com formato de 3 dígitos [Limite 500].
        this.identificador = getData() + "- Ingresso: " + String.format("%03d", controleIngresso()); 
        this.visitante = visitante;
    }

    private String getData() { // Incrementa a data.
        // Converte "dataControle" de uma "String" para um objeto "LocalDateTime" antes de usar o método "plusDays()".
        LocalDateTime incrementaData = LocalDateTime.parse(dataControle, DateTimeFormatter.ofPattern("dd/MM/yyyy")).plusDays(1);
        String dataControle = incrementaData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return dataControle;
    }

    private void controleIngresso() { // Incrementa o controle de ingresso.
        try {
            if (controleIng == 500) {
                return;
                
            } else {incrementaIngresso();}
        }
        catch (Exception e) {
            System.out.println("Limite de ingressos atingido para o dia " + dataControle);
        }
    }

    private int incrementaIngresso() { // Incrementa o ingresso.
        return controleIng++;
    }

    public static int primeiroIngressoDia() {  // Gera o primeiro ingresso do dia
        int sequencial = new Random().nextInt(500);
        return sequencial;
    }

    public String getVisitante() {
        return this.visitante.getNome();
    }
}
