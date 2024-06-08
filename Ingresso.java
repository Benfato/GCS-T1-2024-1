
import java.time.LocalDate;

public class Ingresso {
    private int codigo;
    private LocalDate data;

    public Ingresso(int numIngresso, LocalDate data) {
        this.codigo = numIngresso;
        this.data = data;
    }

    public int getCodigoIngresso() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }
}
