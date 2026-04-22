package services;

import models.Filme;

public class criarFilmes {
    public static Filme[] filmes() {
        Filme titanic = new Filme();
        titanic.setNome("Titanic");
        titanic.setAnoDeLancamento(1997);
        titanic.setIncluidoNoPlano(true);
        titanic.setDuracaoEmMinutos(194);
        // Avaliações
        double[] notasTitanic = {9.5, 8.5, 7.5, 10.0, 10.0, 8.0, 7.0, 8.5, 9.5, 10.0, 9.5, 8.5};
        for (double nota : notasTitanic) {
            titanic.getAvaliacao(nota);
        }

        Filme interestelar = new Filme();
        interestelar.setNome("Interestelar");
        interestelar.setAnoDeLancamento(2014);
        interestelar.setIncluidoNoPlano(true);
        interestelar.setDuracaoEmMinutos(169);
        // Avaliações
        double[] notasInterestelar = {9.5, 8.5, 7.5, 6.0, 8.0, 8.0, 5.0, 8.5, 9.5, 7.0, 9.5};
        for (double nota : notasInterestelar) {
            interestelar.getAvaliacao(nota);
        }

        return new Filme[] { titanic, interestelar };
    }
}
