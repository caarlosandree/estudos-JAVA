// Importação de classes
import models.Filme;
import models.Serie;
import utils.CalculadoraDeTempo;

// Classe principal
public class Principal {
    
    // Método principal
    public static void main(String[] args) {
        // Criando o objeto filme
        Filme interestelar = new Filme();
        // Setando os valores do filme
        interestelar.setNome("Interestelar");
        interestelar.setAnoDeLancamento(2014);
        interestelar.setIncluidoNoPlano(true);
        interestelar.setDuracaoEmMinutos(169);
        interestelar.getAvaliacao(8);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(7);
        interestelar.getAvaliacao(5);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(8);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(7);
        interestelar.getAvaliacao(5);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(8);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(7);
        interestelar.getAvaliacao(5);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(8);


        // Imprimindo os dados do filme
        IO.println("-=-=- Dados do filme -=-=-\n");
        interestelar.getFichaTecnica();

        Filme titanic = new Filme();
        titanic.setNome("Titanic");
        titanic.setAnoDeLancamento(1997);
        titanic.setIncluidoNoPlano(true);
        titanic.setDuracaoEmMinutos(194);
        titanic.getAvaliacao(7);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(8);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(7);
        titanic.getAvaliacao(5);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(8);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(7);
        titanic.getAvaliacao(5);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(8);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(7);
        titanic.getAvaliacao(5);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(8);
        titanic.getAvaliacao(10);
        titanic.getAvaliacao(7);

        // Imprimindo os dados do filme
        IO.println("\n-=-=- Dados do filme -=-=-\n");
        titanic.getFichaTecnica();

        // Criando o objeto série
        Serie theboys = new Serie();
        theboys.setNome("The Boys");
        theboys.setAnoDeLancamento(2019);
        theboys.setIncluidoNoPlano(true);
        theboys.getAvaliacao(8);
        theboys.getAvaliacao(10);
        theboys.getAvaliacao(7);
        theboys.getAvaliacao(5);
        theboys.setTotalTemporadas(3);
        theboys.setEpisodiosPorTemporada(10);
        theboys.setMinutosPorEpisodio(45);
        theboys.setFinalizada(true);

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

        Serie breakingBad = new Serie();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setAnoDeLancamento(2008);
        breakingBad.setIncluidoNoPlano(true);
        breakingBad.setTotalTemporadas(5);
        breakingBad.setEpisodiosPorTemporada(10);
        breakingBad.setMinutosPorEpisodio(45);
        breakingBad.setFinalizada(true);
        breakingBad.getAvaliacao(9);
        breakingBad.getAvaliacao(10);
        breakingBad.getAvaliacao(8);
        breakingBad.getAvaliacao(10);
        breakingBad.getAvaliacao(7);
        breakingBad.getAvaliacao(5);
        breakingBad.getAvaliacao(10);
        breakingBad.getAvaliacao(8);
        breakingBad.getAvaliacao(10);
        breakingBad.getAvaliacao(7);
        breakingBad.getAvaliacao(5);
        breakingBad.getAvaliacao(10);
        breakingBad.getAvaliacao(8);
        breakingBad.getAvaliacao(10);
        breakingBad.getAvaliacao(7);
        breakingBad.getAvaliacao(5);
        breakingBad.getAvaliacao(10);


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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setIncluidoNoPlano(true);
        lost.setTotalTemporadas(6);
        lost.setEpisodiosPorTemporada(16);
        lost.setMinutosPorEpisodio(42);
        lost.setFinalizada(true);
        lost.getAvaliacao(9);
        lost.getAvaliacao(10);
        lost.getAvaliacao(8);
        lost.getAvaliacao(10);
        lost.getAvaliacao(7);
        lost.getAvaliacao(5);
        lost.getAvaliacao(10);
        lost.getAvaliacao(8);
        lost.getAvaliacao(10);
        lost.getAvaliacao(7);
        lost.getAvaliacao(5);
        lost.getAvaliacao(10);
        lost.getAvaliacao(8);
        lost.getAvaliacao(10);
        lost.getAvaliacao(7);
        lost.getAvaliacao(5);
        lost.getAvaliacao(10);

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
