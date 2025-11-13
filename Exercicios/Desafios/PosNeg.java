package Exercicios.Desafios;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {

        int numero;
        IO.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero = leitura.nextInt();

        if (numero > 0) {
            IO.println("Número positivo");
        } else if (numero < 0) {
            IO.println("Número negativo");
        } else {
            IO.println("Número zero");
        }
        leitura.close();
    }
}
