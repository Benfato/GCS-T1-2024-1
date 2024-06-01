import java.util.*;
import java.util.Map;

public abstract class Atracao {
    protected String nomeAtracao;
    protected Map<Visitante, Visita> visitas;

    public class Visita {
        private String dataVisita;
        private Atracao atracao;
        private Visitante visitante;
        private Ingresso ingresso;

        public Visita(Ingresso ingresso, Atracao atracao, Visitante visitante, String dataVisita) {
            this.dataVisita = dataVisita;
            this.atracao = atracao;
            this.visitante = visitante;
            this.ingresso = ingresso;
        }
    }

    public Atracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
        visitas = new HashMap<>();
    }

    interface Registros {
        boolean registraVisita(Visitante visitante, Ingresso ingresso);
        boolean getDataVisita(Ingresso dataAtual); // Alterar para dia Global
    }

    private boolean isValido(Visitante visitante) {
        for (Map.Entry<Visitante, Visita> entry : visitas.entrySet()) {
            if (entry.getKey() == visitante && entry.getValue().ingresso != null) {
                return true;
            }
        }
        return false;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public boolean registraVisita(Visitante visitante, Ingresso ingresso, String dataVisita) {
        if (ingresso != null && ingresso.getVisitante() == visitante) {
            visitas.put(visitante, new Visita(ingresso, this, visitante, dataVisita));
            return true;
        } else if (ingresso != null && ingresso.isValido()) {
            visitas.put(visitante, new Visita(ingresso, this, visitante, dataVisita));
            ingresso.registraVisita(this);
            return true;
        } else {
            System.out.println("Visitante não possui ingresso válido.");
            return false;
        }
    }
}
