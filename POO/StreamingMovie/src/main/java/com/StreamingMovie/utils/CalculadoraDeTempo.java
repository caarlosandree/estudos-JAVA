package utils;

import models.Filme;
import models.Serie;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {

        return tempoTotal;
    }

    public void adicionarFilme(Filme titulo) {

        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public void adicionarSerie(Serie titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
