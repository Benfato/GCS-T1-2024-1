import java.util.ArrayList;
import java.util.List;

//O parque de diversões precisa armazenar dados de suas atrações e de seus visitantes.
//As atrações incluem, por exemplo;
// montanha-russa, roda-gigante, barco viking, carro-choque, trem-fantasma etc

public abstract class herancaAtracao {
    protected String atracao;
    protected List<Visita> visitas;

    public class Visita {
        private String dataVisita;
        private herancaAtracao atracao;
        private herancaVisitante visitante;
        private Ingresso ingresso;

        public Visita(Ingresso ingresso, herancaAtracao atracao, herancaVisitante visitante, String dataVisita) {
            this.dataVisita = dataVisita;
            this.atracao = atracao;
            this.visitante = visitante;
            this.ingresso = ingresso;
            
        }
    }

    public herancaAtracao() {
        visitas = new ArrayList<>();
    }


    interface Registros {
        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso);
        private boolean isIngressoValido(Ingresso ingresso) {};
        public boolean getDataVisita(Ingresso dataAtual); // Alterar para dia Global
    }

    public boolean isIngressoValido(Ingresso ingresso) {
        if (ingresso.isValido()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValido(Visitante visitante) {
        for (Ingresso ingresso : Ingresso.ingressos) {
            if (visitante.ingresso.getVisitante() == visitante && ingresso != null) {
                return true;
            }
        }
        return false;
    }


    /*
    public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
        if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
            return true;
        } else if (ingresso != null && ingresso.isValido()) {
            this.visitante.add(visitante);
            ingresso.registraVisita(this);
            return true;
        } else {
            System.out.println("Visitante não possui ingresso válido.");
            return false;
        }
    }


    */

    public String getNomeAtracao() {
        return atracao;
    }
    

    public class montanhaRussa extends herancaAtracao implements Registros {
        public montanhaRussa() {
            this.atracao = "Montanha Russa";
        }


        // Ajustar duplicidade de métodos
        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else if (ingresso != null && ingresso.isValido()) {
                visitas.add(new Visita());
                ingresso.registraVisita(this);
                return true;
            } else {
                System.out.println("Visitante não possui ingresso válido.");
                return false;
            }
        }
    }
    
    public class rodaGigante extends herancaAtracao implements Registros {
        public rodaGigante() {
            this.atracao = "Roda Gigante";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
            return true;
            } else { return false; }
        }
    }

    public class barcoViking extends herancaAtracao implements Registros {
        public barcoViking() {
            this.atracao = "Barco Viking";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class carroChoque extends herancaAtracao implements Registros {
        public carroChoque() {
            this.atracao = "Carro Choque";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class tremFantasma extends herancaAtracao implements Registros {
        public tremFantasma() {
            this.atracao = "Trem Fantasma";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class tiroAoAlvo extends herancaAtracao implements Registros {
        public tiroAoAlvo() {
            this.atracao = "Tiro ao Alvo";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class bocaDoPalhaco extends herancaAtracao implements Registros {
        public bocaDoPalhaco() {
            this.atracao = "Boca do Palhaço";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }



}