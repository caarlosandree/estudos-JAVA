package ExerciciosPOO.Desafios;

public class Aluno {
    private String nome;
    private int idade;
    private double notas;
    private double notasTotal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return notas;
    }

    public void adicionarNota(double nota) {
        notas += nota;
        notasTotal++;
    }

    public void exibirFicha() {
        IO.println("Nome: " + nome);
        IO.println("Idade: " + idade);
        if (calcularMedia() >= 7) {
            IO.println("Aluno aprovado com média: " + calcularMedia());
        } else {
            IO.println("Aluno reprovado com média: " + calcularMedia());
        }
    }

    public double calcularMedia() {
        if (notasTotal == 0) {
            return 0;
        } else {
            return notas / notasTotal;
        }
    }

}
