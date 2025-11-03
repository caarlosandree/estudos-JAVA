# Documentação Java - Casting

## 📌 Índice
- [O que é Casting?](#o-que-é-casting)
- [Tipos de Casting](#tipos-de-casting)
- [Casting entre Tipos Primitivos](#casting-entre-tipos-primitivos)
- [Casting com Classes Wrapper](#casting-com-classes-wrapper)
- [Casting entre Tipos de Referência](#casting-entre-tipos-de-referência)
- [Tabela Completa de Casting](#tabela-completa-de-casting)
- [Exemplos Práticos](#exemplos-práticos)
- [Armadilhas e Cuidados](#armadilhas-e-cuidados)

---

## 🔍 O que é Casting?

**Casting** (ou conversão de tipos) é o processo de converter um valor de um tipo de dado para outro tipo. Em Java, existem dois tipos principais de casting:

1. **Casting Implícito (Widening)** - Conversão automática
2. **Casting Explícito (Narrowing)** - Conversão manual com cast explícito

### Sintaxe do Cast Explícito

```java
(tipoDestino) valor
```

**Exemplo:**
```java
double valor = 3.14;
int inteiro = (int) valor;  // Cast explícito: 3.14 → 3
```

---

## 🎯 Tipos de Casting

### 1. Casting Implícito (Widening - Alargamento)

Conversões que ocorrem **automaticamente** quando o tipo destino pode representar todos os valores do tipo origem sem perda de informação.

**Regra:** O tipo destino deve ser **maior** ou **igual** em capacidade ao tipo origem.

```java
// byte → short → int → long → float → double
byte b = 100;
short s = b;        // ✅ Automático
int i = s;          // ✅ Automático
long l = i;         // ✅ Automático
float f = l;        // ✅ Automático
double d = f;       // ✅ Automático

// char → int → long → float → double
char c = 'A';
int i2 = c;         // ✅ Automático (c = 65 em Unicode)
```

**Características:**
- ✅ Não requer cast explícito
- ✅ Seguro (sem perda de dados)
- ✅ Ocorre automaticamente

### 2. Casting Explícito (Narrowing - Estreitamento)

Conversões que **requerem cast explícito** porque podem resultar em perda de dados ou valores incorretos.

**Regra:** O tipo destino é **menor** em capacidade que o tipo origem.

```java
int i = 1000;
byte b = (byte) i;      // ✅ Cast explícito necessário
short s = (short) i;    // ✅ Cast explícito necessário

double d = 3.14;
int i2 = (int) d;       // ✅ Cast explícito: 3.14 → 3 (perde parte decimal)
float f = (float) d;    // ✅ Cast explícito
```

**Características:**
- ⚠️ Requer cast explícito `(tipo)`
- ⚠️ Pode causar perda de dados
- ⚠️ Pode causar overflow/underflow
- ⚠️ Deve ser usado com cuidado

---

## 🔢 Casting entre Tipos Primitivos

### Ordem de Alargamento (Widening)

```
byte → short → int → long → float → double
  ↓
char → int → long → float → double
```

### Conversões Automáticas (Sem Cast)

```java
// Inteiros: byte → short → int → long
byte b = 100;
short s = b;    // ✅ Automático
int i = s;      // ✅ Automático
long l = i;     // ✅ Automático

// Decimais: float → double
float f = 3.14f;
double d = f;   // ✅ Automático

// Inteiros → Decimais: int → float/double
int i = 100;
float f2 = i;   // ✅ Automático
double d2 = i;  // ✅ Automático

// char → int
char c = 'A';
int i3 = c;     // ✅ Automático (c = 65)
```

### Conversões que Requerem Cast Explícito

```java
// Decimais → Inteiros
double d = 3.14;
int i = (int) d;        // 3 (perde parte decimal)
long l = (long) d;      // 3

// Tipos maiores → menores
int i = 1000;
byte b = (byte) i;      // ⚠️ Pode não caber!
short s = (short) i;    // ⚠️ Pode não caber!

// long → float/double (pode perder precisão)
long l = 9223372036854775807L;
float f = (float) l;    // ⚠️ Pode perder precisão

// int → char
int i = 65;
char c = (char) i;      // 'A'

// char → byte/short
char c = 'A';
byte b = (byte) c;      // 65
short s = (short) c;    // 65
```

### Exemplos de Perda de Dados

```java
// Perda de precisão decimal
double d = 3.99;
int i = (int) d;        // i = 3 (perde 0.99)

// Overflow/Underflow
int grande = 100000;
short pequeno = (short) grande;  // Valor truncado/incorreto
System.out.println(pequeno);     // -31072 (overflow!)

// Precisão de float
long l = 9223372036854775807L;
float f = (float) l;    // Pode perder precisão
System.out.println(f);  // 9.223372E18 (aproximação)
```

---

## 📦 Casting com Classes Wrapper

### Autoboxing e Unboxing

Java faz conversão automática entre primitivos e suas Wrapper classes:

```java
// Autoboxing: primitivo → Wrapper (automático)
int primitivo = 42;
Integer wrapper = primitivo;  // ✅ Automático

// Unboxing: Wrapper → primitivo (automático)
Integer wrapper2 = 100;
int primitivo2 = wrapper2;    // ✅ Automático
```

### Casting Explícito entre Wrappers

```java
// Conversão entre diferentes Wrappers requer cast explícito
Double d = 3.14;
Integer i = (int) (double) d;  // Cast duplo necessário

// Ou use métodos de conversão
Double d2 = 3.14;
Integer i2 = d2.intValue();    // ✅ Usando método
```

### Métodos de Conversão Úteis

```java
Integer i = 42;

// Conversão para outros tipos
double d = i.doubleValue();    // 42.0
float f = i.floatValue();      // 42.0f
long l = i.longValue();        // 42L
short s = i.shortValue();      // 42
byte b = i.byteValue();        // 42

// Conversão de String
String str = "123";
int num = Integer.parseInt(str);      // 123
double d2 = Double.parseDouble(str);  // 123.0

// Conversão para String
int num2 = 456;
String str2 = String.valueOf(num2);   // "456"
String str3 = Integer.toString(num2); // "456"
```

---

## 🔗 Casting entre Tipos de Referência

### Casting com Herança

```java
// Hierarquia de classes
class Animal { }
class Cachorro extends Animal { }
class Gato extends Animal { }

// Casting implícito (upcasting)
Cachorro cachorro = new Cachorro();
Animal animal = cachorro;  // ✅ Automático (upcasting)

// Casting explícito (downcasting)
Animal animal2 = new Cachorro();
Cachorro cachorro2 = (Cachorro) animal2;  // ✅ Cast explícito necessário

// ⚠️ ERRO: ClassCastException
Animal animal3 = new Gato();
// Cachorro cachorro3 = (Cachorro) animal3;  // ❌ ClassCastException!
```

### Verificação com instanceof

```java
Animal animal = new Cachorro();

// Verificar antes de fazer cast
if (animal instanceof Cachorro) {
    Cachorro cachorro = (Cachorro) animal;  // ✅ Seguro
    cachorro.latir();
}
```

### Casting com Interfaces

```java
interface Voavel {
    void voar();
}

class Passaro implements Voavel {
    public void voar() {
        System.out.println("Voando...");
    }
}

Voavel voavel = new Passaro();  // ✅ Upcasting implícito
Passaro passaro = (Passaro) voavel;  // ✅ Downcasting explícito
```

---

## 📊 Tabela Completa de Casting

### Tabela de Conversões entre Tipos Primitivos

| Origem → Destino | Tipo | Exemplo | Observações |
|------------------|------|---------|-------------|
| `byte` → `short` | ✅ Automático | `short s = b;` | Sem perda |
| `byte` → `int` | ✅ Automático | `int i = b;` | Sem perda |
| `byte` → `long` | ✅ Automático | `long l = b;` | Sem perda |
| `byte` → `float` | ✅ Automático | `float f = b;` | Sem perda |
| `byte` → `double` | ✅ Automático | `double d = b;` | Sem perda |
| `byte` → `char` | ⚠️ Cast | `char c = (char) b;` | Pode perder sinal |
| `short` → `byte` | ⚠️ Cast | `byte b = (byte) s;` | Pode perder dados |
| `short` → `int` | ✅ Automático | `int i = s;` | Sem perda |
| `short` → `long` | ✅ Automático | `long l = s;` | Sem perda |
| `short` → `float` | ✅ Automático | `float f = s;` | Sem perda |
| `short` → `double` | ✅ Automático | `double d = s;` | Sem perda |
| `short` → `char` | ⚠️ Cast | `char c = (char) s;` | Pode perder sinal |
| `int` → `byte` | ⚠️ Cast | `byte b = (byte) i;` | Pode perder dados |
| `int` → `short` | ⚠️ Cast | `short s = (short) i;` | Pode perder dados |
| `int` → `long` | ✅ Automático | `long l = i;` | Sem perda |
| `int` → `float` | ✅ Automático | `float f = i;` | Pode perder precisão |
| `int` → `double` | ✅ Automático | `double d = i;` | Sem perda |
| `int` → `char` | ⚠️ Cast | `char c = (char) i;` | Conversão Unicode |
| `long` → `byte` | ⚠️ Cast | `byte b = (byte) l;` | Pode perder dados |
| `long` → `short` | ⚠️ Cast | `short s = (short) l;` | Pode perder dados |
| `long` → `int` | ⚠️ Cast | `int i = (int) l;` | Pode perder dados |
| `long` → `float` | ✅ Automático | `float f = l;` | Pode perder precisão |
| `long` → `double` | ✅ Automático | `double d = l;` | Pode perder precisão |
| `long` → `char` | ⚠️ Cast | `char c = (char) l;` | Pode perder dados |
| `float` → `byte` | ⚠️ Cast | `byte b = (byte) f;` | Perde parte decimal |
| `float` → `short` | ⚠️ Cast | `short s = (short) f;` | Perde parte decimal |
| `float` → `int` | ⚠️ Cast | `int i = (int) f;` | Perde parte decimal |
| `float` → `long` | ⚠️ Cast | `long l = (long) f;` | Perde parte decimal |
| `float` → `double` | ✅ Automático | `double d = f;` | Sem perda |
| `float` → `char` | ⚠️ Cast | `char c = (char) f;` | Perde parte decimal |
| `double` → `byte` | ⚠️ Cast | `byte b = (byte) d;` | Perde parte decimal |
| `double` → `short` | ⚠️ Cast | `short s = (short) d;` | Perde parte decimal |
| `double` → `int` | ⚠️ Cast | `int i = (int) d;` | Perde parte decimal |
| `double` → `long` | ⚠️ Cast | `long l = (long) d;` | Perde parte decimal |
| `double` → `float` | ⚠️ Cast | `float f = (float) d;` | Pode perder precisão |
| `double` → `char` | ⚠️ Cast | `char c = (char) d;` | Perde parte decimal |
| `char` → `byte` | ⚠️ Cast | `byte b = (byte) c;` | Conversão direta |
| `char` → `short` | ⚠️ Cast | `short s = (short) c;` | Conversão direta |
| `char` → `int` | ✅ Automático | `int i = c;` | Sem perda (Unicode) |
| `char` → `long` | ✅ Automático | `long l = c;` | Sem perda |
| `char` → `float` | ✅ Automático | `float f = c;` | Sem perda |
| `char` → `double` | ✅ Automático | `double d = c;` | Sem perda |
| `boolean` → qualquer | ❌ Impossível | - | Não pode ser convertido |

### Legenda da Tabela

- ✅ **Automático**: Conversão implícita (widening) - sem cast necessário
- ⚠️ **Cast**: Conversão explícita (narrowing) - requer cast explícito
- ❌ **Impossível**: Conversão não permitida

### Resumo Visual da Hierarquia

```
                    double
                     ↑
                    float
                     ↑
                    long
                     ↑
                    int
           ↑         ↑         ↑
         byte      short      char
         
Regra: Conversões ↑ (para cima) = Automáticas
      Conversões ↓ (para baixo) = Requerem cast
```

### Tabela de Conversões com Wrapper Classes

| Origem → Destino | Tipo | Exemplo |
|------------------|------|---------|
| `int` → `Integer` | ✅ Autoboxing | `Integer i = 42;` |
| `Integer` → `int` | ✅ Unboxing | `int i = integer;` |
| `double` → `Double` | ✅ Autoboxing | `Double d = 3.14;` |
| `Double` → `double` | ✅ Unboxing | `double d = wrapper;` |
| `Integer` → `Double` | ⚠️ Cast | `Double d = (double) i.intValue();` |
| `Double` → `Integer` | ⚠️ Cast | `Integer i = (int) d.doubleValue();` |
| `String` → `int` | Método | `int i = Integer.parseInt(str);` |
| `int` → `String` | Método | `String s = String.valueOf(i);` |

---

## 💡 Exemplos Práticos

### Exemplo 1: Conversões Numéricas

```java
public class ExemploCastingNumerico {
    public static void main(String[] args) {
        // Conversões automáticas
        byte b = 100;
        int i = b;              // ✅ Automático
        long l = i;             // ✅ Automático
        double d = l;           // ✅ Automático
        
        // Conversões com cast
        double pi = 3.14159;
        int inteiro = (int) pi; // 3 (perde parte decimal)
        System.out.println("Pi como inteiro: " + inteiro);
        
        // Cuidado com overflow
        int grande = 100000;
        short pequeno = (short) grande;
        System.out.println("Pequeno: " + pequeno);  // -31072 (overflow!)
    }
}
```

### Exemplo 2: Conversões com Char

```java
public class ExemploCastingChar {
    public static void main(String[] args) {
        // char → int (automático)
        char letra = 'A';
        int codigo = letra;     // 65
        System.out.println("Código de 'A': " + codigo);
        
        // int → char (cast necessário)
        int numero = 65;
        char caractere = (char) numero;  // 'A'
        System.out.println("Caractere do código 65: " + caractere);
        
        // Conversão de dígitos
        char digito = '5';
        int valor = digito - '0';  // 5 (truque comum)
        System.out.println("Valor do dígito '5': " + valor);
    }
}
```

### Exemplo 3: Conversões com Wrappers

```java
public class ExemploCastingWrappers {
    public static void main(String[] args) {
        // Autoboxing
        int primitivo = 42;
        Integer wrapper = primitivo;  // ✅ Automático
        
        // Unboxing
        Integer wrapper2 = 100;
        int primitivo2 = wrapper2;    // ✅ Automático
        
        // Conversão entre Wrappers
        Double d = 3.14;
        Integer i = d.intValue();     // 3 (usa método)
        
        // Conversão de String
        String texto = "123";
        int numero = Integer.parseInt(texto);  // 123
        double decimal = Double.parseDouble(texto);  // 123.0
        
        // Conversão para String
        int num = 456;
        String str = String.valueOf(num);  // "456"
        System.out.println("String: " + str);
    }
}
```

### Exemplo 4: Casting com Herança

```java
// Hierarquia
class Veiculo {
    void mover() {
        System.out.println("Veículo se movendo...");
    }
}

class Carro extends Veiculo {
    void acelerar() {
        System.out.println("Acelerando...");
    }
}

public class ExemploCastingHeranca {
    public static void main(String[] args) {
        // Upcasting (implícito)
        Carro carro = new Carro();
        Veiculo veiculo = carro;  // ✅ Automático
        
        // Downcasting (explícito)
        Veiculo veiculo2 = new Carro();
        if (veiculo2 instanceof Carro) {
            Carro carro2 = (Carro) veiculo2;  // ✅ Cast seguro
            carro2.acelerar();
        }
    }
}
```

### Exemplo 5: Conversão de Tipos em Operações

```java
public class ExemploCastingOperacoes {
    public static void main(String[] args) {
        // Divisão inteira vs decimal
        int a = 10;
        int b = 3;
        int resultadoInteiro = a / b;          // 3
        double resultadoDecimal = (double) a / b;  // 3.333...
        
        System.out.println("Inteiro: " + resultadoInteiro);
        System.out.println("Decimal: " + resultadoDecimal);
        
        // Cast em expressões
        double valor = 10.0;
        int multiplicado = (int) (valor * 2.5);  // 25
        System.out.println("Multiplicado: " + multiplicado);
    }
}
```

---

## ⚠️ Armadilhas e Cuidados

### 1. Overflow/Underflow

```java
// ⚠️ CUIDADO: Overflow
int grande = 100000;
short pequeno = (short) grande;  // Valor incorreto!
System.out.println(pequeno);     // -31072 (não 100000!)

// Solução: Verificar limites
if (grande >= Short.MIN_VALUE && grande <= Short.MAX_VALUE) {
    short seguro = (short) grande;
}
```

### 2. Perda de Precisão Decimal

```java
// ⚠️ CUIDADO: Perda de parte decimal
double d = 3.99;
int i = (int) d;  // 3 (não 4!)
System.out.println(i);  // 3

// Solução: Arredondar se necessário
int arredondado = (int) Math.round(d);  // 4
```

### 3. ClassCastException

```java
// ⚠️ CUIDADO: ClassCastException
Animal animal = new Gato();
// Cachorro c = (Cachorro) animal;  // ❌ ClassCastException!

// Solução: Verificar com instanceof
if (animal instanceof Cachorro) {
    Cachorro c = (Cachorro) animal;
}
```

### 4. Casting de null

```java
// ⚠️ CUIDADO: Casting de null pode causar NullPointerException
Integer wrapper = null;
// int primitivo = wrapper;  // ❌ NullPointerException (unboxing)

// Solução: Verificar null
if (wrapper != null) {
    int primitivo = wrapper;
}
```

### 5. Conversões de String

```java
// ⚠️ CUIDADO: NumberFormatException
String texto = "abc";
// int numero = Integer.parseInt(texto);  // ❌ NumberFormatException!

// Solução: Tratar exceção
try {
    int numero = Integer.parseInt(texto);
} catch (NumberFormatException e) {
    System.out.println("Valor inválido!");
}
```

### 6. Precisão de Float/Double

```java
// ⚠️ CUIDADO: Perda de precisão em conversões long → float
long l = 9223372036854775807L;
float f = (float) l;  // Pode perder precisão
double d = (double) l;  // Mantém melhor precisão
```

---

## 🎯 Boas Práticas

### ✅ Recomendações

1. **Use casting implícito quando possível** (mais seguro)
2. **Verifique limites antes de casting narrowing**
3. **Use `instanceof` antes de downcasting**
4. **Prefira métodos de conversão** em vez de cast quando disponível
5. **Trate exceções** em conversões de String
6. **Documente conversões não óbvias** com comentários

### ❌ Evite

1. Casting desnecessário (especialmente narrowing)
2. Casting sem verificação de limites
3. Downcasting sem `instanceof`
4. Ignorar exceções em conversões
5. Assumir que casting sempre funciona
6. Perder precisão desnecessariamente

### Padrões Recomendados

```java
// ✅ BOM: Verificação antes de cast
if (valor >= Byte.MIN_VALUE && valor <= Byte.MAX_VALUE) {
    byte b = (byte) valor;
}

// ✅ BOM: instanceof antes de downcasting
if (animal instanceof Cachorro) {
    Cachorro c = (Cachorro) animal;
}

// ✅ BOM: Tratamento de exceções
try {
    int numero = Integer.parseInt(texto);
} catch (NumberFormatException e) {
    // Tratar erro
}

// ❌ RUIM: Casting sem verificação
byte b = (byte) valor;  // Pode causar overflow

// ❌ RUIM: Downcasting sem verificação
Cachorro c = (Cachorro) animal;  // Pode causar ClassCastException
```

---

## 📚 Resumo Rápido

### Regras Básicas de Casting

1. **Widening (Alargamento)**: Automático, sem cast
   - Tipos menores → maiores
   - `byte → short → int → long → float → double`

2. **Narrowing (Estreitamento)**: Requer cast explícito
   - Tipos maiores → menores
   - Pode causar perda de dados

3. **Char**: Especial
   - `char → int` é automático
   - `int → char` requer cast

4. **Boolean**: Não pode ser convertido

5. **Wrappers**: Autoboxing/Unboxing automático
   - `int ↔ Integer`
   - `double ↔ Double`

### Checklist de Casting Seguro

- [ ] Verificar limites antes de narrowing
- [ ] Usar `instanceof` antes de downcasting
- [ ] Tratar exceções em conversões de String
- [ ] Verificar null antes de unboxing
- [ ] Documentar conversões não óbvias
- [ ] Preferir métodos de conversão quando disponível

---

## 📖 Exercícios Sugeridos

1. Converter valores entre diferentes tipos numéricos
2. Implementar conversão segura de String para número
3. Criar função que verifica se um cast é seguro
4. Implementar conversão de tipos com validação
5. Praticar upcasting e downcasting com herança
6. Trabalhar com conversões de char e Unicode

