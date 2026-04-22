package models;

import utils.Classificacao;

// Classe abstrata
public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private boolean recomendacao;

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        return anoDeLancamento;
    }

    public boolean setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
        return incluidoNoPlano;
    }


    public void getAvaliacao(double nota) {
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double getMediaAvaliacoes() {
        return avaliacao / totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método para imprimir a ficha técnica do filme ou série
    public void getFichaTecnica() {
        // Verificando se o filme ou série, é uma instância de Filme ou Serie
        if (this instanceof Filme) {
            IO.println("Nome do filme: " + nome);
        } else {
            IO.println("Nome da série: " + nome);
        }
        IO.println("Ano de lançamento: " + anoDeLancamento);
        // Verificando se o filme ou série está incluído no plano
        if (incluidoNoPlano) {
            IO.println("Incluído no plano.");
        } else {
            IO.println("Não incluído no plano. Por favor, assine o plano para acessar.");
        }
        IO.println("Total de avaliações: " + totalDeAvaliacoes);
        IO.println("Média de avaliações: " + String.format("%.1f", getMediaAvaliacoes()));
        // Verificando se a série está finalizada
        if (this instanceof Serie) {
            IO.println("Minutos por episódio: " + ((Serie) this).getMinutosPorEpisodio());
        }
        // Verificando se o filme ou série tem duração em minutos
        if (this instanceof Filme) {
            IO.println("Duração em minutos: " + getDuracaoEmMinutos());
        } else {
            IO.println("Minutos por temporada: " + getDuracaoEmMinutos());
        }
    }

    public double getClassificacao() {
        return (double) getMediaAvaliacoes() / 2 ;
    }

    public void setRecomendacao(boolean recomendacao) {
        this.recomendacao = recomendacao;
    }

    public boolean getRecomendacao() {
        return recomendacao;
    }

}
