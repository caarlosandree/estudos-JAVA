package com.streamingmovie.models;

import com.streamingmovie.utils.Classificacao;

public class Episodio implements Classificacao {
    private int numeroEpisodio;
    private String nomeEpisodio;
    private boolean assistido;
    private double notaEpisodio;
    private int duracaoEpisodio;
    private Serie serie;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    public double getNotaEpisodio() {
        return notaEpisodio;
    }

    public void setNotaEpisodio(double notaEpisodio) {
        this.notaEpisodio = notaEpisodio;
    }

    public int getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    private int totalDeAvaliacoes;

    public double getMediaEpisodio() {
        return notaEpisodio / totalDeAvaliacoes;
    }

    @Override
    public double getClassificacao() {

        return (double) getMediaEpisodio() / 2;
    }
}
