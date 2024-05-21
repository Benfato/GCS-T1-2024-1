
public abstract class herancaAtracao {
    protected String atracao;

    public class Visita {

    }


    interface Historico {
        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso);

    }

    public class montanhaRussa extends herancaAtracao implements Historico {
        public montanhaRussa() {
            this.atracao = "Montanha Russa";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public class rodaGigante extends herancaAtracao implements Historico {
        public rodaGigante() {
            this.atracao = "Roda Gigante";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
            return true;
            } else { return false; }
        }
    }

    public class barcoViking extends herancaAtracao implements Historico {
        public barcoViking() {
            this.atracao = "Barco Viking";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class carroChoque extends herancaAtracao implements Historico {
        public carroChoque() {
            this.atracao = "Carro Choque";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class tremFantasma extends herancaAtracao implements Historico {
        public tremFantasma() {
            this.atracao = "Trem Fantasma";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class tiroAoAlvo extends herancaAtracao implements Historico {
        public tiroAoAlvo() {
            this.atracao = "Tiro ao Alvo";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

    public class bocaDoPalhaco extends herancaAtracao implements Historico {
        public bocaDoPalhaco() {
            this.atracao = "Boca do Palhaço";
        }

        public boolean registraVisita(herancaVisitante visitante, Ingresso ingresso) {
            if (ingresso != null && ingresso.getVisitante() == visitante.getNome()) {
                return true;
            } else { return false; }
        }
    }

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

    private boolean isValido(Visitante visitante) {
        for (Ingresso ingresso : ingressos) {
            if (ingresso.getVisitante() == visitante) {
                return true;
            }
        }
        return false;
    }

    public String getNomeAtracao() {
        return atracao;
    }

//O parque de diversões precisa armazenar dados de suas atrações e de seus visitantes.
//As atrações incluem, por exemplo;
// montanha-russa, roda-gigante, barco viking, carro-choque, trem-fantasma etc
}