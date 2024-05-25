import java.util.ArrayList;

public class Ingresso {

    /* Cada ingresso tem um número identificador sequencial daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc)
    * e deve estar associado ao registro de um visitante (seja adulto ou criança).
    */

    private static int controleIngresso = 1;
    private int ingresso;
    private int valor;
    private atributosVisitante visitante;
    private final String identificador;

    enum validadeIngresso {
        INVALIDO, VALIDO
    }

    public Ingresso(atributosVisitante visitante, String data) {
        this.visitante = visitante;
        this.ingresso = incrementaIngresso(); // Usa a funcao incrementaIngresso(), atribuind valor a ingresso
        this.identificador = subMenu.getData() + " - Ingresso: " + String.format("%03d", ingresso) + " - Valor: " + getValorIngresso(visitante.tipo);
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

    public String getIngressoData() {// Pega a data do ingresso
        return identificador.split("-")[0].trim();
    }

    // ArrayList para controle de ingressos do dia
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

    public static ArrayList<Ingresso> getIngressos() {// Pega os ingressos do dia
        return ingressosDoDia;
    }



    private Integer incrementaIngresso() { // AJUSTAR vendasIngressoDia
        if (controleIngresso < 500 && visitante.tipo == "Adulto") {
            ingresso = controleIngresso;
            controleIngresso++;
            vendasIngressoDia+= 100;
        } else if (controleIngresso < 500 && visitante.tipo == "Crianca") {
            ingresso = controleIngresso;
            controleIngresso++;
            vendasIngressoDia+= 80;
        } else if (controleIngresso == 500){
            System.out.println("Erro: Limite de Ingressos diários atingido.");
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

    private static ArrayList<RegistrosDia> vendasIngressoDia = new ArrayList<> () implements Registros;
    public static ArrayList<RegistrosDia> getVendasIngressoDia() {

        return vendasIngressoDia;
    }

    // return identificador.split("-")[-1].trim();

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

    private int getIdentificador(Ingresso ingresso) {
        String i = identificador.split("-")[-2].trim();
        int identificador = Integer.parseInt(i);
        return identificador;
    }

}
