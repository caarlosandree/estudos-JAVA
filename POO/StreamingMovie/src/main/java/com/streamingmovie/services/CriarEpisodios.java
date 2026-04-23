package com.streamingmovie.services;

import com.streamingmovie.models.Serie;
import com.streamingmovie.models.Episodio;

public class CriarEpisodios {

    // Método estático para popular episódios das séries
    public static void popularEpisodios(Serie theBoys, Serie breakingBad, Serie lost) {
        // Inicializar estrutura de episódios
        theBoys.inicializarEpisodios();
        breakingBad.inicializarEpisodios();
        lost.inicializarEpisodios();

        // Criar episódios de The Boys
        criarEpisodiosTheBoys(theBoys);

        // Criar episódios de Breaking Bad
        criarEpisodiosBreakingBad(breakingBad);

        // Criar episódios de Lost
        criarEpisodiosLost(lost);
    }

    private static void criarEpisodiosTheBoys(Serie theBoys) {
        // Temporada 1
        String[] nomesTmp1 = {"The Name of the Game", "Cherry", "Get Some", "The Innocents", "Good for the Soul",
                             "The Big Ride", "Over the Hill with the Swords", "You Found Me", "The Big Ride", "Proper Preparation"};
        for (int i = 0; i < nomesTmp1.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp1[i], 58, 8.5 - (i * 0.1), theBoys);
            ep.setAssistido(i < 3);
            theBoys.adicionarEpisodio(1, ep);
        }

        // Temporada 2
        String[] nomesTmp2 = {"Nothing Like It", "We Gotta Go Now", "The Bloody Doors Off", "Butcher Baker", "What I Know",
                             "The Big Ride", "Over the Hill", "You Found Me", "The Big Ride", "Proper Preparation"};
        for (int i = 0; i < nomesTmp2.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp2[i], 58, 8.5 - (i * 0.05), theBoys);
            theBoys.adicionarEpisodio(2, ep);
        }

        // Temporada 3
        String[] nomesTmp3 = {"Payback", "The Only Man", "Barbary Coast", "Glorious Five Year", "Last Time to Look",
                             "Herogasm", "Here Comes a Candle", "The Instant White-Hot", "The Big Ride", "Over the Hill"};
        for (int i = 0; i < nomesTmp3.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp3[i], 58, 8.9 - (i * 0.05), theBoys);
            theBoys.adicionarEpisodio(3, ep);
        }
    }

    private static void criarEpisodiosBreakingBad(Serie breakingBad) {
        // Temporada 1
        String[] nomesTmp1 = {"Pilot", "Cat's in the Bag", "And the Bag's", "Cancer Man", "Gray Matter",
                             "Crazy Handful", "No Rough Stuff", "Seven Thirty-Seven", "Down", "Over"};
        for (int i = 0; i < nomesTmp1.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp1[i], 48, 9.5 - (i * 0.05), breakingBad);
            breakingBad.adicionarEpisodio(1, ep);
        }

        // Temporada 2 - 13 episódios
        String[] nomesTmp2 = {"Seven Thirty-Seven", "Grilled", "Bit by a Dead Bee", "Down", "Breakage",
                             "Peekaboo", "Negro y Azul", "Better Call Saul", "Four Days Out", "Over",
                             "Phoenix", "Half Measures", "Full Measure"};
        for (int i = 0; i < nomesTmp2.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp2[i], 48, 9.4 - (i * 0.03), breakingBad);
            breakingBad.adicionarEpisodio(2, ep);
        }

        // Temporada 3-5 (simplificado)
        for (int temp = 3; temp <= 5; temp++) {
            int episodiosTemp = temp == 3 ? 13 : 14;
            for (int i = 1; i <= episodiosTemp; i++) {
                Episodio ep = criarEpisodio(i, "Episódio " + i, 48, 9.3, breakingBad);
                breakingBad.adicionarEpisodio(temp, ep);
            }
        }
    }

    private static void criarEpisodiosLost(Serie lost) {
        // Temporada 1 - 24 episódios
        String[] nomesTmp1 = {"Pilot: Part 1", "Pilot: Part 2", "Tabula Rasa", "Walkabout", "White Rabbit",
                             "House of the Rising Sun", "The Moth", "Confidence Man", "Solitary", "Raised by Another",
                             "All the Best Cowboys", "Whatever the Case", "Hearts and Minds", "Special", "Homecoming",
                             "Outlaws", "In Translation", "Numbers", "Deus Ex Machina", "Do No Harm",
                             "The Greater Good", "Born to Run", "Exodus: Part 1", "Exodus: Part 2"};
        for (int i = 0; i < nomesTmp1.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp1[i], 42, 9.0 - (i * 0.02), lost);
            lost.adicionarEpisodio(1, ep);
        }

        // Temporadas 2-6 (populadas com nomes genéricos)
        int[] episodiosPorTemp = {24, 23, 14, 17, 18};
        for (int temp = 2; temp <= 6; temp++) {
            for (int i = 1; i <= episodiosPorTemp[temp - 2]; i++) {
                Episodio ep = criarEpisodio(i, "Episódio " + i, 42, 8.8, lost);
                lost.adicionarEpisodio(temp, ep);
            }
        }
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

    // Método herdado para compatibilidade
    public static Episodio[] episodios() {
        Serie[] series = CriarSeries.series().toArray(new Serie[0]);
        Serie theBoys = series[0];
        Serie breakingBad = series[1];
        Serie lost = series[2];

        // Popular episódios
        popularEpisodios(theBoys, breakingBad, lost);

        return new Episodio[0]; // Retorna vazio pois agora os episódios estão nas séries
    }
}
