# Documentação Java - Tipos Primitivos

## 📌 Índice
- [O que são Tipos Primitivos?](#o-que-são-tipos-primitivos)
- [Os 8 Tipos Primitivos](#os-8-tipos-primitivos)
- [Valores Padrão](#valores-padrão)
- [Classes Wrapper](#classes-wrapper)
- [Conversão de Tipos](#conversão-de-tipos)
- [Resumo Comparativo](#resumo-comparativo)

---

## 🔍 O que são Tipos Primitivos?

Tipos primitivos são tipos de dados básicos fornecidos pela linguagem Java. Eles representam valores simples e são armazenados diretamente na memória.

**Características:**
- São tipos de dados **primitivos** (não são objetos)
- Começam com **letra minúscula**
- Têm valores padrão quando declarados como variáveis de instância
- São mais eficientes em memória e performance
- Não podem ser `null` (exceto quando envolvidos por Wrapper classes)

---

## 🔢 Os 8 Tipos Primitivos

Java possui exatamente **8 tipos primitivos**, divididos em 4 categorias:

### 1️⃣ Tipos Numéricos Inteiros

#### `byte` - 8 bits
```java
byte valor = 127;           // Vai de -128 até 127
byte min = -128;
byte max = 127;
```
- **Tamanho**: 8 bits (1 byte)
- **Faixa**: -128 a 127
- **Uso**: Economia de memória para valores pequenos

#### `short` - 16 bits
```java
short valor = 32767;        // Vai de -32.768 até 32.767
short min = -32768;
short max = 32767;
```
- **Tamanho**: 16 bits (2 bytes)
- **Faixa**: -32.768 a 32.767
- **Uso**: Valores inteiros médios

#### `int` - 32 bits ⭐ **Mais usado**
```java
int valor = 2147483647;     // Vai de -2.147.483.648 até 2.147.483.647
int min = -2147483648;
int max = 2147483647;
int numero = 42;            // Mais comum
```
- **Tamanho**: 32 bits (4 bytes)
- **Faixa**: -2.147.483.648 a 2.147.483.647
- **Uso**: ⭐ **Tipo padrão para números inteiros**
- **Literal padrão**: Números sem sufixo são tratados como `int`

#### `long` - 64 bits
```java
long valor = 9223372036854775807L;  // Precisa do sufixo 'L' ou 'l'
long min = -9223372036854775808L;
long max = 9223372036854775807L;
long numero = 1234567890L;          // Note o 'L' no final
```
- **Tamanho**: 64 bits (8 bytes)
- **Faixa**: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
- **Uso**: Números inteiros muito grandes
- **Literal**: Deve terminar com `L` ou `l` (prefira `L` maiúsculo)

---

### 2️⃣ Tipos Numéricos de Ponto Flutuante

#### `float` - 32 bits
```java
float valor = 3.14f;        // Precisa do sufixo 'f' ou 'F'
float altura = 1.75f;
float precisao = 3.14159F;
```
- **Tamanho**: 32 bits (4 bytes)
- **Precisão**: ~7 dígitos decimais
- **Faixa**: ±3.40282347E+38F
- **Uso**: Quando precisa economizar memória
- **Literal**: Deve terminar com `f` ou `F`

#### `double` - 64 bits ⭐ **Mais usado**
```java
double valor = 3.14;        // Sem sufixo é double por padrão
double preco = 29.99;
double pi = 3.141592653589793;
double cientifico = 1.5e10; // Notação científica: 15000000000.0
```
- **Tamanho**: 64 bits (8 bytes)
- **Precisão**: ~15 dígitos decimais
- **Faixa**: ±1.79769313486231570E+308
- **Uso**: ⭐ **Tipo padrão para números decimais**
- **Literal padrão**: Números decimais sem sufixo são tratados como `double`

---

### 3️⃣ Tipo de Caractere

#### `char` - 16 bits
```java
char letra = 'A';           // Aspas simples
char numero = '5';
char simbolo = '@';
char unicode = '\u0041';    // Unicode: 'A'
char escape = '\n';         // Caractere de escape: quebra de linha
```
- **Tamanho**: 16 bits (2 bytes)
- **Faixa**: 0 a 65.535 (caracteres Unicode)
- **Uso**: Armazenar um único caractere
- **Literal**: Deve estar entre **aspas simples** `' '`
- **Caracteres de escape**: `\n` (nova linha), `\t` (tab), `\\` (barra), etc.

**Caracteres de Escape Comuns:**
```java
char novaLinha = '\n';      // Nova linha
char tab = '\t';            // Tabulação
char barra = '\\';          // Barra invertida
char aspasSimples = '\'';   // Aspas simples
char aspasDuplas = '"';     // Aspas duplas (sem escape)
```

---

### 4️⃣ Tipo Booleano

#### `boolean` - 1 bit
```java
boolean verdadeiro = true;
boolean falso = false;
boolean ativo = true;
boolean desligado = false;
```
- **Tamanho**: Teoricamente 1 bit, mas na prática JVM usa mais
- **Valores**: Apenas `true` ou `false`
- **Uso**: Expressões lógicas e condições
- **Literal**: Apenas as palavras-chave `true` e `false` (não são strings!)

⚠️ **Importante**: `boolean` não pode ser convertido para números (0/1) como em outras linguagens.

---

## 📊 Tabela Resumo dos Tipos Primitivos

| Tipo | Tamanho | Faixa/Valores | Valor Padrão | Exemplo |
|------|---------|---------------|--------------|---------|
| `byte` | 8 bits | -128 a 127 | `0` | `byte b = 100;` |
| `short` | 16 bits | -32.768 a 32.767 | `0` | `short s = 1000;` |
| `int` | 32 bits | -2.147.483.648 a 2.147.483.647 | `0` | `int i = 100000;` |
| `long` | 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | `0L` | `long l = 1000000L;` |
| `float` | 32 bits | ±3.4E+38 (~7 dígitos) | `0.0f` | `float f = 3.14f;` |
| `double` | 64 bits | ±1.7E+308 (~15 dígitos) | `0.0d` | `double d = 3.14;` |
| `char` | 16 bits | 0 a 65.535 (Unicode) | `'\u0000'` | `char c = 'A';` |
| `boolean` | 1 bit* | `true` ou `false` | `false` | `boolean b = true;` |

*Na prática, o JVM pode usar mais espaço para boolean.

---

## 🔧 Valores Padrão

Quando tipos primitivos são declarados como variáveis de **instância** ou **estáticas**, recebem valores padrão automáticos:

```java
public class ExemploValoresPadrao {
    // Variáveis de instância - recebem valores padrão
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    
    public void mostrarValoresPadrao() {
        System.out.println("byte: " + b);       // 0
        System.out.println("short: " + s);      // 0
        System.out.println("int: " + i);        // 0
        System.out.println("long: " + l);       // 0
        System.out.println("float: " + f);      // 0.0
        System.out.println("double: " + d);     // 0.0
        System.out.println("char: " + c);       // '\u0000' (caractere nulo)
        System.out.println("boolean: " + bool); // false
    }
}
```

⚠️ **IMPORTANTE**: Variáveis **locais** (dentro de métodos) **NÃO** recebem valores padrão e devem ser inicializadas antes do uso:

```java
public void exemplo() {
    int x;           // Variável local
    // System.out.println(x);  // ❌ ERRO! Variável não inicializada
    
    int y = 10;      // ✅ Correto: inicializada
    System.out.println(y);
}
```

---

## 📦 Classes Wrapper

Cada tipo primitivo tem uma **classe wrapper** correspondente que permite trabalhar com eles como objetos:

| Primitivo | Wrapper Class |
|-----------|---------------|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

### Uso das Wrapper Classes

```java
// Autoboxing: primitivo → objeto (automático)
int primitivo = 42;
Integer objeto = primitivo;  // Autoboxing

// Unboxing: objeto → primitivo (automático)
Integer objeto2 = 100;
int primitivo2 = objeto2;    // Unboxing

// Valores nulos são possíveis com Wrappers
Integer numero = null;       // ✅ Possível
// int numero2 = null;       // ❌ ERRO! Primitivos não podem ser null

// Métodos úteis das Wrapper classes
int valor = Integer.parseInt("123");        // Converte String para int
String texto = Integer.toString(456);       // Converte int para String
int max = Integer.MAX_VALUE;                // Valor máximo
int min = Integer.MIN_VALUE;                // Valor mínimo
```

### Quando Usar Wrappers?

**Use Wrapper Classes quando:**
- Precisar de valores `null`
- Trabalhar com Collections (List, Set, Map)
- Usar métodos utilitários (parseInt, toString, etc.)

**Use Tipos Primitivos quando:**
- Performance é crítica
- Não precisa de `null`
- Operações matemáticas simples

---

## 🔄 Conversão de Tipos

### Conversão Automática (Widening - Alargamento)

Conversões que ocorrem automaticamente quando o tipo destino é maior:

```java
// Ordem de alargamento: byte → short → int → long → float → double
byte b = 100;
short s = b;        // ✅ Automático
int i = s;          // ✅ Automático
long l = i;         // ✅ Automático
float f = l;        // ✅ Automático
double d = f;       // ✅ Automático

// char pode ser convertido para int, long, float, double
char c = 'A';
int i2 = c;         // ✅ 'A' = 65 em ASCII/Unicode
```

### Conversão Manual (Narrowing - Estreitamento)

Conversões que requerem **cast explícito** quando o tipo destino é menor:

```java
int i = 1000;
byte b = (byte) i;      // ✅ Cast explícito necessário
short s = (short) i;    // ✅ Cast explícito necessário

double d = 3.14;
int i2 = (int) d;       // ✅ i2 = 3 (perde a parte decimal)
float f = (float) d;    // ✅ Cast explícito

// ⚠️ CUIDADO: Pode haver perda de dados
int grande = 100000;
short pequeno = (short) grande;  // Pode não caber em short!
System.out.println(pequeno);     // Valor truncado/incorreto
```

### Conversão entre Tipos Numéricos e `char`

```java
// char → int (automático)
char letra = 'A';
int codigo = letra;         // codigo = 65

// int → char (cast necessário)
int numero = 65;
char caractere = (char) numero;  // caractere = 'A'

// Exemplos práticos
System.out.println((char) 97);   // Imprime 'a'
System.out.println((int) 'B');   // Imprime 66
```

### Conversão com `String`

```java
// String → Primitivo (usando Wrapper classes)
String texto = "123";
int numero = Integer.parseInt(texto);        // 123
double decimal = Double.parseDouble("3.14"); // 3.14
boolean valor = Boolean.parseBoolean("true"); // true

// Primitivo → String
int x = 42;
String str1 = String.valueOf(x);    // "42"
String str2 = Integer.toString(x);  // "42"
String str3 = "" + x;               // "42" (concatenação)

// ⚠️ CUIDADO com conversões inválidas
// int erro = Integer.parseInt("abc");  // ❌ NumberFormatException
```

---

## 💡 Exemplos Práticos

### Exemplo 1: Declaração e Inicialização

```java
public class ExemploTiposPrimitivos {
    public static void main(String[] args) {
        // Tipos inteiros
        byte idade = 25;
        short ano = 2024;
        int populacao = 210000000;
        long distancia = 15000000000L;
        
        // Tipos decimais
        float altura = 1.75f;
        double preco = 29.99;
        
        // Caractere
        char inicial = 'C';
        
        // Booleano
        boolean ativo = true;
        
        // Impressão
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ativo: " + ativo);
    }
}
```

### Exemplo 2: Conversões e Operações

```java
public class ExemploConversoes {
    public static void main(String[] args) {
        // Conversão automática
        byte b = 100;
        int i = b;              // Automático
        
        // Conversão manual (cast)
        int grande = 1000;
        byte pequeno = (byte) grande;  // Cast necessário
        
        // Conversão com Strings
        String texto = "42";
        int numero = Integer.parseInt(texto);
        String resultado = String.valueOf(numero * 2);
        
        System.out.println("Número: " + numero);        // 42
        System.out.println("Resultado: " + resultado);  // 84
    }
}
```

### Exemplo 3: Uso de Wrapper Classes

```java
import java.util.ArrayList;
import java.util.List;

public class ExemploWrappers {
    public static void main(String[] args) {
        // Collections só aceitam objetos (não primitivos)
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);        // Autoboxing automático
        numeros.add(20);
        numeros.add(null);      // ✅ Possível com Wrapper
        
        // Unboxing automático
        int primeiro = numeros.get(0);  // 10
        
        // Métodos úteis
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        String binario = Integer.toBinaryString(10);  // "1010"
        
        System.out.println("Máximo: " + max);
        System.out.println("Binário de 10: " + binario);
    }
}
```

---

## ⚠️ Armadilhas Comuns

### 1. Divisão Inteira
```java
// ❌ ERRADO - divisão inteira
int resultado = 10 / 3;        // resultado = 3 (não 3.33)

// ✅ CORRETO - divisão decimal
double resultado = 10.0 / 3.0; // resultado = 3.333...
```

### 2. Overflow de Tipos
```java
// ⚠️ CUIDADO com overflow
int max = Integer.MAX_VALUE;
int overflow = max + 1;        // Vira negativo! (-2147483648)
System.out.println(overflow);  // -2147483648
```

### 3. Comparação de `char`
```java
char a = '5';
int b = 5;

// ❌ ERRADO
// if (a == b) { }  // Compara '5' (Unicode 53) com 5

// ✅ CORRETO
if (Character.getNumericValue(a) == b) { }
```

### 4. Literais Decimais
```java
// ❌ ERRO - literal decimal sem sufixo é double
// float altura = 1.75;

// ✅ CORRETO
float altura = 1.75f;
double preco = 1.75;  // double por padrão
```

### 5. Comparação com `==` em Wrappers
```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b);  // true (cache de -128 a 127)

Integer c = 200;
Integer d = 200;
System.out.println(c == d);  // false (não está em cache)

// ✅ Use .equals() para comparar Wrappers
System.out.println(c.equals(d));  // true
```

---

## 📋 Resumo Comparativo

### Quando Usar Cada Tipo?

| Situação | Tipo Recomendado | Motivo |
|----------|------------------|--------|
| Números inteiros gerais | `int` | Padrão, mais usado |
| Números muito grandes | `long` | Faixa maior |
| Economia de memória | `byte`, `short` | Menos espaço |
| Números decimais gerais | `double` | Maior precisão |
| Economia com decimais | `float` | Menos memória |
| Caractere único | `char` | Tipo específico |
| Valores lógicos | `boolean` | Único tipo booleano |
| Valores que podem ser null | Wrapper classes | Permitem null |
| Collections (List, Set, Map) | Wrapper classes | Exigido pela API |

---

## 🎯 Boas Práticas

### ✅ Recomendações

1. **Use `int` para inteiros** (a menos que precise de `long`)
2. **Use `double` para decimais** (a menos que precise economizar memória)
3. **Inicialize variáveis locais** antes de usar
4. **Use cast explícito** quando necessário para clareza
5. **Use `.equals()`** para comparar Wrapper classes
6. **Seja cuidadoso com overflow** em operações matemáticas

### ❌ Evite

1. Usar tipos menores (`byte`, `short`) sem necessidade real
2. Comparar Wrappers com `==` (use `.equals()`)
3. Esquecer sufixos em literais (`f` para float, `L` para long)
4. Usar `float` quando `double` é necessário
5. Conversões sem verificação (pode causar perda de dados)

---

## 📚 Exercícios Sugeridos

1. Criar variáveis de todos os tipos primitivos e imprimir seus valores
2. Realizar conversões entre diferentes tipos numéricos
3. Trabalhar com conversões entre `String` e tipos primitivos
4. Comparar o uso de primitivos vs Wrapper classes
5. Calcular limites e overflow de cada tipo numérico

