package ExerciciosPOO.Desafios;

public class MainCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Fiesta";
        meuCarro.ano = 2020;
        meuCarro.cor = "Verde";
        
        IO.println("-=-=- Ficha técnica -=-=-\n");
        meuCarro.fichaTecnica();
        meuCarro.calcularIdade();
    }
}


