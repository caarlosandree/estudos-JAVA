package ExerciciosPOO.Desafios;

import java.time.LocalDate;

public class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;
    int idade;
    int anoAtual;

    void fichaTecnica() {
        IO.println("Marca: " + marca);
        IO.println("Modelo: " + modelo);
        IO.println("Ano: " + ano);
        IO.println("Cor: " + cor);
    }
    
    LocalDate hoje = LocalDate.now();

    int anoAtual() {
        anoAtual = hoje.getYear();
        return anoAtual;
    };

    void calcularIdade() {
        idade = anoAtual() - ano;
        IO.println("Idade do carro: " + idade + " anos");
    }
    
}
