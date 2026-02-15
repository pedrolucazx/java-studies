# Capítulo 3 - Exercício 44: N-ésimo Termo de Fibonacci

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e suas Representações

---

## 📝 Enunciado

Um número da séria de Fibonacci é gerado a partir da soma dos dois números anteriores. Convenciona-se que o primeiro, é
$f_0 = 0$, e o segundo, $f_1 = 1$. A partir desse valor é possível calcular o n-ésimo elemento da série assim (para n>
2):

$$f(n) = f_{n-1} + f_{n-2}$$

---

## 📊 Fluxograma

```mermaid
%%{init: {'flowchart': {'curve': 'linear'}}}%%
flowchart TD
    A([Início])
    B{{Ler n}}
    C{n < 0?}
    D["a ← 0<br/>b ← 1<br/>i ← 0"]
    E{i = n?}
    F["temp ← a<br/>a ← b<br/>b ← temp + b<br/>i ← i + 1"]
    G(( ))
H{{Escrever: a}}
J{{Escrever: n deve ser >= 0}}
K(( ))
I([Fim])

A --> B
B --> C
C -->|Sim| J
C -->|Não|D
D --> E
E -->|Sim|H
E -->|Não|F
F --> E
J --> K
H --> G
K --> I
G --> I

style A fill: #D4F1D4, stroke: #2D5F2D, stroke-width:3px, color: #000
style I fill:#D4F1D4, stroke: #2D5F2D, stroke-width: 3px,color: #000
style B fill: #D4E4F7,stroke: #2B5278, stroke-width: 2px, color:#000
style D fill: #D4E4F7, stroke:#2B5278, stroke-width: 2px, color: #000
style J fill: #D4E4F7, stroke: #2B5278,stroke-width: 2px, color: #000
style H fill: #D4E4F7, stroke: #2B5278, stroke-width:2px, color: #000
style E fill:#FFF4D6, stroke: #D4A574, stroke-width: 2px,color: #000
style F fill: #FFF4D6,stroke: #D4A574, stroke-width: 2px, color:#000
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex40](../Cap03_Ex40/flowchart.md)
- [📝 Código Java](Cap03_Ex44.java)
- [➡️ Próximo: Cap03_Ex47](../Cap03_Ex47/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
