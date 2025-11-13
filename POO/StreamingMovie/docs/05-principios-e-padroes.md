## Princípios, Boas Práticas e Padrões de Projeto

A orientação a objetos vai além de classes e herança; envolve princípios que garantem código limpo, extensível e fácil de manter.

### Coesão e acoplamento

- **Coesão**: classes e métodos devem ter responsabilidades bem definidas.
- **Acoplamento**: relações entre classes devem ser minimizadas; dependências fortes dificultam mudanças.

### Princípios SOLID

1. **Single Responsibility Principle**: uma classe deve ter apenas um motivo para mudar.
2. **Open/Closed Principle**: entidades devem estar abertas para extensão, mas fechadas para modificação direta.
3. **Liskov Substitution Principle**: objetos de classes derivadas devem substituir os da classe base sem alterar a funcionalidade esperada.
4. **Interface Segregation Principle**: prefira várias interfaces específicas a uma interface única genérica.
5. **Dependency Inversion Principle**: dependa de abstrações, não de implementações concretas.

### Princípios GRASP

- **Creator**: atribui a uma classe a responsabilidade de criar instâncias de outra.
- **Controller**: coordena operações de sistema.
- **Information Expert**: responsabilidade deve ficar com quem possui os dados necessários.
- **Low Coupling e High Cohesion**: complementam SOLID, incentivando design limpo.

### Padrões de projeto (Design Patterns)

#### Criação

- **Singleton**: garante única instância, útil para configurações globais (usar com cautela).
- **Factory Method**: delega criação de objetos a subclasses, mantendo código flexível.
- **Builder**: facilita construção de objetos complexos passo a passo.

#### Estrutural

- **Adapter**: converte interface de uma classe para outra compatível.
- **Composite**: compõe objetos em estruturas hierárquicas (árvores) para tratá-los de forma uniforme.
- **Decorator**: adiciona comportamentos dinamicamente sem alterar a classe original.

#### Comportamental

- **Strategy**: define famílias de algoritmos intercambiáveis em tempo de execução.
- **Observer**: notifica objetos interessados sobre mudanças de estado.
- **Command**: encapsula uma operação como objeto, permitindo desfazer ou agendar execuções.

### Práticas recomendadas

- Nomeie classes com substantivos claros (`Pedido`, `RepositorioCliente`).
- Nomeie métodos com verbos (`calcularTotal`, `salvar`, `finalizar`).
- Prefira composição a herança quando a relação não for estritamente “é um”.
- Injete dependências (por construtor ou setter) para facilitar testes.
- Refatore frequentemente para remover duplicações e clarificar responsabilidades.

### Documentação e comunicação

- Utilize JavaDoc para métodos públicos relevantes.
- Mantenha diagramas atualizados quando impactarem entendimento crítico.
- Registre decisões arquiteturais importantes (Arquitetura Decision Records, por exemplo).

Seguir princípios e padrões de projeto reduz a complexidade e aumenta a qualidade das soluções orientadas a objetos, especialmente em sistemas em evolução constante.

