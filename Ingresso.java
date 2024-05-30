//Imports.
import java.util.ArrayList;

//Criação da classe Ingresso.
public class Ingresso
{
    //Criação das variáveis.
    private int cont, dia;
    private ArrayList<Visitante> ingressos;
    private ArrayList<ArrayList> dias;

    //Construtor.
    public Ingresso()
    {
        this.cont = cont;
        this.dia = dia;
        ingressos = new ArrayList<>();
        dias = new ArrayList<>();
    }

    //Método para consultar se um visitante possui um ingresso.
    public boolean consultaIngresso(Visitante v1)
    {
        for (Visitante v2 : ingressos)
        {
            if (v1.getCpf() == v2.getCpf())
            {
                return true;
            }
        }
        return false;
    }
}
