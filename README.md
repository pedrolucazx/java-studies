# Java Studies ☕

Repositório de estudos sobre a linguagem Java, contendo exercícios, desafios e anotações sobre fundamentos, POO e frameworks.

## 📚 Sumário

- [História do Java](#história-do-java)
  - [O Início: Green Team e o Projeto Green](#o-início-green-team-e-o-projeto-green)
  - [Oak e a Visão de Dispositivos Conectados](#oak-e-a-visão-de-dispositivos-conectados)
  - [Da TV Interativa à Web: WebRunner](#da-tv-interativa-à-web-webrunner)
  - [Como Java Recebeu Seu Nome](#como-java-recebeu-seu-nome)
  - [HotJava: O Primeiro Navegador Java](#hotjava-o-primeiro-navegador-java)
  - [Write Once, Run Anywhere](#write-once-run-anywhere)
  - [O Lançamento do JDK 1.0](#o-lançamento-do-jdk-10)
  - [A Era Oracle](#a-era-oracle)
- [Gerenciadores de Build](#gerenciadores-de-build)
  - [O que são Gerenciadores de Build?](#o-que-são-gerenciadores-de-build)
  - [Maven](#maven)
  - [Gradle](#gradle)
  - [Maven vs Gradle: Principais Diferenças](#maven-vs-gradle-principais-diferenças)
- [IDEs para Java](#ides-para-java)
  - [IntelliJ IDEA](#intellij-idea)
  - [Visual Studio Code](#visual-studio-code)

## 📖 História do Java

### O Início: Green Team e o Projeto Green

Em 1991, a **Sun Microsystems** criou um grupo de pesquisa especial chamado **Green Team**, liderado por **James Gosling**, **Mike Sheridan** e **Patrick Naughton**. O objetivo inicial não era criar uma nova linguagem de programação, mas sim desenvolver tecnologias para a próxima geração de dispositivos eletrônicos.

O projeto, conhecido como **"Projeto Green"**, tinha uma visão ambiciosa para a época: criar software que pudesse ser executado em diferentes tipos de dispositivos eletrônicos, antecipando a era da Internet das Coisas (IoT).

### Oak e a Visão de Dispositivos Conectados

A primeira linguagem desenvolvida pelo Green Team foi chamada **Oak** (carvalho em inglês), nome inspirado por uma árvore que James Gosling podia ver da janela de seu escritório. A linguagem foi projetada especificamente para **programar dispositivos eletrônicos de consumo**, como televisores interativos, controles remotos e outros aparelhos domésticos.

A visão era revolucionária: **residências conectadas por dispositivos inteligentes** que pudessem se comunicar entre si. Embora essa ideia tenha se tornado realidade décadas depois com a IoT, na época dos anos 90 o mercado ainda não estava pronto para essa tecnologia.

### Da TV Interativa à Web: WebRunner

O projeto inicial de TV interativa não obteve o sucesso comercial esperado. No entanto, em 1994, com o crescimento explosivo da **World Wide Web**, a equipe percebeu que a linguagem Oak poderia ter uma aplicação perfeita na internet.

Eles desenvolveram um navegador experimental chamado **WebRunner** (originalmente chamado de **"GreenTalk"**), que era capaz de executar programas interativos (applets) dentro de páginas web. Esse foi o momento crucial que transformou o projeto.

### Como Java Recebeu Seu Nome

O nome "Oak" já estava registrado como marca por outra empresa, então a equipe precisou encontrar um novo nome. Após várias sessões de brainstorming, o nome **"Java"** foi escolhido.

A origem do nome tem diferentes versões, mas a mais aceita é que **Java** é uma referência ao **café Java**, uma variedade de café da ilha de Java, na Indonésia. A equipe de desenvolvimento consumia muito café durante as longas sessões de programação, e o nome capturava perfeitamente a energia e o dinamismo que queriam para a linguagem. O logotipo da xícara de café fumegante se tornou icônico e permanece até hoje.

### HotJava: O Primeiro Navegador Java

Em 1995, a Sun Microsystems apresentou oficialmente o **HotJava**, um navegador web completamente escrito em Java. O HotJava demonstrou o poder da linguagem ao executar **applets Java** - pequenos programas que rodavam diretamente no navegador, trazendo interatividade e animações às páginas web.

Essa capacidade era revolucionária na época, quando a maioria das páginas web era estática. O HotJava provou que Java poderia transformar a experiência na internet.

### Write Once, Run Anywhere

O grande diferencial de Java ficou consolidado em seu famoso lema: **"Write Once, Run Anywhere"** (Escreva uma vez, rode em qualquer lugar).

Esse princípio se baseava na **Java Virtual Machine (JVM)** - uma camada de abstração que permitia que o mesmo código Java fosse executado em diferentes sistemas operacionais (Windows, macOS, Linux, Solaris) e diferentes tipos de dispositivos, sem necessidade de recompilação.

Esta **portabilidade** era algo inédito e se tornou um dos maiores atrativos da linguagem, especialmente para empresas que precisavam desenvolver software para múltiplas plataformas.

### O Lançamento do JDK 1.0

Em **23 de janeiro de 1996**, a Sun Microsystems lançou oficialmente o **JDK 1.0** (Java Development Kit), a primeira versão do kit de desenvolvimento Java disponível publicamente.

O JDK incluía:

- Compilador Java
- Java Virtual Machine (JVM)
- Bibliotecas padrão (API Java)
- Ferramentas de desenvolvimento

Com o JDK 1.0, desenvolvedores de todo o mundo puderam começar a criar aplicações Java. A linguagem rapidamente ganhou popularidade, especialmente em aplicações empresariais e desenvolvimento web.

### A Era Oracle

Em **2010**, a **Oracle Corporation** adquiriu a Sun Microsystems por aproximadamente **$7.4 bilhões**, assumindo o controle sobre Java e suas tecnologias relacionadas.

Sob a Oracle, Java continuou evoluindo com:

- Lançamentos regulares de novas versões
- Melhorias de performance na JVM
- Novas funcionalidades (lambdas, streams, módulos)
- Java SE, Java EE e Java ME
- Maior adoção em cloud computing e microserviços

Hoje, Java permanece como uma das linguagens mais populares do mundo, presente em bilhões de dispositivos - de smartphones Android a sistemas corporativos de larga escala - realizando a visão original do Green Team de uma linguagem verdadeiramente universal.

---

## 🏗️ Gerenciadores de Build

### O que são Gerenciadores de Build?

**Gerenciadores de build** (ou build tools) são ferramentas que automatizam o processo de construção de aplicações. Em projetos Java, eles são essenciais para:

- **Gerenciar dependências**: Baixar e atualizar bibliotecas externas automaticamente
- **Compilar código**: Transformar arquivos `.java` em bytecode `.class`
- **Executar testes**: Rodar testes unitários e de integração
- **Empacotar aplicações**: Gerar arquivos JAR, WAR ou outros formatos
- **Automatizar tarefas**: Executar scripts personalizados no ciclo de build

Sem um gerenciador de build, você precisaria baixar manualmente cada biblioteca (JAR), configurar o classpath, compilar cada arquivo e gerenciar versões - um processo trabalhoso e propenso a erros.

### Maven

**Apache Maven** é o gerenciador de build mais tradicional e amplamente utilizado no ecossistema Java, criado em 2004.

#### Características principais:

- **Baseado em XML**: Usa o arquivo `pom.xml` (Project Object Model) para configuração
- **Convenção sobre configuração**: Segue uma estrutura de diretórios padrão bem definida
- **Repositório central**: Maven Central hospeda milhares de bibliotecas Java
- **Ciclo de vida definido**: Fases predefinidas (compile, test, package, install, deploy)
- **Plugins**: Extensível através de plugins para diferentes tarefas

**Vantagens do Maven:**

- Amplamente adotado e com vasta documentação
- Grande quantidade de plugins disponíveis
- Estrutura consistente entre projetos
- Integração com a maioria das IDEs e ferramentas CI/CD

### Gradle

**Gradle** é um gerenciador de build mais moderno, lançado em 2007, que tem ganhado muita popularidade, especialmente em projetos Android.

#### Características principais:

- **Baseado em Groovy/Kotlin DSL**: Usa `build.gradle` ou `build.gradle.kts` para configuração
- **Mais flexível**: Permite programação imperativa, não apenas declarativa
- **Builds incrementais**: Recompila apenas o que mudou, tornando builds mais rápidos
- **Build cache**: Reutiliza resultados de builds anteriores
- **Compatibilidade com Maven**: Pode usar repositórios Maven
- **Daemon**: Processo em background que acelera builds subsequentes

**Vantagens do Gradle:**

- Builds mais rápidos (até 100x em alguns casos)
- Sintaxe mais concisa e legível
- Maior flexibilidade para personalizações
- Oficial para desenvolvimento Android
- Suporte a builds multi-projeto mais eficiente

### Maven vs Gradle: Principais Diferenças

| Aspecto                     | Maven             | Gradle                             |
| --------------------------- | ----------------- | ---------------------------------- |
| **Configuração**            | XML (`pom.xml`)   | Groovy/Kotlin DSL (`build.gradle`) |
| **Performance**             | Mais lento        | Mais rápido (builds incrementais)  |
| **Curva de aprendizado**    | Mais simples      | Mais complexo inicialmente         |
| **Flexibilidade**           | Menos flexível    | Altamente flexível                 |
| **Adoção**                  | Mais estabelecido | Crescente (Android)                |
| **Tamanho da configuração** | Mais verboso      | Mais conciso                       |

**Quando usar Maven:**

- Projetos corporativos tradicionais
- Equipes que preferem convenções rígidas
- Quando a simplicidade é mais importante que performance

**Quando usar Gradle:**

- Projetos Android
- Builds complexos que precisam de customização
- Quando performance de build é crítica
- Projetos multi-módulo grandes

---

## 💻 IDEs para Java

**IDE** (Integrated Development Environment - Ambiente de Desenvolvimento Integrado) é um software que fornece ferramentas completas para desenvolvimento, incluindo editor de código, debugger, compilador e outras funcionalidades que aumentam a produtividade.

### IntelliJ IDEA

**IntelliJ IDEA**, desenvolvido pela JetBrains, é considerado por muitos como a melhor IDE para desenvolvimento Java.

#### Características principais:

- **Autocompletar inteligente**: Sugestões contextuais extremamente precisas
- **Refatoração poderosa**: Renomear, extrair métodos, mover classes com segurança
- **Análise de código em tempo real**: Detecta bugs, code smells e sugere melhorias
- **Debugger avançado**: Breakpoints condicionais, evaluate expressions, hot swap
- **Integração nativa**: Maven, Gradle, Git, Docker, Kubernetes
- **Suporte completo ao Spring**: Spring Boot, Spring Data, Spring Security
- **Database tools**: Cliente SQL integrado
- **Plugins**: Ecossistema rico de extensões

#### Versões:

- **Community Edition (CE)**: Gratuita e open-source, ideal para desenvolvimento Java puro
- **Ultimate Edition**: Paga, com suporte adicional para web (Spring, Jakarta EE), JavaScript, bancos de dados, frameworks e ferramentas empresariais

#### Vantagens:

- Interface intuitiva e bem projetada
- Ferramentas de refatoração superiores
- Excelente para projetos Spring Boot
- Navegação de código extremamente eficiente
- Detecção inteligente de erros antes da compilação

#### Desvantagens:

- Consome bastante memória RAM (recomendado 8GB+)
- Ultimate Edition é paga (porém com licença gratuita para estudantes)
- Pode ser lento em máquinas mais antigas

**Ideal para**: Desenvolvedores profissionais Java, projetos empresariais, desenvolvimento Spring Boot, quem busca máxima produtividade.

### Visual Studio Code

**Visual Studio Code (VS Code)**, desenvolvido pela Microsoft, é um editor de código leve que pode se tornar uma IDE completa através de extensões.

#### Características principais:

- **Leve e rápido**: Consome menos recursos que IDEs tradicionais
- **Extensões Java**: Java Extension Pack da Microsoft
- **Multi-linguagem**: Excelente para projetos full-stack (Java + JavaScript/TypeScript)
- **Terminal integrado**: Suporte nativo para múltiplos terminais
- **Git integrado**: Controle de versão visual intuitivo
- **Customizável**: Temas, atalhos e configurações altamente personalizáveis
- **Gratuito e open-source**: Totalmente livre para uso comercial

#### Extensões essenciais para Java:

- **Extension Pack for Java**: Pacote oficial com:
  - Language Support for Java (Red Hat)
  - Debugger for Java
  - Test Runner for Java
  - Maven for Java
  - Project Manager for Java
  - IntelliCode
- **Spring Boot Extension Pack**: Suporte para Spring Boot
- **Gradle for Java**: Integração com Gradle

#### Vantagens:

- Muito leve e rápido
- Gratuito e totalmente open-source
- Excelente para projetos polyglot (Java + outras linguagens)
- Grande comunidade e ecossistema de extensões
- Funciona bem em máquinas com recursos limitados
- Melhor para desenvolvimento full-stack

#### Desvantagens:

- Requer configuração manual de extensões
- Ferramentas de refatoração menos poderosas que IntelliJ
- Autocompletar menos inteligente para Java
- Algumas features avançadas podem requerer configuração adicional

**Ideal para**: Desenvolvedores full-stack, projetos menores, quem trabalha com múltiplas linguagens, máquinas com recursos limitados, iniciantes que querem uma ferramenta gratuita.

---

## 📂 Estrutura do Projeto

```
java-studies/
├── challenges/          # Desafios e exercícios práticos
└── docs/               # Documentação adicional
```

## 📚 Recursos

Para um guia detalhado sobre os cursos e livros de estudo, consulte o [Guia de Estudos](GUIA_DE_ESTUDOS.md).

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
