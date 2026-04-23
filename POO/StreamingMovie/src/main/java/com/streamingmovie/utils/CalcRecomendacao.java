package com.streamingmovie.utils;

import com.streamingmovie.models.Titulo;

public class CalcRecomendacao {

    public static boolean calcularRecomendacao(Titulo titulo) {

        if (titulo.getClassificacao() >= 3.8) {
            System.out.println("Recomendado");
        } else if (titulo.getClassificacao() >= 2.3
                && titulo.getClassificacao() < 3.8) {
            System.out.println("Pouco recomendado");
        } else {
            System.out.println("Não recomendado");
        }

        return titulo.getRecomendacao();
    }
}
