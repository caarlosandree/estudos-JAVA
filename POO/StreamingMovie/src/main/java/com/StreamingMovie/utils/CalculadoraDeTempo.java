package utils;

import models.Filme;
import models.Serie;
import org.jetbrains.annotations.NotNull;

public class CalculadoraDeTempo {

    @Deprecated
    private int tempoTotal; // Vamos usar os tempos individuais
    private int tempoTotalFilmes;
    private int tempoTotalSeries;

    @Deprecated
    public int getTempoTotal() {

        return this.tempoTotal;
    }

    public int getTempoTotalFilmes() {
        return tempoTotalFilmes;
    }

    public int getTempoTotalSeries() {
        return tempoTotalSeries;
    }

    public void adicionarFilme(@NotNull Filme titulo) {

        this.tempoTotalFilmes += titulo.getDuracaoEmMinutos();
    }

    public void adicionarSerie(@NotNull Serie titulo) {

        this.tempoTotalSeries += titulo.getDuracaoEmMinutos();
    }
}
