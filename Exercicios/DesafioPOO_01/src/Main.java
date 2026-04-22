import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import models.ModeloCarro;
import utils.variacaoPreco;

void main() {

    // Criar lista de modelos
    List<ModeloCarro> modelos = new ArrayList<>();

    // Adicionar modelos
    ModeloCarro Corolla = new ModeloCarro();
    Corolla.setModelo("Corolla");
    Corolla.setPreco(new BigDecimal("200000"));
    Corolla.setAno(2026);
    Corolla.setMarca("Toyota");
    Corolla.setPrecoMedio(200000);
    modelos.add(Corolla);

    ModeloCarro Civic = new ModeloCarro();
    Civic.setModelo("Civic");
    Civic.setPreco(new BigDecimal("135000"));
    Civic.setAno(2020);
    Civic.setMarca("Honda");
    Civic.setPrecoMedio(135000);
    modelos.add(Civic);

    ModeloCarro Versa = new ModeloCarro();
    Versa.setModelo("Versa");
    Versa.setPreco(new BigDecimal("150000"));
    Versa.setAno(2023);
    Versa.setMarca("Nissan");
    Versa.setPrecoMedio(150000);
    modelos.add(Versa);

    IO.println("Projeção de desvalorização para os próximos 10 anos do " + modelos.getLast().getMarca() + " " + modelos.getLast().getModelo() + ", Ano " + modelos.getLast().getAno());

    // Calcular Projeção
    variacaoPreco calculadora = new variacaoPreco();
    List<ModeloCarro> projetos = calculadora.calcularVariacaoPreco(modelos);

    // Imprimir Projeção
    for (ModeloCarro projeto : projetos) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        IO.println(projeto.getAno() + ": " + formatoMoeda.format(projeto.getPreco()));
    }
}