## Herança em Orientação a Objetos

Herança é um mecanismo fundamental da POO que permite criar novas classes baseadas em classes existentes, reutilizando código e estabelecendo relações hierárquicas entre entidades. Em Java, a herança é implementada através da palavra-chave `extends`.

### Conceito fundamental

Uma classe **filha** (subclasse) herda atributos e métodos de uma classe **pai** (superclasse), podendo adicionar novos comportamentos ou modificar os existentes. Isso facilita a reutilização de código e a modelagem de relações "é-um-tipo-de".

### Sintaxe básica

```java
public class Superclasse {
    // atributos e métodos
}

public class Subclasse extends Superclasse {
    // novos atributos e métodos
    // ou sobrescrita de métodos herdados
}
```

### Exemplo prático: Sistema de Streaming

No sistema de streaming, temos `Titulo` como classe base e `Filme` e `Serie` como subclasses:

```java
public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    
    // métodos getters e setters
}

public class Filme extends Titulo {
    private String diretor;
    private int duracaoEmMinutos;
    
    // métodos específicos de Filme
}

public class Serie extends Titulo {
    private int totalTemporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean finalizada;
    
    // métodos específicos de Serie
}
```

### O que é herdado

A subclasse herda:
- **Todos os atributos** da superclasse (mesmo que privados, não são acessíveis diretamente).
- **Todos os métodos públicos e protegidos** da superclasse.
- **A capacidade de usar construtores** da superclasse através de `super()`.

### Modificadores de acesso e herança

- **`private`**: não é acessível nas subclasses.
- **`protected`**: acessível nas subclasses e no mesmo pacote.
- **`public`**: acessível em qualquer lugar.
- **`default`** (sem modificador): acessível apenas no mesmo pacote.

```java
public class Titulo {
    private String nome;              // não acessível na subclasse
    protected int anoDeLancamento;    // acessível na subclasse
    public double avaliacao;          // acessível em qualquer lugar
}
```

### Sobrescrita de métodos (Override)

Permite que a subclasse redefina o comportamento de um método herdado. Use a anotação `@Override` para garantir que o método existe na superclasse:

```java
public class Serie extends Titulo {
    @Override
    public int getDuracaoEmMinutos() {
        return getTotalTemporadas() * 
               getEpisodiosPorTemporada() * 
               getMinutosPorEpisodio();
    }
}
```

### Palavra-chave `super`

A referência `super` permite:
- Chamar construtores da superclasse: `super(parametros)`.
- Acessar métodos ou atributos da superclasse: `super.nomeDoMetodo()`.

```java
public class Filme extends Titulo {
    public Filme(String nome, int ano, String diretor) {
        super(nome, ano);  // chama construtor da superclasse
        this.diretor = diretor;
    }
}
```

### Construtores e herança

- Se a superclasse não tem construtor padrão, a subclasse deve chamar explicitamente um construtor da superclasse usando `super()`.
- A primeira linha de um construtor de subclasse deve ser `super(...)` ou `this(...)`.

```java
public class Titulo {
    public Titulo(String nome, int ano) {
        this.nome = nome;
        this.anoDeLancamento = ano;
    }
}

public class Filme extends Titulo {
    public Filme(String nome, int ano, String diretor) {
        super(nome, ano);  // obrigatório se não houver construtor padrão
        this.diretor = diretor;
    }
}
```

### Classes abstratas

Uma classe abstrata não pode ser instanciada diretamente, servindo apenas como base para outras classes:

```java
public abstract class Titulo {
    // métodos concretos e abstratos
    public abstract void exibirDetalhes();
}
```

### Polimorfismo através da herança

Herança permite polimorfismo: tratar objetos de subclasses como instâncias da superclasse:

```java
Titulo titulo1 = new Filme("Interestelar", 2014, "Christopher Nolan");
Titulo titulo2 = new Serie("Breaking Bad", 2008);

List<Titulo> catalogo = new ArrayList<>();
catalogo.add(titulo1);
catalogo.add(titulo2);
```

### Verificação de tipo: `instanceof`

Operador usado para verificar se um objeto é instância de uma classe específica:

```java
if (titulo instanceof Serie) {
    Serie serie = (Serie) titulo;
    System.out.println("Temporadas: " + serie.getTotalTemporadas());
}
```

### Benefícios da herança

1. **Reutilização de código**: evita duplicação de atributos e métodos comuns.
2. **Hierarquia clara**: modela relações "é-um-tipo-de" de forma natural.
3. **Extensibilidade**: facilita adicionar novos tipos sem modificar código existente.
4. **Polimorfismo**: permite tratar diferentes tipos de forma uniforme.

### Quando usar herança

Use herança quando:
- Existe uma relação "é-um-tipo-de" clara (ex.: `Serie` é um `Titulo`).
- Há código comum significativo que pode ser compartilhado.
- Você precisa de polimorfismo para tratar diferentes tipos uniformemente.

Evite herança quando:
- A relação não é realmente "é-um-tipo-de" (prefira composição).
- A herança apenas para reutilizar código sem semântica adequada (use composição).
- Você precisa herdar de múltiplas classes (Java não permite herança múltipla de classes).

### Boas práticas

- Use `@Override` ao sobrescrever métodos para garantir consistência.
- Mantenha a hierarquia simples e com poucos níveis (evite herança profunda).
- Prefira composição sobre herança quando a relação não for claramente hierárquica.
- Documente o contrato da superclasse para que subclasses saibam o que implementar.
- Considere classes abstratas ou interfaces para definir contratos mais flexíveis.

### Limitações em Java

- **Herança única**: uma classe pode estender apenas uma superclasse.
- Para múltiplos contratos, use interfaces (que permitem múltipla implementação).
- Métodos e classes `final` não podem ser sobrescritos ou estendidos, respectivamente.

Dominar herança é essencial para criar hierarquias de classes bem estruturadas, aproveitando a reutilização de código e o polimorfismo para construir sistemas mais flexíveis e manuteníveis.

