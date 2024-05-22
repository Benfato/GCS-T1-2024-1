import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

    /* Cada ingresso tem um número identificador sequencial daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc)
    * e deve estar associado ao registro de um visitante (seja adulto ou criança).
    */

public class Ingresso {
    private static int controleIngresso = 0;
    private int ingresso;
    private herancaVisitante visitante;
    private final String identificador;
    private String dataStart = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now());
    private String dataAtual = dataStart;
    

    public Ingresso(herancaVisitante visitante, String data) {
        this.visitante = visitante;
        this.ingresso = incrementaIngresso(); // Usa a funcao incrementaIngresso(), atribuind valor a ingresso
        this.identificador = getData() + "- Ingresso: " + String.format("%03d", ingresso);
    }


    // Verificar a adição de ingressos na lista.

    private static ArrayList<Ingresso> ingressos = new ArrayList<>();
    public static ArrayList<Ingresso> getAllIngressos() {
        ArrayList<Ingresso> allIngressos = new ArrayList<>();
        for (Ingresso ingresso : ingressos) {
            allIngressos.add(ingresso);
        }
        return allIngressos;
    }

    public static void addIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public static ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    //


    private int incrementaIngresso() {
        if (controleIngresso == 500) {
            System.out.println("Limite de Ingressos diários atingido.");
        } else {
            ingresso = controleIngresso;
            controleIngresso++;
        }
        return ingresso; // Retorna o valor atualizado de ingresso
    }
    
    public int getIngresso() {
        return ingresso;
    }

    public void getNextIngresso() {
        incrementaIngresso();
    }

    public String getVisitante() {
        return visitante.getNome();
    }

    public String getData() {
        return dataAtual;
    }

    public void incrementaData() {
        LocalDateTime incrementaData = LocalDateTime.parse(dataAtual, DateTimeFormatter.ofPattern("dd/MM/yyyy")).plusDays(1);
        dataAtual = incrementaData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        controleIngresso = 0; // Reseta controleIngresso ao finalizar o dia
    }
    
    
}
