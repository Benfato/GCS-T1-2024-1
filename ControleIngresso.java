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

    public void encerraDia() {
        this.historico.put(LocalDate.now(), this.listaVizitantes);
        this.listaVizitantes.clear();
    }

}