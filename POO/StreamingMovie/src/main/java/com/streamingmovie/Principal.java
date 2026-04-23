package com.streamingmovie;

// Importação de classes
import com.streamingmovie.models.Filme;
import com.streamingmovie.models.Serie;
import com.streamingmovie.services.CriarFilmes;
import com.streamingmovie.services.CriarSeries;
import com.streamingmovie.utils.CalcRecomendacao;
import com.streamingmovie.utils.CalculadoraDeTempo;

import static com.streamingmovie.utils.ArredondarParaMeio.arredondar;
import java.util.ArrayList;
import java.util.Scanner;

// Classe principal
public class Principal {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtendo o ArrayList de filmes e séries
        ArrayList<Filme> filmes = CriarFilmes.filmes();
        ArrayList<Serie> series = CriarSeries.series();

        // Criando o objeto calculadora de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        // Adicionando os filmes à calculadora
        for (Filme filme : filmes) {
            calculadora.adicionarFilme(filme);
        }

        // Adicionando as séries à calculadora
        for (Serie serie : series) {
            calculadora.adicionarSerie(serie);
        }

        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Listar Filmes");
            System.out.println("2 - Listar Séries");
            System.out.println("3 - Listar Episódios");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline

            switch (opcao) {
                case 1:
                    listarFilmes(filmes, calculadora, scanner);
                    break;
                case 2:
                    listarSeries(series, calculadora, scanner);
                    break;
                case 3:
                    listarEpisodios(series, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void listarFilmes(ArrayList<Filme> filmes, CalculadoraDeTempo calculadora, Scanner scanner) {
        System.out.println("\n-=-=- Lista de Filmes -=-=-");
        System.out.println("Quantidade de filmes: " + filmes.size());
        System.out.println("Tempo total dos filmes: " + calculadora.getTempoTotalFilmes() / 60.0 + " hora(s)");
        System.out.println();

        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i + 1) + " - " + filmes.get(i).getNome());
        }

        System.out.print("\nEscolha um filme para ver os detalhes (0 para voltar): ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha > 0 && escolha <= filmes.size()) {
            Filme filme = filmes.get(escolha - 1);
            System.out.println("\n-=-=- Dados do filme -=-=-");
            filme.getFichaTecnica();
            System.out.println("Classificação: " + String.format("%.1f", arredondar(filme.getClassificacao())) + " estrelas");
            CalcRecomendacao.calcularRecomendacao(filme);
        } else if (escolha != 0) {
            System.out.println("Opção inválida!");
        }
    }

    private static void listarSeries(ArrayList<Serie> series, CalculadoraDeTempo calculadora, Scanner scanner) {
        System.out.println("\n-=-=- Lista de Séries -=-=-");
        System.out.println("Quantidade de séries: " + series.size());
        System.out.println("Tempo total das séries: " + calculadora.getTempoTotalSeries() / 60.0 + " hora(s)");
        System.out.println();

        for (int i = 0; i < series.size(); i++) {
            System.out.println((i + 1) + " - " + series.get(i).getNome());
        }

        System.out.print("\nEscolha uma série para ver os detalhes (0 para voltar): ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha > 0 && escolha <= series.size()) {
            Serie serie = series.get(escolha - 1);
            System.out.println("\n-=-=- Dados da série -=-=-");
            serie.getFichaTecnica();
            System.out.println("Total de temporadas: " + serie.getTotalTemporadas());
            System.out.println("Episódios por temporada: " + serie.getEpisodiosPorTemporada());
            if (serie.isFinalizada()) {
                System.out.println("Série finalizada.");
            } else {
                System.out.println("Em andamento.");
            }
            System.out.println("Classificação: " + String.format("%.1f", arredondar(serie.getClassificacao())) + " estrelas");
            CalcRecomendacao.calcularRecomendacao(serie);
        } else if (escolha != 0) {
            System.out.println("Opção inválida!");
        }
    }

    private static void listarEpisodios(ArrayList<Serie> series, Scanner scanner) {
        System.out.println("\n-=-=- Escolha a Série -=-=-");
        for (int i = 0; i < series.size(); i++) {
            System.out.println((i + 1) + " - " + series.get(i).getNome());
        }

        System.out.print("\nEscolha uma série (0 para voltar): ");
        int escolhaSerie = scanner.nextInt();
        scanner.nextLine();

        if (escolhaSerie > 0 && escolhaSerie <= series.size()) {
            Serie serie = series.get(escolhaSerie - 1);
            System.out.println("\n-=-=- Escolha a Temporada -=-=-");
            System.out.println("Série: " + serie.getNome());
            System.out.println("Total de temporadas: " + serie.getTotalTemporadas());
            System.out.println();

            for (int i = 1; i <= serie.getTotalTemporadas(); i++) {
                System.out.println(i + " - Temporada " + i);
            }

            System.out.print("\nEscolha uma temporada (0 para voltar): ");
            int escolhaTemporada = scanner.nextInt();
            scanner.nextLine();

            if (escolhaTemporada > 0 && escolhaTemporada <= serie.getTotalTemporadas()) {
                System.out.println("\n-=-=- Episódios da Temporada " + escolhaTemporada + " -=-=-");
                System.out.println("Série: " + serie.getNome());
                System.out.println("Episódios por temporada: " + serie.getEpisodiosPorTemporada());
                System.out.println("Minutos por episódio: " + serie.getMinutosPorEpisodio());
                System.out.println("Total de episódios nesta temporada: " + serie.getEpisodiosPorTemporada());
                System.out.println("Duração total da temporada: " + (serie.getEpisodiosPorTemporada() * serie.getMinutosPorEpisodio()) + " minutos");
            } else if (escolhaTemporada != 0) {
                System.out.println("Opção inválida!");
            }
        } else if (escolhaSerie != 0) {
            System.out.println("Opção inválida!");
        }
    }
}
