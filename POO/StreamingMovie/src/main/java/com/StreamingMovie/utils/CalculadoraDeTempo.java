package com.streamingmovie.utils;

import com.streamingmovie.models.Filme;
import com.streamingmovie.models.Serie;

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

    public void adicionarFilme(Filme titulo) {

        this.tempoTotalFilmes += titulo.getDuracaoEmMinutos();
    }

    public void adicionarSerie(Serie titulo) {

        this.tempoTotalSeries += titulo.getDuracaoEmMinutos();
    }
}
