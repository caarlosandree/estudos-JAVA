package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Leitura de dados
        Scanner leitura = new Scanner(System.in);
        // Declaração de variáveis
        double saldo = 12500.00;
        int opcao = 0;
        String NomeCliente = "Carlos André Sabino";
        int NumeroConta = 1234567890;
        int Agencia = 0001;
        int DigitoVerificador = 2;
        String TipoConta = "Conta Corrente";
        String Menu = "1. Consultar saldo\n2. Depositar\n3. Sacar\n4. Transferir\n5. Sair";

        // Inicio do programa
        IO.println("************ Bem-vindo ao Banco ************");
        IO.println("\nNome do cliente: " + NomeCliente);
        IO.println("Número da conta: " + NumeroConta + "-" + DigitoVerificador);
        IO.println("Agência: " + Agencia);
        IO.println("Tipo de conta: " + TipoConta);
        IO.println("Saldo da conta: R$" + saldo);
        IO.println("\n*****************************************");

        // Processamento das opções
        while (opcao != 5) {

            // Menu de opções
            IO.println(Menu + "\n");
            opcao = leitura.nextInt();
            IO.println("\n");

            switch (opcao) {

                case 1:
                    IO.println("Seu saldo atual é: R$" + saldo);
                    break;

                case 2:
                    IO.println("Depositar");
                    IO.println("Digite o valor a depositar: ");
                    double valorDeposito = leitura.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        IO.println("Depósito realizado com sucesso!");
                        IO.println("Seu saldo atual é: R$" + saldo + "\n");
                    } else {
                        IO.println("Valor inválido");
                        IO.println("Por favor, digite um valor válido\n");
                    }
                    break;

                case 3:
                    IO.println("Sacar");
                    IO.println("Digite o valor a sacar: ");
                    double valorSaque = leitura.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        IO.println("Saque realizado com sucesso!");
                        IO.println("Seu saldo atual é: R$" + saldo + "\n");
                    } else if (valorSaque > saldo) {
                        IO.println("Saldo insuficiente");
                        IO.println("Seu saldo atual é: R$" + saldo + "\n");
                    } else if (valorSaque <= 0) {
                        IO.println("Valor inválido");
                        IO.println("Por favor, digite um valor válido\n");
                    }
                    break;

                case 4:
                    IO.println("Transferir");
                    IO.println("Digite o valor a transferir: ");
                    double valorTransferir = leitura.nextDouble();
                    if (valorTransferir <= saldo) {
                        saldo -= valorTransferir;
                        IO.println("Transferência realizada com sucesso!");
                        IO.println("Seu saldo atual é: R$" + saldo + "\n");
                    } else if (valorTransferir > saldo) {
                        IO.println("Saldo insuficiente");
                        IO.println("Seu saldo atual é: R$" + saldo + "\n");
                    } else if (valorTransferir <= 0) {
                        IO.println("Valor inválido");
                        IO.println("Por favor, digite um valor válido\n");
                    }
                    break;

                default:
                    IO.println("Opção inválida");
                    IO.println("Por favor, digite uma opção válida\n");
                    break;
            }
        }
        leitura.close();
        // Fim do programa
        IO.println("Obrigado por usar o nosso sistema!\n");
        System.exit(0);
    }
}
