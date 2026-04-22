package utils;

import models.Filme;
import models.Serie;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {

        return this.tempoTotal;
    }

    public void adicionarFilme(Filme titulo) {

        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public void adicionarSerie(Serie titulo) {

        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
