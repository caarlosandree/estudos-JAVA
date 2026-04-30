package services;

import model.Filme;
import model.Titulo;

import java.util.ArrayList;

public class CriarFilmes {
    public static ArrayList<Filme> filmes() {

        ArrayList<Filme> listaFilmes = new ArrayList<>();

        Filme titanic = new Filme("Titanic", 1997);
        titanic.setIncluidoNoPlano(true);
        titanic.setDuracaoEmMinutos(194);
        // Avaliações
        double[] notasTitanic = {8.0, 7.5, 9.0, 8.5, 10.0, 6.5, 9.5, 7.0, 8.5, 9.0, 10.0, 8.0};
        for (double nota : notasTitanic) {
            titanic.avaliar(nota);
        }
        listaFilmes.add(titanic);

        Filme interestelar = new Filme("Interestelar", 2014);
        interestelar.setIncluidoNoPlano(true);
        interestelar.setDuracaoEmMinutos(169);
        // Avaliações
        double[] notasInterestelar = {9.0, 8.0, 7.5, 9.5, 6.5, 8.5, 10.0, 7.0, 8.0, 9.0, 8.5};
        for (double nota : notasInterestelar) {
            interestelar.avaliar(nota);
        }
        listaFilmes.add(interestelar);

        Filme avatar = new Filme("Avatar", 2009);
        avatar.setIncluidoNoPlano(true);
        avatar.setDuracaoEmMinutos(162);
        // Avaliações
        double[] notasAvatar = {7.5, 8.0, 9.0, 6.5, 8.5, 10.0, 7.0, 9.5,
                8.0, 7.5, 9.0, 8.5, 6.0, 9.5, 8.0, 7.5, 9.0, 8.5, 10.0, 7.0};
        for (double nota : notasAvatar) {
            avatar.avaliar(nota);
        }
        listaFilmes.add(avatar);

        return listaFilmes;
    }
}
