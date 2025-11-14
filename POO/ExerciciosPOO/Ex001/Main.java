package ExerciciosPOO.Ex001;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Produto 1";
        produto.preco = 100;
        produto.descontoParaPix = 0.1;

        IO.println(produto.pegaPrecoFinal(true));
    }
}
