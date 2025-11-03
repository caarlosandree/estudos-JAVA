# Documentação Java - Operadores

## 📌 Índice
- [Operadores de Atribuição](#operadores-de-atribuição)
- [Operadores Aritméticos](#operadores-aritméticos)
- [Operadores Relacionais](#operadores-relacionais)
- [Operadores Lógicos](#operadores-lógicos)
- [Operadores de Incremento e Decremento](#operadores-de-incremento-e-decremento)

---

## 🔄 Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis.

### Operador de Atribuição Simples (`=`)

Atribui o valor da direita à variável da esquerda.

```java
int numero = 10;        // Atribui 10 à variável numero
String nome = "Java";   // Atribui "Java" à variável nome
double preco = 29.99;   // Atribui 29.99 à variável preco
```

### Operadores de Atribuição Composta

Combinam uma operação aritmética com a atribuição.

```java
int x = 10;

x += 5;   // Equivale a: x = x + 5   → x = 15
x -= 3;   // Equivale a: x = x - 3   → x = 12
x *= 2;   // Equivale a: x = x * 2   → x = 24
x /= 4;   // Equivale a: x = x / 4   → x = 6
x %= 5;   // Equivale a: x = x % 5   → x = 1
```

**Tabela de Operadores de Atribuição Composta:**

| Operador | Exemplo | Equivale a |
|----------|---------|------------|
| `+=` | `x += 5` | `x = x + 5` |
| `-=` | `x -= 3` | `x = x - 3` |
| `*=` | `x *= 2` | `x = x * 2` |
| `/=` | `x /= 4` | `x = x / 4` |
| `%=` | `x %= 5` | `x = x % 5` |

**Exemplo Prático:**

```java
public class ExemploAtribuicao {
    public static void main(String[] args) {
        int salario = 1000;
        
        salario += 500;  // Aumento de 500 → salario = 1500
        System.out.println("Salário após aumento: " + salario);
        
        salario -= 200;  // Desconto de 200 → salario = 1300
        System.out.println("Salário após desconto: " + salario);
        
        salario *= 2;    // Dobro do salário → salario = 2600
        System.out.println("Salário dobrado: " + salario);
    }
}
```

---

## ➕ Operadores Aritméticos

Os operadores aritméticos realizam operações matemáticas básicas.

### Operadores Básicos

```java
int a = 10;
int b = 3;

int soma = a + b;           // 13 → Adição
int subtracao = a - b;      // 7  → Subtração
int multiplicacao = a * b;  // 30 → Multiplicação
int divisao = a / b;        // 3  → Divisão inteira
int resto = a % b;          // 1  → Módulo (resto da divisão)
```

### Tabela de Operadores Aritméticos

| Operador | Nome | Exemplo | Resultado |
|----------|------|---------|-----------|
| `+` | Adição | `10 + 5` | `15` |
| `-` | Subtração | `10 - 5` | `5` |
| `*` | Multiplicação | `10 * 5` | `50` |
| `/` | Divisão | `10 / 5` | `2` |
| `%` | Módulo (resto) | `10 % 3` | `1` |

### Precedência dos Operadores Aritméticos

A ordem de execução é:
1. `()` (parênteses) - maior precedência
2. `*`, `/`, `%` (multiplicação, divisão, módulo)
3. `+`, `-` (adição, subtração)

```java
int resultado1 = 2 + 3 * 4;     // 14 (multiplicação primeiro)
int resultado2 = (2 + 3) * 4;   // 20 (parênteses primeiro)
int resultado3 = 10 / 2 + 3;    // 8 (divisão primeiro)
```

### Divisão Inteira vs Divisão Decimal

```java
// Divisão inteira (com int)
int divisaoInteira = 10 / 3;           // Resultado: 3
int restoDivisao = 10 % 3;             // Resultado: 1

// Divisão decimal (com double ou float)
double divisaoDecimal = 10.0 / 3.0;    // Resultado: 3.333...
double divisaoMista = 10 / 3.0;        // Resultado: 3.333... (promoção)
```

**Exemplo Prático:**

```java
public class ExemploAritmeticos {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        
        System.out.println("a + b = " + (a + b));    // 19
        System.out.println("a - b = " + (a - b));    // 11
        System.out.println("a * b = " + (a * b));    // 60
        System.out.println("a / b = " + (a / b));    // 3 (divisão inteira)
        System.out.println("a % b = " + (a % b));    // 3 (resto)
        
        // Divisão decimal
        double resultado = (double) a / b;
        System.out.println("a / b (decimal) = " + resultado);  // 3.75
    }
}
```

---

## 🔗 Operadores Relacionais

Os operadores relacionais comparam valores e retornam um valor booleano (`true` ou `false`).

### Operadores Relacionais

```java
int a = 10;
int b = 5;

boolean igual = (a == b);        // false → Igual a
boolean diferente = (a != b);    // true  → Diferente de
boolean maior = (a > b);         // true  → Maior que
boolean menor = (a < b);         // false → Menor que
boolean maiorIgual = (a >= b);   // true  → Maior ou igual a
boolean menorIgual = (a <= b);   // false → Menor ou igual a
```

### Tabela de Operadores Relacionais

| Operador | Nome | Exemplo | Resultado |
|----------|------|---------|-----------|
| `==` | Igual a | `5 == 5` | `true` |
| `!=` | Diferente de | `5 != 3` | `true` |
| `>` | Maior que | `5 > 3` | `true` |
| `<` | Menor que | `5 < 3` | `false` |
| `>=` | Maior ou igual | `5 >= 5` | `true` |
| `<=` | Menor ou igual | `5 <= 3` | `false` |

### ⚠️ Atenção: `==` vs `=`

- `==` é o operador de comparação (igualdade)
- `=` é o operador de atribuição

```java
int x = 10;
int y = 10;

boolean comparacao = (x == y);  // ✅ Compara valores
// x = y;                        // ❌ Atribui valor de y a x
```

### Comparação de Strings

Para comparar strings, use o método `.equals()`:

```java
String nome1 = "Java";
String nome2 = "Java";

// ❌ ERRADO - compara referências, não conteúdo
boolean igual = (nome1 == nome2);

// ✅ CORRETO - compara conteúdo
boolean igualConteudo = nome1.equals(nome2);  // true
```

**Exemplo Prático:**

```java
public class ExemploRelacionais {
    public static void main(String[] args) {
        int idade = 18;
        double nota = 7.5;
        
        // Verificar se é maior de idade
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
        
        // Verificar aprovação
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        // Comparações
        System.out.println("5 == 5: " + (5 == 5));        // true
        System.out.println("5 != 3: " + (5 != 3));        // true
        System.out.println("5 > 3: " + (5 > 3));          // true
        System.out.println("5 < 10: " + (5 < 10));        // true
        System.out.println("5 >= 5: " + (5 >= 5));        // true
        System.out.println("5 <= 3: " + (5 <= 3));        // false
    }
}
```

---

## 🧠 Operadores Lógicos

Os operadores lógicos trabalham com valores booleanos e retornam resultados booleanos.

### Operadores Lógicos Básicos

```java
boolean a = true;
boolean b = false;

boolean e = a && b;    // false → E lógico (AND)
boolean ou = a || b;   // true  → OU lógico (OR)
boolean nao = !a;      // false → NÃO lógico (NOT)
```

### Tabela Verdade

#### Operador `&&` (E/AND)
| A | B | A && B |
|---|---|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

#### Operador `||` (OU/OR)
| A | B | A \|\| B |
|---|---|----------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

#### Operador `!` (NÃO/NOT)
| A | !A |
|---|----|
| true | false |
| false | true |

### Avaliação de Curto-Circuito (Short-Circuit)

- `&&` (AND): Se o primeiro operando for `false`, o segundo não é avaliado
- `||` (OR): Se o primeiro operando for `true`, o segundo não é avaliado

```java
int x = 5;

// Short-circuit: se x > 10 for false, a segunda parte não é avaliada
if (x > 10 && x / 0 == 0) {  // Não causa erro de divisão por zero
    System.out.println("Executa");
}

// Short-circuit: se x < 10 for true, a segunda parte não é avaliada
if (x < 10 || x / 0 == 0) {  // Não causa erro de divisão por zero
    System.out.println("Executa");
}
```

### Operadores `&` e `|` (sem curto-circuito)

- `&` (E sem curto-circuito): Avalia ambos os operandos sempre
- `|` (OU sem curto-circuito): Avalia ambos os operandos sempre

```java
boolean resultado1 = false & (true || false);  // Avalia ambos
boolean resultado2 = true | (false && true);   // Avalia ambos
```

**Exemplo Prático:**

```java
public class ExemploLogicos {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCarteira = true;
        boolean temCarro = false;
        
        // Verificar se pode dirigir
        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir");
        }
        
        // Verificar se tem transporte
        if (temCarteira || temCarro) {
            System.out.println("Tem forma de se locomover");
        }
        
        // Operador NOT
        if (!temCarro) {
            System.out.println("Não tem carro");
        }
        
        // Combinação de operadores
        boolean podeViajar = (idade >= 18) && (temCarteira || temCarro);
        System.out.println("Pode viajar: " + podeViajar);
        
        // Exemplos de tabela verdade
        System.out.println("true && true: " + (true && true));      // true
        System.out.println("true && false: " + (true && false));    // false
        System.out.println("true || false: " + (true || false));    // true
        System.out.println("false || false: " + (false || false));  // false
        System.out.println("!true: " + (!true));                    // false
        System.out.println("!false: " + (!false));                  // true
    }
}
```

---

## 🔢 Operadores de Incremento e Decremento

Os operadores de incremento e decremento aumentam ou diminuem o valor de uma variável em 1.

### Operadores de Incremento (`++`)

```java
int x = 5;

x++;      // Pós-incremento: usa o valor e depois incrementa
++x;      // Pré-incremento: incrementa e depois usa o valor
```

### Operadores de Decremento (`--`)

```java
int x = 5;

x--;      // Pós-decremento: usa o valor e depois decrementa
--x;      // Pré-decremento: decrementa e depois usa o valor
```

### Diferença entre Pré e Pós

A diferença é quando a variável é incrementada/decrementada em relação ao uso do valor:

#### Pós-incremento (`x++`) e Pós-decremento (`x--`)

```java
int x = 5;
int y = x++;  // y recebe 5, depois x vira 6

// Após a execução:
// x = 6
// y = 5
```

#### Pré-incremento (`++x`) e Pré-decremento (`--x`)

```java
int x = 5;
int y = ++x;  // x vira 6 primeiro, depois y recebe 6

// Após a execução:
// x = 6
// y = 6
```

### Tabela de Operadores

| Operador | Nome | Exemplo | Resultado |
|----------|------|---------|-----------|
| `++x` | Pré-incremento | `int x=5; y=++x;` | `x=6, y=6` |
| `x++` | Pós-incremento | `int x=5; y=x++;` | `x=6, y=5` |
| `--x` | Pré-decremento | `int x=5; y=--x;` | `x=4, y=4` |
| `x--` | Pós-decremento | `int x=5; y=x--;` | `x=4, y=5` |

### Exemplos Práticos

```java
public class ExemploIncremento {
    public static void main(String[] args) {
        // Pós-incremento
        int a = 5;
        System.out.println("a = " + a);        // a = 5
        System.out.println("a++ = " + a++);    // a++ = 5 (imprime e depois incrementa)
        System.out.println("a = " + a);        // a = 6
        
        System.out.println(); // linha em branco
        
        // Pré-incremento
        int b = 5;
        System.out.println("b = " + b);        // b = 5
        System.out.println("++b = " + ++b);    // ++b = 6 (incrementa e depois imprime)
        System.out.println("b = " + b);        // b = 6
        
        System.out.println(); // linha em branco
        
        // Pós-decremento
        int c = 5;
        System.out.println("c = " + c);        // c = 5
        System.out.println("c-- = " + c--);    // c-- = 5 (imprime e depois decrementa)
        System.out.println("c = " + c);        // c = 4
        
        System.out.println(); // linha em branco
        
        // Pré-decremento
        int d = 5;
        System.out.println("d = " + d);        // d = 5
        System.out.println("--d = " + --d);    // --d = 4 (decrementa e depois imprime)
        System.out.println("d = " + d);        // d = 4
        
        System.out.println(); // linha em branco
        
        // Uso em loops
        System.out.println("Loop com pós-incremento:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");  // 0 1 2 3 4
        }
        
        System.out.println(); // linha em branco
        
        // Comparação prática
        int x = 10;
        int resultado1 = x++ * 2;   // resultado1 = 20, x = 11
        
        int y = 10;
        int resultado2 = ++y * 2;   // resultado2 = 22, y = 11
        
        System.out.println("x++ * 2 = " + resultado1);  // 20
        System.out.println("++y * 2 = " + resultado2);  // 22
    }
}
```

### Uso Comum em Loops

```java
// Incremento em loops for
for (int i = 0; i < 10; i++) {  // i++ é pós-incremento
    System.out.println(i);
}

// Decremento em loops for
for (int i = 10; i > 0; i--) {  // i-- é pós-decremento
    System.out.println(i);
}
```

---

## 📊 Resumo dos Operadores

### Tabela Geral

| Categoria | Operadores | Exemplo |
|-----------|-----------|---------|
| **Atribuição** | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | `x += 5` |
| **Aritméticos** | `+`, `-`, `*`, `/`, `%` | `10 + 5` |
| **Relacionais** | `==`, `!=`, `>`, `<`, `>=`, `<=` | `5 > 3` |
| **Lógicos** | `&&`, `\|\|`, `!`, `&`, `\|` | `true && false` |
| **Incremento/Decremento** | `++`, `--` | `x++`, `++x` |

### Precedência dos Operadores (do maior para o menor)

1. `()`, `[]`, `.` (parênteses, colchetes, ponto)
2. `++`, `--` (incremento/decremento)
3. `!`, `~` (negação lógica e bitwise)
4. `*`, `/`, `%` (multiplicação, divisão, módulo)
5. `+`, `-` (adição, subtração)
6. `<`, `>`, `<=`, `>=` (relacionais)
7. `==`, `!=` (igualdade)
8. `&&` (E lógico)
9. `||` (OU lógico)
10. `=`, `+=`, `-=`, etc. (atribuição)

---

## 💡 Dicas e Boas Práticas

### ✅ Boas Práticas

1. **Use parênteses para clarificar expressões complexas:**
   ```java
   // Confuso
   int resultado = a + b * c - d;
   
   // Claro
   int resultado = a + (b * c) - d;
   ```

2. **Prefira `x++` em loops simples:**
   ```java
   for (int i = 0; i < 10; i++) {  // Mais comum e legível
   }
   ```

3. **Use `&&` e `||` para operações lógicas:**
   ```java
   if (idade >= 18 && temCarteira) {  // ✅ Usa curto-circuito
   }
   ```

4. **Cuidado com comparação de strings:**
   ```java
   String nome = "Java";
   if (nome.equals("Java")) {  // ✅ Correto
   }
   // Não use: nome == "Java"
   ```

### ⚠️ Erros Comuns

1. **Confundir `==` com `=`:**
   ```java
   // ❌ ERRADO
   if (x = 5) { }
   
   // ✅ CORRETO
   if (x == 5) { }
   ```

2. **Divisão inteira quando se espera decimal:**
   ```java
   // ❌ Resultado: 3 (divisão inteira)
   int resultado = 10 / 3;
   
   // ✅ Resultado: 3.333... (divisão decimal)
   double resultado = 10.0 / 3.0;
   ```

3. **Comparar strings com `==`:**
   ```java
   String a = "Java";
   String b = "Java";
   
   // ❌ Compara referências, não conteúdo
   if (a == b) { }
   
   // ✅ Compara conteúdo
   if (a.equals(b)) { }
   ```

---

## 📚 Exercícios Práticos Sugeridos

1. Criar uma calculadora básica usando operadores aritméticos
2. Implementar validações usando operadores relacionais e lógicos
3. Criar contadores usando operadores de incremento
4. Implementar condições complexas combinando operadores lógicos

