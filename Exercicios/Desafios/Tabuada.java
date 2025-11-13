package Exercicios.Desafios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int numero;
        int resultado = 0;
        IO.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            IO.println(numero + " x " + i + " = " + resultado);
        }
        leitura.close();
    }
}
