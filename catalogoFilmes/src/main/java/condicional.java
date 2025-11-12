package catalogoFilmes.src.main.java;

public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPLano = true;
        String tipoPlano = "plus";
        
        if (anoDeLancamento > 2022){
            IO.println("Lançamento que a galera está curtindo");
        }else{
            IO.println("Filme retro que vale a pena assistir");
        }

        if (incluidoNoPLano && tipoPlano.equals("plus")){
            IO.println("Filme liberado!");
        }else{
            IO.println("Filme não incluso no plano, necessario adquirir o plano ou pagar a locação.");
        }



    }
}