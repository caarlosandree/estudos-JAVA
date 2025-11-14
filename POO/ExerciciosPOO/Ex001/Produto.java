package ExerciciosPOO.Ex001;

public class Produto {

    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = preco - (preco * descontoParaPix);
            return precoFinal;
        } else {
            double precoFinal = preco;
            return precoFinal;
        }
    }
}