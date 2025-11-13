package Exercicios.Desafios;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int opcao;
        IO.println("1. Calcular área do quadrado: ");
        IO.println("2. Calcular área do círculo: ");
        IO.println("3. Sair");
        IO.println("Digite a opção desejada: ");
        Scanner leitura = new Scanner(System.in);
        opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                IO.println("Opção 1");
                double lado;
                IO.println("Digite o lado do quadrado: ");
                lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                IO.println("A área do quadrado é: " + areaQuadrado + "m²");
                break;                
            case 2:
                IO.println("Opção 2");
                double raio;
                IO.println("Digite o raio do círculo: ");
                raio = leitura.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                IO.println("A área do círculo é: " + areaCirculo + "m³");
                break;
            case 3:
                IO.println("Saindo...");
                break;
            default:
                IO.println("Opção inválida");
        }
        leitura.close();
    }
}