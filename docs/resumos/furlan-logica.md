# Algoritmos E Lógica Da Programação.

> Resumo e anotações do livro "Algoritmos e Lógica da Programação"

**Autores:** Marco A. Furlan de Souza.

**Status:** 🔄 Iniciado.

**Parte do:** [Roadmap - Parte 1](../../ROADMAP.md#parte-1-fundação---lógica-algoritmos-e-computação-)

---

## 📑 Índice de Capítulos

- [Capítulo 1: Introdução](#capítulo-1-introdução)
- [Capítulo 2: Conceitos de Computação e Computadores](#capítulo-2-conceitos-de-computação-e-computadores)
- [Capítulo 3: Algoritmos e Suas Representações](#capítulo-3-algoritmos-e-suas-representações)
- [Capítulo 4: Estruturas de Programação](#capítulo-4-estruturas-de-programação)
- [Capítulo 5: Variáveis Indexadas](#capítulo-5-variáveis-indexadas)
- [Capítulo 6: Técnicas para a Solução de Problemas](#capítulo-6-técnicas-para-a-solução-de-problemas)

---

## Capítulo 1: Introdução

### 📝 Resumo

Este capítulo apresenta os fundamentos do desenvolvimento de software, explicando a diferença entre dados e informação, as etapas do processo de engenharia de software, e introduz o conceito de algoritmos como base para a programação estruturada.

### 💡 Pontos Importantes

#### 🖥️ Sobre Programação

- Um programa de computador é produto da atividade intelectual de um programador
- Depende de treinamento prévio em **abstração** e **modelagem de problemas**
- Exige uso da lógica na verificação das soluções

#### 📊 Dados vs Informação

| Conceito             | Definição                                                        |
| -------------------- | ---------------------------------------------------------------- |
| **Dado**             | Valor qualquer armazenado em um computador (bruto, sem contexto) |
| **Informação**       | Interpretação do dado com significado                            |
| **Dados de Entrada** | Fornecidos pelo usuário ao sistema                               |
| **Dados de Saída**   | Fornecidos pelo sistema ao usuário após processamento            |

#### 🔄 Etapas do Desenvolvimento de Software

1. **Análise**

   - Criação de especificações detalhando como o software vai funcionar
   - Define requisitos e funcionalidades

2. **Projeto**

   - Transforma especificações da análise em termos mais próximos da implementação
   - Arquitetura e design do sistema

3. **Implementação**

   - Utiliza linguagem de programação para construir o software
   - Traduz especificações do projeto em código

4. **Teste**
   - Verifica conformidade com requisitos iniciais
   - Software deve satisfazer todas as especificações

### 🎯 Conceitos-Chave

- **Abstração:** Capacidade de simplificar problemas complexos focando no essencial.
- **Modelagem:** Representação estruturada de um problema real.
- **Algoritmo:** Sequência lógica e finita de passos para resolver um problema.
- **Estruturas de Programação:** Blocos fundamentais que compõem qualquer algoritmo.
- **Processo de Engenharia de Software:** Metodologia sistemática para desenvolvimento.

### 📚 Exercícios Relacionados

- [Exercícios do Capítulo 1](../../challenges/src/algorithms/furlan/README.md)

---

## Capítulo 2: Conceitos de Computação e Computadores

### 📝 Resumo

Este capítulo explora a evolução histórica dos computadores através de suas gerações, desde dispositivos mecânicos até os modernos chips VLSI. Apresenta a etimologia da computação, os fundamentos da eletrônica digital, e explica como os computadores representam e processam diferentes tipos de dados através de sua arquitetura.

### 💡 Pontos Importantes

#### 📖 Etimologia e Fundamentos

- **Digitus (Latim)** → Dedo → Dígito (Português)
  - Reflete a origem da contagem usando os dedos
- **Computação** = Ato ou efeito de computar
  - Essencialmente significa "fazer contagem"

#### 🕰️ Evolução das Gerações de Computadores

##### **Geração Zero (~Até 1940) - Computadores Puramente Mecânicos**

- Dispositivos baseados em engrenagens, alavancas e componentes mecânicos
- **Destaques:**
  - Ábaco (antiguidade)
  - Pascaline (1642) - Blaise Pascal
  - Máquina Analítica de Babbage (1837)
- **Características:** Lentos, limitados, sem eletrônica

##### **Primeira Geração (1940-1956) - Válvulas e Relés**

- Primeiros computadores **eletrônicos**
- **Destaques:**
  - ENIAC (1946) - Electronic Numerical Integrator and Computer
  - UNIVAC (1951) - Primeiro computador comercial
- **Características:**
  - Enormes dimensões (salas inteiras)
  - Alto consumo de energia
  - Aquecimento excessivo
  - Frequentes falhas nas válvulas
  - Programação em linguagem de máquina

##### **Segunda Geração (1956-1963) - Transistores**

- Substituição das válvulas por **transistores**
- **Destaques:**
  - IBM 7090 (1959)
  - Surgimento de linguagens de alto nível (FORTRAN, COBOL)
- **Características:**
  - Menor tamanho e consumo energético
  - Maior confiabilidade
  - Mais rápidos e eficientes
  - Menor geração de calor

##### **Terceira Geração (1964-1971) - Circuitos Integrados**

- Introdução dos **CIs (Circuitos Integrados)**
- **Destaques:**
  - IBM System/360 (1964)
  - Múltiplos transistores em um único chip
- **Características:**
  - Miniaturização significativa
  - Maior velocidade de processamento
  - Redução de custos de produção
  - Início da popularização dos computadores

##### **Quarta Geração (1971-Presente) - Chips VLSI**

- **VLSI:** Very Large Scale Integration
- **Destaques:**
  - Intel 4004 (1971) - Primeiro microprocessador
  - Apple II (1977), IBM PC (1981)
  - Era dos computadores pessoais
  - Smartphones e dispositivos móveis
- **Características:**
  - Milhões/bilhões de transistores por chip
  - Computação pessoal e portátil
  - Processamento massivamente paralelo
  - Integração de múltiplas funções

---

#### 💻 Eletrônica Digital e Representação de Dados

| Conceito                  | Descrição                                                     |
| ------------------------- | ------------------------------------------------------------- |
| **Bit**                   | Unidade básica: 0 ou 1 (sistema binário)                      |
| **Múltiplos**             | Byte (8 bits), KB, MB, GB, TB, PB                             |
| **Caracteres**            | Representação de letras e símbolos (ASCII, Unicode)           |
| **Cadeias de Caracteres** | Sequências de caracteres (strings/texto)                      |
| **Som**                   | Digitalização de ondas sonoras em valores binários            |
| **Imagem**                | Representação de pixels com valores de cor em formato digital |

---

#### 🏗️ Arquitetura e Funcionamento

##### **Arquitetura de um Computador**

- **UCP (Unidade Central de Processamento):** Cérebro do computador
- **Memória:** Armazenamento de dados e instruções
- **Dispositivos de E/S:** Entrada e Saída de dados
- **Barramento:** Sistema de comunicação entre componentes

##### **Funcionamento da UCP na Execução de Programas**

1. **Busca (Fetch):** Busca a próxima instrução na memória
2. **Decodificação (Decode):** Interpreta o que a instrução significa
3. **Execução (Execute):** Realiza a operação especificada
4. **Armazenamento:** Guarda o resultado (se necessário)

---

### 🎯 Conceitos-Chave

- **Sistema Binário:** Base da computação digital (0 e 1).
- **Transistor:** Componente semicondutor que revolucionou a computação.
- **Circuito Integrado:** Chip que contém múltiplos componentes eletrônicos.
- **VLSI:** Integração em larga escala permitindo chips com bilhões de transistores.
- **UCP/CPU:** Responsável pelo processamento e execução de instruções.
- **Digitalização:** Conversão de informações analógicas (som, imagem) para formato binário.

---

## Capítulo 3: Algoritmos e Suas Representações

_[Em breve]_

---

## Capítulo 4: Estruturas de Programação

_[Em breve]_

---

## Capítulo 5: Variáveis Indexadas

_[Em breve]_

---

## Capítulo 6: Técnicas para a Solução de Problemas

_[Em breve]_

---

## 📊 Progresso de Leitura

- [x] Capítulo 1: Introdução
- [ ] Capítulo 2: Conceitos de Computação e Computadores
- [ ] Capítulo 3: Algoritmos e Suas Representações
- [ ] Capítulo 4: Estruturas de Programação
- [ ] Capítulo 5: Variáveis Indexadas
- [ ] Capítulo 6: Técnicas para a Solução de Problemas

**Progresso:** 1/6 capítulos (16.7%) 🎯

---

## 🎯 Conclusão Geral

_[A ser preenchido ao terminar o livro]_

---

**[⬅️ Voltar aos Resumos](README.md)** | **[🏠 Voltar ao README](../../README.md)**
