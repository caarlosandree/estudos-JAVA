package services;

import model.Serie;

import java.util.ArrayList;

public class CriarSeries {
    public static ArrayList<Serie> series() {

        ArrayList<Serie> listaSeries = new ArrayList<>();
        Serie theBoys = new Serie();
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2019);
        theBoys.setIncluidoNoPlano(false);
        theBoys.setTotalTemporadas(3);
        theBoys.setEpisodiosPorTemporada(10);
        theBoys.setMinutosPorEpisodio(58);
        theBoys.setFinalizada(true);

        // Avaliações
        double[] notasTheBoys = {7.2, 8.9, 6.5, 9.1, 7.8, 8.3, 6.9, 9.5, 7.4, 8.7, 9.2};
        for (double nota : notasTheBoys) {
            theBoys.avaliar(nota);
        }
        listaSeries.add(theBoys);

        Serie breakingBad = new Serie();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setAnoDeLancamento(2008);
        breakingBad.setIncluidoNoPlano(true);
        breakingBad.setTotalTemporadas(5);
        breakingBad.setEpisodiosPorTemporada(10);
        breakingBad.setMinutosPorEpisodio(48);
        breakingBad.setFinalizada(false);

        // Avaliações
        double[] notasBreakingBad = {9.8, 10.0, 8.5, 9.2, 9.5, 8.9, 10.0, 9.1, 8.7, 9.6, 9.3, 9.0, 8.8, 9.7, 9.4};
        for (double nota : notasBreakingBad) {
            breakingBad.avaliar(nota);
        }
        listaSeries.add(breakingBad);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setIncluidoNoPlano(true);
        lost.setTotalTemporadas(6);
        lost.setEpisodiosPorTemporada(20);
        lost.setMinutosPorEpisodio(42);
        lost.setFinalizada(false);

        // Avaliações
        double[] notasLost = {8.0, 7.5, 9.0, 8.3, 7.8, 8.5, 7.2, 8.8, 7.9, 8.1, 7.6, 8.4, 7.7};
        for (double nota : notasLost) {
            lost.avaliar(nota);
        }
        listaSeries.add(lost);

        return listaSeries;
    }

}
