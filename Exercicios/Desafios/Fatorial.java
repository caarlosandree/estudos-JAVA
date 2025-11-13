package Exercicios.Desafios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero;
        IO.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero = leitura.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        IO.println("O fatorial de " + numero + " é " + fatorial);
        leitura.close();
    }
    
}
