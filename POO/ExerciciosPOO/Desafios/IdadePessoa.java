package ExerciciosPOO.Desafios;

public class IdadePessoa {

    private String nome;
    private int idade;

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

    public void mostrarDados() {
        IO.println("Nome: " + nome);
        IO.println("Idade: " + idade);
    }

    public void verificarIdade() {
        if (idade >= 18) {
            IO.println("A pessoa é maior de idade");
        } else {
            IO.println("A pessoa é menor de idade");
        }
    }
    
}
