package models;

import utils.Classificacao;

// Herança de Titulo
public class Serie extends Titulo implements Classificacao {

    private int totalTemporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean finalizada;

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return getTotalTemporadas() * getEpisodiosPorTemporada() * getMinutosPorEpisodio();
    }

    @Override
    public double getClassificacao() {
        return (double) getMediaAvaliacoes() / 2 ;
    }
}
