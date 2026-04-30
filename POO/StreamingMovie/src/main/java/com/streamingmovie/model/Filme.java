package model;

import DAO.Classificacao;

// Herança de Titulo
public class Filme extends Titulo implements Classificacao {

    private String diretor;
    private int duracaoEmMinutos;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + getNome() + '\'' +
                ", anoDeLancamento=" + getAnoDeLancamento() +
                ", diretor='" + diretor + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", avaliacao=" + getMediaAvaliacoes() +
                '}';
    }

}

