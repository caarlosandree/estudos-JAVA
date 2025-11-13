package Exercicios.Desafios;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int numero;
        IO.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero = leitura.nextInt();
        if (numero % 2 == 0) {
            IO.println("Número par");
        } else {
            IO.println("Número ímpar");
        }
        leitura.close();
    }
    
}
