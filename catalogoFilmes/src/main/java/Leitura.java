package catalogoFilmes.src.main.java;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        IO.println("Digite o seu filme favorito: ");
        String nomeDoFilme = leitura.nextLine();

        IO.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();

        IO.println("Digite a nota do filme: ");
        double notaDoFilme = leitura.nextDouble();

        IO.println("O filme " + nomeDoFilme + " foi lançado em " + anoDeLancamento + " e tem a nota " + notaDoFilme);
        leitura.close();
    }
}
