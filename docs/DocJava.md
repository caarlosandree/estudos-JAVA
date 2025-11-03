# Documentação Java - Básico

## 📝 Estrutura Básica de um Programa Java

### Método Main
Todo programa Java precisa de um método `main` como ponto de entrada:

```java
public class Main {
    public static void main(String[] args) {
        // Seu código aqui
    }
}
```

### Sintaxe Geral
- **Classes**: Nome da classe deve começar com letra maiúscula e combinar com o nome do arquivo
- **Métodos**: Nome do método deve começar com letra minúscula (camelCase)
- **Ponto e vírgula**: Todas as instruções terminam com `;`
- **Chaves**: Delimitam blocos de código `{}`

## 🔢 Tipos de Dados Primários

### Números Inteiros
- `byte`: -128 a 127 (8 bits)
- `short`: -32.768 a 32.767 (16 bits)
- `int`: -2.147.483.648 a 2.147.483.647 (32 bits) ⭐ **Mais usado**
- `long`: Números muito grandes (64 bits)

```java
int numero = 42;
long numeroGrande = 1234567890L;
```

### Números Decimais
- `float`: Precisão simples (32 bits)
- `double`: Precisão dupla (64 bits) ⭐ **Mais usado**

```java
double preco = 29.99;
float altura = 1.75f;
```

### Caracteres e Textos
- `char`: Um único caractere (16 bits)
- `String`: Sequência de caracteres (não é primitivo, mas muito usado)

```java
char letra = 'A';
String nome = "Java";
```

### Booleanos
- `boolean`: `true` ou `false`

```java
boolean ativo = true;
boolean desligado = false;
```

## 📦 Variáveis

### Declaração de Variáveis
Sintaxe: `tipo nome = valor;`

```java
int idade = 25;
String nome = "Carlos";
double salario = 1500.50;
```

### Convenções de Nomenclatura
- **Variáveis**: camelCase (primeira letra minúscula)
  - ✅ `idadeUsuario`, `salarioBruto`, `numeroDeContas`
  - ❌ `IdadeUsuario`, `SALARIO`, `numero_de_contas`

- **Constantes**: UPPER_SNAKE_CASE (todas maiúsculas, separadas por underscore)
  - ✅ `PI = 3.14159`, `MAX_TENTATIVAS = 3`

- **Classes**: PascalCase (primeira letra maiúscula)
  - ✅ `Main`, `Usuario`, `Calculadora`

- **Métodos**: camelCase (primeira letra minúscula)
  - ✅ `calcularTotal()`, `obterNome()`

## 💬 Comentários

```java
// Comentário de uma linha

/* 
   Comentário de múltiplas linhas
   pode ter várias linhas
*/

/**
 * Comentário de documentação (Javadoc)
 * usado para documentar classes e métodos
 */
```

## 🖨️ Impressão no Console

```java
System.out.println("Mensagem");     // Imprime e quebra linha
System.out.print("Mensagem");       // Imprime sem quebra linha
System.out.println(2022);           // Imprime números
System.out.println("Ano: " + 2022); // Concatenação de strings
```

## 📁 Packages (Pacotes)

Organizam classes em grupos:

```java
package primeiroprojeto;

public class MinhaClasse {
    // código aqui
}
```

## 🔗 Imports

Importam classes de outros pacotes:

```java
import primeiroprojeto.Estudos;
import primeiroprojeto.Perfil;

// ou importar tudo do pacote
import primeiroprojeto.*;
```

## 🎯 Estruturas Básicas

### Condicionais
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### Laços de Repetição
```java
// For
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// While
int contador = 0;
while (contador < 5) {
    System.out.println(contador);
    contador++;
}
```

## 📚 Convenções Importantes

### Regras Básicas
1. Todo arquivo `.java` deve ter uma classe pública
2. Nome da classe = nome do arquivo
3. Código sempre dentro de classes
4. Main method é obrigatório para executar o programa

### Boas Práticas
- Usar nomes descritivos e claros
- Indentação consistente (4 espaços ou tab)
- Evitar números mágicos (usar constantes)
- Comentar código complexo
- Manter classes e métodos pequenos e focados

## 🔤 Operadores Aritméticos

```java
int soma = 10 + 5;        // 15
int subtracao = 10 - 5;   // 5
int multiplicacao = 10 * 5; // 50
int divisao = 10 / 5;     // 2
int resto = 10 % 3;       // 1

// Atribuição composta
int x = 10;
x += 5;  // x = x + 5
x++;     // x = x + 1 (incremento)
x--;     // x = x - 1 (decremento)
```

## 📝 Exemplo Completo

```java
package exemplo;

public class ExemploBasico {
    public static void main(String[] args) {
        // Declarar variáveis
        String nome = "Carlos";
        int idade = 25;
        double altura = 1.75;
        
        // Imprimir informações
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        
        // Condicional
        if (idade >= 18) {
            System.out.println("É maior de idade");
        }
        
        // Loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Contagem: " + i);
        }
    }
}
```

