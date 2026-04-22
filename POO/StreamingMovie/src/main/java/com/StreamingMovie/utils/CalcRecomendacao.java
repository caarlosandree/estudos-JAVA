package utils;

import models.Titulo;

public class CalcRecomendacao {

    public static boolean calcularRecomendacao(Titulo titulo) {

        if (titulo.getClassificacao() >= 3.8) {
            IO.println("Recomendado");
        } else if (titulo.getClassificacao() >= 2.3
                && titulo.getClassificacao() < 3.8) {
            IO.println("Pouco recomendado");
        } else {
            IO.println("Não recomendado");
        }

        return titulo.getRecomendacao();
    }
}
