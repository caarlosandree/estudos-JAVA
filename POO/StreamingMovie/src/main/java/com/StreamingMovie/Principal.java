// Importação de classes
import models.Filme;
import models.Serie;
import services.criarFilmes;
import services.criarSeries;
import utils.ArredondarParaMeio;
import utils.CalculadoraDeTempo;

import static utils.ArredondarParaMeio.arredondar;

// Classe principal
public class Principal {
    
    // Método principal
    public static void main(String[] args) {
        // Criando o objeto filme
        Filme interestelar = criarFilmes.filmes() [1];
       // Imprimindo os dados do filme
        IO.println("-=-=- Dados do filme -=-=-\n");
        interestelar.getFichaTecnica();
        IO.println("Classificação: " + String.format("%.1f", arredondar(interestelar.getClassificacao())) + " estrelas");

        // Criando o objeto filme
        Filme titanic = criarFilmes.filmes() [0];
        // Imprimindo os dados do filme
        IO.println("\n-=-=- Dados do filme -=-=-\n");
        titanic.getFichaTecnica();
        IO.println("Classificação: " + String.format("%.1f", arredondar(titanic.getClassificacao())) + " estrelas");

       // Criando o objeto série
       Serie theboys = criarSeries.series() [0];
       Serie breakingBad = criarSeries.series() [1];
       Serie lost = criarSeries.series() [2];

        // Imprimindo os dados da série
        IO.println("\n-=-=- Dados da série -=-=-\n");
        theboys.getFichaTecnica();
        IO.println("Total de temporadas: " + theboys.getTotalTemporadas());
        IO.println("Episódios por temporada: " + theboys.getEpisodiosPorTemporada());
        if (theboys.isFinalizada()) {
            IO.println("Série finalizada.");
        } else {
            IO.println("Em andamento.");
        }
        IO.println("Classificação: " + String.format("%.1f", arredondar(theboys.getClassificacao())) + " estrelas");

        // Imprimindo os dados da série
        IO.println("\n-=-=- Dados da série -=-=-\n");
        breakingBad.getFichaTecnica();
        IO.println("Total de temporadas: " + breakingBad.getTotalTemporadas());
        IO.println("Episódios por temporada: " + breakingBad.getEpisodiosPorTemporada());
        if (breakingBad.isFinalizada()) {
            IO.println("Série finalizada.");
        } else {
            IO.println("Em andamento.");
        }
        IO.println("Classificação: " + String.format("%.1f", arredondar(breakingBad.getClassificacao())) + " estrelas");

        // Imprimindo os dados da série
        IO.println("\n-=-=- Dados da série -=-=-\n");
        lost.getFichaTecnica();
        IO.println("Total de temporadas: " + lost.getTotalTemporadas());
        IO.println("Episódios por temporada: " + lost.getEpisodiosPorTemporada());
        if (lost.isFinalizada()) {
            IO.println("Série finalizada.");
        } else {
            IO.println("Em andamento.");
        }
        IO.println("Classificação: " + String.format("%.1f", arredondar(lost.getClassificacao())) + " estrelas");

        // Criando o objeto calculadora de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        // Adicionando o filme e a série à calculadora
        calculadora.adicionarFilme(interestelar);
        calculadora.adicionarFilme(titanic);

        IO.println("-=-=- Tempo total -=-=-\n");
        IO.println("Tempo total dos filmes (em horas): " + calculadora.getTempoTotalFilmes() / 60 + " hora(s)");

        calculadora.adicionarSerie(breakingBad);
        calculadora.adicionarSerie(lost);
        calculadora.adicionarSerie(theboys);

        IO.println("-=-=- Tempo total -=-=-\n");
        IO.println("Tempo total das séries (em horas): " + calculadora.getTempoTotalSeries() / 60 + " hora(s)");

    }
}
