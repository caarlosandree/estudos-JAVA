// Importação de classes
import models.Filme;
import models.Serie;
import services.CriarFilmes;
import services.CriarSeries;
import utils.CalcRecomendacao;
import utils.CalculadoraDeTempo;

import static utils.ArredondarParaMeio.arredondar;
import java.util.ArrayList;

// Classe principal
public class Principal {
    
    // Método principal
    public static void main(String[] args) {
        // Obtendo o ArrayList de filmes
        ArrayList<Filme> filmes = CriarFilmes.filmes();

        IO.println("Quantidade de filmes adicionados: " + filmes.size());

        // Iterando sobre os filmes e imprimindo os dados
        IO.println("-=-=- Lista de Filmes -=-=-\n");
        for (Filme filme : filmes) {
            IO.println("-=-=- Dados do filme -=-=-\n");
            filme.getFichaTecnica();
            IO.println("Classificação: " + String.format("%.1f", arredondar(filme.getClassificacao())) + " estrelas");
            CalcRecomendacao.calcularRecomendacao(filme);
            IO.println();
        }

        // Obtendo o ArrayList de séries
        ArrayList<Serie> series = CriarSeries.series();

        IO.println("\nQuantidade de séries adicionadas: " + series.size());

        // Iterando sobre as séries e imprimindo os dados
        IO.println("\n-=-=- Lista de Séries -=-=-\n");
        for (Serie serie : series) {
            IO.println("-=-=- Dados da série -=-=-\n");
            serie.getFichaTecnica();
            IO.println("Total de temporadas: " + serie.getTotalTemporadas());
            IO.println("Episódios por temporada: " + serie.getEpisodiosPorTemporada());
            if (serie.isFinalizada()) {
                IO.println("Série finalizada.");
            } else {
                IO.println("Em andamento.");
            }
            IO.println("Classificação: " + String.format("%.1f", arredondar(serie.getClassificacao())) + " estrelas");
            CalcRecomendacao.calcularRecomendacao(serie);
            IO.println();
        }

        // Criando o objeto calculadora de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        // Adicionando os filmes à calculadora
        for (Filme filme : filmes) {
            calculadora.adicionarFilme(filme);
        }

        IO.println("-=-=- Tempo total -=-=-\n");
        IO.println("Tempo total dos filmes (em horas): " + calculadora.getTempoTotalFilmes() / 60 + " hora(s)");

        // Adicionando as séries à calculadora
        for (Serie serie : series) {
            calculadora.adicionarSerie(serie);
        }

        IO.println("-=-=- Tempo total -=-=-\n");
        IO.println("Tempo total das séries (em horas): " + calculadora.getTempoTotalSeries() / 60 + " hora(s)");

    }
}
