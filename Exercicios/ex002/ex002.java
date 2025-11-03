public class ex002 {
    public static void main(String[] args) {
        //entrada de dados
        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digine a nota da segunda prova: ");
        double nota2 = Double.parseDouble(System.console().readLine());

        //cálculo da média
        double media = (nota1 + nota2)/2;
        
        // Requisito 1: Casting de double para int
        double valorDouble = media;
        int valorInt = (int) valorDouble;
        System.out.println("Casting de double para int: " + valorDouble + " -> " + valorInt);
        
        // Requisito 2: Concatenação de char e String
        char letra = 'A';
        String palavra = "luno";
        String mensagemConcat = "Conceito do " + letra + palavra;
        System.out.println(mensagemConcat);
        
        //condição para verificar se o aluno foi aprovado ou reprovado
        if ( media >= 7){
            System.out.println("Aprovado com a média: " + media);
        } else {
            System.out.println("Recuperação com a média: " + media);

            System.out.println("Digite a nota da recuperação: ");
            double notaRecuperacao = Double.parseDouble(System.console().readLine());
            if (notaRecuperacao >= 7){
                System.out.println("Aprovado com a nota da recuperação: " + notaRecuperacao);
            } else {
                System.out.println("Reprovado com a nota da recuperação: " + notaRecuperacao);
            }
        };

        char conceito = 'A';
        if (media >= 9 && media <= 10){
            conceito = 'A';
        } else if (media >= 7 && media < 9){
            conceito = 'B';
        } else if (media >= 5 && media < 7){
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        String mensagem = String.format("O conceito do aluno é: %s", conceito);
        System.out.println(mensagem);
    }
}

