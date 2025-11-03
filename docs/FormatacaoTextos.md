# Documentação Java - Formatação de Textos

## 📌 Índice
- [Introdução](#introdução)
- [System.out.printf() e format()](#systemoutprintf-e-format)
- [String.format()](#stringformat)
- [Formatadores de Números](#formatadores-de-números)
- [Formatadores de Texto](#formatadores-de-texto)
- [Alinhamento e Padding](#alinhamento-e-padding)
- [Formatação de Datas](#formatação-de-datas)
- [Locale e Internacionalização](#locale-e-internacionalização)
- [Métodos Úteis da Classe String](#métodos-úteis-da-classe-string)
- [Exemplos Práticos](#exemplos-práticos)

---

## 🎯 Introdução

A formatação de textos em Java permite criar saídas formatadas de maneira profissional e consistente. Java oferece várias formas de formatar textos:

- **`System.out.printf()`** - Imprime texto formatado diretamente no console
- **`String.format()`** - Retorna uma String formatada
- **`System.out.format()`** - Equivalente ao `printf()`

Todas essas formas usam a mesma sintaxe baseada em **especificadores de formato** (`%` seguido de caracteres especiais).

---

## 🖨️ System.out.printf() e format()

### Sintaxe Básica

```java
System.out.printf("formato", valor1, valor2, ...);
System.out.format("formato", valor1, valor2, ...);  // Equivalente
```

**Exemplo:**

```java
String nome = "Carlos";
int idade = 25;
double altura = 1.75;

System.out.printf("Nome: %s, Idade: %d, Altura: %.2f%n", nome, idade, altura);
// Saída: Nome: Carlos, Idade: 25, Altura: 1.75
```

### Especificadores de Formato Comuns

| Especificador | Tipo | Descrição |
|---------------|------|-----------|
| `%s` | String | Formata strings |
| `%d` | int, long | Formata números inteiros |
| `%f` | float, double | Formata números decimais |
| `%c` | char | Formata caracteres |
| `%b` | boolean | Formata booleanos |
| `%n` | - | Insere quebra de linha (plataforma independente) |
| `%%` | - | Insere o símbolo `%` literal |

**Exemplos:**

```java
// String
System.out.printf("Nome: %s%n", "Java");        // Nome: Java

// Inteiro
System.out.printf("Idade: %d%n", 25);           // Idade: 25

// Decimal
System.out.printf("Preço: %f%n", 29.99);        // Preço: 29.990000
System.out.printf("Preço: %.2f%n", 29.99);      // Preço: 29.99

// Caractere
System.out.printf("Letra: %c%n", 'A');          // Letra: A

// Booleano
System.out.printf("Ativo: %b%n", true);         // Ativo: true

// Percentual literal
System.out.printf("Desconto: 10%%%n");          // Desconto: 10%
```

---

## 📝 String.format()

O método `String.format()` funciona da mesma forma que `printf()`, mas retorna uma String formatada em vez de imprimir diretamente.

### Sintaxe

```java
String resultado = String.format("formato", valor1, valor2, ...);
```

### Exemplos

```java
String nome = "Maria";
int idade = 30;
double salario = 2500.75;

// Criar string formatada
String mensagem = String.format("Nome: %s | Idade: %d | Salário: R$ %.2f", 
                                nome, idade, salario);
System.out.println(mensagem);
// Saída: Nome: Maria | Idade: 30 | Salário: R$ 2500.75

// Usar diretamente
System.out.println(String.format("Total: R$ %.2f", 1234.56));
// Saída: Total: R$ 1234.56
```

**Vantagens:**
- Permite reutilizar a string formatada
- Pode ser usado em concatenações
- Útil para criar mensagens dinâmicas

---

## 🔢 Formatadores de Números

### Números Inteiros (`%d`)

#### Formatação Básica

```java
int numero = 12345;
System.out.printf("%d%n", numero);              // 12345
System.out.printf("Número: %d%n", numero);      // Número: 12345
```

#### Padding (Preenchimento) com Zeros

```java
int numero = 42;
System.out.printf("%05d%n", numero);            // 00042 (5 dígitos com zeros à esquerda)
System.out.printf("%010d%n", numero);           // 0000000042 (10 dígitos)
```

#### Padding com Espaços

```java
int numero = 42;
System.out.printf("[%5d]%n", numero);           // [   42] (5 espaços, alinhado à direita)
System.out.printf("[%-5d]%n", numero);          // [42   ] (5 espaços, alinhado à esquerda)
```

#### Separador de Milhares (Locale)

```java
import java.util.Locale;

int numero = 1234567;
System.out.printf(Locale.US, "%,d%n", numero);      // 1,234,567
System.out.printf(Locale.GERMANY, "%,d%n", numero); // 1.234.567
```

### Números Decimais (`%f`)

#### Formatação Básica

```java
double valor = 29.99;
System.out.printf("%f%n", valor);               // 29.990000 (6 casas decimais padrão)
```

#### Controle de Casas Decimais

```java
double pi = 3.14159265359;

System.out.printf("%.2f%n", pi);                // 3.14 (2 casas decimais)
System.out.printf("%.4f%n", pi);                // 3.1416 (4 casas decimais)
System.out.printf("%.0f%n", pi);                // 3 (sem casas decimais)
```

#### Padding e Alinhamento

```java
double valor = 123.45;

System.out.printf("[%10.2f]%n", valor);         // [    123.45] (10 caracteres, alinhado à direita)
System.out.printf("[%-10.2f]%n", valor);        // [123.45    ] (10 caracteres, alinhado à esquerda)
System.out.printf("[%010.2f]%n", valor);        // [0000123.45] (preenchido com zeros)
```

#### Notação Científica (`%e` ou `%E`)

```java
double numero = 1234567.89;

System.out.printf("%e%n", numero);              // 1.234568e+06
System.out.printf("%E%n", numero);              // 1.234568E+06
System.out.printf("%.2e%n", numero);            // 1.23e+06
```

#### Formatação Condicional (`%g` ou `%G`)

Escolhe automaticamente entre notação decimal e científica, dependendo do valor:

```java
double pequeno = 0.000001;
double grande = 1000000;

System.out.printf("%g%n", pequeno);             // 1.00000e-06
System.out.printf("%g%n", grande);              // 1000000
System.out.printf("%.2g%n", pequeno);           // 1.0e-06
```

#### Formatação de Moeda

```java
import java.util.Locale;

double valor = 1234.56;

// Formatação com Locale
System.out.printf(Locale.US, "$%,.2f%n", valor);        // $1,234.56
System.out.printf(Locale.GERMANY, "%,.2f €%n", valor);  // 1.234,56 €
System.out.printf(Locale.BRAZIL, "R$ %,.2f%n", valor);  // R$ 1.234,56
```

### Exemplos Práticos de Formatação Numérica

```java
public class ExemploFormatacaoNumeros {
    public static void main(String[] args) {
        // IDs com zeros à esquerda
        int id1 = 1;
        int id2 = 42;
        int id3 = 123;
        
        System.out.printf("ID: %03d%n", id1);   // ID: 001
        System.out.printf("ID: %03d%n", id2);   // ID: 042
        System.out.printf("ID: %03d%n", id3);   // ID: 123
        
        // Tabela formatada
        System.out.println("\nTabela de Preços:");
        System.out.printf("%-15s %10s%n", "Produto", "Preço");
        System.out.println("-".repeat(27));
        System.out.printf("%-15s %10.2f%n", "Notebook", 2599.99);
        System.out.printf("%-15s %10.2f%n", "Mouse", 45.50);
        System.out.printf("%-15s %10.2f%n", "Teclado", 120.00);
        
        // Saída:
        // Tabela de Preços:
        // Produto          Preço
        // ---------------------------
        // Notebook        2599.99
        // Mouse             45.50
        // Teclado          120.00
    }
}
```

---

## 📄 Formatadores de Texto

### Strings (`%s`)

#### Formatação Básica

```java
String nome = "Java";
System.out.printf("Linguagem: %s%n", nome);     // Linguagem: Java
```

#### Limitação de Tamanho

```java
String texto = "Programação";

System.out.printf("%.5s%n", texto);             // Progr (apenas 5 caracteres)
System.out.printf("%.8s%n", texto);             // Programa (apenas 8 caracteres)
```

#### Padding e Alinhamento

```java
String nome = "Java";

System.out.printf("[%10s]%n", nome);            // [      Java] (alinhado à direita)
System.out.printf("[%-10s]%n", nome);           // [Java      ] (alinhado à esquerda)
System.out.printf("[%10.5s]%n", "Programação"); // [     Progr] (10 espaços, max 5 chars)
```

#### Conversão para Maiúsculas/Minúsculas

```java
String texto = "Java";

System.out.printf("%S%n", texto);               // JAVA (maiúsculas)
System.out.printf("%s%n", texto.toLowerCase()); // java (minúsculas)
```

### Caracteres (`%c`)

```java
char letra = 'A';
System.out.printf("Letra: %c%n", letra);        // Letra: A
System.out.printf("Código: %d%n", (int) letra); // Código: 65
```

### Booleanos (`%b` ou `%B`)

```java
boolean ativo = true;
boolean inativo = false;

System.out.printf("Status: %b%n", ativo);       // Status: true
System.out.printf("Status: %B%n", inativo);     // Status: FALSE (maiúsculas)
System.out.printf("Status: %b%n", null);        // Status: false (null vira false)
```

---

## 📐 Alinhamento e Padding

### Sintaxe Geral

```
%[flags][width][.precision]conversão
```

- **flags**: `-` (alinhar à esquerda), `0` (preencher com zeros)
- **width**: Largura mínima do campo
- **precision**: Precisão (casas decimais ou caracteres máximos)
- **conversão**: Tipo de dado (`d`, `f`, `s`, etc.)

### Exemplos de Alinhamento

```java
// Alinhamento à direita (padrão)
System.out.printf("[%10s]%n", "Java");          // [      Java]

// Alinhamento à esquerda
System.out.printf("[%-10s]%n", "Java");         // [Java      ]

// Números com padding de zeros
System.out.printf("[%05d]%n", 42);              // [00042]

// Decimais com padding
System.out.printf("[%10.2f]%n", 123.45);        // [    123.45]
System.out.printf("[%-10.2f]%n", 123.45);       // [123.45    ]
System.out.printf("[%010.2f]%n", 123.45);       // [0000123.45]
```

### Criando Tabelas Formatadas

```java
public class ExemploTabela {
    public static void main(String[] args) {
        System.out.println("Tabela de Produtos");
        System.out.println("=".repeat(50));
        System.out.printf("%-15s %10s %10s%n", "Produto", "Quantidade", "Preço");
        System.out.println("-".repeat(50));
        System.out.printf("%-15s %10d %10.2f%n", "Notebook", 5, 2599.99);
        System.out.printf("%-15s %10d %10.2f%n", "Mouse", 20, 45.50);
        System.out.printf("%-15s %10d %10.2f%n", "Teclado", 15, 120.00);
        System.out.println("=".repeat(50));
        System.out.printf("%-15s %10s %10.2f%n", "TOTAL", "", 13999.75);
        
        // Saída:
        // Tabela de Produtos
        // ==================================================
        // Produto         Quantidade      Preço
        // --------------------------------------------------
        // Notebook                5    2599.99
        // Mouse                  20      45.50
        // Teclado                15     120.00
        // ==================================================
        // TOTAL                             13999.75
    }
}
```

---

## 📅 Formatação de Datas

Para formatação de datas, é necessário usar a classe `SimpleDateFormat` ou as classes do pacote `java.time` (Java 8+).

### Usando SimpleDateFormat (Java 7 e anteriores)

```java
import java.text.SimpleDateFormat;
import java.util.Date;

Date agora = new Date();
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
String dataFormatada = formato.format(agora);
System.out.println(dataFormatada);  // 15/03/2024 14:30:45
```

### Usando java.time (Java 8+) ⭐ **Recomendado**

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

LocalDateTime agora = LocalDateTime.now();

// Formatadores predefinidos
DateTimeFormatter formato1 = DateTimeFormatter.ISO_LOCAL_DATE;
System.out.println(agora.format(formato1));  // 2024-03-15

// Formatador customizado
DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
System.out.println(agora.format(formato2));  // 15/03/2024 14:30:45

// Padrões comuns
DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println(agora.format(formato3));  // 15/03/2024

DateTimeFormatter formato4 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
System.out.println(agora.format(formato4));  // sexta-feira, 15 de março de 2024
```

### Símbolos de Formatação de Data

| Símbolo | Significado | Exemplo |
|---------|-------------|---------|
| `yyyy` | Ano (4 dígitos) | 2024 |
| `MM` | Mês (2 dígitos) | 03 |
| `dd` | Dia (2 dígitos) | 15 |
| `HH` | Hora (24h, 2 dígitos) | 14 |
| `mm` | Minuto (2 dígitos) | 30 |
| `ss` | Segundo (2 dígitos) | 45 |
| `EEEE` | Dia da semana completo | sexta-feira |
| `MMMM` | Mês completo | março |

### Exemplos de Formatos de Data

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

LocalDateTime data = LocalDateTime.of(2024, 3, 15, 14, 30, 45);

System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));          
// 15/03/2024

System.out.println(data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); 
// 2024-03-15 14:30:45

System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm"))); 
// 15/03/2024 às 14:30

System.out.println(data.format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy"))); 
// sexta-feira, 15 de março de 2024
```

---

## 🌍 Locale e Internacionalização

O `Locale` permite formatar números, datas e moedas de acordo com diferentes países/regiões.

### Locales Comuns

```java
import java.util.Locale;

Locale brasil = Locale.forLanguageTag("pt-BR");
Locale usa = Locale.US;
Locale alemanha = Locale.GERMANY;
Locale franca = Locale.FRANCE;
```

### Formatação de Números com Locale

```java
import java.util.Locale;

double valor = 1234567.89;

System.out.printf(Locale.US, "%,.2f%n", valor);      // 1,234,567.89
System.out.printf(Locale.GERMANY, "%,.2f%n", valor); // 1.234.567,89
System.out.printf(Locale.FRANCE, "%,.2f%n", valor);  // 1 234 567,89
System.out.printf(Locale.forLanguageTag("pt-BR"), "%,.2f%n", valor); // 1.234.567,89
```

### Formatação de Moeda com Locale

```java
import java.text.NumberFormat;
import java.util.Locale;

double valor = 1234.56;

NumberFormat formatoUS = NumberFormat.getCurrencyInstance(Locale.US);
System.out.println(formatoUS.format(valor));  // $1,234.56

NumberFormat formatoBR = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
System.out.println(formatoBR.format(valor));  // R$ 1.234,56

NumberFormat formatoEU = NumberFormat.getCurrencyInstance(Locale.GERMANY);
System.out.println(formatoEU.format(valor));  // 1.234,56 €
```

### Formatação de Datas com Locale

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

LocalDateTime data = LocalDateTime.now();

DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", 
                                                          Locale.forLanguageTag("pt-BR"));
System.out.println(data.format(formatoBR));  
// sexta-feira, 15 de março de 2024

DateTimeFormatter formatoUS = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.US);
System.out.println(data.format(formatoUS));  
// Friday, March 15, 2024
```

---

## 🔤 Métodos Úteis da Classe String

Além da formatação com `printf` e `format`, a classe `String` possui vários métodos úteis para manipulação de texto.

### Conversão de Case

```java
String texto = "Java Programming";

System.out.println(texto.toLowerCase());  // java programming
System.out.println(texto.toUpperCase());  // JAVA PROGRAMMING
```

### Remoção de Espaços

```java
String texto = "  Java  ";

System.out.println("[" + texto.trim() + "]");        // [Java] (remove espaços início/fim)
System.out.println("[" + texto.strip() + "]");       // [Java] (Java 11+, remove whitespace Unicode)
System.out.println("[" + texto.stripLeading() + "]"); // [Java  ] (remove espaços início)
System.out.println("[" + texto.stripTrailing() + "]"); // [  Java] (remove espaços fim)
```

### Substituição

```java
String texto = "Java é ótimo";

System.out.println(texto.replace("Java", "Python"));  // Python é ótimo
System.out.println(texto.replaceAll("ó", "o"));       // Java e otimo (regex)
System.out.println(texto.replaceFirst("a", "A"));     // JAva é ótimo (primeira ocorrência)
```

### Verificação e Busca

```java
String texto = "Programação Java";

System.out.println(texto.startsWith("Pro"));     // true
System.out.println(texto.endsWith("Java"));      // true
System.out.println(texto.contains("ama"));       // true
System.out.println(texto.indexOf("Java"));       // 13 (índice onde começa)
System.out.println(texto.lastIndexOf("a"));      // 15 (última ocorrência)
```

### Divisão e Junção

```java
String texto = "Java,Python,JavaScript";
String[] linguagens = texto.split(",");
for (String lang : linguagens) {
    System.out.println(lang);
}
// Java
// Python
// JavaScript

// Junção (Java 8+)
String[] palavras = {"Java", "é", "ótimo"};
String frase = String.join(" ", palavras);
System.out.println(frase);  // Java é ótimo
```

### Padding Manual

```java
String texto = "Java";

// Padding à esquerda
System.out.println(String.format("%10s", texto));     // [      Java]

// Padding à direita
System.out.println(String.format("%-10s", texto));    // [Java      ]

// Repetição de caracteres (Java 11+)
System.out.println("=".repeat(20));  // ====================
```

### Comparação

```java
String texto1 = "Java";
String texto2 = "java";

System.out.println(texto1.equals(texto2));           // false
System.out.println(texto1.equalsIgnoreCase(texto2)); // true
System.out.println(texto1.compareTo(texto2));        // -32 (diferente)
System.out.println(texto1.compareToIgnoreCase(texto2)); // 0 (igual)
```

---

## 💡 Exemplos Práticos

### Exemplo 1: Relatório de Vendas

```java
public class RelatorioVendas {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.printf("%35s%n", "RELATÓRIO DE VENDAS");
        System.out.println("=".repeat(60));
        System.out.printf("%-20s %15s %15s%n", "Produto", "Quantidade", "Total");
        System.out.println("-".repeat(60));
        
        System.out.printf("%-20s %15d %15.2f%n", "Notebook", 5, 12999.95);
        System.out.printf("%-20s %15d %15.2f%n", "Mouse", 20, 910.00);
        System.out.printf("%-20s %15d %15.2f%n", "Teclado", 15, 1800.00);
        
        System.out.println("-".repeat(60));
        System.out.printf("%-20s %15s %15.2f%n", "TOTAL", "", 15709.95);
        System.out.println("=".repeat(60));
    }
}
```

### Exemplo 2: Formatação de Receita

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ReceitaFormatada {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern(
            "dd 'de' MMMM 'de' yyyy", Locale.forLanguageTag("pt-BR")
        );
        
        String cliente = "Carlos Silva";
        double valor = 1234.56;
        int numeroPedido = 12345;
        
        System.out.println("=".repeat(50));
        System.out.printf("%30s%n", "RECIBO");
        System.out.println("=".repeat(50));
        System.out.printf("Cliente: %s%n", cliente);
        System.out.printf("Data: %s%n", data.format(formatoData));
        System.out.printf("Pedido: %05d%n", numeroPedido);
        System.out.println("-".repeat(50));
        System.out.printf("Valor Total: R$ %,.2f%n", valor);
        System.out.println("=".repeat(50));
    }
}
```

### Exemplo 3: Tabela de Dados Formatada

```java
public class TabelaDados {
    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(70));
        System.out.printf("%-5s %-20s %-15s %-15s %-10s%n", 
                         "ID", "Nome", "Idade", "Salário", "Ativo");
        System.out.println("-".repeat(70));
        
        System.out.printf("%-5d %-20s %-15d %-15.2f %-10s%n", 
                         1, "João Silva", 30, 3500.00, "Sim");
        System.out.printf("%-5d %-20s %-15d %-15.2f %-10s%n", 
                         2, "Maria Santos", 25, 4200.50, "Sim");
        System.out.printf("%-5d %-20s %-15d %-15.2f %-10s%n", 
                         3, "Pedro Costa", 35, 2800.75, "Não");
        
        System.out.println("=".repeat(70));
    }
}
```

### Exemplo 4: Formatação de Logs

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFormatado {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        String nivel = "INFO";
        String mensagem = "Usuário logado com sucesso";
        String usuario = "admin";
        
        System.out.printf("[%s] [%s] %s - Usuário: %s%n", 
                         agora.format(formatoHora), nivel, mensagem, usuario);
        // Saída: [14:30:45] [INFO] Usuário logado com sucesso - Usuário: admin
    }
}
```

---

## ⚠️ Armadilhas Comuns

### 1. Ordem dos Argumentos

Os argumentos devem estar na mesma ordem dos especificadores:

```java
// ❌ ERRADO
String nome = "João";
int idade = 25;
System.out.printf("Idade: %d, Nome: %s%n", nome, idade);  // Erro!

// ✅ CORRETO
System.out.printf("Idade: %d, Nome: %s%n", idade, nome);
```

### 2. Tipo de Dado Incorreto

```java
// ❌ ERRADO
double valor = 29.99;
System.out.printf("Preço: %d%n", valor);  // Erro! %d espera int

// ✅ CORRETO
System.out.printf("Preço: %.2f%n", valor);
```

### 3. Escape de Caracteres Especiais

```java
// Para imprimir % literal, use %%
System.out.printf("Desconto: 10%%%n");  // ✅ Desconto: 10%
// System.out.printf("Desconto: 10%%n");  // ❌ Erro!
```

### 4. Locale em Formatação de Números

```java
// Sem locale, usa o padrão do sistema
double valor = 1234.56;
System.out.printf("%.2f%n", valor);  // Pode variar: 1234.56 ou 1234,56

// Com locale explícito, garante consistência
System.out.printf(Locale.US, "%.2f%n", valor);  // Sempre 1234.56
```

---

## 📋 Resumo dos Especificadores

### Especificadores Principais

| Especificador | Tipo | Exemplo |
|---------------|------|---------|
| `%s` | String | `"Java"` |
| `%d` | int, long | `42` |
| `%f` | float, double | `3.14` |
| `%c` | char | `'A'` |
| `%b` | boolean | `true` |
| `%e` / `%E` | Notação científica | `1.23e+02` |
| `%g` / `%G` | Notação condicional | `123` ou `1.23e+02` |
| `%n` | Quebra de linha | - |
| `%%` | % literal | `%` |

### Flags Comuns

| Flag | Significado | Exemplo |
|------|-------------|---------|
| `-` | Alinhar à esquerda | `%-10s` |
| `0` | Preencher com zeros | `%05d` |
| `,` | Separador de milhares | `%,d` |
| `+` | Mostrar sinal sempre | `%+d` |
| ` ` (espaço) | Espaço antes de positivo | `% d` |
| `(` | Números negativos entre parênteses | `%(d` |

### Sintaxe Completa

```
%[argument_index$][flags][width][.precision]conversion
```

**Exemplo completo:**

```java
System.out.printf("%2$d é maior que %1$d%n", 5, 10);  
// 10 é maior que 5 (argument_index: 2$ e 1$)
```

---

## 🎯 Boas Práticas

### ✅ Recomendações

1. **Use `String.format()` quando precisar reutilizar a string formatada**
2. **Use `System.out.printf()` para saída direta no console**
3. **Sempre especifique o Locale para formatação de números e moedas**
4. **Use precisão adequada para decimais** (`.2f` para moedas, por exemplo)
5. **Use padding consistente** para criar tabelas alinhadas
6. **Prefira `%n` em vez de `\n`** para quebras de linha (plataforma independente)

### ❌ Evite

1. Misturar tipos de dados com especificadores incorretos
2. Esquecer o Locale em aplicações internacionais
3. Usar formatação complexa quando concatenação simples é suficiente
4. Esquecer de escapar `%` quando necessário (`%%`)

---

## 📚 Exercícios Sugeridos

1. Criar um relatório de vendas formatado em tabela
2. Formatar um recibo com data, valores e informações do cliente
3. Criar uma função que formate números de telefone
4. Implementar formatação de CPF/CNPJ com máscara
5. Criar um sistema de logs com timestamp formatado
6. Formatar dados de uma lista de produtos em colunas alinhadas

