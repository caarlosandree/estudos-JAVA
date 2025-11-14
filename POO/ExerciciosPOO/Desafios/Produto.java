package ExerciciosPOO.Desafios;

public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }

    public void aplicarDesconto(){
        double descontoAplicado = preco * desconto;
        double precoFinal = preco - descontoAplicado;
        IO.println("Preço final: " + precoFinal);
    }
    
    public void mostrarDados() {
        IO.println("Nome: " + nome);
        IO.println("Preço: " + preco);
        IO.println("Desconto: " + desconto);
    }
}
