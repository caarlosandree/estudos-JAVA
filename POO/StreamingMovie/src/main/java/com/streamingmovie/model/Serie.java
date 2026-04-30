package model;

import DAO.Classificacao;
import java.util.ArrayList;

// Herança de Titulo
public class Serie extends Titulo implements Classificacao {

    private int totalTemporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean finalizada;
    private ArrayList<ArrayList<Episodio>> episodios; // Matriz 2D: temporada -> episódios

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

    // Inicializar a estrutura de episódios
    public void inicializarEpisodios() {
        episodios = new ArrayList<>();
        for (int t = 0; t < totalTemporadas; t++) {
            episodios.add(new ArrayList<>());
        }
    }

    // Adicionar episódio em uma temporada específica
    public void adicionarEpisodio(int temporada, Episodio episodio) {
        if (episodios == null) {
            inicializarEpisodios();
        }
        if (temporada > 0 && temporada <= totalTemporadas) {
            episodios.get(temporada - 1).add(episodio);
        }
    }

    // Obter episódios de uma temporada específica
    public ArrayList<Episodio> getEpisodiosPorTemporada(int numeroDaTemporada) {
        if (episodios == null || numeroDaTemporada < 1 || numeroDaTemporada > totalTemporadas) {
            return new ArrayList<>();
        }
        return episodios.get(numeroDaTemporada - 1);
    }
}
