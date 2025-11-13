## Métodos em Orientação a Objetos

Métodos representam os comportamentos que um objeto pode executar. Eles encapsulam lógica, manipulam o estado interno e expõem funcionalidades de maneira controlada.

### Estrutura básica de um método em Java

```java
public TipoRetorno nomeMetodo(TipoParametro parametro) {
    // corpo do método
    return valor;
}
```

- **Modificador de acesso** define a visibilidade (`public`, `private`, `protected`).
- **Tipo de retorno** informa qual valor será devolvido; use `void` quando não houver retorno.
- **Parâmetros** permitem a entrada de dados externos.
- **Corpo** contém a lógica do método.

### Métodos de instância vs. métodos estáticos

- **Instância**: dependem do estado do objeto. Exemplos: `filme.avalia(8.5)`, `serie.finalizar()`.
- **Estáticos**: pertencem à classe e não usam atributos de instância. São invocados com o nome da classe (`Math.max(a, b)`).

### Encapsulamento de lógica

Um método deve ter responsabilidade clara, facilitando leitura e testes:

```java
public class CalculadoraDeAvaliacoes {
    public double media(List<Double> notas) {
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}
```

### Sobrecarga de métodos (Overload)

Permite definir métodos com o mesmo nome, mas assinaturas diferentes:

```java
public void exibirFichaTecnica() { ... }
public void exibirFichaTecnica(boolean detalhada) { ... }
```

Cada versão atende a uma necessidade distinta, mantendo o nome semântico.

### Sobrescrita de métodos (Override)

Ocorre quando uma subclasse redefine o comportamento herdado da superclasse:

```java
public class Documentario extends Filme {
    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Categoria: Documentário");
    }
}
```

### Métodos acessores e modificadores

- **Getters** retornam valores de atributos.
- **Setters** alteram atributos com validações necessárias.

```java
public class Filme {
    private double avaliacao;

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao < 0 || avaliacao > 10) {
            throw new IllegalArgumentException("Nota fora do intervalo 0-10");
        }
        this.avaliacao = avaliacao;
    }
}
```

### Métodos utilitários comuns

- **`toString()`**: retorna representação textual do objeto.
- **`equals()` e `hashCode()`**: suportam comparação lógica e uso em coleções.
- **`compareTo()`**: ordena objetos quando a classe implementa `Comparable`.

### Métodos privados e auxiliares

Divide a lógica complexa em partes menores, mantendo a clareza do código público:

```java
public void reproduzir() {
    validarDisponibilidade();
    iniciarStreaming();
}

private void validarDisponibilidade() { ... }
private void iniciarStreaming() { ... }
```

### Boas práticas para métodos

- Nomeie com verbos no infinitivo ou presente (`calcular`, `buscarCliente`).
- Mantenha o método curto e com um único nível de abstração.
- Utilize tratamento de exceções coerente (`try/catch` ou propague com `throws`).
- Evite efeitos colaterais inesperados (métodos devem ser previsíveis).
- Documente comportamento, parâmetros e precondições com JavaDoc quando necessário.

Dominar métodos é essencial para modelar comportamentos robustos e expressivos em sistemas orientados a objetos, garantindo clareza e extensibilidade ao código.

