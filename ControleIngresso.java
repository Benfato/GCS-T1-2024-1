import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class ControleIngresso {
    private static HashMap<Integer, Visitante> listaVizitantes;
    private static HashMap<LocalDate, HashMap<Integer, Visitante>> historico;

    public static void addVisitante(int ingresso, Visitante visitante) {
        listaVizitantes.put(ingresso, visitante);
    }

    public static ArrayList<Visitante> getVisitantes() {
        return new ArrayList<>(listaVizitantes.values());
    }

    public static int getNextIngresso() {
        return listaVizitantes.size() + 1;
    }

    public static Visitante getVisitanteByIngresso(int ingresso) {
        return listaVizitantes.get(ingresso);
    }

    public static int getQuantidadeIngressos() {
        return listaVizitantes.size();
    }

    public static int getIngressoByVisitante(Visitante visitante) {
        Collection<Visitante> lista = listaVizitantes.values();
        for (int i = 0; i < lista.size(); i++) {
            if (visitante.equals(lista.toArray()[i])) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Visitante> getVisitantesByData(LocalDate data) {
        return new ArrayList<>(historico.get(data).values());
    }

    public static boolean consultaIngresso(Visitante visitante) {
        Collection<Visitante> lista = listaVizitantes.values();
        for (Visitante v2 : lista) {
            if (visitante.getCpf() == v2.getCpf()) {
                return true;
            }
        }
        return false;
    }

    public static int getFaturamentoPeriodo() {
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

    public static void encerraDia() {
        historico.put(LocalDate.now(), listaVizitantes);
        listaVizitantes.clear();
    }

}