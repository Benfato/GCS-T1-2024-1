
//Imports.
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

//Criação da classe Ingresso.
public class Ingresso {
    // Criação das variáveis.
    private int contadorIngressos = -1;
    private HashMap<Integer, Visitante> listaVizitantes;
    private HashMap<LocalDate, HashMap<Integer, Visitante>> historico;

    // Construtor.
    private Ingresso(Visitante visitante) {
        contadorIngressos = this.contadorIngressos++;
        LocalDate data = LocalDate.now();
        this.listaVizitantes.put(contadorIngressos, visitante);
    }

    // Método para consultar se um visitante possui um ingresso.
    public boolean consultaIngresso(Visitante visitante) {
        Collection<Visitante> lista = this.listaVizitantes.values();
        for (Visitante v2 : lista) {
            if (visitante.getCpf() == v2.getCpf()) {
                return true;
            }
        }
        return false;
    }

    // Método para cadastrar um ingresso a um visitante.
    public boolean cadastraIngresso(Visitante visitante) {
        if (contadorIngressos < 500) {
            if (!consultaIngresso(visitante)) {
                new Ingresso(visitante);
                return true;
            }
        }
        encerraDia();
        return false;
    }

    public Visitante getVisitanteByIngresso(int ingresso) {
        return listaVizitantes.get(ingresso);
    }

    public ArrayList<Visitante> getVisitantesByData(LocalDate data) {
        return new ArrayList<>(historico.get(data).values());
    }

    // Método para cadastrar um dia.
    private void encerraDia() {
        this.contadorIngressos = 0;
        historico.put(LocalDate.now(), listaVizitantes);
        this.listaVizitantes.clear();
    }

}
