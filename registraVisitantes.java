import java.util.Random;

/*
     * O sistema deve permitir que o operador registre a entrada de visitantes no parque.
     * O sistema deve ter um método que gere um nome aleatório para o visitante.
     * O sistema deve ter um método que gere um número, do ano de nascimento aleatório entre 0 e 120 para o visitante. Caso a idade seja menor ou igual a 12 anos, o visitante deve ser criado como Child, utilizando a referencia de Visitante.java.
     * Caso a idade seja maior que 12 anos, o visitante deve ser criado como Parent, utilizando a referencia de Visitante.java.
     * O sistema deve ter um método que gere um número de telefone aleatório para o visitante.
     * O sistema deve ter um método que gere um número de ingresso aleatório para o visitante.
     */

public class registraVisitantes {

    public static void main(String[] args) {
        // Cria um visitante
        Visitante visitante = new Visitante("João Pedro", "999999999", Ingresso());
        // Cria uma atração
        Atracao atração = new Atracao();
        // Adiciona o visitante na atração
        atração.adicionarVisitante(visitante);
    }
}
