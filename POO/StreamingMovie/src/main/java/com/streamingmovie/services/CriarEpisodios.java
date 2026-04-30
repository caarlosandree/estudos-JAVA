package services;

import model.Serie;
import model.Episodio;

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
        // Temporada 1 - 7 episódios
        String[] nomesTmp1 = {"Pilot", "Cat's in the Bag...", "...And the Bag's in the River", "Cancer Man", "Gray Matter",
                             "Crazy Handful of Nothin'", "A No-Rough-Stuff-Type Deal"};
        for (int i = 0; i < nomesTmp1.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp1[i], 48, 9.5 - (i * 0.05), breakingBad);
            breakingBad.adicionarEpisodio(1, ep);
        }

        // Temporada 2 - 13 episódios
        String[] nomesTmp2 = {"Seven Thirty-Seven", "Grilled", "Bit by a Dead Bee", "Down", "Breakage",
                             "Peekaboo", "Negro y Azul", "Better Call Saul", "Four Days Out", "Over",
                             "Phoenix", "ABQ", "Half Measures"};
        for (int i = 0; i < nomesTmp2.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp2[i], 48, 9.4 - (i * 0.03), breakingBad);
            breakingBad.adicionarEpisodio(2, ep);
        }

        // Temporada 3 - 13 episódios
        String[] nomesTmp3 = {"No Más", "Caballo Sin Nombre", "I.F.T.", "Green Light", "Más",
                             "Sunset", "One Minute", "I See You", "Kafkaesque", "Fly",
                             "Abiquiu", "Half Measures", "Full Measure"};
        for (int i = 0; i < nomesTmp3.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp3[i], 48, 9.3 - (i * 0.03), breakingBad);
            breakingBad.adicionarEpisodio(3, ep);
        }

        // Temporada 4 - 13 episódios
        String[] nomesTmp4 = {"Box Cutter", "Thirty-Eight Snub", "Open House", "Bullet Points",
                             "Cornered", "Problem Dog", "Hermanos", "Salud", "Crawl Space",
                             "Bug", "Hazard Pay", "End Times", "Face Off"};
        for (int i = 0; i < nomesTmp4.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp4[i], 48, 9.2 - (i * 0.03), breakingBad);
            breakingBad.adicionarEpisodio(4, ep);
        }

        // Temporada 5 - 16 episódios
        String[] nomesTmp5 = {"Live Free or Die", "Madrigal", "Hazard Pay", "Fifty-One",
                             "Dead Freight", "Buyout", "Say My Name", "Gliding Over All",
                             "Blood Money", "Buried", "Confessions", "Rabid Dog",
                             "To'hajiilee", "Ozymandias", "Granite State", "Felina"};
        for (int i = 0; i < nomesTmp5.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp5[i], 48, 9.1 - (i * 0.03), breakingBad);
            breakingBad.adicionarEpisodio(5, ep);
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

        // Temporada 2 - 24 episódios
        String[] nomesTmp2 = {"Man of Science, Man of Faith", "Adrift", "Orientation", "Everybody Hates Hugo",
                             "...And Found", "Abandoned", "The Other 48 Days", "Collision", "What Kate Did",
                             "The 23rd Psalm", "The Hunting Party", "Fire + Water", "The Long Con", "One of Them",
                             "Maternity Leave", "The Whole Truth", "Lockdown", "Dave", "S.O.S.", "Two for the Road",
                             "?", "Three Minutes", "Live Together, Die Alone: Part 1", "Live Together, Die Alone: Part 2"};
        for (int i = 0; i < nomesTmp2.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp2[i], 42, 8.9 - (i * 0.02), lost);
            lost.adicionarEpisodio(2, ep);
        }

        // Temporada 3 - 23 episódios
        String[] nomesTmp3 = {"A Tale of Two Cities", "The Glass Ballerina", "Further Instructions", "Every Man for Himself",
                             "The Cost of Living", "I Do", "Not in Portland", "Flashes Before Your Eyes", "Stranger in a Strange Land",
                             "Tricia Tanaka Is Dead", "Enter 77", "Par Avion", "The Man from Tallahassee", "Exposé",
                             "Left Behind", "One of Us", "Catch-22", "D.O.C.", "The Brig", "The Man Behind the Curtain",
                             "Greatest Hits", "Through the Looking Glass: Part 1", "Through the Looking Glass: Part 2"};
        for (int i = 0; i < nomesTmp3.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp3[i], 42, 8.8 - (i * 0.02), lost);
            lost.adicionarEpisodio(3, ep);
        }

        // Temporada 4 - 14 episódios
        String[] nomesTmp4 = {"The Beginning of the End", "Confirmed Dead", "The Economist", "Eggtown",
                             "The Constant", "The Other Woman", "Ji Yeon", "Meet Kevin Johnson",
                             "The Shape of Things to Come", "Something Nice Back Home", "Cabin Fever",
                             "There's No Place Like Home: Part 1", "There's No Place Like Home: Part 2", "There's No Place Like Home: Part 3"};
        for (int i = 0; i < nomesTmp4.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp4[i], 42, 8.7 - (i * 0.02), lost);
            lost.adicionarEpisodio(4, ep);
        }

        // Temporada 5 - 17 episódios
        String[] nomesTmp5 = {"Because You Left", "The Lie", "Jughead", "The Little Prince",
                             "This Place Is Death", "316", "The Life and Death of Jeremy Bentham", "LaFleur",
                             "Namaste", "He's Our You", "Whatever Happened, Happened", "Dead Is Dead",
                             "Some Like It Hoth", "The Variable", "Follow the Leader", "The Incident: Part 1", "The Incident: Part 2"};
        for (int i = 0; i < nomesTmp5.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp5[i], 42, 8.6 - (i * 0.02), lost);
            lost.adicionarEpisodio(5, ep);
        }

        // Temporada 6 - 18 episódios
        String[] nomesTmp6 = {"LA X: Part 1", "LA X: Part 2", "What Kate Does", "The Substitute",
                             "Lighthouse", "Sundown", "Dr. Linus", "Recon", "Ab Aeterno",
                             "The Package", "Happily Ever After", "Everybody Loves Hugo", "The Last Recruit",
                             "The Candidate", "Across the Sea", "What They Died For", "The End: Part 1", "The End: Part 2"};
        for (int i = 0; i < nomesTmp6.length; i++) {
            Episodio ep = criarEpisodio(i + 1, nomesTmp6[i], 42, 8.5 - (i * 0.02), lost);
            lost.adicionarEpisodio(6, ep);
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
