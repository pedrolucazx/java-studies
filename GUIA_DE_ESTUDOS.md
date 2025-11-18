# 🎓 Guia de Estudo: Do Algoritmo ao Full-Stack

## Java, Spring Boot & Angular

---

## 📋 Índice

- [Prefácio](#-prefácio-uma-abordagem-pedagógica)
- [Parte 1: Fundação - Lógica e Algoritmos](#-parte-1-fundação---lógica-e-algoritmos)
- [Parte 2: Linguagem Java - Fundamentos](#-parte-2-linguagem-java---fundamentos)
- [Parte 3: Orientação a Objetos](#-parte-3-orientação-a-objetos-oop)
- [Parte 4: Estruturas de Dados](#-parte-4-estruturas-de-dados-e-algoritmos)
- [Parte 5: Tratamento de Erros e Projeto](#-parte-5-consolidação---erros-e-projeto-prático)
- [Parte 6: Backend com Spring](#-parte-6-backend---spring-framework)
- [Parte 7: Frontend com Angular](#-parte-7-frontend---angular)
- [Parte 8: Boas Práticas](#-parte-8-boas-práticas-e-engenharia)
- [Parte 9: Próximos Passos](#-parte-9-próximos-passos)
- [Recursos e Referências](#-recursos-e-referências)

---

## 🎯 Prefácio: Uma Abordagem Pedagógica

### Sobre Este Guia

Este documento é um **roteiro de integração** que conecta estrategicamente cursos e livros em uma progressão pedagógica deliberada, transitando da teoria fundamental da Ciência da Computação para a implementação prática da Engenharia de Software.

### 📊 Progressão de Aprendizado

```
Lógica Agnóstica → Implementação Java → Eficiência Teórica → Aplicação Profissional
   (Fundação)          (Sintaxe)           (Otimização)         (Produção)
```

| Fase                    | Foco                                             | Fontes Principais    |
| ----------------------- | ------------------------------------------------ | -------------------- |
| **1️⃣ Lógica Agnóstica** | Pensamento computacional e análise de eficiência | Furlan, Bhargava     |
| **2️⃣ Implementação**    | Java e Orientação a Objetos                      | Cod3r                |
| **3️⃣ Eficiência**       | Por que certas soluções são melhores             | Bhargava             |
| **4️⃣ Profissional**     | Escalar e manter aplicações complexas            | DIO, Spring, Angular |

> 💡 **Dica de Estudo:** Ao começar uma seção prática (ex: Collections), consulte primeiro a teoria correspondente (ex: Tabelas Hash) para compreensão completa.

---

## 📚 Parte 1: Fundação - Lógica e Algoritmos

**📖 Fontes:** Furlan - Algoritmos e Lógica | Bhargava - Entendendo Algoritmos

> 🎯 **Objetivo:** Estabelecer o pensamento computacional, independente de linguagem

### 1.1 🧠 O que é um Algoritmo?

**📘 Fonte:** Furlan, Cap. 1

#### Conceito Fundamental

Um algoritmo é um **"conjunto de regras"** para solução de problemas. A programação começa com **análise e síntese**, não com código.

#### Processo de Engenharia

```
Ideias → Projeto Lógico → Implementação → Testes → Entrega
```

#### ✅ Tópicos-chave

- ✓ Definição formal de algoritmo
- ✓ Processo: Requisitos → Análise → Projeto → Implementação → Testes
- ✓ Modelagem de problemas
- ✓ **"Projeto lógico primeiro"** - diferencial do profissional

---

### 1.2 📊 Análise de Performance e Notação Big O

**📘 Fonte:** Bhargava, Cap. 1

#### Por que medir eficiência?

Múltiplas soluções podem resolver o mesmo problema. Big O permite provar **objetivamente** qual é superior.

#### Pesquisa Binária

Primeiro exemplo de algoritmo eficiente: $O(\log n)$ vs $O(n)$

#### ⚡ Complexidades Comuns

| Notação       | Nome        | Exemplo                   | Performance          |
| ------------- | ----------- | ------------------------- | -------------------- |
| $O(1)$        | Constante   | Acesso a array por índice | ⚡⚡⚡⚡⚡ Excelente |
| $O(\log n)$   | Logarítmica | Pesquisa binária          | ⚡⚡⚡⚡ Ótimo       |
| $O(n)$        | Linear      | Pesquisa simples          | ⚡⚡⚡ Bom           |
| $O(n \log n)$ | Log-linear  | Quicksort (médio)         | ⚡⚡ Aceitável       |
| $O(n^2)$      | Quadrática  | Ordenação por seleção     | ⚡ Lento             |
| $O(n!)$       | Fatorial    | Caixeiro viajante         | ❌ Intratável        |

#### 📌 Pontos-chave

- **Taxas de Crescimento:** Diferentes algoritmos escalam diferentemente
- **Pior Hipótese:** Big O garante performance mínima
- **Análise Objetiva:** Comparação antes da implementação

---

### 1.3 🛠️ Ferramentas de Modelagem

**📘 Fonte:** Furlan, Cap. 3 & 4

#### Ferramentas Visuais

| Ferramenta              | Descrição                             | Uso                          |
| ----------------------- | ------------------------------------- | ---------------------------- |
| **Fluxogramas**         | Representação gráfica (ISO 5807/1985) | Visualizar fluxo de execução |
| **Portugol**            | Pseudocódigo em português             | Escrever lógica sem sintaxe  |
| **Nassi-Schneidermann** | Diagramas em caixas                   | Estruturação hierárquica     |

#### 🔷 As 3 Estruturas Universais

Todo algoritmo pode ser construído com apenas 3 estruturas:

**1. 📋 Sequenciais**

```
Execução linear, passo a passo
```

**2. 🔀 Decisão**

- SE-ENTÃO (`if`)
- SE-ENTÃO-SENÃO (`if-else`)
- CASO (`switch`)

**3. 🔄 Repetição**

- ENQUANTO-FAÇA (`while`)
- REPITA-ATÉ (`do-while`)
- PARA-ATÉ-FAÇA (`for`)

> ⚠️ **Importante:** As estruturas de controle do Java são **implementações** dessas estruturas lógicas formais. Domine a lógica primeiro, a sintaxe vem depois!

---

### 1.4 💻 Arquitetura do Computador

**📘 Fonte:** Furlan, Cap. 2

#### Por que estudar hardware?

Entender a arquitetura explica **por que** certas estruturas de dados são mais rápidas.

#### 🏗️ Arquitetura de Von Neumann

```
┌─────────────────────────────────────┐
│   UCP (Processamento)               │
│   - Busca instruções                │
│   - Executa operações               │
└───────────┬─────────────────────────┘
            │
┌───────────▼─────────────────────────┐
│   Memória RAM                       │
│   - Endereços sequenciais           │
│   - Armazenamento temporário        │
└───────────┬─────────────────────────┘
            │
┌───────────▼─────────────────────────┐
│   I/O (Entrada/Saída)               │
│   - Dispositivos externos           │
└─────────────────────────────────────┘
```

#### 🔑 Conceitos Fundamentais

- **Bit:** Dígito binário (0 ou 1)
- **Byte:** Conjunto de 8 bits
- **Endereços de Memória:** Localização de dados na RAM
- **Ciclo de Execução:** Buscar → Decodificar → Executar

> 🔗 **Conexão:** Este conhecimento é base para entender Arrays (armazenamento contíguo) vs Listas Encadeadas (dispersas na memória) no Cap. 2 de Bhargava.

---

---

## ☕ Parte 2: Linguagem Java - Fundamentos

**🎓 Curso:** Cod3r - Java COMPLETO (Seções 03-04)

> 🎯 **Objetivo:** Traduzir conceitos lógicos para sintaxe Java

### 2.1 🔧 Sintaxe Fundamental

**📂 Cod3r Seção 03**

#### Ecossistema Java

```
JDK (Java Development Kit)
 ├── JRE (Java Runtime Environment)
 │    └── JVM (Java Virtual Machine)
 └── Ferramentas de Desenvolvimento
```

#### 📦 Tipos de Dados

| Categoria     | Tipos Primitivos               | Wrapper Classes                    |
| ------------- | ------------------------------ | ---------------------------------- |
| **Inteiros**  | `byte`, `short`, `int`, `long` | `Byte`, `Short`, `Integer`, `Long` |
| **Decimais**  | `float`, `double`              | `Float`, `Double`                  |
| **Caractere** | `char`                         | `Character`                        |
| **Lógico**    | `boolean`                      | `Boolean`                          |

#### 🔨 Operadores

**Aritméticos:** `+` `-` `*` `/` `%`  
**Relacionais:** `==` `!=` `>` `<` `>=` `<=`  
**Lógicos:** `&&` `||` `!`  
**Atribuição:** `=` `+=` `-=` `*=` `/=`  
**Ternário:** `condição ? true : false`

#### 🔗 Mapeamento Lógico

| Conceito (Furlan)                    | Implementação (Java)    |
| ------------------------------------ | ----------------------- | --- | ------ |
| Tipos de dados (Números, Caracteres) | `int`, `double`, `char` |
| Operações aritméticas                | `+`, `-`, `*`, `/`      |
| Operações relacionais                | `==`, `!=`, `>`, `<`    |
| Operações lógicas (AND, OR, NOT)     | `&&`, `                 |     | `, `!` |
| Atribuição ←                         | `=`                     |

---

### 2.2 🔀 Estruturas de Controle

**📂 Cod3r Seção 04**

#### Estruturas de Decisão

```java
// SE-ENTÃO
if (condição) {
    // código
}

// SE-ENTÃO-SENÃO
if (condição) {
    // código
} else {
    // código alternativo
}

// CASO
switch (variavel) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código padrão
}
```

#### Estruturas de Repetição

```java
// ENQUANTO-FAÇA
while (condição) {
    // código
}

// REPITA-ATÉ
do {
    // código
} while (condição);

// PARA-ATÉ-FAÇA
for (int i = 0; i < limite; i++) {
    // código
}
```

#### ⚙️ Controles de Laço

| Comando    | Função                     |
| ---------- | -------------------------- |
| `break`    | Sai do laço imediatamente  |
| `continue` | Pula para próxima iteração |

> 💡 **Conexão:** Estas estruturas em Java são **implementações diretas** das estruturas universais vistas em Furlan (Parte 1.3)!

---

## 🎨 Parte 3: Orientação a Objetos (OOP)

**🎓 Curso:** Cod3r - Java COMPLETO (Seções 05, 07)

> 🎯 **Objetivo:** Transição do pensamento estruturado para orientado a objetos

### 3.1 🏗️ Classes e Métodos - Blocos de Construção

**📂 Cod3r Seção 05**

#### Conceitos Fundamentais

```java
// Classe: O molde/template
public class Pessoa {
    // Atributos: Estado do objeto
    private String nome;
    private int idade;

    // Construtor: Inicialização
    public Pessoa(String nome, int idade) {
        this.nome = nome;    // 'this' = referência ao objeto
        this.idade = idade;
    }

    // Métodos: Comportamento
    public void apresentar() {
        System.out.println("Olá, sou " + nome);
    }
}

// Objeto: Instância concreta
Pessoa pessoa1 = new Pessoa("João", 25);
```

#### 📋 Elementos da OOP

| Elemento       | Definição                         | Exemplo                  |
| -------------- | --------------------------------- | ------------------------ |
| **Classe**     | Molde/template para objetos       | `class Carro`            |
| **Objeto**     | Instância concreta da classe      | `new Carro()`            |
| **Atributos**  | Variáveis que definem estado      | `private String cor;`    |
| **Métodos**    | Funções que definem comportamento | `public void acelerar()` |
| **Construtor** | Método especial de inicialização  | `public Carro()`         |
| **this**       | Referência ao objeto atual        | `this.nome`              |

---

### 3.2 🏛️ Os 4 Pilares da OOP

**📂 Cod3r Seção 07**

#### 1️⃣ Encapsulamento 🔒

**Proteger o estado interno do objeto**

```java
public class ContaBancaria {
    private double saldo;  // Privado - protegido

    // Acesso controlado via métodos públicos
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
```

**Modificadores de Acesso:**

- `private` - Apenas dentro da classe
- `protected` - Classe e subclasses
- `public` - Qualquer lugar

---

#### 2️⃣ Herança 🧬

**Reutilizar código através de hierarquia**

```java
// Superclasse
public class Animal {
    protected String nome;

    public void comer() {
        System.out.println("Comendo...");
    }
}

// Subclasse herda de Animal
public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au au!");
    }
}

Cachorro dog = new Cachorro();
dog.comer();  // Herdado de Animal
dog.latir();  // Próprio de Cachorro
```

**Palavras-chave:**

- `extends` - Declara herança
- `super` - Acessa superclasse

---

#### 3️⃣ Polimorfismo 🎭

**"Muitas formas" - Objetos tratados de múltiplas maneiras**

```java
public class Animal {
    public void fazerSom() {
        System.out.println("Som genérico");
    }
}

public class Gato extends Animal {
    @Override  // Sobrescreve método da superclasse
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

Animal animal = new Gato();  // Polimorfismo
animal.fazerSom();  // Imprime: Miau!
```

---

#### 4️⃣ Abstração 🎯

**Expor apenas o essencial, esconder complexidade**

```java
// Classe abstrata - não pode ser instanciada
public abstract class Forma {
    public abstract double calcularArea();  // Método abstrato
}

// Interface - contrato puro
public interface Desenhavel {
    void desenhar();
}

// Implementação concreta
public class Circulo extends Forma implements Desenhavel {
    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando círculo");
    }
}
```

#### 📊 Pilares vs SOLID

| Conceito      | O que é                             | Quando usar                           |
| ------------- | ----------------------------------- | ------------------------------------- |
| **4 Pilares** | Ferramentas que a linguagem oferece | Construir programas OOP               |
| **SOLID**     | Regras de como usar os pilares      | Garantir qualidade e manutenibilidade |

> ⚠️ **Nota:** Os pilares são as ferramentas. SOLID (Parte 8) são as **regras** de como usá-las corretamente.

---

## 📊 Parte 4: Estruturas de Dados e Algoritmos

**📚 Fontes:** Cod3r (Seção 06) | Furlan (Cap 5) | Bhargava (Cap 2-5)

> 🎯 **Objetivo:** Convergência de teoria e prática para manipulação eficiente de dados

### 4.1 📦 Arrays - Estruturas Estáticas

**📘 Teoria (Furlan, Cap 5)**

Conceito fundamental: agrupar dados do mesmo tipo sob um único nome

```
Memória Contígua:
[0][1][2][3][4]  ← Índices
[A][B][C][D][E]  ← Valores
```

| Tipo       | Descrição            | Exemplo                          |
| ---------- | -------------------- | -------------------------------- |
| **Vetor**  | Array unidimensional | `int[] numeros = {1, 2, 3}`      |
| **Matriz** | Array bidimensional  | `int[][] tabela = new int[3][3]` |

**💻 Prática (Cod3r, Seção 06)**

```java
// Declaração e inicialização
int[] numeros = new int[5];
String[] nomes = {"Ana", "Bruno", "Carlos"};

// Iteração
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}

// For-each
for (String nome : nomes) {
    System.out.println(nome);
}
```

---

### 4.2 🔗 Estruturas Dinâmicas - Trade-offs

**📘 Bhargava, Cap. 2**

#### Arrays vs Listas Encadeadas

```
Arrays:           [A][B][C][D]  (Contíguo)
                   ↓  ↓  ↓  ↓
Listas Encadeadas: [A]→[C]→[B]→[D]  (Disperso)
```

| Estrutura           | Armazenamento | Leitura   | Inserção/Deleção | Quando usar                   |
| ------------------- | ------------- | --------- | ---------------- | ----------------------------- |
| **Array**           | Contíguo      | $O(1)$ ⚡ | $O(n)$ ⏳        | Acesso frequente por índice   |
| **Lista Encadeada** | Disperso      | $O(n)$ ⏳ | $O(1)$ ⚡        | Inserções/deleções frequentes |

---

### 4.3 🔄 Recursão e Ordenação

**📘 Bhargava, Cap. 3-4**

#### Recursão - Fundação dos Algoritmos

```java
// Estrutura básica
public int recursiva(int n) {
    if (n <= 1) return 1;  // ← Caso base
    return n * recursiva(n - 1);  // ← Caso recursivo
}
```

**Pilha de Chamadas:**

```
recursiva(3)
  ├─ recursiva(2)
  │   └─ recursiva(1)  ← Retorna
  └─ Retorna
```

#### Algoritmos de Ordenação

| Algoritmo     | Complexidade          | Características                          |
| ------------- | --------------------- | ---------------------------------------- |
| **Seleção**   | $O(n^2)$              | Simples, mas ineficiente                 |
| **Quicksort** | $O(n \log n)$ [médio] | Eficiente, usa "Dividir para Conquistar" |

---

### 4.4 📚 Java Collections Framework

**💻 Cod3r, Seção 06**

#### Hierarquia de Interfaces

```
Collection
├── List (ordenada, permite duplicatas)
│   ├── ArrayList    ← Array dinâmico
│   └── LinkedList   ← Lista encadeada
├── Set (não permite duplicatas)
│   └── HashSet      ← Tabela hash
├── Queue (FIFO)
│   └── LinkedList
└── Map (chave-valor)
    └── HashMap      ← Tabela hash
```

#### 📋 Guia de Uso

| Interface | Implementação | Quando Usar                  | Exemplo           |
| --------- | ------------- | ---------------------------- | ----------------- |
| **List**  | `ArrayList`   | Acesso por índice frequente  | Lista de produtos |
| **List**  | `LinkedList`  | Inserções/remoções no meio   | Fila de processos |
| **Set**   | `HashSet`     | Sem duplicatas, busca rápida | Emails únicos     |
| **Map**   | `HashMap`     | Chave-valor, busca por chave | Cache de dados    |

```java
// Exemplos práticos
List<String> lista = new ArrayList<>();
lista.add("Item 1");

Set<Integer> conjunto = new HashSet<>();
conjunto.add(1);
conjunto.add(1);  // Ignorado (duplicata)

Map<String, Integer> mapa = new HashMap<>();
mapa.put("chave", 100);
```

---

### 4.5 # Tabelas Hash - Poder do O(1)

**📘 Bhargava, Cap. 5**

#### Como Funcionam

```
Chave → Função Hash → Índice → Valor
"João" →    hash()    →   3   → {dados}
```

#### Conceitos-chave

| Conceito           | Descrição                                |
| ------------------ | ---------------------------------------- |
| **Função Hash**    | Mapeia chave para índice de array        |
| **Colisão**        | Duas chaves geram mesmo índice           |
| **Fator de Carga** | Controla redimensionamento               |
| **Performance**    | $O(1)$ médio para busca/inserção/deleção |

> 💡 **Por que HashMap é rápido?** `map.get("chave")` não percorre toda a coleção - usa hash para acesso direto!

---

### 4.6 📊 Tabela Resumo: Estruturas de Dados

| Estrutura       | Java                | Fonte Teoria                  | Busca  | Inserção | Deleção | Uso Ideal            |
| --------------- | ------------------- | ----------------------------- | ------ | -------- | ------- | -------------------- |
| Array (fixo)    | `int[]`             | Furlan Cap 5 / Bhargava Cap 2 | $O(n)$ | N/A      | N/A     | Tamanho conhecido    |
| Array dinâmico  | `ArrayList`         | Bhargava Cap 2                | $O(n)$ | $O(n)$   | $O(n)$  | Acesso por índice    |
| Lista encadeada | `LinkedList`        | Bhargava Cap 2                | $O(n)$ | $O(1)$   | $O(1)$  | Inserções frequentes |
| Tabela hash     | `HashMap`/`HashSet` | Bhargava Cap 5                | $O(1)$ | $O(1)$   | $O(1)$  | Busca rápida         |

---

## ✅ Parte 5: Consolidação - Erros e Projeto Prático

**🎓 Curso:** Cod3r (Seções 10-11)

> 🎯 **Objetivo:** Robustez e integração de conhecimentos

### 5.1 ⚠️ Tratamento de Exceções

**📂 Cod3r Seção 10**

#### Hierarquia de Exceções

```
Throwable
├── Error (erros graves do sistema)
└── Exception
    ├── RuntimeException (não checadas)
    │   ├── NullPointerException
    │   └── ArrayIndexOutOfBoundsException
    └── IOException (checadas)
        └── FileNotFoundException
```

#### Estrutura try-catch-finally

```java
try {
    // Código que pode gerar exceção
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    // Tratamento específico
    System.out.println("Divisão por zero!");
} catch (Exception e) {
    // Tratamento genérico
    System.out.println("Erro: " + e.getMessage());
} finally {
    // Sempre executado
    System.out.println("Limpeza de recursos");
}
```

#### Tipos de Exceções

| Tipo             | Verificação  | Obrigatório Tratar? | Exemplo                |
| ---------------- | ------------ | ------------------- | ---------------------- |
| **Checadas**     | Compile-time | ✅ Sim              | `IOException`          |
| **Não Checadas** | Runtime      | ❌ Não              | `NullPointerException` |

#### Lançar Exceções

```java
// throw - lança exceção
public void validarIdade(int idade) {
    if (idade < 18) {
        throw new IllegalArgumentException("Menor de idade");
    }
}

// throws - declara que método pode lançar
public void lerArquivo() throws IOException {
    // código
}
```

---

### 5.2 🎮 Projeto: Campo Minado

**📂 Cod3r Seção 11**

#### Integração de Conceitos

```
┌─────────────────────────────────────────┐
│  PROJETO CAMPO MINADO                   │
│  Integra TODOS os conceitos aprendidos  │
└─────────────────────────────────────────┘
```

| Conceito                   | Aplicação no Projeto                   | Fonte                         |
| -------------------------- | -------------------------------------- | ----------------------------- |
| **Matriz (Array 2D)**      | Tabuleiro do jogo                      | Furlan Cap 5 / Cod3r Seção 06 |
| **Recursão**               | Abrir células vizinhas automaticamente | Bhargava Cap 3                |
| **OOP**                    | Classes `Campo`, `Tabuleiro`, `Celula` | Cod3r Seções 05, 07           |
| **Exceções**               | Tratamento de jogadas inválidas        | Cod3r Seção 10                |
| **Estruturas de Controle** | Lógica de vitória/derrota              | Cod3r Seção 04                |
| **Testes**                 | JUnit para validação                   | Cod3r Seção 11                |

#### Exemplo de Estrutura

```java
public class Tabuleiro {
    private Campo[][] campos;  // Matriz 2D

    public void abrirCampo(int linha, int coluna) {
        if (!validarCoordenadas(linha, coluna)) {
            throw new ExplosaoException();  // Exceção
        }

        Campo campo = campos[linha][coluna];
        campo.abrir();

        if (campo.vizinhancaSegura()) {
            // Recursão para abrir vizinhos
            abrirVizinhos(linha, coluna);
        }
    }
}
```

---

## 🚀 Parte 6: Backend - Spring Framework

**🎓 Bootcamp:** DIO + Deal | **📘 Livro:** Bhargava (Cap 6-9)

> 🎯 **Objetivo:** Transição de programador para engenheiro de backend profissional

### 6.1 ⚡ Spring Boot - Produtividade

**📂 DIO: Produtividade com Spring Framework**

#### Conceitos Centrais

```
Spring Boot
├── IoC (Inversão de Controle)
│   └── Container gerencia componentes
├── DI (Injeção de Dependências)
│   └── Spring injeta dependências
└── Gerenciamento de Dependências
    └── Maven / Gradle
```

#### Injeção de Dependências na Prática

```java
@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    // Spring injeta automaticamente
    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
}
```

| Conceito        | Descrição                              | Benefício         |
| --------------- | -------------------------------------- | ----------------- |
| **IoC**         | Container controla ciclo de vida       | Menos acoplamento |
| **DI**          | Dependências injetadas automaticamente | Testabilidade     |
| **Auto-config** | Configuração automática                | Produtividade     |

---

### 6.2 🌐 APIs REST

**📂 DIO: Produtividade com Spring Framework**

#### Arquitetura REST

```java
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping
    public List<Usuario> listar() {
        return service.findAll();
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
```

#### 📋 Anotações Principais

| Anotação         | Método HTTP | Uso                |
| ---------------- | ----------- | ------------------ |
| `@GetMapping`    | GET         | Buscar dados       |
| `@PostMapping`   | POST        | Criar recurso      |
| `@PutMapping`    | PUT         | Atualizar completo |
| `@PatchMapping`  | PATCH       | Atualizar parcial  |
| `@DeleteMapping` | DELETE      | Remover recurso    |

**Documentação:** Swagger/OpenAPI para doc automática

---

### 6.3 💾 Persistência de Dados

**📂 DIO: Integração com Banco de Dados**

#### Camadas de Persistência

```
Application
     ↓
Controller (REST)
     ↓
Service (Lógica de Negócio)
     ↓
Repository (Acesso a Dados)
     ↓
Database
```

#### JPA/Hibernate - ORM

```java
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true)
    private String email;
}

// Repository - abstração do banco
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
```

| Tecnologia    | Nível | Descrição                      |
| ------------- | ----- | ------------------------------ |
| **JDBC**      | Baixo | SQL direto em Java             |
| **JPA**       | Alto  | Especificação ORM              |
| **Hibernate** | Alto  | Implementação JPA mais popular |

---

### 6.4 🔐 Tópicos Avançados

#### Spring Security

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/public/**").permitAll()
                .anyRequest().authenticated()
            )
            .oauth2Login();
        return http.build();
    }
}
```

#### Deploy (Railway / Cloud)

```
Desenvolvimento → Build → Testes → Deploy → Monitoramento
```

---

### 6.5 🧮 Algoritmos para Escala

**📘 Bhargava, Cap 6-9**

#### Aplicações em Backend

| Algoritmo          | Cap | Problema Real          | Solução                                |
| ------------------ | --- | ---------------------- | -------------------------------------- |
| **Grafos (BFS)**   | 6   | Rede de microserviços  | Encontrar caminho mínimo               |
| **Dijkstra**       | 7   | Roteamento de rede     | Caminho com menor latência             |
| **Gulosos**        | 8   | Agendamento de tarefas | Otimização de recursos                 |
| **Prog. Dinâmica** | 9   | Alocação de recursos   | Problema da mochila (CPU/RAM)          |
| **NP-Completo**    | 8   | Caixeiro-viajante      | Usar aproximação, não solução perfeita |

> 💡 **Insight:** Estes algoritmos não são acadêmicos - são ferramentas práticas para design de sistemas em larga escala!

---

## 🎨 Parte 7: Frontend - Angular

**🎓 Bootcamp:** DIO + Deal (Angular)

> 🎯 **Objetivo:** Construir interfaces de usuário modernas e reativas

### 7.1 🌐 Ecossistema Angular

#### Fundamentos

| Conceito        | Descrição                               |
| --------------- | --------------------------------------- |
| **TypeScript**  | JavaScript com tipos estáticos          |
| **Components**  | Blocos reutilizáveis de UI              |
| **SPA**         | Single Page Application                 |
| **Reatividade** | Interface responde a mudanças de estado |

#### Estrutura de um Component

```typescript
@Component({
  selector: "app-usuario",
  templateUrl: "./usuario.component.html",
  styleUrls: ["./usuario.component.css"],
})
export class UsuarioComponent implements OnInit {
  usuarios: Usuario[] = [];

  constructor(private service: UsuarioService) {}

  ngOnInit(): void {
    this.carregarUsuarios();
  }

  carregarUsuarios(): void {
    this.service.listar().subscribe((data) => (this.usuarios = data));
  }
}
```

---

### 7.2 🏗️ Arquitetura Angular 17+

#### Ciclo de Vida dos Components

```
Constructor → ngOnInit → ngOnChanges → ngOnDestroy
```

#### Estrutura Modular

```
App
├── Módulos
│   ├── Componentes (UI)
│   ├── Services (Lógica/HTTP)
│   ├── Models (Tipos)
│   └── Routing (Navegação)
└── Shared
    ├── Pipes (Transformação)
    └── Guards (Segurança)
```

---

### 7.3 🛠️ Funcionalidades Essenciais

#### Services - Comunicação HTTP

```typescript
@Injectable({ providedIn: "root" })
export class UsuarioService {
  private apiUrl = "http://localhost:8080/api/usuarios";

  constructor(private http: HttpClient) {}

  listar(): Observable<Usuario[]> {
    return this.http.get<Usuario[]>(this.apiUrl);
  }

  criar(usuario: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(this.apiUrl, usuario);
  }
}
```

#### Routing - Navegação SPA

```typescript
const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "usuarios", component: UsuariosComponent },
  { path: "usuario/:id", component: UsuarioDetalheComponent },
  { path: "**", component: NotFoundComponent },
];
```

#### Guards - Proteção de Rotas

```typescript
@Injectable()
export class AuthGuard implements CanActivate {
  canActivate(): boolean {
    return this.authService.isLoggedIn();
  }
}
```

#### Pipes - Transformação de Dados

```html
<!-- Formatação no template -->
{{ preco | currency:'BRL' }} {{ data | date:'dd/MM/yyyy' }} {{ texto | uppercase
}}
```

---

## 💎 Parte 8: Boas Práticas e Engenharia

**🎓 Bootcamp:** DIO (Boas Práticas)

> 🎯 **Objetivo:** Código de qualidade profissional e sustentável

### 8.1 ✨ Clean Code

**Princípios de Robert C. Martin (Uncle Bob)**

#### 📝 Regras de Nomenclatura

| Item         | Ruim     | Bom                        |
| ------------ | -------- | -------------------------- |
| **Variável** | `d`      | `diasDesdeModificacao`     |
| **Função**   | `calc()` | `calcularSalarioLiquido()` |
| **Classe**   | `DM`     | `DocumentoManager`         |

#### 🎯 Funções Limpas

```java
// ❌ Função faz múltiplas coisas
public void processarUsuario(Usuario u) {
    validarEmail(u);
    salvarNoBanco(u);
    enviarEmail(u);
    gerarLog(u);
}

// ✅ Cada função faz uma coisa
public void cadastrarUsuario(Usuario usuario) {
    validarDados(usuario);
    persistir(usuario);
    notificar(usuario);
}
```

#### Princípios Fundamentais

| Princípio                 | Descrição                                            |
| ------------------------- | ---------------------------------------------------- |
| **DRY**                   | Don't Repeat Yourself - evite duplicação             |
| **KISS**                  | Keep It Simple, Stupid - mantenha simples            |
| **YAGNI**                 | You Aren't Gonna Need It - não antecipe necessidades |
| **Single Responsibility** | Uma responsabilidade por função/classe               |

---

### 8.2 🏛️ Princípios SOLID

#### Fundação do Design OO

```
S - Single Responsibility (Uma responsabilidade)
O - Open/Closed (Aberto/Fechado)
L - Liskov Substitution (Substituição de Liskov)
I - Interface Segregation (Segregação de interfaces)
D - Dependency Inversion (Inversão de dependência)
```

#### (S) Single Responsibility

```java
// ❌ Classe com múltiplas responsabilidades
class Usuario {
    void salvar() { /*...*/ }
    void enviarEmail() { /*...*/ }
    void gerarRelatorio() { /*...*/ }
}

// ✅ Cada classe uma responsabilidade
class Usuario { /* apenas dados */ }
class UsuarioRepository { void salvar() {} }
class EmailService { void enviar() {} }
class RelatorioService { void gerar() {} }
```

#### (O) Open/Closed

```java
// Aberto para extensão, fechado para modificação
interface FormaGeometrica {
    double calcularArea();
}

class Circulo implements FormaGeometrica {
    public double calcularArea() { /*...*/ }
}
// Adicionar nova forma não modifica código existente
```

#### (L) Liskov Substitution

```java
// Subclasses devem ser substituíveis pelas superclasses
class Ave {
    void comer() {}
}

class Pardal extends Ave {
    void voar() {}
}

class Pinguim extends Ave {
    // ❌ Não voa, viola LSP se Ave tiver método voar()
}
```

#### (I) Interface Segregation

```java
// ❌ Interface muito grande
interface Trabalhador {
    void trabalhar();
    void comer();
    void dormir();
}

// ✅ Interfaces específicas
interface Trabalhavel {
    void trabalhar();
}

interface Alimentavel {
    void comer();
}
```

#### (D) Dependency Inversion

```java
// ❌ Depende de implementação concreta
class Servico {
    private MySQLRepository repo = new MySQLRepository();
}

// ✅ Depende de abstração
class Servico {
    private Repository repo;  // Interface

    public Servico(Repository repo) {
        this.repo = repo;  // Injetado
    }
}
```

> 🔗 **Conexão com Spring:** O princípio (D) é a base do DI do Spring! O Spring força boas práticas de design.

---

### 8.3 🧪 Testes Unitários

**JUnit - Framework de Testes**

```java
@Test
public void deveria CalcularMediaCorretamente() {
    // Arrange (preparar)
    Calculadora calc = new Calculadora();

    // Act (agir)
    double resultado = calc.media(10, 20);

    // Assert (verificar)
    assertEquals(15.0, resultado, 0.01);
}

@Test
public void deveriaLancarExcecaoParaDivisaoPorZero() {
    Calculadora calc = new Calculadora();

    assertThrows(ArithmeticException.class, () -> {
        calc.dividir(10, 0);
    });
}
```

#### Boas Práticas

- ✅ Testes independentes
- ✅ Um assert por teste (ideal)
- ✅ Nomenclatura descritiva
- ✅ Cobertura > 80%

---

## 🚀 Parte 9: Próximos Passos

**📘 Bhargava, Cap 10-11**

### Fronteiras do Conhecimento

| Tópico           | Descrição                 | Aplicação                |
| ---------------- | ------------------------- | ------------------------ |
| **K-NN**         | K-vizinhos mais próximos  | Machine Learning         |
| **Árvores**      | Estruturas hierárquicas   | Bancos de dados, parsers |
| **MapReduce**    | Processamento distribuído | Big Data                 |
| **Criptografia** | Algoritmos SHA            | Segurança                |

### 📈 Caminho Sugerido

```
Fundamentos Sólidos (Este guia)
         ↓
Projetos Práticos
         ↓
Contribuições Open Source
         ↓
Especialização (Cloud, DevOps, ML...)
```

---

- **Algoritmo de Dijkstra (Cap 7):** Usado para encontrar o caminho mais curto em redes com custos (ponderadas), como encontrar a rota de rede com menor latência ou o balanceamento de carga mais barato

- **Algoritmos Gulosos (Cap 8):** Resolvem problemas de otimização buscando a solução localmente ótima. "O problema do cronograma da sala de aula" é diretamente análogo ao agendamento de tarefas (jobs) em um servidor

- **Programação Dinâmica (Cap 9):** Resolve problemas de otimização complexos. "O problema da mochila" é uma analogia clássica para a alocação de recursos limitados (ex: alocar CPU e memória para contêineres)

- **Problemas NP-Completos (Cap 8):** Ensina um engenheiro sênior a identificar um problema intratável (como o "Caixeiro-Viajante") e optar por um "Algoritmo de aproximação" em vez de tentar uma solução perfeita impossível

---

## Parte 7: A Especialização Frontend - Construindo com Angular

**Bootcamp:** DIO + Deal (Angular)

Com o backend (API) construído, esta seção aborda a construção da interface do usuário (UI) para criar uma aplicação full-stack.

### 7.1 O Ecossistema Angular

**Fonte:** Introdução a Angular

O Angular é um framework robusto para construir aplicações web complexas.

- **Web Components:** O conceito de construir UIs a partir de componentes reutilizáveis
- **TypeScript:** A linguagem base do Angular. É um superconjunto do JavaScript que adiciona tipagem estática, trazendo uma robustez similar à do Java para o frontend

### 7.2 Arquitetura de Aplicações Angular (Angular 17+)

**Fonte:** Introdução a Angular

- **Componentes Angular:** Os blocos de construção fundamentais de uma aplicação Angular (HTML + CSS + TypeScript)
- **LifeCycle Hooks:** Métodos especiais que o Angular chama durante a vida de um componente (ex: `ngOnInit`)
- **Single Page Application (SPA):** O modelo de aplicação onde o Angular gerencia a navegação sem recarregar a página
- **Módulos Angular:** Usados para organizar a aplicação em blocos de funcionalidade

### 7.3 Tópicos Essenciais do Angular

**Fonte:** Construindo Aplicação Angular

- **Services:** Classes usadas para compartilhar lógica e dados entre componentes (ex: fazer a chamada HTTP para a API Spring)
- **Rotas (Routing):** Gerencia a navegação entre diferentes "páginas" (componentes) da SPA
- **Pipes:** Usados para transformar dados diretamente no HTML (ex: formatação de datas ou moedas)
- **Guards:** Usados para proteger rotas, aplicando lógica de segurança (ex: "usuário está logado?")

---

## Parte 8: O Polimento - Engenharia de Software e Boas Práticas

**Bootcamp:** DIO (Boas Práticas)

O que separa um código funcional de um código profissional é a sua qualidade, legibilidade e, acima de tudo, sustentabilidade.

### 8.1 Escrevendo Código Limpo (Clean Code)

**Fonte:** Boas Práticas de Programação

Baseado nos princípios de Robert C. Martin (Uncle Bob), o Clean Code foca em escrever código que seja legível e fácil de manter. Os tópicos incluem:

- Nomenclatura significativa para variáveis, funções e classes
- Funções que fazem apenas uma coisa (Single Responsibility)
- Evitar "números mágicos" e duplicidade de código (DRY - Don't Repeat Yourself)
- Formatação e comentários adequados

### 8.2 Os Princípios SOLID

**Fonte:** Boas Práticas de Programação

Os princípios SOLID são o alicerce do design de software orientado a objetos robusto.

- **(S) Single Responsibility Principle** (Princípio da Responsabilidade Única): Uma classe deve ter apenas um motivo para mudar

- **(O) Open/Closed Principle** (Princípio Aberto/Fechado): O software deve ser aberto para extensão, mas fechado para modificação

- **(L) Liskov Substitution Principle** (Princípio da Substituição de Liskov): Subclasses devem ser substituíveis por suas superclasses. Esta é a _regra_ de como usar a Herança (Parte 3.2) corretamente

- **(I) Interface Segregation Principle** (Princípio da Segregação de Interfaces): Clientes não devem ser forçados a depender de interfaces que não utilizam. Esta é a _regra_ de como usar Abstração/Interfaces (Parte 3.2) corretamente

- **(D) Dependency Inversion Principle** (Princípio da Inversão de Dependência): Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações (interfaces)

> **Conexão:** Este último princípio (D) é a justificativa filosófica e técnica para a **Injeção de Dependências (DI)**, que é o mecanismo central do Spring Framework (Parte 6.1). O Spring _força_ a aplicação deste princípio: uma classe Service não instancia `new Repository()`; ela depende da _interface_ Repository, e o Spring _injeta_ a implementação concreta. Entender SOLID é entender o _porquê_ do Spring funcionar como funciona.

### 8.3 Garantia de Qualidade: Testes Unitários

**Fonte:** Boas Práticas de Programação

Código profissional é código testado.

- **Testes Unitários com JUnit:** O framework padrão para testes em Java
- O foco é testar a menor unidade de lógica (um método) de forma isolada, usando _assertions_ para verificar se o resultado é o esperado

---

## Parte 9: Conclusão e Próximos Passos

**Livro:** Bhargava (Cap 10-11)

Este guia cobriu a jornada desde a lógica pura até a construção de uma aplicação full-stack. O aprendizado, no entanto, é contínuo. Os capítulos finais de _Entendendo Algoritmos_ apontam para as próximas fronteiras:

- **K-vizinhos mais próximos (KNN):** Sua introdução ao mundo do Machine Learning (Aprendizado de Máquina)
- **Árvores:** Estruturas de dados hierárquicas complexas
- **MapReduce e Algoritmos Paralelos:** A base conceitual do Big Data
- **Algoritmos SHA e Criptografia:** Fundamentos de segurança da informação

## 📚 Recursos e Referências

### 📖 Livros Fundamentais

#### 1. Algoritmos e Lógica da Programação

**Autor:** Marco A. Furlan de Souza et al.

```
✓ Raciocínio lógico e algoritmos
✓ Fluxogramas e pseudocódigos
✓ Fundação do pensamento computacional
✓ Estruturas universais de programação
```

🔗 [Comprar na Amazon](https://a.co/d/2Hhwczl)

---

#### 2. Entendendo Algoritmos – Um Guia Ilustrado

**Autor:** Aditya Y. Bhargava

```
✓ Algoritmos fundamentais com diagramas visuais
✓ Notação Big O explicada de forma simples
✓ Estruturas de dados avançadas
✓ Grafos, programação dinâmica, algoritmos gulosos
```

🔗 [Comprar na Amazon](https://a.co/d/2bkiKPh)

---

### 🎓 Cursos Online

#### 1. Java COMPLETO: Do Zero ao Profissional + Projetos

**Plataforma:** Cod3r / Udemy  
**Instrutor:** Leonardo Leitão

| Módulo      | Conteúdo                                       |
| ----------- | ---------------------------------------------- |
| Fundamentos | JVM, tipos, operadores, estruturas de controle |
| OOP         | Classes, herança, polimorfismo, abstração      |
| Collections | ArrayList, HashMap, Set, Queue                 |
| Projetos    | Campo Minado, calculadora, aplicações práticas |
| Testes      | JUnit para garantia de qualidade               |

🔗 [Acessar Curso](https://www.udemy.com/course/fundamentos-de-programacao-com-java)

---

#### 2. Bootcamp Deal + DIO – Spring Boot e Angular

**Plataforma:** DIO (Digital Innovation One)  
**Parceria:** Deal Technologies

| Stack              | Tecnologias                                         |
| ------------------ | --------------------------------------------------- |
| **Backend**        | Spring Boot, Spring Web, Spring Data JPA, Hibernate |
| **Frontend**       | Angular 17+, TypeScript, RxJS                       |
| **Banco de Dados** | SQL, modelagem, integração com JPA                  |
| **Qualidade**      | SOLID, Clean Code, testes                           |
| **DevOps**         | Deploy em nuvem (Railway)                           |

🔗 [Acessar Bootcamp](https://www.dio.me/)

---

### 🛠️ Metodologia de Estudo

#### 1️⃣ Estudo Intercalado

```
Teoria ← → Prática
   ↓         ↓
Furlan   Cod3r
   ↓         ↓
Bhargava   DIO
```

**Exemplo:** Ao estudar Collections (Cod3r), consulte Tabelas Hash (Bhargava Cap 5)

---

#### 2️⃣ Progressão Linear

```
Parte 1: Fundação
    ↓
Parte 2: Java Básico
    ↓
Parte 3: OOP
    ↓
Parte 4: Estruturas de Dados
    ↓
Parte 5: Projeto Integrador
    ↓
Parte 6: Backend (Spring)
    ↓
Parte 7: Frontend (Angular)
    ↓
Parte 8: Boas Práticas
    ↓
Parte 9: Especialização
```

---

#### 3️⃣ Prática Deliberada

| Fase            | Ação                        |
| --------------- | --------------------------- |
| **Aprender**    | Ler teoria + assistir aula  |
| **Implementar** | Codificar conceito estudado |
| **Testar**      | Escrever testes unitários   |
| **Integrar**    | Usar em projeto real        |
| **Revisar**     | Refatorar aplicando SOLID   |

---

#### 4️⃣ Conexões Constantes

**Sempre pergunte:**

- 📘 **Teoria:** Por que isso funciona assim? (Furlan/Bhargava)
- 💻 **Prática:** Como implemento isso em Java? (Cod3r)
- 🏗️ **Aplicação:** Onde uso isso profissionalmente? (DIO)
- 🎯 **Qualidade:** Estou seguindo boas práticas? (SOLID/Clean Code)

---

#### 5️⃣ Projetos Integradores

**Sugestão de Progressão:**

1. **Campo Minado** (Cod3r)

   - Consolida: Arrays, OOP, Recursão, Exceções

2. **API REST de Gerenciamento**

   - Consolida: Spring Boot, JPA, REST, validações

3. **Aplicação Full-Stack**
   - Consolida: Backend (Spring) + Frontend (Angular)

---

### 📊 Checklist de Progresso

Marque conforme avança:

- [ ] **Parte 1:** Fundação - Lógica e Algoritmos

  - [ ] 1.1 Algoritmos e Mentalidade
  - [ ] 1.2 Big O
  - [ ] 1.3 Estruturas Universais
  - [ ] 1.4 Arquitetura

- [ ] **Parte 2:** Java - Fundamentos

  - [ ] 2.1 Sintaxe
  - [ ] 2.2 Estruturas de Controle

- [ ] **Parte 3:** Orientação a Objetos

  - [ ] 3.1 Classes e Métodos
  - [ ] 3.2 4 Pilares

- [ ] **Parte 4:** Estruturas de Dados

  - [ ] 4.1 Arrays
  - [ ] 4.2 Listas Encadeadas
  - [ ] 4.3 Recursão/Ordenação
  - [ ] 4.4 Collections
  - [ ] 4.5 Tabelas Hash

- [ ] **Parte 5:** Projeto Campo Minado

  - [ ] 5.1 Exceções
  - [ ] 5.2 Projeto Completo

- [ ] **Parte 6:** Spring Framework

  - [ ] 6.1 Spring Boot
  - [ ] 6.2 APIs REST
  - [ ] 6.3 JPA/Hibernate
  - [ ] 6.4 Spring Security
  - [ ] 6.5 Algoritmos Avançados

- [ ] **Parte 7:** Angular

  - [ ] 7.1 TypeScript/Ecossistema
  - [ ] 7.2 Arquitetura
  - [ ] 7.3 Services/Routing/Guards

- [ ] **Parte 8:** Boas Práticas

  - [ ] 8.1 Clean Code
  - [ ] 8.2 SOLID
  - [ ] 8.3 Testes

- [ ] **Parte 9:** Próximos Passos
  - [ ] Algoritmos Avançados
  - [ ] Especialização

---

### 🎯 Dicas Finais

> 💡 **"Projeto lógico primeiro"** - Planeje antes de codificar  
> 💡 **Big O importa** - Sempre pense em eficiência  
> 💡 **SOLID não é opcional** - É a diferença entre código funcional e profissional  
> 💡 **Teste sempre** - Código sem teste não está pronto  
> 💡 **Aprenda continuamente** - A tecnologia evolui, você também deve

---

## 🏆 Conclusão

Este guia fornece um caminho estruturado do **zero ao full-stack**, integrando teoria sólida com prática profissional. Ao completá-lo, você terá:

✅ Fundação teórica em algoritmos e estruturas de dados  
✅ Domínio de Java e Orientação a Objetos  
✅ Experiência com Spring Framework (backend)  
✅ Conhecimento de Angular (frontend)  
✅ Habilidades de código limpo e boas práticas

**O próximo passo é seu!** Continue aprendendo, construindo e evoluindo. 🚀

---

_Guia atualizado em Novembro de 2025_
