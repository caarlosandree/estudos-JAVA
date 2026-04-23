package services;

import models.Serie;
import models.Episodio;

public class CriarEpisodios {
    public static Episodio[] episodios() {
        Serie[] series = CriarSeries.series();
        Serie theBoys = series[0];
        Serie breakingBad = series[1];
        Serie lost = series[2];

        Episodio[] episodiosTheBoys = new Episodio[30];
        Episodio[] episodiosBreakingBad = new Episodio[50];
        Episodio[] episodiosLost = new Episodio[96];

        // The Boys - 3 temporadas, 10 episódios cada
        episodiosTheBoys[0] = criarEpisodio(1, "The Name of the Game", 60, 8.5, theBoys);
        episodiosTheBoys[1] = criarEpisodio(2, "Cherry", 58, 8.2, theBoys);
        episodiosTheBoys[2] = criarEpisodio(3, "Get Some", 55, 8.0, theBoys);
        episodiosTheBoys[3] = criarEpisodio(4, "The Innocents", 57, 8.3, theBoys);
        episodiosTheBoys[4] = criarEpisodio(5, "Good for the Soul", 59, 8.1, theBoys);
        episodiosTheBoys[5] = criarEpisodio(6, "The Big Ride", 56, 8.4, theBoys);
        episodiosTheBoys[6] = criarEpisodio(7, "Over the Hill with the Swords of a Thousand Men", 62, 8.6, theBoys);
        episodiosTheBoys[7] = criarEpisodio(8, "You Found Me", 58, 8.7, theBoys);
        episodiosTheBoys[8] = criarEpisodio(9, "The Big Ride", 57, 8.0, theBoys);
        episodiosTheBoys[9] = criarEpisodio(10, "Proper Preparation and Planning", 60, 8.3, theBoys);

        episodiosTheBoys[10] = criarEpisodio(11, "Nothing Like It", 55, 8.5, theBoys);
        episodiosTheBoys[11] = criarEpisodio(12, "We Gotta Go Now", 58, 8.2, theBoys);
        episodiosTheBoys[12] = criarEpisodio(13, "The Bloody Doors Off", 56, 8.4, theBoys);
        episodiosTheBoys[13] = criarEpisodio(14, "Butcher, Baker, Candlestickmaker", 61, 8.6, theBoys);
        episodiosTheBoys[14] = criarEpisodio(15, "What I Know", 59, 8.8, theBoys);
        episodiosTheBoys[15] = criarEpisodio(16, "The Big Ride", 57, 8.1, theBoys);
        episodiosTheBoys[16] = criarEpisodio(17, "Over the Hill with the Swords of a Thousand Men", 62, 8.5, theBoys);
        episodiosTheBoys[17] = criarEpisodio(18, "You Found Me", 58, 8.7, theBoys);
        episodiosTheBoys[18] = criarEpisodio(19, "The Big Ride", 56, 8.3, theBoys);
        episodiosTheBoys[19] = criarEpisodio(20, "Proper Preparation and Planning", 60, 8.4, theBoys);

        episodiosTheBoys[20] = criarEpisodio(21, "Payback", 60, 8.9, theBoys);
        episodiosTheBoys[21] = criarEpisodio(22, "The Only Man in the Sky", 58, 8.7, theBoys);
        episodiosTheBoys[22] = criarEpisodio(23, "Barbary Coast", 55, 8.4, theBoys);
        episodiosTheBoys[23] = criarEpisodio(24, "Glorious Five Year Plan", 57, 8.6, theBoys);
        episodiosTheBoys[24] = criarEpisodio(25, "The Last Time to Look on This World of Lies", 62, 8.8, theBoys);
        episodiosTheBoys[25] = criarEpisodio(26, "Herogasm", 59, 9.0, theBoys);
        episodiosTheBoys[26] = criarEpisodio(27, "Here Comes a Candle to Light You to Bed", 61, 8.9, theBoys);
        episodiosTheBoys[27] = criarEpisodio(28, "The Instant White-Hot Wild", 58, 9.1, theBoys);
        episodiosTheBoys[28] = criarEpisodio(29, "The Big Ride", 56, 8.5, theBoys);
        episodiosTheBoys[29] = criarEpisodio(30, "Over the Hill with the Swords of a Thousand Men", 63, 8.8, theBoys);

        // Breaking Bad - 5 temporadas, 10 episódios cada
        episodiosBreakingBad[0] = criarEpisodio(1, "Pilot", 48, 9.5, breakingBad);
        episodiosBreakingBad[1] = criarEpisodio(2, "Cat's in the Bag...", 48, 9.2, breakingBad);
        episodiosBreakingBad[2] = criarEpisodio(3, "...And the Bag's in the River", 48, 9.0, breakingBad);
        episodiosBreakingBad[3] = criarEpisodio(4, "Cancer Man", 48, 8.8, breakingBad);
        episodiosBreakingBad[4] = criarEpisodio(5, "Gray Matter", 48, 8.9, breakingBad);
        episodiosBreakingBad[5] = criarEpisodio(6, "Crazy Handful of Nothin'", 48, 9.1, breakingBad);
        episodiosBreakingBad[6] = criarEpisodio(7, "A No-Rough-Stuff-Type Deal", 48, 8.7, breakingBad);
        episodiosBreakingBad[7] = criarEpisodio(8, "Seven Thirty-Seven", 48, 9.3, breakingBad);
        episodiosBreakingBad[8] = criarEpisodio(9, "Down", 48, 8.9, breakingBad);
        episodiosBreakingBad[9] = criarEpisodio(10, "Over", 48, 9.4, breakingBad);

        for (int i = 10; i < 20; i++) {
            episodiosBreakingBad[i] = criarEpisodio(i + 1, "Episódio " + (i + 1), 48, 8.5 + (i % 5) * 0.1, breakingBad);
        }

        for (int i = 20; i < 30; i++) {
            episodiosBreakingBad[i] = criarEpisodio(i + 1, "Episódio " + (i + 1), 48, 8.6 + (i % 5) * 0.1, breakingBad);
        }

        for (int i = 30; i < 40; i++) {
            episodiosBreakingBad[i] = criarEpisodio(i + 1, "Episódio " + (i + 1), 48, 8.7 + (i % 5) * 0.1, breakingBad);
        }

        for (int i = 40; i < 50; i++) {
            episodiosBreakingBad[i] = criarEpisodio(i + 1, "Episódio " + (i + 1), 48, 8.8 + (i % 5) * 0.1, breakingBad);
        }

        // Lost - 6 temporadas, 16 episódios cada
        for (int i = 0; i < 96; i++) {
            episodiosLost[i] = criarEpisodio(i + 1, "Episódio " + (i + 1), 42, 7.5 + (i % 10) * 0.1, lost);
        }

        Episodio[] todosEpisodios = new Episodio[176];
        int index = 0;

        for (Episodio ep : episodiosTheBoys) {
            todosEpisodios[index++] = ep;
        }

        for (Episodio ep : episodiosBreakingBad) {
            todosEpisodios[index++] = ep;
        }

        for (Episodio ep : episodiosLost) {
            todosEpisodios[index++] = ep;
        }

        return todosEpisodios;
    }

    private static Episodio criarEpisodio(int numero, String nome, int duracao, double nota, Serie serie) {
        Episodio ep = new Episodio();
        ep.setNumeroEpisodio(numero);
        ep.setNomeEpisodio(nome);
        ep.setDuracaoEpisodio(duracao);
        ep.setNotaEpisodio(nota);
        ep.setAssistido(false);
        ep.setSerie(serie);
        return ep;
    }
}
