## Testes, Qualidade e Manutenção em Orientação a Objetos

O código orientado a objetos favorece a criação de software testável e evolutivo quando aplicado com disciplina. Esta seção destaca estratégias para garantir qualidade desde o início do projeto.

### Estratégias de teste

- **Teste de unidade**: valida métodos e comportamentos públicos isoladamente.
- **Teste de integração**: verifica a colaboração entre classes e módulos.
- **Teste end-to-end**: simula cenários completos do usuário, garantindo funcionalidade do sistema como um todo.

### Dublês de teste

- **Stub**: fornece respostas pré-programadas, sem lógica complexa.
- **Mock**: verifica se interações esperadas ocorreram.
- **Fake**: implementa comportamento simplificado, mas funcional (ex.: repositório em memória).
- **Spy**: registra chamadas para posterior verificação.

### Ciclo TDD (Test-Driven Development)

1. **Red**: escreva um teste que falha.
2. **Green**: implemente o mínimo necessário para passar.
3. **Refactor**: melhore o design mantendo os testes verdes.

### Métricas úteis

- **Cobertura de código**: indica quantas linhas foram exercitadas pelos testes (não é garantia absoluta de qualidade).
- **Complexidade ciclomática**: orienta refatorações em métodos com muitos caminhos lógicos.
- **Debt principal**: monitora pontos que necessitam ajustes futuros.

### Manutenção contínua

- **Refatoração**: ajuste estruturas sem alterar comportamento observável.
- **Code review**: dupla verificação para detectar problemas lógicos e fortalecer padrões.
- **Documentação viva**: comentários e guias devem refletir o estado atual do sistema.

### Ferramentas de apoio em Java

- **JUnit**: framework padrão para testes unitários.
- **Mockito**: criação de mocks e spies com sintaxe fluida.
- **AssertJ/Hamcrest**: matchers expressivos para afirmações.
- **JaCoCo**: geração de relatórios de cobertura.

### Práticas de manutenção orientada a objetos

- Garanta que invariantes sejam respeitados antes e depois de alterações de estado.
- Prefira objetos imutáveis ou defensivas cópias em contextos concorrentes.
- Documente contratos em interfaces, facilitando substituições.
- Automatize pipelines de build e teste para detectar regressões rapidamente.

Manter uma cultura ativa de testes e revisão reduz riscos, acelera entregas e sustenta a saúde do código orientado a objetos ao longo do tempo.

