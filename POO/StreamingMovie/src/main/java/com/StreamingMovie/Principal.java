// Importação de classes
import models.Filme;
import models.Serie;

// Classe principal
public class Principal {
    
    // Método principal
    public static void main(String[] args) {
        // Criando o objeto filme
        Filme interestelar = new Filme();
        // Setando os valores do filme
        interestelar.setNome("Interestelar");
        interestelar.setAnoDeLancamento(2014);
        interestelar.setIncluidoNoPlano(true);
        interestelar.setDuracaoEmMinutos(169);
        interestelar.getAvaliacao(8);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(7);
        interestelar.getAvaliacao(5);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(8);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(7);
        interestelar.getAvaliacao(5);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(8);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(7);
        interestelar.getAvaliacao(5);
        interestelar.getAvaliacao(10);
        interestelar.getAvaliacao(8);


        // Imprimindo os dados do filme
        IO.println("-=-=- Dados do filme -=-=-\n");
        interestelar.getFichaTecnica();

        // Criando o objeto série
        Serie theboys = new Serie();
        theboys.setNome("The Boys");
        theboys.setAnoDeLancamento(2019);
        theboys.setIncluidoNoPlano(true);
        theboys.getAvaliacao(8);
        theboys.getAvaliacao(10);
        theboys.getAvaliacao(7);
        theboys.getAvaliacao(5);
        theboys.setTotalTemporadas(3);
        theboys.setEpisodiosPorTemporada(10);
        theboys.setMinutosPorEpisodio(45);
        theboys.setFinalizada(true);

        // Imprimindo os dados da série
        IO.println("\n-=-=- Dados da série -=-=-\n");
        theboys.getFichaTecnica();
        IO.println("Total de temporadas: " + theboys.getTotalTemporadas());
        IO.println("Episódios por temporada: " + theboys.getEpisodiosPorTemporada());
        if (theboys.isFinalizada()) {
            IO.println("Série finalizada.");
        } else {
            IO.println("Em andamento.");
        }

    }
}
