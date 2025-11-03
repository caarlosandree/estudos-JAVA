# Lógica de Programação - Fundamentos

## 🧠 O que é Lógica de Programação?

Lógica de programação é a técnica de encadear pensamentos para atingir determinado objetivo. É a capacidade de pensar de forma estruturada e sequencial, essencial para qualquer programador.

### Conceitos Fundamentais
- **Algoritmo**: Sequência de instruções lógicas e bem definidas para resolver um problema
- **Programa**: Implementação de um algoritmo em uma linguagem de programação
- **Abstração**: Capacidade de pensar em conceitos gerais, ignorando detalhes desnecessários

## 🔢 Variáveis e Tipos de Dados

### O que são Variáveis?
Variáveis são espaços na memória que armazenam dados que podem ser modificados durante a execução do programa.

### Tipos Primitivos Comuns

#### Números Inteiros
- Armazenam números sem parte decimal
- Exemplos: `idade = 25`, `quantidade = 10`

#### Números Decimais (Reais)
- Armazenam números com parte decimal
- Exemplos: `preco = 29.99`, `altura = 1.75`, `pi = 3.14159`

#### Texto (String)
- Armazenam sequências de caracteres
- Exemplos: `nome = "João"`, `mensagem = "Olá mundo"`

#### Booleano (Lógico)
- Armazenam apenas dois valores: verdadeiro ou falso
- Exemplos: `ativo = true`, `premium = false`

#### Caracteres
- Armazenam um único caractere
- Exemplos: `letra = 'a'`, `opcao = 'S'`

### Convenções de Nomenclatura
- Use nomes descritivos e significativos
- ✅ Bom: `valor_ingresso`, `quantidade_produtos`, `idade_usuario`
- ❌ Ruim: `x`, `temp`, `var1`
- Evite espaços, use underscore (_) ou camelCase
- Não use números no início

## 📥 Entrada e Saída de Dados

### Entrada (Input)
Receber dados do usuário ou de fontes externas

```pseudocodigo
LER idade
LER nome
LER preco
```

### Saída (Output)
Exibir informações para o usuário

```pseudocodigo
ESCREVER "Olá mundo"
ESCREVER "Sua idade é: " + idade
ESCREVER total_compra
```

## 🎯 Operadores

### Operadores Aritméticos
```
+   Soma            (10 + 5 = 15)
-   Subtração       (10 - 5 = 5)
*   Multiplicação   (10 * 5 = 50)
/   Divisão         (10 / 5 = 2)
%   Módulo/Resto    (10 % 3 = 1)
^   Potenciação     (2 ^ 3 = 8)
```

### Operadores Relacionais
```
==  Igual a                (5 == 5) → true
!=  Diferente de           (5 != 3) → true
>   Maior que              (10 > 5) → true
<   Menor que              (5 < 10) → true
>=  Maior ou igual         (10 >= 10) → true
<=  Menor ou igual         (5 <= 10) → true
```

### Operadores Lógicos
```
AND  E (ambos verdadeiros)    (true AND true) → true
OR   OU (pelo menos um)       (true OR false) → true
NOT  NÃO (inverte)            (NOT false) → true
```

## 🔀 Estruturas Condicionais

### SE-ENTÃO (if)
Executa um bloco de código apenas se a condição for verdadeira

```
SE (idade >= 18) ENTÃO
    ESCREVER "Maior de idade"
FIM SE
```

### SE-ENTÃO-SENÃO (if-else)
Escolhe entre duas opções baseado na condição

```
SE (idade >= 18) ENTÃO
    ESCREVER "Maior de idade"
SENÃO
    ESCREVER "Menor de idade"
FIM SE
```

### SE-ENTÃO-SENÃO-SE (if-elseif)
Testa múltiplas condições em sequência

```
SE (nota >= 90) ENTÃO
    ESCREVER "Excelente"
SENÃO SE (nota >= 70) ENTÃO
    ESCREVER "Bom"
SENÃO SE (nota >= 50) ENTÃO
    ESCREVER "Regular"
SENÃO
    ESCREVER "Insuficiente"
FIM SE
```

### Escolha-Caso (switch-case)
Seleciona uma ação baseado no valor de uma variável

```
ESCOLHA (opcao)
CASO 1:
    ESCREVER "Opção 1"
CASO 2:
    ESCREVER "Opção 2"
CASO PADRÃO:
    ESCREVER "Opção inválida"
FIM ESCOLHA
```

## 🔄 Estruturas de Repetição (Loops)

### PARA (for)
Repete um bloco um número fixo de vezes

```
PARA i = 1 ATÉ 10 FAÇA
    ESCREVER i
FIM PARA
```

### ENQUANTO (while)
Repete enquanto a condição for verdadeira

```
CONTADOR = 0
ENQUANTO (CONTADOR < 10) FAÇA
    ESCREVER CONTADOR
    CONTADOR = CONTADOR + 1
FIM ENQUANTO
```

### REPITA-ATÉ (do-while)
Executa pelo menos uma vez, repetindo até a condição ser falsa

```
REPITA
    LER numero
ATÉ (numero > 0)
```

### Contadores e Acumuladores

```
// Contador: incrementa/decrementa
contador = contador + 1

// Acumulador: soma valores
soma = soma + valor
total = total + preco
```

## 📦 Vetores e Arrays

### Conceito
Conjunto de variáveis do mesmo tipo identificadas por índices

```
VETOR numeros = [10, 20, 30, 40, 50]

ESCREVER numeros[0]  // Primeiro elemento: 10
ESCREVER numeros[2]  // Terceiro elemento: 30
```

### Operações Comuns

```
// Percorrer vetor
PARA i = 0 ATÉ TAMANHO(vetor) - 1 FAÇA
    ESCREVER vetor[i]
FIM PARA

// Buscar valor
ENCONTROU = false
PARA i = 0 ATÉ TAMANHO(vetor) - 1 FAÇA
    SE (vetor[i] == valor) ENTÃO
        ENCONTROU = true
        PARAR
    FIM SE
FIM PARA
```

## 🔨 Desenvolvendo Algoritmos

### Passos para Resolver Problemas

1. **Entender o Problema**
   - Leia cuidadosamente
   - Identifique os dados de entrada
   - Identifique o resultado esperado

2. **Identificar Variáveis**
   - O que preciso guardar?
   - Quais tipos usar?

3. **Planejar a Solução**
   - Escreva o algoritmo em pseudocódigo
   - Teste mentalmente com exemplos

4. **Codificar**
   - Transforme o algoritmo em código
   - Use nomes descritivos

5. **Testar**
   - Execute com diferentes valores
   - Verifique casos especiais

### Exemplo Prático: Calculadora de Preço

```
Início
    // Entrada de dados
    LER preco_unitario
    LER quantidade
    
    // Processamento
    subtotal = preco_unitario * quantidade
    desconto = subtotal * 0.10
    total = subtotal - desconto
    
    // Saída
    ESCREVER "Total a pagar: " + total
Fim
```

## 🧮 Operações Matemáticas Comuns

### Conversões de Unidade

```
// Temperatura: Celsius → Fahrenheit
fahrenheit = celsius * 1.8 + 32

// Moedas
dolares = reais / cotacao_dolar

// Medidas
metros = centimetros / 100
quilometros = metros / 1000
```

### Cálculos de Percentual

```
// Calcular desconto
desconto = preco * (percentual / 100)
preco_final = preco - desconto

// Calcular acréscimo
acrescimo = preco * (percentual / 100)
preco_final = preco + acrescimo

// Calcular percentual
percentual = (valor / total) * 100
```

### Média Aritmética

```
media = (nota1 + nota2 + nota3) / 3
```

### Operações Básicas

```
// Raiz quadrada
raiz = numero ^ 0.5

// Potência
resultado = base ^ expoente

// Valor absoluto
absoluto = |numero|

// Arredondar
arredondado = ROUND(numero)
```

## 🔍 Estratégias de Resolução

### Divisão e Conquista
Quebrar um problema grande em partes menores

```
Problema: Processar vendas de uma loja
Dividir em:
  1. Calcular preço de cada item
  2. Somar todos os itens
  3. Aplicar descontos
  4. Mostrar total
```

### Repetição até Condição
Executar ação até atingir um objetivo

```
posicao = 0
ENQUANTO (lista[posicao] != valor_desejado) FAÇA
    posicao = posicao + 1
FIM ENQUANTO
```

### Seleção Múltipla
Testar várias condições

```
SE (distancia <= 5) ENTÃO
    taxa = 2.00
SENÃO SE (distancia <= 10) ENTÃO
    taxa = 5.00
SENÃO
    taxa = 7.00
FIM SE
```

### Acumulação
Juntar valores através de repetições

```
total = 0
PARA i = 1 ATÉ 100 FAÇA
    total = total + i
FIM PARA
ESCREVER total  // Soma de 1 a 100
```

## 📊 Estruturas de Dados Básicas

### Lista/Vetor Simples
```
lista = [10, 20, 30, 40, 50]
```

### Matriz (Lista de Listas)
```
matriz = [[1, 2, 3],
          [4, 5, 6],
          [7, 8, 9]]
```

### Registro/Struct
Conjunto de campos relacionados
```
ALUNO
    nome: texto
    idade: inteiro
    nota: decimal
```

## 🎨 Boas Práticas

### Nomenclatura Clara
- Use nomes descritivos
- Evite abreviações obscuras
- Seja consistente

### Comentários Úteis
```
// Este loop calcula a média das notas
total = 0
PARA i = 1 ATÉ 10 FAÇA
    total = total + notas[i]
FIM PARA
media = total / 10
```

### Estrutura Lógica
- Ordene instruções de forma sequencial
- Agrupe instruções relacionadas
- Mantenha indentação consistente

### Validação de Dados
```
LER idade
ENQUANTO (idade < 0 OU idade > 150) FAÇA
    ESCREVER "Idade inválida. Digite novamente:"
    LER idade
FIM ENQUANTO
```

## 🧪 Algoritmos Clássicos

### Máximo e Mínimo

```
// Encontrar maior valor
maior = vetor[0]
PARA i = 1 ATÉ TAMANHO(vetor) - 1 FAÇA
    SE (vetor[i] > maior) ENTÃO
        maior = vetor[i]
    FIM SE
FIM PARA

// Encontrar menor valor
menor = vetor[0]
PARA i = 1 ATÉ TAMANHO(vetor) - 1 FAÇA
    SE (vetor[i] < menor) ENTÃO
        menor = vetor[i]
    FIM SE
FIM PARA
```

### Busca Linear

```
posicao = -1
PARA i = 0 ATÉ TAMANHO(vetor) - 1 FAÇA
    SE (vetor[i] == valor_procurado) ENTÃO
        posicao = i
        PARAR
    FIM SE
FIM PARA

SE (posicao == -1) ENTÃO
    ESCREVER "Valor não encontrado"
SENÃO
    ESCREVER "Encontrado na posição: " + posicao
FIM SE
```

### Ordenação por Bolha (Bubble Sort)

```
PARA i = 0 ATÉ TAMANHO(vetor) - 2 FAÇA
    PARA j = 0 ATÉ TAMANHO(vetor) - 2 - i FAÇA
        SE (vetor[j] > vetor[j + 1]) ENTÃO
            temp = vetor[j]
            vetor[j] = vetor[j + 1]
            vetor[j + 1] = temp
        FIM SE
    FIM PARA
FIM PARA
```

### Contagem de Elementos

```
contador = 0
PARA i = 0 ATÉ TAMANHO(vetor) - 1 FAÇA
    SE (vetor[i] == valor) ENTÃO
        contador = contador + 1
    FIM SE
FIM PARA
ESCREVER "Aparece " + contador + " vezes"
```

### Soma de Elementos

```
total = 0
PARA i = 0 ATÉ TAMANHO(vetor) - 1 FAÇA
    total = total + vetor[i]
FIM PARA
ESCREVER "Soma: " + total
```

### Média dos Valores

```
soma = 0
PARA i = 0 ATÉ TAMANHO(vetor) - 1 FAÇA
    soma = soma + vetor[i]
FIM PARA
media = soma / TAMANHO(vetor)
ESCREVER "Média: " + media
```

## 💡 Exercícios Práticos

### 1. Calculadora de Imposto
```
LER salario_bruto
imposto = salario_bruto * 0.15
salario_liquido = salario_bruto - imposto
ESCREVER "Salário líquido: " + salario_liquido
```

### 2. Verificar Paridade
```
LER numero
SE (numero % 2 == 0) ENTÃO
    ESCREVER "Par"
SENÃO
    ESCREVER "Ímpar"
FIM SE
```

### 3. Área de Formas Geométricas

```
// Círculo
LER raio
area = pi * raio * raio

// Retângulo
LER largura, altura
area = largura * altura

// Triângulo
LER base, altura
area = (base * altura) / 2
```

### 4. Sistema de Notas

```
LER nota1, nota2, nota3
media = (nota1 + nota2 + nota3) / 3

SE (media >= 7) ENTÃO
    ESCREVER "Aprovado"
SENÃO SE (media >= 5) ENTÃO
    ESCREVER "Recuperação"
SENÃO
    ESCREVER "Reprovado"
FIM SE
```

### 5. Calcular Tempo de Viagem

```
LER distancia, velocidade_media
tempo_horas = distancia / velocidade_media
tempo_minutos = tempo_horas * 60
ESCREVER "Tempo: " + tempo_horas + " horas"
ESCREVER "Tempo: " + tempo_minutos + " minutos"
```

## 🎯 Principios Fundamentais

### Sequência
Instruções executadas em ordem

### Seleção
Escolha entre diferentes caminhos (IF, SWITCH)

### Repetição
Executar ação múltiplas vezes (FOR, WHILE)

### Modularização
Dividir programa em partes menores e reutilizáveis

### Recursão
Função que chama a si mesma

## 📝 Pseudocódigo - Padrões Comuns

### Estrutura Básica

```
INÍCIO
    // Declaração de variáveis
    VAR tipo nome
    VAR tipo nome2
    
    // Entrada de dados
    LER variavel
    
    // Processamento
    variavel = expressao
    
    // Saída de dados
    ESCREVER mensagem
FIM
```

### Padrão Menu

```
REPITA
    ESCREVER "1. Opção 1"
    ESCREVER "2. Opção 2"
    ESCREVER "3. Sair"
    LER opcao
    
    ESCOLHA (opcao)
    CASO 1:
        // Ação 1
    CASO 2:
        // Ação 2
    CASO 3:
        ESCREVER "Saindo..."
    FIM ESCOLHA
ATÉ (opcao == 3)
```

### Padrão Validação

```
REPITA
    ESCREVER "Digite valor:"
    LER valor
    SE (valor inválido) ENTÃO
        ESCREVER "Erro! Tente novamente."
    FIM SE
ATÉ (valor válido)
```

### Padrão Acumulador

```
soma = 0
PARA i = 1 ATÉ n FAÇA
    LER numero
    soma = soma + numero
FIM PARA
media = soma / n
```

## 🔗 Como Aplicar em Qualquer Linguagem

Os conceitos de lógica de programação são **universais**. A sintaxe muda, mas a lógica permanece:

### Se-Então-Senão
```
// Python
if (idade >= 18):
    print("Maior")
else:
    print("Menor")

// Java
if (idade >= 18) {
    System.out.println("Maior");
} else {
    System.out.println("Menor");
}

// JavaScript
if (idade >= 18) {
    console.log("Maior");
} else {
    console.log("Menor");
}
```

### Loop
```
// Python
for i in range(1, 11):
    print(i)

// Java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

// JavaScript
for (let i = 1; i <= 10; i++) {
    console.log(i);
}
```

## ✨ Checklist Mental para Resolver Problemas

1. ✅ Entendi o que o problema pede?
2. ✅ Quais são as entradas necessárias?
3. ✅ Qual é o resultado esperado?
4. ✅ Que variáveis preciso criar?
5. ✅ Qual lógica devo implementar?
6. ✅ Preciso de condicionais?
7. ✅ Preciso de loops?
8. ✅ Há casos especiais a considerar?
9. ✅ Meu algoritmo funciona corretamente?

## 🎓 Conclusão

A lógica de programação é a base fundamental para qualquer programador. Dominar estes conceitos permite:

- ✅ Resolver problemas de forma estruturada
- ✅ Pensar como um desenvolvedor
- ✅ Adaptar-se a qualquer linguagem
- ✅ Escrever código limpo e eficiente
- ✅ Colaborar melhor em equipes

**Lembre-se**: Programação não é decorar sintaxe, é pensar logicamente!

