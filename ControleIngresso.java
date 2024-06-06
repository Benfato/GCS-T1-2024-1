import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ControleIngresso {
    private HashMap<Integer, Visitante> listaVizitantes;
    private HashMap<LocalDate, HashMap<Integer, Visitante>> historico;

    public void addVisitante(int ingresso, Visitante visitante) {
        this.listaVizitantes.put(ingresso, visitante);
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
        Collection<Visitante> lista = this.listaVizitantes.values();
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
        Collection<Visitante> lista = this.listaVizitantes.values();
        for (Visitante v2 : lista) {
            if (visitante.getCpf() == v2.getCpf()) {
                return true;
            }
        }
        return false;
    }

    // falta a criação do método que retorne o tipo ou o valor do ingresso para
    // verificação.
    public int getFaturamentoPeriodo(LocalDate inicio, LocalDate fim) {
        int faturamento = 0;
        for (LocalDate data = inicio; data.isBefore(fim); data = data.plusDays(1)) {
            if (historico.containsKey(data)) {
                Collection<Visitante> lista = this.historico.get(data).values();
                for (Visitante v : lista) {
                    if (v.getTipoIngresso() == TipoIngresso.INTEIRO) {
                        faturamento += 100;
                    } else if (v.getTipoIngresso() == TipoIngresso.INFANTIL) {
                        faturamento += 80;
                    }
                }
            }

        }
        return faturamento;
    }

    public void encerraDia() {
        this.historico.put(LocalDate.now(), this.listaVizitantes);
        this.listaVizitantes.clear();
    }

}