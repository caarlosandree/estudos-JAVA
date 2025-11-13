package Exercicios.Desafios;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leitura = new Scanner(System.in);

        IO.println("Digite o primeiro número: ");
        num1 = leitura.nextInt();
        IO.println("Digite o segundo número: ");
        num2 = leitura.nextInt();
        if (num1 > num2) {
            IO.println("O primeiro número é maior");
        } else if (num1 < num2) {
            IO.println("O segundo número é maior");
        } else {
            IO.println("Os dois números são iguais");
        }
        leitura.close();
    }
}
