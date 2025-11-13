package catalogoFilmes.src.main.java;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        int mediaAvaliacoes = 0;
        int totalNotas = 0;
        
        while(nota != -1){
            IO.println("Digite a sua avaliação para o filme ou -1 para sair: ");
            nota = leitura.nextDouble();
            if(nota != -1){
                mediaAvaliacoes += nota;
                totalNotas++;
            }
        }
        leitura.close();

        if (totalNotas > 0){
            IO.println("Média de avaliações: " + mediaAvaliacoes / totalNotas);
        } else {
            IO.println("Nenhuma avaliação foi feita.");
        }
    }
}