public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Interestelar";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.obterAvaliacao(8);
        meuFilme.obterAvaliacao(10);
        meuFilme.obterAvaliacao(7);
        meuFilme.obterAvaliacao(5);
        meuFilme.obterAvaliacao(10);
        meuFilme.obterAvaliacao(8);
        meuFilme.obterAvaliacao(10);
        meuFilme.obterAvaliacao(7);
        meuFilme.obterAvaliacao(5);
        meuFilme.obterAvaliacao(10);
        meuFilme.obterAvaliacao(8);
        meuFilme.obterAvaliacao(10);
        meuFilme.obterAvaliacao(7);
        meuFilme.obterAvaliacao(5);
        meuFilme.obterAvaliacao(10);
        meuFilme.obterAvaliacao(8);

        
        IO.println("-=-=- Dados do filme -=-=-\n");
        meuFilme.exibeFichaTecnica();

    }
}
