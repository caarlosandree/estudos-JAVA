## Anotações em Java

Anotações (annotations) são metadados que fornecem informações sobre elementos do código sem modificá-los diretamente. Introduzidas no Java 5, as anotações permitem adicionar informações descritivas que podem ser processadas em tempo de compilação ou execução por ferramentas, frameworks e pela própria JVM.

### Conceito fundamental

Anotações são marcadores especiais que podem ser aplicados a classes, métodos, campos, parâmetros e outros elementos do código. Elas começam com o símbolo `@` e fornecem informações que podem ser:
- Processadas pelo compilador (`@Override`, `@Deprecated`).
- Lidas em tempo de execução por frameworks (Spring, JPA, etc.).
- Usadas por ferramentas de análise estática e IDEs.

### Sintaxe básica

As anotações são aplicadas antes da declaração do elemento:

```java
@NomeDaAnotacao
public class MinhaClasse {
    @NomeDaAnotacao
    private String atributo;
    
    @NomeDaAnotacao
    public void meuMetodo() {
        // código
    }
}
```

Algumas anotações podem receber parâmetros:

```java
@Deprecated(since = "2.0", forRemoval = true)
public void metodoAntigo() {
    // código
}
```

### Anotações built-in do Java

O Java fornece várias anotações pré-definidas que são essenciais no desenvolvimento:

#### @Override

Indica que um método está sobrescrevendo um método da superclasse. O compilador verifica se o método realmente existe na hierarquia:

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

**Benefícios:**
- Detecta erros de digitação no nome do método.
- Garante que a assinatura corresponde ao método da superclasse.
- Melhora a legibilidade ao deixar explícita a intenção de sobrescrever.

#### @Deprecated

Marca elementos que não devem mais ser usados. IDEs e compiladores geram avisos quando elementos marcados são utilizados:

```java
public class Titulo {
    @Deprecated
    public void metodoAntigo() {
        // implementação antiga
    }
    
    @Deprecated(since = "2.0", forRemoval = true)
    public void metodoSeraRemovido() {
        // será removido na próxima versão
    }
}
```

**Parâmetros:**
- `since`: versão em que o elemento foi marcado como deprecated.
- `forRemoval`: indica se será removido em versão futura.

#### @SuppressWarnings

Suprime avisos do compilador para elementos específicos. Deve ser usado com cautela:

```java
@SuppressWarnings("unchecked")
public List<String> converterLista(Object obj) {
    return (List<String>) obj;  // aviso suprimido
}

@SuppressWarnings({"unchecked", "deprecation"})
public void metodoComMultiplosAvisos() {
    // código que gera múltiplos avisos
}
```

**Valores comuns:**
- `"unchecked"`: suprime avisos sobre conversões não verificadas.
- `"deprecation"`: suprime avisos sobre uso de métodos deprecated.
- `"rawtypes"`: suprime avisos sobre tipos brutos (raw types).

#### @SafeVarargs

Indica que um método ou construtor é seguro ao usar varargs com parâmetros genéricos:

```java
@SafeVarargs
public final void adicionarTitulos(Titulo... titulos) {
    // processamento seguro
}
```

#### @FunctionalInterface

Marca uma interface como interface funcional (usada para expressões lambda). O compilador verifica se a interface possui exatamente um método abstrato:

```java
@FunctionalInterface
public interface Avaliavel {
    void avalia(double nota);
}

// Uso com lambda
Avaliavel avaliador = nota -> System.out.println("Avaliação: " + nota);
```

### Meta-anotações

Meta-anotações são anotações que se aplicam a outras anotações, definindo como elas podem ser usadas:

#### @Target

Especifica onde uma anotação pode ser aplicada (classe, método, campo, etc.):

```java
@Target(ElementType.METHOD)
public @interface Validar {
    // anotação só pode ser usada em métodos
}
```

**Valores do ElementType:**
- `TYPE`: classes, interfaces, enums.
- `FIELD`: campos de classe.
- `METHOD`: métodos.
- `PARAMETER`: parâmetros de métodos.
- `CONSTRUCTOR`: construtores.
- `LOCAL_VARIABLE`: variáveis locais.

#### @Retention

Define em que fase do ciclo de vida do programa a anotação está disponível:

```java
@Retention(RetentionPolicy.RUNTIME)
public @interface MinhaAnotacao {
    // disponível em tempo de execução
}
```

**Valores do RetentionPolicy:**
- `SOURCE`: descartada pelo compilador (ex.: `@Override`).
- `CLASS`: incluída no bytecode, mas não disponível em runtime (padrão).
- `RUNTIME`: disponível via reflection em runtime (usado por frameworks).

#### @Documented

Indica que a anotação deve aparecer na documentação JavaDoc:

```java
@Documented
public @interface ApiEndpoint {
    String value();
}
```

#### @Inherited

Faz com que anotações de classes sejam herdadas por subclasses:

```java
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Entidade {
    // subclasses também terão essa anotação
}
```

#### @Repeatable

Permite que uma anotação seja aplicada múltiplas vezes ao mesmo elemento:

```java
@Repeatable(Permissoes.class)
public @interface Permissao {
    String value();
}

@Target(ElementType.METHOD)
public @interface Permissoes {
    Permissao[] value();
}

// Uso
@Permissao("ADMIN")
@Permissao("USER")
public void metodoRestrito() {
    // código
}
```

### Criando anotações customizadas

Você pode criar suas próprias anotações para adicionar metadados específicos ao seu projeto:

#### Anotação simples

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validar {
}

// Uso
public class Titulo {
    @Validar
    public void setAvaliacao(double nota) {
        // código
    }
}
```

#### Anotação com parâmetros

```java
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MinLength {
    int value();
    String message() default "Valor muito curto";
}

// Uso
public class Filme {
    @MinLength(value = 3, message = "Título deve ter pelo menos 3 caracteres")
    private String titulo;
}
```

#### Anotação com múltiplos parâmetros

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cacheable {
    int ttl() default 3600;
    String[] tags() default {};
    boolean invalidateOnUpdate() default true;
}

// Uso
@Cacheable(ttl = 7200, tags = {"filmes", "catalogo"})
public List<Filme> listarFilmes() {
    // código
}
```

### Processamento de anotações

#### Em tempo de compilação

Processadores de anotação podem analisar código durante a compilação e gerar código adicional ou relatórios:

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface GerarBuilder {
    // processador gera código builder em tempo de compilação
}
```

#### Em tempo de execução (reflection)

Use reflection para ler anotações em runtime:

```java
import java.lang.reflect.Method;

public class ProcessadorValidacao {
    public void validar(Object obj) {
        Class<?> clazz = obj.getClass();
        
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Validar.class)) {
                // executar validação
                System.out.println("Método " + method.getName() + " requer validação");
            }
            
            MinLength minLength = method.getAnnotation(MinLength.class);
            if (minLength != null) {
                int tamanhoMinimo = minLength.value();
                // aplicar validação de tamanho mínimo
            }
        }
    }
}
```

### Exemplos práticos

#### Sistema de validação customizado

```java
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    String message() default "Campo não pode ser nulo";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {
    double min() default Double.MIN_VALUE;
    double max() default Double.MAX_VALUE;
    String message() default "Valor fora do intervalo permitido";
}

// Uso no modelo
public class Filme extends Titulo {
    @NotNull(message = "Diretor é obrigatório")
    private String diretor;
    
    @Range(min = 0, max = 10, message = "Avaliação deve estar entre 0 e 10")
    private double avaliacao;
}
```

#### Anotação para logging

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Loggable {
    Level level() default Level.INFO;
    boolean logParameters() default true;
    boolean logReturn() default false;
    
    enum Level {
        DEBUG, INFO, WARN, ERROR
    }
}

// Uso
public class ServicoTitulo {
    @Loggable(level = Loggable.Level.INFO, logReturn = true)
    public Filme buscarFilme(String nome) {
        // código
        return filme;
    }
}
```

### Boas práticas

1. **Use anotações com propósito claro**: cada anotação deve ter uma função bem definida.
2. **Documente suas anotações**: use JavaDoc para explicar quando e como usar.
3. **Prefira anotações built-in**: use `@Override`, `@Deprecated` quando apropriado.
4. **Seja específico com @Target**: restrinja onde a anotação pode ser aplicada.
5. **Considere a retenção**: use `SOURCE` para validações de compilação, `RUNTIME` para frameworks.
6. **Evite @SuppressWarnings sem motivo**: apenas quando realmente necessário e documentado.
7. **Use valores padrão**: torne parâmetros opcionais quando fizer sentido.
8. **Mantenha anotações simples**: evite lógica complexa; use processadores se necessário.

### Limitações

- Anotações não podem ter código executável (mas podem ser processadas para gerar código).
- Parâmetros de anotações devem ser tipos primitivos, String, Class, enums ou arrays desses tipos.
- Anotações não podem herdar de outras anotações (mas podem ter hierarquias através de composição).

### Integração com frameworks

Frameworks populares usam extensivamente anotações:

- **Spring**: `@Component`, `@Autowired`, `@Service`, `@Controller`.
- **JPA/Hibernate**: `@Entity`, `@Table`, `@Column`, `@OneToMany`.
- **JUnit**: `@Test`, `@BeforeEach`, `@AfterEach`.
- **Lombok**: `@Getter`, `@Setter`, `@Data`, `@Builder` (gera código em compile-time).

Dominar anotações é essencial para trabalhar com frameworks modernos e criar código mais expressivo e bem documentado, facilitando a manutenção e extensibilidade dos sistemas.

