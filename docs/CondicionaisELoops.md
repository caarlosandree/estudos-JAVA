# Condicionais e Estruturas de Repetição em Java

## Visão Geral
Controlar o fluxo de execução é essencial para reagir a diferentes situações dentro do programa. Em Java, usamos **condicionais** (`if`, `else if`, `else`, `switch`) para tomar decisões e **laços de repetição** (`for`, `while`) para executar blocos de código várias vezes.

---

## Condicionais

### `if` e `else`
Utilize `if` para testar uma condição booleana. Se for `true`, o bloco é executado. Opcionalmente, complemente com `else` para tratar o caso contrário.

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Pode dirigir.");
} else {
    System.out.println("Não pode dirigir.");
}
```

### `else if`
Quando houver múltiplas possibilidades, encadeie condições com `else if`.

```java
double nota = 7.5;

if (nota >= 9.0) {
    System.out.println("Excelente");
} else if (nota >= 7.0) {
    System.out.println("Bom");
} else if (nota >= 5.0) {
    System.out.println("Regular");
} else {
    System.out.println("Reprovado");
}
```

**Boas práticas**
- Mantenha condições simples e expressivas.
- Extraia comparações complexas para métodos auxiliares.
- Prefira chaves `{}` mesmo para blocos com uma linha.

### `switch`
`switch` é útil para testar um mesmo valor contra várias alternativas.

```java
String dia = "TERCA";

switch (dia) {
    case "SEGUNDA":
        System.out.println("Início da semana.");
        break;
    case "TERCA":
    case "QUARTA":
        System.out.println("Meio da semana.");
        break;
    case "QUINTA":
    case "SEXTA":
        System.out.println("Quase lá!");
        break;
    case "SABADO":
    case "DOMINGO":
        System.out.println("Fim de semana! 😎");
        break;
    default:
        System.out.println("Valor inválido.");
}
```

#### `switch` com expressão (Java 14+)
Versões mais recentes permitem retornar valores diretamente:

```java
String mensagem = switch (dia) {
    case "SEGUNDA" -> "Início da semana.";
    case "TERCA", "QUARTA" -> "Meio da semana.";
    case "QUINTA", "SEXTA" -> "Quase lá!";
    case "SABADO", "DOMINGO" -> "Fim de semana!";
    default -> "Valor inválido.";
};

System.out.println(mensagem);
```

---

## Laços de Repetição

### `for`
Ideal quando você conhece a quantidade de repetições.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}
```

**Componentes do `for`**
- Inicialização: executada uma única vez no início (`int i = 0`).
- Condição: avaliada antes de cada iteração (`i < 5`).
- Atualização: executada ao final de cada iteração (`i++`).

### `for-each`
Percorre coleções, arrays ou qualquer estrutura que implemente `Iterable`.

```java
String[] nomes = {"Ana", "Bruno", "Carla"};

for (String nome : nomes) {
    System.out.println(nome);
}
```

### `while`
Executa enquanto a condição for verdadeira. Use quando não souber quantas repetições serão necessárias.

```java
int tentativas = 0;
boolean autenticado = false;

while (!autenticado && tentativas < 3) {
    System.out.println("Tentativa " + (tentativas + 1));
    // lógica de autenticação
    tentativas++;
}
```

### `do-while`
Garante pelo menos uma execução do bloco.

```java
int opcao;

do {
    opcao = menu.aguardarEntrada();
    processar(opcao);
} while (opcao != 0);
```

---

## Controle de Fluxo Adicional

- `break`: encerra o laço ou o `switch` atual.
- `continue`: interrompe a iteração corrente e avança para a próxima.

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // pula números pares
    }
    if (i > 7) {
        break; // interrompe quando i for maior que 7
    }
    System.out.println(i);
}
```

---

## Boas Práticas Gerais
- Avalie se uma condição ou loop pode ser extraído para um método com nome descritivo.
- Evite loops infinitos sem necessidade; se precisar, garanta uma condição de saída.
- Combine loops com coleções adequadas (`List`, `Set`, `Map`) para escrever código mais legível.
- Monitore o custo computacional: loops aninhados podem crescer rapidamente e impactar desempenho.
- Escreva testes que cubram cada ramo (`if`, `else`, `switch`) e limites de loops.


