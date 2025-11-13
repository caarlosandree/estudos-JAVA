package catalogoFilmes.src.main.java;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        int mediaAvaliacoes = 0;
        
        for (int i = 0; i < 3; i++){
            IO.println("Digite a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacoes += nota;
        }
        
        leitura.close();

        IO.println("Média de avaliações: " + mediaAvaliacoes / 3);
        
    }
}
