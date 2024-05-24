import java.util.ArrayList;

public class Ingresso {

    /* Cada ingresso tem um número identificador sequencial daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc)
    * e deve estar associado ao registro de um visitante (seja adulto ou criança).
    */

    private static int controleIngresso = 1;
    private int ingresso;
    private int valor;
    private herancaVisitante visitante;
    private final String identificador;

    public Ingresso(herancaVisitante visitante, String data) {
        this.visitante = visitante;
        this.ingresso = incrementaIngresso(); // Usa a funcao incrementaIngresso(), atribuind valor a ingresso
        this.identificador = subMenu.getData() + "- Ingresso: " + String.format("%03d", ingresso);
        this.valor = valor;
    }

    // Verificar a adição de ingressos na lista.
    public static boolean isIngressoValido(int ingresso) {
        for (Ingresso i : ingressosDoDia) {
            if (i.getIngresso() == ingresso && i.getIngressoData().equals(subMenu.getData())) {
                return true;
            }
        }
        return false;
    }

    public String getIngressoData() {
        return identificador.split("-")[0].trim();
    }

    public static ArrayList<Ingresso> ingressosDoDia = new ArrayList<>();
    public static ArrayList<Ingresso> getAllIngressos() {
        ArrayList<Ingresso> allIngressos = new ArrayList<>();
        for (Ingresso ingresso : ingressosDoDia) {
            allIngressos.add(ingresso);
        }
        return allIngressos;
    }

    public static void addIngresso(Ingresso ingresso) {
        ingressosDoDia.add(ingresso);
    }

    public static ArrayList<Ingresso> getIngressos() {
        return ingressosDoDia;
    }

    private int incrementaIngresso() {
        if (controleIngresso == 500) {
            System.out.println("Limite de Ingressos diários atingido.");
        } else {
            if (visitante.tipo == "Adulto") {
                ingresso = controleIngresso;
                controleIngresso++;
                vendasIngressoDia+= 100;
            } else if (visitante.tipo == "Crianca") {
                ingresso = controleIngresso;
                controleIngresso++;
                vendasIngressoDia+= 80;
            } else {
                System.out.println("Erro: Tipo de visitante não reconhecido.");
            }
        }
        return ingresso; // Retorna o valor atualizado de ingresso
    }

    private int getValorIngresso(String tipo) {
        try {
            if (tipo == "Adulto") {
                return 100;
            } else if (tipo == "Crianca") {
                return 80;
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    };

    private static ArrayList<vendasIngressoDia> vendasIngressoDia = new ArrayList<>();
    public static ArrayList<vendasIngressoDia> getVendasIngressoDia() {
        return vendasIngressoDia;
    }

    public int getIngresso() {
        return ingresso;
    }

    public Integer getNextIngresso() {
        try {
            incrementaIngresso();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        return ingresso;
    }

    public String getVisitante() {
        return visitante.getNome();
    }

    public static int encerraDia(int controleIngresso) {
        return controleIngresso;
    }

}
