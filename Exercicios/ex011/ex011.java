package Exercicios.ex011;

import java.util.Scanner; //Importação da classe Scanner para leitura de dados
import java.util.Random; //Importação da classe Random para geração de números aleatórios

public class ex011 {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner leitura = new Scanner(System.in); //Instanciação do objeto Scanner para leitura de dados
        Random numeroAleatorio = new Random(); //Instanciação do objeto Random para geração de números aleatórios
        int numero = numeroAleatorio.nextInt(100); //Geração de um número aleatório entre 1 e 100
        int chute = 0; //Declaração da variável chute para armazenar o número chutado pelo usuário
        int tentativas = 0; //Declaração da variável tentativas para armazenar o número de tentativas do usuário

        //Laço de repetição
        while(chute != numero && tentativas < 10){ //Laço de repetição que repete até que o número chutado pelo usuário seja igual ao número aleatório ou que o número de tentativas seja igual a 10
            IO.println("Digite um número entre 1 e 100: "); //Exibição da mensagem para o usuário
            chute = leitura.nextInt(); //Leitura do número chutado pelo usuário
            if(chute < numero){
                IO.println("O número é maior que " + chute);
            } else { //Condição para o caso de o número chutado pelo usuário ser menor que o número aleatório   
                IO.println("O número é menor que " + chute);
            }
            tentativas++; //Incremento da variável tentativas para contar o número de tentativas do usuário
        }

        //Condição de saída
        if (tentativas == 10){ //Condição para o caso de o número de tentativas ser igual a 10
            IO.println("Você perdeu! O número era " + numero);
        } else { //Condição para o caso de o número de tentativas ser diferente de 10
            IO.println("Você acertou o número!");
        }
    }
}
