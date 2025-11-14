package ExerciciosPOO.Desafios;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("João");
        aluno.setIdade(20);
        aluno.adicionarNota(10);
        aluno.adicionarNota(8);
        aluno.adicionarNota(7);
        aluno.adicionarNota(5);
        aluno.adicionarNota(10);
        aluno.adicionarNota(8);
        aluno.adicionarNota(7);
        aluno.adicionarNota(5);

        aluno.exibirFicha();
    
    }
}
