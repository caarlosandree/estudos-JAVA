## Modelagem Orientada a Objetos e UML

A etapa de modelagem traduz requisitos do domínio em estruturas de software. A Unified Modeling Language (UML) é um conjunto de notações padronizadas que apoia a visualização, especificação e documentação de sistemas orientados a objetos.

### Etapas da modelagem

1. **Coleta de requisitos**: identificar necessidades do usuário, regras de negócio, atores e fluxos.
2. **Análise**: transformar requisitos em modelos conceituais (entidades, relacionamentos, responsabilidades).
3. **Projeto**: detalhar como as classes serão implementadas, considerando tecnologias e padrões.
4. **Implementação**: converter o modelo em código, mantendo a aderência com o projeto definido.

### Diagramas essenciais da UML

- **Diagrama de classes**: mostra classes, atributos, métodos e seus relacionamentos (associação, herança, dependência). Ideal para discutir hierarquias e responsabilidades.
- **Diagrama de sequência**: explicita a troca de mensagens entre objetos ao longo do tempo, destacando ordem e condições.
- **Diagrama de casos de uso**: representa funcionalidade vista pelos usuários finais, útil na fase de requisitos.
- **Diagrama de estados**: descreve mudanças de estado de um objeto em resposta a eventos.
- **Diagrama de atividades**: ilustra fluxos de trabalho, destacando decisões e paralelismos.

### Papéis e responsabilidades

Durante a modelagem, é importante definir responsabilidades claras usando técnicas como GRASP (General Responsibility Assignment Software Patterns), que auxilia a distribuir comportamentos entre classes de maneira equilibrada.

- **Creator**: define quem deve criar instâncias de uma classe.
- **Controller**: estabelece quem lida com eventos de entrada e coordena ações.
- **Low Coupling e High Cohesion**: incentivam classes coesas e com o mínimo de dependências externas.

### Princípios SOLID na modelagem

- **Single Responsibility Principle (SRP)**: cada classe deve ter um único motivo para mudar.
- **Open/Closed Principle (OCP)**: classes devem ser abertas a extensão e fechadas para modificação.
- **Liskov Substitution Principle (LSP)**: subclasses devem poder substituir a classe base sem quebrar o comportamento esperado.
- **Interface Segregation Principle (ISP)**: prefira interfaces específicas a contratos genéricos gigantes.
- **Dependency Inversion Principle (DIP)**: módulos de alto nível não devem depender de detalhes; ambos dependem de abstrações.

### Passos para criar um modelo eficaz

1. Identifique substantivos nos requisitos → candidatos a classes.
2. Identifique verbos → possíveis métodos ou responsabilidades.
3. Defina relacionamentos e multiplicidades entre classes.
4. Avalie se há herança ou composição apropriada.
5. Garanta que os nomes sejam claros e reflitam o domínio.

### Iteração contínua

A modelagem não é estática. Durante o desenvolvimento:

- Revise diagramas conforme o código evolui.
- Documente decisões arquiteturais relevantes.
- Atualize modelos de alta importância (ex.: diagramas de classes principais) para manter a comunicação com o time.

Modelar bem economiza tempo no desenvolvimento, reduz retrabalho e facilita a comunicação entre pessoas técnicas e stakeholders.

