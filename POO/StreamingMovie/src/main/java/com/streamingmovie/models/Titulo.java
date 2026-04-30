package models;

// Classe abstrata
public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private boolean recomendacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void avaliar(double nota) {
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double getMediaAvaliacoes() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
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
            System.out.println("Nome do filme: " + nome);
        } else {
            System.out.println("Nome da série: " + nome);
        }
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        // Verificando se o filme ou série está incluído no plano
        if (incluidoNoPlano) {
            System.out.println("Incluído no plano.");
        } else {
            System.out.println("Não incluído no plano. Por favor, assine o plano para acessar.");
        }
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Média de avaliações: " + String.format("%.1f", getMediaAvaliacoes()));
        // Verificando se a série está finalizada
        if (this instanceof Serie) {
            System.out.println("Minutos por episódio: " + ((Serie) this).getMinutosPorEpisodio());
        }
        // Verificando se o filme ou série tem duração em minutos
        if (this instanceof Filme) {
            System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        } else {
            System.out.println("Minutos por temporada: " + getDuracaoEmMinutos());
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
