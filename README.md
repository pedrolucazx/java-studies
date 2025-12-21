# Java Studies ☕

## 🎯 Sobre o Projeto

Este repositório documenta a minha jornada de aprendizado em **Java**, desde os fundamentos da linguagem até conceitos avançados de Programação Orientada a Objetos (POO) e frameworks modernos. Aqui você encontrará exercícios práticos, desafios resolvidos, anotações de estudo e referências a cursos e livros que estou utilizando.

**Objetivo:** Consolidar conhecimentos em Java através da prática constante, documentação organizada e estudo de boas práticas de desenvolvimento.

## 📚 Sumário

- [🎯 Sobre o Projeto](#-sobre-o-projeto)
- [🚀 Como Começar](#-como-começar)
- [📈 Progresso de Estudos](#-progresso-de-estudos)
- [💻 IDEs para Java](#-ides-para-java)
- [📖 História do Java](#-história-do-java)
- [☕ Conceitos Java](#-conceitos-java)
  - [Variáveis e Constantes](#variáveis-e-constantes)
  - [Inferência de Tipos](#inferência-de-tipos)
  - [Tipos Primitivos](#tipos-primitivos)
  - [Notação Ponto](#notação-ponto)
  - [Imports](#imports)
  - [Tipo String](#tipo-string)
  - [Console](#console)
  - [Objetos x Tipos Primitivos](#objetos-x-tipos-primitivos)
  - [Wrapper Classes](#wrapper-classes)
  - [Conversão de Tipos](#conversão-de-tipos)
  - [Operadores](#operadores)
- [📂 Estrutura do Projeto](#-estrutura-do-projeto)
- [📚 Recursos de Estudo](#-recursos-de-estudo)
- [📝 Licença](#-licença)

## 🚀 Como Começar

### Pré-requisitos

Certifique-se de ter instalado na sua máquina:

- **Java JDK** (versão 11 ou superior) - [Download](https://www.oracle.com/java/technologies/downloads/)
- **IDE** da sua preferência (IntelliJ IDEA ou VS Code)
- **Git** - [Download](https://git-scm.com/)

### Clonando o Repositório

```bash
# Clone este repositório
git clone https://github.com/pedrolucazx/java-studies.git

# Entre no diretório
cd java-studies
```

### Executando os Exercícios

#### Opção 1: Usando a IDE

1. Abra o projeto na sua IDE (IntelliJ IDEA ou VS Code)
2. Navegue até o arquivo desejado em `challenges/src/`
3. Execute o arquivo (botão ▶️ ou `Shift + F10` no IntelliJ)

#### Opção 2: Via Terminal

```bash
# Entre no diretório challenges
cd challenges

# Compile um arquivo específico
javac src/Ex01_AreaCircle.java

# Execute o programa
java -cp src Ex01_AreaCircle
```

## 📈 Progresso de Estudos

Acompanhe meu progresso ao longo das **9 partes** do plano de estudos estruturado. Cada parte integra teoria e prática de forma progressiva.

### Parte 1: Fundação - Lógica, Algoritmos e Computação

**Livros:** Furlan + Bhargava

- [ ] 1.1 O que é um Algoritmo? (Mentalidade do Engenheiro)
- [ ] 1.2 Pesquisa Binária e Notação Big O
- [ ] 1.3 Ferramentas de Modelagem (Fluxogramas, Portugol)
- [ ] 1.4 Arquitetura do Computador (Von Neumann)

### Parte 2: A Ferramenta - Fundamentos Java

**Curso:** Cod3r (Seções 03-04)

- [x] 2.1 Sintaxe Fundamental (Tipos, Variáveis, Operadores)
- [ ] 2.2 Estruturas de Controle (if, for, while, switch)

### Parte 3: O Paradigma - Orientação a Objetos

**Curso:** Cod3r (Seções 05, 07)

- [ ] 3.1 Classes e Métodos (Atributos, Construtores, `this`)
- [ ] 3.2 Quatro Pilares da OOP (Encapsulamento, Herança, Polimorfismo, Abstração)

### Parte 4: A Biblioteca - Estruturas de Dados

**Curso:** Cod3r (Seção 06) + **Livros:** Furlan Cap 5 + Bhargava Cap 2-5

- [ ] 4.1 Arrays (Vetores e Matrizes)
- [ ] 4.2 Estruturas Dinâmicas (Arrays vs Listas Encadeadas)
- [ ] 4.3 Algoritmos de Ordenação e Recursão
- [ ] 4.4 Java Collections (ArrayList, LinkedList, HashSet, HashMap)
- [ ] 4.5 Tabelas Hash (Teoria e Performance)

### Parte 5: A Consolidação - Erros e Projeto Prático

**Curso:** Cod3r (Seções 10-11)

- [ ] 5.1 Tratamento de Erros (try-catch-finally, Exceções)
- [ ] 5.2 Projeto Campo Minado (Integração de conceitos)

### Parte 6: Especialização Backend - Spring Framework

**Bootcamp:** DIO + Deal + **Livro:** Bhargava Cap 6-9

- [ ] 6.1 Spring Boot (IoC, DI, Gerenciamento de Dependências)
- [ ] 6.2 APIs REST (Spring Web, Swagger)
- [ ] 6.3 Bancos de Dados (SQL, JDBC, JPA/Hibernate)
- [ ] 6.4 Tópicos Avançados (Spring Security, Deploy)
- [ ] 6.5 Algoritmos Avançados (Grafos, Dijkstra, Programação Dinâmica)

### Parte 7: Especialização Frontend - Angular

**Bootcamp:** DIO + Deal

- [ ] 7.1 Ecossistema Angular (Web Components, TypeScript)
- [ ] 7.2 Arquitetura Angular 17+ (Componentes, Lifecycle, SPA)
- [ ] 7.3 Tópicos Essenciais (Services, Routing, Pipes, Guards)

### Parte 8: O Polimento - Engenharia de Software

**Bootcamp:** DIO (Boas Práticas)

- [ ] 8.1 Clean Code (Nomenclatura, Single Responsibility, DRY)
- [ ] 8.2 Princípios SOLID (S-O-L-I-D)
- [ ] 8.3 Testes Unitários (JUnit, Assertions)

### Parte 9: Próximos Passos - Tópicos Avançados

**Livro:** Bhargava Cap 10-11

- [ ] Machine Learning (K-vizinhos mais próximos)
- [ ] Estruturas Avançadas (Árvores)
- [ ] Big Data (MapReduce)
- [ ] Segurança (SHA, Criptografia)

---

**Progresso Geral:** 1/50 tópicos concluídos (1%)

**Legenda:**

- ✅ [x] Concluído
- ⬜ [ ] Em andamento ou não iniciado

---

## 💻 IDEs para Java

| IDE               | Tipo               | Melhor Para                                              |
| ----------------- | ------------------ | -------------------------------------------------------- |
| **IntelliJ IDEA** | IDE completa       | Projetos Java/Spring profissionais, máxima produtividade |
| **VS Code**       | Editor + extensões | Projetos full-stack, ambiente leve e customizável        |

**Dica:** IntelliJ Community Edition é gratuita e suficiente para estudos. VS Code com Java Extension Pack também é uma ótima opção gratuita.

---

## 📖 História do Java

### Timeline

| Ano      | Evento                                                                                                                 |
| -------- | ---------------------------------------------------------------------------------------------------------------------- |
| **1991** | **Green Team** (Sun Microsystems) inicia projeto para dispositivos eletrônicos. James Gosling cria a linguagem **Oak** |
| **1994** | Com o boom da Web, Oak é adaptado para internet e renomeado para **Java** (referência ao café)                         |
| **1995** | Lançamento do **HotJava** - primeiro navegador a executar applets Java                                                 |
| **1996** | **JDK 1.0** lançado oficialmente (23 de janeiro)                                                                       |
| **2010** | **Oracle** adquire Sun Microsystems por $7.4 bilhões                                                                   |
| **Hoje** | Uma das linguagens mais populares do mundo, presente em bilhões de dispositivos                                        |

### Write Once, Run Anywhere ☕

O grande diferencial do Java é sua **portabilidade**: o mesmo código roda em qualquer sistema operacional graças à **JVM (Java Virtual Machine)**. Essa característica tornou Java a escolha preferida para aplicações empresariais, Android e sistemas de larga escala.

---

## ☕ Fundamentos Java

### Variáveis e Constantes

**Variáveis** armazenam dados que podem ser alterados durante a execução do programa.

```java
int idade = 25;        // Variável inteira
String nome = "João";  // Variável String
idade = 26;            // Valor pode ser alterado
```

**Constantes** são valores que não podem ser alterados após a inicialização. Usa-se a palavra-chave `final`.

```java
final double PI = 3.14159;      // Constante
final int MAX_USUARIOS = 100;   // Convenção: SNAKE_CASE maiúsculo
// PI = 3.14; // ERRO! Não pode alterar constante
```

---

### Inferência de Tipos

A partir do Java 10, você pode usar `var` para deixar o compilador inferir o tipo automaticamente.

```java
// Declaração tradicional
String mensagem = "Olá, mundo!";
ArrayList<String> lista = new ArrayList<String>();

// Com inferência de tipos (var)
var mensagem = "Olá, mundo!";           // Compilador infere String
var lista = new ArrayList<String>();    // Compilador infere ArrayList<String>
var numero = 42;                        // Compilador infere int
var preco = 19.99;                      // Compilador infere double
```

**Regras do `var`:**

- Só funciona com variáveis locais (dentro de métodos)
- A variável deve ser inicializada na declaração
- Não pode ser usado em parâmetros de métodos ou atributos de classe

---

### Tipos Primitivos

Java possui 8 tipos primitivos que armazenam valores diretamente na memória:

| Tipo      | Tamanho | Valor Padrão | Exemplo                          |
| --------- | ------- | ------------ | -------------------------------- |
| `byte`    | 8 bits  | 0            | `byte b = 127;`                  |
| `short`   | 16 bits | 0            | `short s = 32000;`               |
| `int`     | 32 bits | 0            | `int i = 2147483647;`            |
| `long`    | 64 bits | 0L           | `long l = 9223372036854775807L;` |
| `float`   | 32 bits | 0.0f         | `float f = 3.14f;`               |
| `double`  | 64 bits | 0.0d         | `double d = 3.14159;`            |
| `char`    | 16 bits | '\u0000'     | `char c = 'A';`                  |
| `boolean` | 1 bit   | false        | `boolean b = true;`              |

```java
// Exemplos de uso
int quantidade = 100;
double preco = 49.99;
boolean ativo = true;
char inicial = 'J';
```

---

### Notação Ponto

A **notação ponto** (`.`) é usada para acessar membros (atributos e métodos) de objetos e classes.

```java
// Acessando métodos de um objeto String
String texto = "Java";
int tamanho = texto.length();           // Método: retorna 4
String maiusculo = texto.toUpperCase(); // Método: retorna "JAVA"
char primeiro = texto.charAt(0);        // Método: retorna 'J'

// Acessando membros estáticos de uma classe
double pi = Math.PI;                    // Atributo estático
double raiz = Math.sqrt(16);            // Método estático: retorna 4.0

// Encadeamento de métodos (method chaining)
String resultado = "  java  ".trim().toUpperCase(); // "JAVA"
```

---

### Imports

**Imports** permitem usar classes de outros pacotes sem precisar escrever o nome completo.

```java
// Sem import - nome completo (fully qualified name)
java.util.Scanner scanner = new java.util.Scanner(System.in);
java.util.ArrayList<String> lista = new java.util.ArrayList<>();
```

```java
// Com import - mais limpo e legível
import java.util.Scanner;
import java.util.ArrayList;

Scanner scanner = new Scanner(System.in);
ArrayList<String> lista = new ArrayList<>();
```

**Import com wildcard (`*`):**

```java
import java.util.*;  // Importa TODAS as classes do pacote java.util
```

**Pacotes comuns:**

| Pacote      | Descrição                 | Classes Comuns                    |
| ----------- | ------------------------- | --------------------------------- |
| `java.lang` | Importado automaticamente | `String`, `Math`, `System`        |
| `java.util` | Utilitários               | `Scanner`, `ArrayList`, `HashMap` |
| `java.io`   | Entrada/Saída             | `File`, `BufferedReader`          |
| `java.time` | Data e hora (Java 8+)     | `LocalDate`, `LocalDateTime`      |

### Tipo String

- Definição: uma `String` representa um conjunto de caracteres com métodos utilitários para manipulação e consulta. Não crie classes com nome `String` (conflito com `java.lang.String`).

- Exemplos básicos:

```java
String s = "Java";
char primeiro = s.charAt(0); // 'J'
```

#### Concatenação:

```java
String a = "Olá";
String b = " Mundo";
String c = a + b;            // "Olá Mundo"
String d = a.concat(b);      // "Olá Mundo"
```

#### Imutabilidade:

Instâncias de `String` são imutáveis — operações retornam novas `String` sem alterar a original.

```java
String x = "hello";
String y = x.toUpperCase(); // y = "HELLO", x continua "hello"
```

#### Métodos úteis (exemplos):

```java
s.startsWith("Ja");          // true
s.endsWith("va");           // true
s.length();                   // 4
s.equals("Java");           // true (case-sensitive)
s.equalsIgnoreCase("java"); // true
s.contains("av");           // true
s.indexOf('v');               // 2
s.substring(1, 3);            // "av"
s.trim();                     // remove espaços nas extremidades
```

#### Igualdade entre Strings

Ao comparar Strings em Java, é fundamental entender a diferença entre o operador `==` e o método `.equals()`. Usar o operador `==` compara se as referências dos objetos são iguais (ou seja, se apontam para o mesmo local na memória), e não necessariamente se o conteúdo das Strings é igual. Isso pode causar resultados inesperados:

```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b); // true (mesmo pool de strings)
System.out.println(a == c); // false (objetos diferentes)
System.out.println(a.equals(c)); // true (conteúdo igual)
```

Portanto, **sempre utilize o método `.equals()` para comparar o conteúdo de Strings**:

```java
String senhaDigitada = "1234 ";
String senhaCorreta = "1234";

// Comparação incorreta:
System.out.println(senhaDigitada == senhaCorreta ? "Acesso liberado" : "Acesso negado");

// Comparação correta:
System.out.println(senhaDigitada.equals(senhaCorreta) ? "Acesso liberado" : "Acesso negado");
```

### Console

#### Impressão no console:

- `System.out.print(...)` — imprime sem pular linha.
- `System.out.println(...)` — imprime e adiciona uma nova linha ao final.
- `System.out.printf(...)` — impressão formatada com especificadores (ex.: `%s`, `%d`, `%f`). Use `%n` para nova linha.

Exemplos:

```java
System.out.print("Sem nova linha");
System.out.println("Com nova linha");
System.out.printf("Nome: %s, Idade: %d%n", nome, idade);
```

#### Formatação de strings:

- `String.format(...)` retorna uma `String` formatada.

```java
String info = String.format("Nome: %s, Idade: %d", nome, idade);
```

#### Captura de entrada do usuário (teclado):

- A classe `Scanner` permite ler diferentes tipos de dados a partir de `System.in`.
- Importar `java.util.Scanner`, criar um objeto `Scanner`, ler valores e fechá-lo quando não for mais necessário.

Exemplo problemático:

```
Scanner teclado = new Scanner(System.in);

    System.out.println("Qual a sua idade?");
    int idade = teclado.nextInt();
    System.out.println("Qual o seu nome?");
    String nome = teclado.nextLine();
    System.out.println("Qual o seu sobrenome?");
    String sobrenome = teclado.nextLine();

    teclado.close();
```

Exemplo de saída observada quando o problema ocorre:

```
Qual a sua idade? 25
Qual o seu nome? Qual o seu sobrenome? Silva
```

Por que isso acontece:

- `nextInt()` e `nextDouble()` leem apenas o token numérico (ex.: `25`) e deixam o caractere de nova linha (`\n`) no buffer quando o usuário pressiona Enter.
- Se você chamar `nextLine()` logo depois, ele vai consumir esse `\n` remanescente e retornar uma string vazia, fazendo com que a próxima pergunta seja pulada.

Solução (consumir o newline antes de usar `nextLine()`):

```java
Scanner teclado = new Scanner(System.in);

    System.out.println("Qual a sua idade?");
    int idade = teclado.nextInt();
    teclado.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.
    System.out.println("Qual o seu nome?");
    String nome = teclado.nextLine();
    System.out.println("Qual o seu sobrenome?");
    String sobrenome = teclado.nextLine();

teclado.close();
```

- Alternativa: ler tudo com `nextLine()` e converter para número com `Integer.parseInt()` / `Double.parseDouble()` quando necessário.

---

### Objetos x Tipos Primitivos

Java é uma linguagem centrada em classes, onde praticamente tudo é representado por classes e objetos. No entanto, existem os **tipos primitivos** que funcionam de forma diferente.

**Tipos Primitivos:**

- São 8 tipos primitivos em Java: 6 numéricos (`int`, `short`, `long`, `byte`, `float`, `double`), 1 caractere (`char`) e 1 booleano (`boolean`)
- Armazenam apenas valores diretamente na memória
- Não possuem métodos ou comportamentos associados
- São mais eficientes em termos de memória e performance

```java
int numero = 42;        // Tipo primitivo - apenas armazena o valor
double preco = 19.99;   // Tipo primitivo - apenas armazena o valor
boolean ativo = true;   // Tipo primitivo - apenas armazena o valor
```

**Objetos:**

- São instâncias de classes
- Possuem atributos (dados) e comportamentos (métodos)
- Armazenam referências na memória, não o valor diretamente
- Podem ser `null`

```java
String texto = "Java";           // Objeto - possui métodos como length(), toUpperCase()
int tamanho = texto.length();    // Chamando método do objeto
String maiusculo = texto.toUpperCase(); // Outro método disponível
```

**Diferença fundamental:**

```java
// Tipo primitivo - apenas armazena valor
int a = 10;
// a.??? - NÃO possui métodos!

// Objeto - possui atributos e comportamentos
String s = "Olá";
s.length();      // Método disponível
s.toUpperCase(); // Método disponível
s.charAt(0);     // Método disponível
```

---

### Wrapper Classes

**Wrapper** significa "invólucro" ou "empacotador". As **Wrapper Classes** são classes que encapsulam os tipos primitivos, transformando-os em objetos.

**Correspondência entre Primitivos e Wrappers:**

| Tipo Primitivo | Wrapper Class |
| -------------- | ------------- |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |

> **Nota:** Os nomes das Wrapper Classes começam com letra maiúscula (convenção de classes em Java).

**Criando Wrappers:**

```java
// Usando tipos primitivos
int numeroPrimitivo = 42;
double precoPrimitivo = 19.99;

// Usando Wrapper Classes
Integer numeroObjeto = 42;          // Autoboxing
Double precoObjeto = 19.99;         // Autoboxing
Integer outroNumero = Integer.valueOf(100);
```

**Boxing e Unboxing:**

```java
// Boxing: primitivo -> objeto
int primitivo = 10;
Integer objeto = primitivo;           // Autoboxing (automático)
Integer objeto2 = Integer.valueOf(primitivo); // Boxing explícito

// Unboxing: objeto -> primitivo
Integer objeto3 = 20;
int primitivo2 = objeto3;             // Auto-unboxing (automático)
int primitivo3 = objeto3.intValue();  // Unboxing explícito
```

**Operações aritméticas com Wrappers:**

```java
Integer a = 10;
Integer b = 3;

// Operações funcionam normalmente (auto-unboxing)
int soma = a + b;       // 13
int divisao = a / b;    // 3 (divisão inteira!)
double divisaoReal = a / 3.0;  // 3.333... (inclua decimal para resultado decimal)
```

> **Importante:** A divisão entre inteiros resulta em um valor inteiro. Para obter um resultado decimal, é necessário que pelo menos um dos operandos seja decimal.

**Quando usar Wrappers:**

- Quando precisar armazenar valores em coleções (`ArrayList`, `HashMap`, etc.)
- Quando o valor pode ser `null`
- Quando precisar usar métodos utilitários da classe (ex.: `Integer.parseInt()`)

```java
// ArrayList não aceita tipos primitivos, apenas objetos
ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(10);  // Autoboxing: int -> Integer
numeros.add(20);

// Wrapper pode ser null, primitivo não
Integer valor = null;  // OK
// int valor2 = null;  // ERRO de compilação!
```

---

### Conversão de Tipos

A conversão de tipos (type casting) é o processo de transformar um valor de um tipo de dado para outro. Em Java, existem diferentes tipos de conversão dependendo dos tipos envolvidos.

#### Conversão entre Tipos Primitivos Numéricos

Java possui 4 tipos inteiros (`byte`, `short`, `int`, `long`) e 2 tipos de ponto flutuante (`float`, `double`). A conversão entre eles segue regras específicas.

**Hierarquia de tamanho (do menor para o maior):**

```
byte (8 bits) → short (16 bits) → int (32 bits) → long (64 bits) → float (32 bits) → double (64 bits)
```

**Conversão Implícita (Widening):**

Ocorre automaticamente quando convertemos de um tipo menor para um tipo maior. Não há risco de perda de informação.

```java
int numeroInt = 100;
long numeroLong = numeroInt;      // int → long (implícito)
double numeroDouble = numeroInt;  // int → double (implícito)

byte b = 10;
short s = b;    // byte → short (implícito)
int i = s;      // short → int (implícito)
```

**Conversão Explícita - Casting (Narrowing):**

Necessária quando convertemos de um tipo maior para um tipo menor. Pode haver perda de dados.

```java
double valorDouble = 9.78;
int valorInt = (int) valorDouble;  // Casting explícito: resultado = 9 (perde decimais)

long numeroGrande = 1000L;
int numeroMenor = (int) numeroGrande;  // Casting explícito

int valor = 130;
byte valorByte = (byte) valor;  // Cuidado! Pode causar overflow
```

> **Atenção:** O Java analisa o **tipo** dos dados, não o valor. O programador deve estar ciente das possíveis perdas de informação durante a conversão.

**Perda de dados em conversões:**

Existem dois tipos principais de perda de dados em conversões:

**1. Perda de casas decimais (truncamento):**

Ao converter um número de ponto flutuante para inteiro, a parte decimal é simplesmente descartada (não há arredondamento).

```java
double media = 7.8;
int mediaInteira = (int) media;  // mediaInteira = 7 (descarta .8)

double valor = 9.99;
int valorInt = (int) valor;  // valorInt = 9 (não arredonda para 10!)
```

**2. Overflow (estouro de capacidade):**

Ocorre quando tentamos armazenar um valor maior do que o tipo de destino suporta. O valor "estoura" e volta do limite oposto, causando resultados inesperados.

```java
// byte suporta valores de -128 até 127
int grande = 128;
byte pequeno = (byte) grande;  // pequeno = -128 (overflow!)

int grande2 = 129;
byte pequeno2 = (byte) grande2;  // pequeno2 = -127

int grande3 = 256;
byte pequeno3 = (byte) grande3;  // pequeno3 = 0 (deu uma volta completa!)
```

**Por que isso acontece?**

Cada tipo tem um limite de armazenamento baseado em seus bits:

| Tipo    | Bits | Valor Mínimo | Valor Máximo |
| ------- | ---- | ------------ | ------------ |
| `byte`  | 8    | -128         | 127          |
| `short` | 16   | -32.768      | 32.767       |
| `int`   | 32   | -2³¹         | 2³¹ - 1      |

Quando o valor ultrapassa o máximo, ele "dá a volta" e continua a partir do mínimo. É como um odômetro de carro que volta para 000000 após atingir 999999.

```java
// Visualizando o overflow do byte:
// 127 + 1 = -128 (estoura e vai para o mínimo)
// 127 + 2 = -127
// 127 + 129 = 0 (volta completa: 128 passos)

byte b = 127;
b = (byte)(b + 1);  // b = -128
```

> **Importante:** O Java não gera erro em overflow de tipos primitivos! O código compila e executa normalmente, mas produz resultados incorretos. Por isso, evite conversões desnecessárias que possam causar overflow.

#### Conversão de Número para String

Todo número pode ser convertido para String. Existem várias formas de fazer isso:

```java
int numero = 10000;

// Usando String.valueOf()
String texto1 = String.valueOf(numero);     // "10000"

// Usando Integer.toString()
String texto2 = Integer.toString(numero);   // "10000"

// Usando concatenação (conversão implícita)
String texto3 = "" + numero;                // "10000"

// Com wrapper, usando toString()
Integer numeroObj = 42;
String texto4 = numeroObj.toString();       // "42"
```

Após a conversão, é possível utilizar os métodos da classe `String`:

```java
int numero = 10000;
String texto = String.valueOf(numero);
int quantidadeDigitos = texto.length();  // 5 (funcionalidade disponível apenas em String)
```

#### Conversão de String para Número

Nem toda String pode ser convertida em número (ex.: "abc" não é um número válido), mas todo número pode ser transformado em String.

**Usando métodos parse (retorna tipo primitivo):**

```java
String texto = "123";

int numero = Integer.parseInt(texto);           // 123
double decimal = Double.parseDouble("45.67");   // 45.67
long grande = Long.parseLong("999999999");      // 999999999
boolean flag = Boolean.parseBoolean("true");    // true
```

**Usando valueOf (retorna Wrapper):**

```java
String texto = "123";

Integer numeroObj = Integer.valueOf(texto);     // Integer(123)
Double decimalObj = Double.valueOf("45.67");    // Double(45.67)
```

**Cuidado com exceções:**

```java
String textoInvalido = "abc";
// int numero = Integer.parseInt(textoInvalido);  // ERRO! NumberFormatException
```

#### Imprecisão em Operações com Ponto Flutuante

Operações com `float` e `double` podem apresentar pequenas imprecisões devido à forma como números decimais são representados em binário.

```java
double resultado = 0.1 + 0.2;
System.out.println(resultado);  // 0.30000000000000004 (não é exatamente 0.3!)
```

**Solução para cálculos precisos (financeiros):**

Para situações que exigem alta precisão, como cálculos financeiros, utilize a classe `BigDecimal`:

```java
import java.math.BigDecimal;

BigDecimal valor1 = new BigDecimal("0.1");
BigDecimal valor2 = new BigDecimal("0.2");
BigDecimal soma = valor1.add(valor2);  // 0.3 (precisão garantida)
```

### Operadores

Operadores são símbolos especiais usados para realizar operações sobre variáveis e valores. Eles podem ser classificados em três tipos:

**Operadores Unários:**
Operam sobre apenas um operando. Exemplos: `++`, `--`, `!`, `-` (negação).

```java
int a = 5;
a++;    // operador unário de incremento
boolean ativo = false;
!ativo; // operador unário de negação lógica
```

**Operadores Binários:**
Operam sobre dois operandos. Exemplos: `+`, `-`, `*`, `/`, `%`, `&&`, `||`, `^`.

```java
int soma = 2 + 3;      // operador binário de adição
boolean resultado = true && false; // operador binário lógico AND
```

**Operador Ternário:**
Opera sobre três operandos. É o operador condicional `? :`.

```java
int idade = 18;
String status = (idade >= 18) ? "maior de idade" : "menor de idade";
```

#### Operadores Lógicos: AND, OR, XOR

Os operadores lógicos são usados para combinar expressões booleanas:

- **AND (`&&`)**: Verdadeiro se ambos os operandos forem verdadeiros.
- **OR (`||`)**: Verdadeiro se pelo menos um dos operandos for verdadeiro.
- **XOR (`^`)**: Verdadeiro se apenas um dos operandos for verdadeiro (exclusivo).

<div style="display: flex; justify-content: space-between;">
  <table>
    <thead>
      <tr><th>A</th><th>B</th><th>A && B</th></tr>
    </thead>
    <tbody>
      <tr><td>false</td><td>false</td><td>false</td></tr>
      <tr><td>false</td><td>true</td><td>false</td></tr>
      <tr><td>true</td><td>false</td><td>false</td></tr>
      <tr><td>true</td><td>true</td><td>true</td></tr>
    </tbody>
  </table>
  <table>
    <thead>
      <tr><th>A</th><th>B</th><th>A || B</th></tr>
    </thead>
    <tbody>
      <tr><td>false</td><td>false</td><td>false</td></tr>
      <tr><td>false</td><td>true</td><td>true</td></tr>
      <tr><td>true</td><td>false</td><td>true</td></tr>
      <tr><td>true</td><td>true</td><td>true</td></tr>
    </tbody>
  </table>
  <table>
    <thead>
      <tr><th>A</th><th>B</th><th>A ^ B</th></tr>
    </thead>
    <tbody>
      <tr><td>false</td><td>false</td><td>false</td></tr>
      <tr><td>false</td><td>true</td><td>true</td></tr>
      <tr><td>true</td><td>false</td><td>true</td></tr>
      <tr><td>true</td><td>true</td><td>false</td></tr>
    </tbody>
  </table>
</div>

#### Operadores Relacionais

Os operadores relacionais são usados para comparar dois valores. O resultado de uma comparação relacional é sempre um valor booleano (`true` ou `false`).

| Operador | Descrição        | Exemplo (Java) | Resultado |
| -------- | ---------------- | -------------- | --------- |
| `==`     | Igual a          | `5 == 5`       | `true`    |
| `!=`     | Diferente de     | `3 != 4`       | `true`    |
| `>`      | Maior que        | `7 > 2`        | `true`    |
| `<`      | Menor que        | `1 < 0`        | `false`   |
| `>=`     | Maior ou igual a | `6 >= 6`       | `true`    |
| `<=`     | Menor ou igual a | `8 <= 10`      | `true`    |

Exemplo prático:

```java
int a = 10;
int b = 20;
boolean resultado = a < b; // true
```

#### Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis. O operador mais comum é o `=`, mas existem operadores combinados para facilitar operações matemáticas e lógicas.

| Operador | Exemplo   | Equivalente a | Descrição                  |
| -------- | --------- | ------------- | -------------------------- |
| `=`      | `a = 5;`  | —             | Atribuição simples         |
| `+=`     | `a += 3;` | `a = a + 3;`  | Soma e atribuição          |
| `-=`     | `a -= 2;` | `a = a - 2;`  | Subtração e atribuição     |
| `*=`     | `a *= 4;` | `a = a * 4;`  | Multiplicação e atribuição |
| `/=`     | `a /= 2;` | `a = a / 2;`  | Divisão e atribuição       |
| `%=`     | `a %= 3;` | `a = a % 3;`  | Módulo e atribuição        |

Exemplo prático:

```java
int x = 10;
x += 5; // x agora é 15
x *= 2; // x agora é 30
```

#### Operador Ternário

O operador ternário é uma forma concisa de expressar uma condição que retorna um valor entre duas opções. Sua sintaxe é:

```java
variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
```

Exemplo prático:

```java
int idade = 18;
String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
// status será "Maior de idade"
```

## 📂 Estrutura do Projeto

```
java-studies/
│
├── challenges/                   # 🎯 Exercícios e desafios práticos
│   ├── challenges.iml            # Configuração do módulo IntelliJ
│   └── src/                      # Código-fonte dos exercícios
│       ├── Ex01_AreaCircle.java              # Cálculo de área de círculo
│       ├── Ex02_CelsiusToFahrenheit.java     # Conversão de temperatura
│       └── ...                               # Mais exercícios em breve
│
├── GUIA_DE_ESTUDOS.md            # 📖 Guia completo de cursos e livros
├── README.md                     # 📄 Este arquivo
└── LICENSE                       # ⚖️ Licença MIT
```

### Sobre os Exercícios

Cada arquivo de exercício contém:

- **Descrição do problema** nos comentários
- **Implementação da solução**
- **Conceitos aplicados** (variáveis, operadores, estruturas de controle, etc.)

---

## 📚 Recursos de Estudo

Para um guia detalhado sobre os **cursos online** e **livros** que estou utilizando nesta jornada, consulte o [📖 Guia de Estudos](GUIA_DE_ESTUDOS.md).

O guia inclui:

- Curso completo Cod3r/Udemy - Java do Zero ao Profissional
- Bootcamp Deal + DIO - Spring Boot e Angular
- Livros recomendados sobre algoritmos e lógica de programação
- Objetivos e tópicos de cada seção de estudo

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

Feito com ☕ e 💙 por [Pedro Lucas](https://github.com/pedrolucazx)

**[⬆ Voltar ao topo](#java-studies-)**

</div>
