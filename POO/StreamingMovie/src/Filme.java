public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void obterAvaliacao(double nota) {
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    double obterMediaAvaliacoes() {
        return avaliacao / totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        IO.println("Nome do filme: " + nome);
        IO.println("Ano de lançamento: " + anoDeLancamento);
        IO.println("Incluído no plano: " + incluidoNoPlano);
        IO.println("Total de avaliações: " + totalDeAvaliacoes);
        IO.println("Média de avaliações: " + obterMediaAvaliacoes());
        IO.println("Duração em minutos: " + duracaoEmMinutos);
    }

}

