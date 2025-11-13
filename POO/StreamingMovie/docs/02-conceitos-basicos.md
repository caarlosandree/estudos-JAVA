## Conceitos Básicos da Orientação a Objetos

Compreender a terminologia da POO é essencial para modelar sistemas coerentes. A seguir, os conceitos mais importantes, ilustrados com exemplos simples.

### Classe

Classe é o molde que define características (atributos) e comportamentos (métodos) para um conjunto de objetos. Em Java:

```java
public class Filme {
    private String titulo;
    private int anoLancamento;

    public Filme(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }
}
```

### Objeto

Objeto é uma instância concreta de uma classe. Cada objeto possui valores próprios para os atributos declarados.

```java
Filme interestelar = new Filme("Interestelar", 2014);
```

### Atributo

Variáveis que guardam o estado do objeto. Devem ser declarados com visibilidade adequada para evitar acesso indevido.

### Método

Função associada à classe/objeto. Define ações executadas ou valores calculados.

```java
public void exibirFichaTecnica() {
    System.out.println("Título: " + titulo);
    System.out.println("Ano: " + anoLancamento);
}
```

### Mensagem

É a invocação de um método. Ao enviar uma mensagem, solicitamos que o objeto realize uma ação.

```java
interestelar.exibirFichaTecnica();
```

### Construtor

Método especial que inicializa o objeto. Em Java, tem o mesmo nome da classe e pode receber parâmetros obrigatórios.

### Interface

Contrato que define um conjunto de métodos que devem ser implementados por classes concretas.

```java
public interface Avaliavel {
    void avalia(double nota);
}
```

### Pacote

Estrutura de organização lógica que agrupa classes relacionadas, facilitando modularização e controle de acesso.

```java
package br.com.alura.streaming;
```

### Relações entre classes

- **Associação**: vínculo genérico (ex.: `Usuario` possui uma `Conta`).
- **Dependência**: uso temporário de outra classe, geralmente como parâmetro de método.
- **Agregação**: relação “tem-um” em que os objetos têm ciclo de vida independente.
- **Composição**: relação “parte de” onde o ciclo de vida é compartilhado.

Dominar esses conceitos permite ler e escrever código orientado a objetos com clareza e precisão.

