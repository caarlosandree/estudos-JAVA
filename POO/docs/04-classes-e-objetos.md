## Classes, Objetos e Ciclo de Vida

As classes definem a estrutura e o comportamento dos objetos, enquanto os objetos representam instâncias concretas ativas na aplicação. Em Java, a distinção entre classe (conceito) e objeto (instância) é fundamental.

### Estrutura de uma classe

```java
public class Serie {
    private String titulo;
    private int totalTemporadas;
    private boolean finalizada;

    public Serie(String titulo, int totalTemporadas) {
        this.titulo = titulo;
        this.totalTemporadas = totalTemporadas;
    }

    public void finalizar() {
        this.finalizada = true;
    }
}
```

- **Campos/atributos** armazenam dados.
- **Construtores** definem o estado inicial.
- **Métodos** determinam comportamentos e regras de negócio.

### Ciclo de vida de um objeto

1. **Criação**: chamada ao construtor (`new Serie(...)`).
2. **Uso**: execução de métodos que modificam ou consultam o estado.
3. **Finalização**: objeto torna-se elegível para coleta de lixo quando não há mais referências em uso.

### Sobrecarga e encapsulamento

- **Sobrecarga** permite múltiplos construtores ou métodos com assinaturas diferentes.
- **Encapsulamento** oculta detalhes internos por meio de modificadores (`private`, `protected`, `public`).

### Métodos de acesso

Os famosos getters e setters controlam a leitura e alteração de atributos:

```java
public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    if (titulo == null || titulo.isBlank()) {
        throw new IllegalArgumentException("Título inválido");
    }
    this.titulo = titulo;
}
```

### Métodos utilitários

- **`toString()`**: descreve o objeto em forma de texto.
- **`equals()` e `hashCode()`**: definem igualdade lógica e suporte a coleções (ex.: `HashSet`).
- **`clone()`**: copia o estado, quando apropriado.

### Imutabilidade

Criar classes imutáveis (sem modificadores após construção) aumenta a segurança e facilita concorrência:

```java
public final class Avaliacao {
    private final double nota;
    private final String comentario;

    public Avaliacao(double nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }

    public double getNota() {
        return nota;
    }
}
```

### Composição de objetos

Objetos podem conter outros objetos para representar uma estrutura completa:

```java
public class Playlist {
    private String nome;
    private List<Filme> filmes = new ArrayList<>();

    public void adicionar(Filme filme) {
        filmes.add(filme);
    }
}
```

Essa composição possibilita criar agregados ricos e expressivos, respeitando os princípios de coesão e baixo acoplamento.

