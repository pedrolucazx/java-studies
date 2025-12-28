# 🎓 Guia de Estudos: Java Full-Stack

## 📚 Materiais de Estudo

### Livros

1. **Algoritmos e Lógica da Programação** - Furlan et al.
2. **Entendendo Algoritmos** - Aditya Y. Bhargava

### Cursos

1. **Java COMPLETO: Do Básico ao Avançado** - Cod3r
2. **Bootcamp Full-Stack Java + Spring + Angular** - DIO

---

## 🎯 Overview do Plano de Estudos

Este guia organiza minha jornada de aprendizado do básico ao avançado, integrando teoria e prática através dos materiais listados acima.

### Estrutura de Estudo

```
📖 Teoria (Livros) + 💻 Prática (Cursos) = 🚀 Domínio Full-Stack
```

---

## 📖 Fase 1: Fundamentos de Lógica e Algoritmos

**Objetivo:** Desenvolver pensamento computacional e entender eficiência de algoritmos antes de aprender sintaxe específica.

---

### 1.1 O que é um Algoritmo? (A Mentalidade do Engenheiro)

> **Fonte Principal:** Furlan, Cap. 1.1

**Conteúdo:**

- Definição formal de algoritmo
- Análise e síntese de problemas
- Processo de engenharia: Requisitos → Desenvolvimento → Entrega
- Etapas: Ideias → Projeto Lógico → Implementação
- Modelagem de problemas
- Papel da lógica na verificação de programas

**Por que estudar:** Entender que programação começa com projeto lógico, não com código. Diferença entre programador amador e engenheiro de software.

---

### 1.2 Análise de Performance e Notação Big O

> **Fonte Principal:** Bhargava, Cap. 1

**Conteúdo:**

- Pesquisa Binária como primeiro exemplo de algoritmo eficiente
- **Notação Big O:** linguagem universal para medir performance
- Taxas de crescimento de algoritmos
- Conceito de "pior hipótese"
- Tempos comuns de execução:
  - O(log n) - logarítmico (ex: Pesquisa Binária)
  - O(n) - linear
  - O(n log n)
  - O(n²) - quadrático
  - O(n!) - fatorial (ex: Caixeiro-Viajante)

**Por que estudar:** Aprender a medir objetivamente qual solução é melhor _antes_ de implementar.

---

### 1.3 Ferramentas de Modelagem e Estruturas Lógicas

> **Fonte Principal:** Furlan, Cap. 3 & 4

**Conteúdo:**

**Ferramentas de Modelagem:**

- **Fluxogramas:** Representação gráfica (norma ISO 5807/1985)
- **Portugol:** Representação textual estruturada
- **Diagramas de Nassi-Schneidermann:** Representação em caixas aninhadas

**Estruturas de Programação Universais:**

1. **Estruturas Sequenciais**

   - Execução linear, passo a passo

2. **Estruturas de Decisão**

   - SE-ENTÃO (if)
   - SE-ENTÃO-SENÃO (if-else)
   - CASO (switch)

3. **Estruturas de Repetição**
   - ENQUANTO-FAÇA (while)
   - REPITA-ATÉ (do-while)
   - PARA-ATÉ-FAÇA (for)

**Por que estudar:** Essas estruturas são universais. O `if-else` do Java é apenas sintaxe para o conceito SE-ENTÃO-SENÃO que você já dominou.

---

### 1.4 Como o Computador Executa o Código

> **Fonte Principal:** Furlan, Cap. 2

**Conteúdo:**

- **Arquitetura de Von Neumann:** UCP, Memória RAM, I/O
- **Representação da Informação:** Bits e bytes
- **Memória:** Como dados são armazenados em endereços
- **Execução de Programas:** Ciclo de busca e execução da UCP

**Por que estudar:** Entender o que é um _endereço de memória_ e _armazenamento contíguo_ é essencial para compreender estruturas de dados (Arrays vs Listas Encadeadas).

---

## 💻 Fase 2: Java Core - A Ferramenta

**Objetivo:** Traduzir conceitos lógicos abstratos para a sintaxe Java, dominando a linguagem e o paradigma de Orientação a Objetos.

---

### 2.1 Sintaxe Fundamental do Java

> **Fonte Principal:** Cod3r - Seção 03

**Conteúdo:**

- A plataforma Java: JVM, JDK e JRE
- **Tipos Primitivos:** int, double, boolean, char
- **Variáveis e Constantes:** uso da palavra-chave `final`
- **Operadores:**
  - Aritméticos (\*, /, +, -)
  - Relacionais (==, !=, >, <, >=, <=)
  - Lógicos (&&, ||, !)
  - Atribuição (=)
  - Ternário (? :)
- **Classes Wrapper:** Integer, Double, Boolean, etc.
- **Manipulação de String**
- **Conversão de tipos (casting)**

**Conexão com a Teoria (Furlan):**

- Tipos primitivos = implementação das "Convenções para tipos de dados"
- Operadores aritméticos = implementação das "Operações aritméticas"
- Operadores relacionais = implementação das "Operações relacionais"
- Operadores lógicos = implementação das "Operações lógicas" (AND, OR, NOT)
- Atribuição `=` em Java = conceito de atribuição `<-` do Portugol

---

### 2.2 Estruturas de Controle

> **Fonte Principal:** Cod3r - Seção 04

**Conteúdo:**

**Estruturas de Decisão:**

- `if` → implementa SE-ENTÃO
- `if-else` → implementa SE-ENTÃO-SENÃO
- `if-else if-...-else` → decisões encadeadas
- `switch` → implementa CASO

**Estruturas de Repetição:**

- `while` → implementa ENQUANTO-FAÇA
- `do-while` → implementa REPITA-ATÉ
- `for` → implementa PARA-ATÉ-FAÇA
- Controles: `break` e `continue`

**Conexão com a Teoria:** Essas estruturas não são "recursos do Java", mas implementações diretas das estruturas lógicas universais aprendidas em Furlan (Cap. 4).

---

## 🎨 Fase 3: Orientação a Objetos (OOP)

**Objetivo:** Transição do pensamento estruturado para o paradigma orientado a objetos, que é o núcleo do Java.

---

### 3.1 Classes e Métodos - Os Blocos de Construção

> **Fonte Principal:** Cod3r - Seção 05

**Conteúdo:**

- **Classe:** O "molde" ou "planta" para criar objetos
- **Objeto (Instância):** Entidade concreta criada a partir da classe
- **Atributos:** Variáveis que definem o "estado" do objeto
- **Métodos:** Funções que definem o "comportamento" do objeto
- **Construtores:** Métodos especiais para inicialização
- **Palavra-chave `this`:** Referência ao objeto atual

**Conexão com a Teoria:** Métodos em Java = implementação OOP de "Sub-rotinas" (Funções/Procedimentos) conforme Furlan.

---

### 3.2 Os Quatro Pilares da OOP

> **Fonte Principal:** Cod3r - Seção 07

**Conteúdo:**

**1. Encapsulamento**

- Proteger estado interno (atributos) do objeto
- Modificadores de acesso: `private`, `public`, `protected`
- Getters e Setters para acesso controlado

**2. Herança**

- Subclasse herda atributos e métodos da Superclasse
- Reutilização de código
- Palavras-chave: `extends`, `super`

**3. Polimorfismo**

- "Muitas formas" - objeto tratado como instância de sua classe ou superclasse
- Sobrescrita de Métodos (`@Override`)

**4. Abstração**

- Esconder complexidade, expor apenas funcionalidade essencial
- `abstract class` e `interface`

**Importante:** Os pilares da OOP são as _ferramentas_ que Java oferece. Os princípios SOLID (Fase 5) são as _regras de design_ que ensinam como usar essas ferramentas corretamente.

---

## 📊 Fase 4: Estruturas de Dados e Algoritmos em Java

**Objetivo:** Compreender teoria e prática das ferramentas fundamentais para manipulação de dados.

---

### 4.1 Estruturas Estáticas: Arrays

> **Fontes:** Furlan Cap. 5 (Teoria) + Cod3r Seção 06 (Prática)

**Teoria (Furlan):**

- **Vetores:** Variáveis Indexadas Unidimensionais
- **Matrizes:** Variáveis Indexadas Bidimensionais
- **Representação na memória:** Arrays são blocos contíguos

**Prática (Cod3r):**

- Declaração e inicialização: `int[] numeros`
- Iteração sobre Arrays
- Matrizes (Arrays de Arrays): `int[][]`

---

### 4.2 Arrays vs Listas Encadeadas

> **Fonte Principal:** Bhargava, Cap. 2

**Conteúdo - O Trade-off Central:**

**Arrays:**

- ✅ Leitura rápida por índice: O(1)
- ❌ Inserção/Deleção lentas: O(n)
- Armazenamento: contíguo na memória

**Listas Encadeadas:**

- ✅ Inserção/Deleção rápidas: O(1)
- ❌ Leitura lenta: O(n)
- Armazenamento: locais aleatórios, cada elemento aponta para o próximo

**Por que estudar:** Base para entender quando usar `ArrayList` vs `LinkedList` no Java.

---

### 4.3 Recursão e Algoritmos de Ordenação

> **Fonte Principal:** Bhargava, Cap. 3 e 4

**Cap. 3 - Recursão:**

- Caso-base e caso recursivo
- A pilha de chamada
- Conexão com memória e execução de funções

**Cap. 4 - Ordenação:**

- **Ordenação por Seleção:** Simples mas ineficiente - O(n²)
- **Quicksort:** Algoritmo recursivo (Dividir para Conquistar)
  - Caso médio: O(n log n)
  - Pior caso: O(n²)

---

### 4.4 Java Collections Framework

> **Fonte Principal:** Cod3r - Seção 06

**Conteúdo:**

**Interface List (coleções ordenadas):**

- **ArrayList:** Implementação baseada em Array
  - Usar quando: leitura por índice frequente
  - Conectar com: Bhargava Cap. 2 (Arrays)
- **LinkedList:** Implementação baseada em Lista Encadeada
  - Usar quando: inserções/deleções no meio da lista frequentes
  - Conectar com: Bhargava Cap. 2 (Listas)

**Interface Set (sem duplicatas):**

- **HashSet:** Implementação baseada em Tabela Hash
  - Conectar com: Bhargava Cap. 5

**Interface Queue (FIFO):**

- Estrutura de fila (First-In, First-Out)

**Interface Map (chave-valor):**

- **HashMap:** Implementação baseada em Tabela Hash
  - Conectar com: Bhargava Cap. 5

---

### 4.5 Tabelas Hash - A Teoria por Trás de HashMap e HashSet

> **Fonte Principal:** Bhargava, Cap. 5

**Conteúdo:**

- **Funções Hash:** Mapeiam entrada para índice de array
- **Colisões:** Quando duas entradas geram o mesmo índice
- **Fator de Carga:** Gerenciamento de performance
- **Desempenho:** O(1) médio para busca, inserção e deleção

**Aplicação Prática:** Quando você usa `map.get(key)` em Java, ele não percorre a coleção - usa função hash para acessar diretamente o índice. Por isso HashMap é tão rápido.

---

## 🔧 Fase 5: Consolidação - Tratamento de Erros e Projeto

**Objetivo:** Tornar o código robusto e aplicar todo conhecimento em projeto integrador.

---

### 5.1 Tratamento de Erros em Java

> **Fonte Principal:** Cod3r - Seção 10

**Conteúdo:**

- Conceito de **Exception**
- Blocos `try-catch-finally`
- **Exceções Checadas** (Checked) vs **Não Checadas** (Unchecked/Runtime)
- Lançar exceções: `throw`
- Declarar exceções: `throws`
- Criação de Exceções Personalizadas

**Por que estudar:** Código profissional antecipa falhas. Tratamento de exceções é a forma estruturada do Java para lidar com erros.

---

### 5.2 Projeto Integrador: Campo Minado

> **Fonte Principal:** Cod3r - Seção 11

**Conteúdo do Projeto:**

Este projeto sintetiza TODO o "Core Java" aprendido:

- **Tabuleiro:** Matriz (Array Bidimensional)
  - Conecta: Furlan Cap. 5 + Cod3r Seção 06
- **Lógica de Abertura:** Recursão para abrir células vizinhas
  - Conecta: Bhargava Cap. 3
- **Design:** Classes e Métodos (OOP)
  - Conecta: Cod3r Seções 05 e 07
- **Tratamento de Erros:** Exceções ao clicar em mina ou célula inválida
  - Conecta: Cod3r Seção 10
- **Fluxo do Jogo:** Estruturas de Controle
  - Conecta: Cod3r Seção 04

**Por que é importante:** É aqui que você prova que dominou os fundamentos, integrando múltiplos conceitos em um projeto real.

---

## 🚀 Fase 6: Backend Profissional - Spring Framework

**Objetivo:** Transição de "programador Java" para "engenheiro backend", usando o ecossistema profissional dominante.

---

### 6.1 Produtividade com Spring Boot

> **Fonte Principal:** DIO - Módulo Spring Framework

**Conteúdo:**

- **Inversão de Controle (IoC):** O contêiner Spring gerencia componentes
- **Injeção de Dependências (DI):** Spring "injeta" dependências automaticamente
- **Gerenciamento de Dependências:** Maven ou Gradle
- **Spring Boot:** Configuração simplificada do Spring

**Por que estudar:** Spring remove a complexidade de configuração, permitindo foco na lógica de negócio.

---

### 6.2 Construindo APIs REST

> **Fonte Principal:** DIO - Módulo Spring Framework

**Conteúdo:**

- **Spring Web:** Framework para construir APIs
- Anotações principais:
  - `@RestController` - Define um controlador REST
  - `@GetMapping` - Endpoint GET
  - `@PostMapping` - Endpoint POST
  - `@PutMapping`, `@DeleteMapping` - Outros verbos HTTP
- **Swagger:** Documentação automática de API REST

**Por que estudar:** APIs REST são a espinha dorsal de sistemas modernos e comunicação frontend-backend.

---

### 6.3 Integração com Banco de Dados

> **Fonte Principal:** DIO - Módulo Banco de Dados

**Conteúdo:**

**Teoria:**

- Fundamentos de Banco de Dados Relacionais
- SQL básico e intermediário
- Modelagem de dados

**Prática - Persistência em Java:**

- **JDBC:** Abordagem de baixo nível (SQL direto)
- **JPA (Java Persistence API):** Padrão de ORM
- **Hibernate:** Implementação mais popular de JPA
- Mapeamento Objeto-Relacional: tabelas como objetos Java

---

### 6.4 Tópicos Avançados de Backend

> **Fonte Principal:** DIO - Módulo Spring Framework

**Conteúdo:**

- **Spring Security:** Autenticação e autorização
- **Deploy em Nuvem:** Publicação na Railway (ou similar)
- **Boas práticas:** Arquitetura em camadas (Controller, Service, Repository)

---

### 6.5 Algoritmos para Problemas de Larga Escala

> **Fonte Principal:** Bhargava, Cap. 6-9 (Teoria Avançada)

**Conteúdo - Aplicações em Backend:**

**Cap. 6 - Grafos:**

- Modelagem de redes, dependências de microserviços
- Pesquisa em Largura (BFS) para encontrar caminho mínimo

**Cap. 7 - Algoritmo de Dijkstra:**

- Caminho mais curto em redes ponderadas
- Aplicação: roteamento com menor latência, balanceamento de carga

**Cap. 8 - Algoritmos Gulosos:**

- Otimização por escolha localmente ótima
- "Problema da sala de aula" = agendamento de jobs em servidor

**Cap. 9 - Programação Dinâmica:**

- Otimização complexa
- "Problema da mochila" = alocação de CPU/memória para contêineres

**Cap. 8 - Problemas NP-Completos:**

- Identificar problemas intratáveis
- Quando usar algoritmos de aproximação ao invés de solução perfeita

**Por que estudar:** Esses algoritmos não são acadêmicos - são ferramentas reais de design de backend para escala empresarial.

---

## 🎨 Fase 7: Frontend Moderno - Angular

**Objetivo:** Construir interfaces de usuário modernas e criar aplicações Full-Stack completas.

---

### 7.1 Fundamentos do Ecossistema Angular

> **Fonte Principal:** DIO - Módulo Angular (Introdução)

**Conteúdo:**

- **Web Components:** Conceito de UI componentizada e reutilizável
- **TypeScript:** Superconjunto do JavaScript com tipagem estática
  - Traz robustez similar ao Java para o frontend
- **Angular CLI:** Ferramenta de linha de comando
- **Single Page Application (SPA):** Modelo de aplicação moderna

---

### 7.2 Arquitetura Angular (17+)

> **Fonte Principal:** DIO - Módulo Angular (Introdução)

**Conteúdo:**

- **Componentes Angular:** Blocos fundamentais (HTML + CSS + TypeScript)
- **Lifecycle Hooks:** Métodos do ciclo de vida
  - `ngOnInit` - Inicialização do componente
  - `ngOnDestroy` - Destruição do componente
  - Outros hooks importantes
- **Módulos Angular:** Organização em blocos de funcionalidade
- **Data Binding:** Comunicação entre template e componente

---

### 7.3 Recursos Essenciais do Angular

> **Fonte Principal:** DIO - Módulo Angular (Construindo Aplicações)

**Conteúdo:**

**Services:**

- Classes para compartilhar lógica entre componentes
- Realizar chamadas HTTP para API Spring
- Injeção de dependência no Angular

**Routing:**

- Navegação entre "páginas" (componentes) da SPA
- Configuração de rotas
- Parâmetros de rota

**Pipes:**

- Transformação de dados no template
- Ex: formatação de datas, moedas, textos

**Guards:**

- Proteção de rotas
- Lógica de segurança (ex: verificar se usuário está logado)
- Tipos: CanActivate, CanDeactivate, etc.

**Resultado Final:** Aplicação Full-Stack completa (Angular + Spring + Banco de Dados)

---

## ✨ Fase 8: Engenharia de Software e Boas Práticas

**Objetivo:** Elevar código funcional para código profissional - legível, sustentável e de alta qualidade.

---

### 8.1 Clean Code - Código Limpo

> **Fonte Principal:** DIO - Módulo Boas Práticas

**Conteúdo - Princípios de Robert C. Martin (Uncle Bob):**

- **Nomenclatura:** Variáveis, funções e classes com nomes significativos
- **Funções Pequenas:** Cada função faz apenas uma coisa (Single Responsibility)
- **DRY (Don't Repeat Yourself):** Evitar duplicação de código
- **Números Mágicos:** Usar constantes nomeadas
- **Comentários:** Quando usar e quando evitar
- **Formatação:** Padrões consistentes

**Por que estudar:** Código é lido muito mais vezes do que escrito. Clean Code reduz bugs e facilita manutenção.

---

### 8.2 Princípios SOLID

> **Fonte Principal:** DIO - Módulo Boas Práticas

**Conteúdo - Os 5 Pilares do Design OOP:**

**S - Single Responsibility Principle (Responsabilidade Única)**

- Uma classe deve ter apenas um motivo para mudar
- Cada classe faz uma coisa bem feita

**O - Open/Closed Principle (Aberto/Fechado)**

- Software aberto para extensão, fechado para modificação
- Estender funcionalidade sem alterar código existente

**L - Liskov Substitution Principle (Substituição de Liskov)**

- Subclasses devem ser substituíveis por suas superclasses
- **Regra de como usar Herança corretamente**

**I - Interface Segregation Principle (Segregação de Interfaces)**

- Clientes não devem depender de interfaces que não usam
- **Regra de como usar Abstração/Interfaces corretamente**

**D - Dependency Inversion Principle (Inversão de Dependência)**

- Módulos de alto nível não devem depender de módulos de baixo nível
- Ambos devem depender de abstrações (interfaces)
- **Justificativa técnica da Injeção de Dependências do Spring**

**Conexão Crítica:** SOLID não é teoria abstrata - é a razão do Spring funcionar como funciona. O Spring _força_ aplicação destes princípios, especialmente o "D" através de DI.

---

### 8.3 Testes Unitários com JUnit

> **Fonte Principal:** DIO - Módulo Boas Práticas

**Conteúdo:**

- **JUnit:** Framework padrão para testes em Java
- **Testes Unitários:** Testar a menor unidade de lógica (um método)
- **Assertions:** Verificações de resultado esperado
- **Mocks:** Simular dependências
- **Test-Driven Development (TDD):** Escrever testes antes do código

**Por que estudar:** Código profissional é código testado. Testes garantem qualidade e facilitam refatoração.

---

## 🎯 Checklist de Domínio

### ✅ Ao Concluir Este Guia, Você Será Capaz De:

**Fundamentos:**

- [ ] Pensar algoritmicamente e decompor problemas complexos
- [ ] Analisar eficiência de código usando Big O
- [ ] Escolher a estrutura de dados adequada para cada situação

**Java Core:**

- [ ] Desenvolver aplicações Java robustas
- [ ] Aplicar os 4 pilares da OOP corretamente
- [ ] Usar Collections Framework com proficiência
- [ ] Tratar erros de forma profissional

**Backend:**

- [ ] Construir APIs REST escaláveis com Spring Boot
- [ ] Integrar aplicações com bancos de dados relacionais
- [ ] Implementar segurança e autenticação
- [ ] Fazer deploy de aplicações em produção

**Frontend:**

- [ ] Criar interfaces modernas e responsivas com Angular
- [ ] Gerenciar estado e navegação em SPAs
- [ ] Consumir APIs REST do backend

**Qualidade:**

- [ ] Escrever código limpo e legível
- [ ] Aplicar princípios SOLID em projetos reais
- [ ] Criar testes unitários abrangentes
- [ ] Refatorar código mantendo funcionalidade

**Full-Stack:**

- [ ] Integrar frontend Angular + backend Spring + banco de dados
- [ ] Entender o fluxo completo de uma aplicação web
- [ ] Debugar problemas em qualquer camada da aplicação

---

## 📌 Nota Final

### Por Que Esta Ordem?

A progressão **Lógica → Java → OOP → Estruturas de Dados → Spring → Angular → Boas Práticas** não é arbitrária:

1. **Fundamentos primeiro:** Entender _como pensar_ antes de _como escrever_
2. **Sintaxe depois:** Java como ferramenta para expressar lógica
3. **Paradigma OOP:** Organizar código complexo de forma sustentável
4. **Estruturas de Dados:** Eficiência e escolhas corretas
5. **Frameworks:** Produtividade em escala empresarial
6. **Qualidade:** Profissionalismo e código de longo prazo

---

_Última atualização: Novembro 2025_
