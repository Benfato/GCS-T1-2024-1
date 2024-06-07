import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class ControleIngresso {
    private int countIngresso = 0;
    private HashMap<Ingresso, Visitante> listaVizitantes;
    private HashMap<LocalDate, HashMap<Ingresso, Visitante>> historico;

    public ControleIngresso() {
        this.listaVizitantes = new HashMap<Ingresso, Visitante>();
        this.historico = new HashMap<LocalDate, HashMap<Ingresso, Visitante>>();
    }

    public void addVisitante(Visitante visitante, LocalDate data) {
        if (this.countIngresso < 500) {
            this.listaVizitantes.put(new Ingresso(countIngresso, data), visitante);
            
            countIngresso++;
            System.out.println("Ingresso cadastrado com sucesso!");
        } else {
            System.out.println("Limite de ingressos atingido.");
        }
    }

    public ArrayList<Visitante> getVisitantes() {
        return new ArrayList<>(listaVizitantes.values());
    }

    public int getNextIngresso() {
        return listaVizitantes.size() + 1;
    }

    public Visitante getVisitanteByIngresso(int ingresso) {
        return listaVizitantes.get(ingresso);
    }

    public int getQuantidadeIngressos() {
        return listaVizitantes.size();
    }

    public int getIngressoByVisitante(Visitante visitante) {
        Collection<Visitante> lista = listaVizitantes.values();
        for (int i = 0; i < lista.size(); i++) {
            if (visitante.equals(lista.toArray()[i])) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Visitante> getVisitantesByData(LocalDate data) {
        return new ArrayList<>(historico.get(data).values());
    }

    public boolean consultaIngresso(Visitante visitante) {
        Collection<Visitante> lista = listaVizitantes.values();
        for (Visitante v2 : lista) {
            if (visitante.getCpf() == v2.getCpf()) {
                return true;
            }
        }
        return false;
    }

    public int getFaturamentoPeriodo() {
        try {
            Scanner scan = new Scanner(System.in);
            DateTimeFormatter f = new DateTimeFormatterBuilder().parseCaseInsensitive()
                    .append(DateTimeFormatter.ofPattern("dd-MMM-yyyy")).toFormatter();

            System.out.println();
            System.out.println("Digite o inicio do período (dd/MMM/yyy): ");
            String dataString = scan.nextLine();
            LocalDate inicio = LocalDate.parse(dataString, f);

            System.out.println();
            System.out.println("Digite o inicio do período (dd/MMM/yyy): ");
            dataString = scan.nextLine();
            LocalDate fim = LocalDate.parse(dataString, f);

            scan.close();

            int faturamento = 0;
            for (LocalDate data = inicio; data.isBefore(fim); data = data.plusDays(1)) {
                if (historico.containsKey(data)) {
                    Collection<Visitante> lista = historico.get(data).values();
                    for (Visitante v : lista) {
                        if (v.getIdade() > 12) {
                            faturamento += 100;
                        } else {
                            faturamento += 80;
                        }
                    }
                }

            }
            return faturamento;
        } catch (Exception e) {
            System.out.println("Erro");
            return -1;
        }

    }

    public void encerraDia() {
        countIngresso = 0;
        historico.put(LocalDate.now(), listaVizitantes);
        listaVizitantes.clear();
    }

}