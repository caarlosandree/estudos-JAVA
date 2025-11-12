package catalogoFilmes.src.main.java;
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        //Declarando variavel
        //tipo nome = valor
        int anoDeLancamento = 2022;
        //imprimindo variavel
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPLano = false;
        if (incluidoNoPLano) {
            System.out.println("Filme incluso no plano");
        } else {
            System.out.println("Filme não incluso no plano");
        }

        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);

        double media = (8.1 + 8.0 + 7.9) / 3;
        System.out.println("Média do filme: " + media);

        String sinopse = """
                Top Gun Maverick é um filme de ação e drama
                que conta a história de um piloto de testes que se torna 
                um piloto de guerra.
                """;
        System.out.println("Sinopse: " + sinopse);

        int classificacao;
        classificacao = (int)(media/2);
        System.out.println("Classificação: " + classificacao);
    }
}
