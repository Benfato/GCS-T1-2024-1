import java.util.ArrayList;

public class Ingresso {

    /* Cada ingresso tem um número identificador sequencial daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc)
    * e deve estar associado ao registro de um visitante (seja adulto ou criança).
    */

    private static int controleIngresso = 1;
    private final int ingresso;
    private int valor;
    private atributosVisitante visitante;
    private final String identificador;

    /* Considerar implementação de enum para validade do ingresso ou manter comparação de datas.
    enum validadeIngresso {
        INVALIDO, VALIDO
    }
    */

    public Ingresso(atributosVisitante visitante, String data, int anoDeNascimento) {
        this.visitante = visitante;
        this.ingresso = incrementaIngresso(); // Usa a funcao incrementaIngresso(), atribuind valor a ingresso
        this.identificador = subMenu.getData() + " - Ingresso: " + String.format("%03d", ingresso) + " - Valor: " + getValorIngresso(anoDeNascimento);
        this.valor = getValorIngresso(anoDeNascimento); // Por que eu adicionei isso?
    }


    private Integer incrementaIngresso() {
        if (controleIngresso < 500) {
            ingresso = controleIngresso;
            controleIngresso++;
        } else if (controleIngresso < 500) {
            ingresso = controleIngresso;
            controleIngresso++;
        } else if (controleIngresso == 500){
            System.out.println("Erro: Limite de Ingressos diários atingido.");
        }
        // Retorna o valor atualizado de ingresso
        return ingresso; 
    }

    public boolean isVisitanteMenorDeIdade(int anoDeNascimento) {
        String dataAtual = subMenu.getData();
        //Tratamento de data
        int anoAtual = Integer.parseInt(dataAtual.split("/")[2]);
        int idade = anoAtual - anoDeNascimento;
        if (idade <= 12) {
            return true;
        } else {
            return false;
        }
    }

    private static ArrayList<RegistrosDia> vendasIngressoDia = new ArrayList<> ();
    public static ArrayList<RegistrosDia> getVendasIngressoDia() {

        return vendasIngressoDia;
    }

    private int getValorIngresso(atributosVisitante visitante) {
        try {
            if (isVisitanteMenorDeIdade(visitante.anoDeNascimento) == false) {
                vendasIngressoDia.add(subMenu.getData(), this.ingresso, 100);
                return 100;
            } else if (isVisitanteMenorDeIdade(visitante.anoDeNascimento) == true) {
                // Adicionar aqui, lógica com adição no Array de resultados [vendasIngressoDia]
                return 80;
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    };

    // Verifica se o ingresso é válido e se o visistante pode visitar uma atracao.
    public static boolean isIngressoValido(int ingresso) {
        for (Ingresso i : ingressosDoDia) {
            if (i.getIngresso() == ingresso && i.getIngressoData().equals(subMenu.getData())) {
                return true;
            }
        }
        { return false; }
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

    public static ArrayList<Ingresso> getIngressosDoDia() {// Pega os ingressos do dia
        return ingressosDoDia;
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
