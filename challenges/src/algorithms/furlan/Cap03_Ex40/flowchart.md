# Capítulo 3 - Exercício 40: Cálculo de Fatorial

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e Suas Representações

---

## 📝 Enunciado

Elabore um fluxograma que, dado um valor n inteiro, calculará seu fatorial. (`n! = n * (n-1) * ... * 1`)

---

## 📊 Fluxograma

```mermaid
flowchart TD
    A([Início])
    B{{Ler N}}
    C["i ← 1<br/>FAT ← 1"]
    D{i ≤ N?}
E["FAT ← FAT * i<br/>i ← i + 1"]
F(( ))
G{{Escrever: FAT}}
H([Fim])

A --> B
B --> C
C --> D

D -->|Sim|E
E --> D

D -->|Não|G
G --> F
F --> H

style A fill: #D4F1D4, stroke: #2D5F2D, stroke-width: 3px, color: #000
style H fill: #D4F1D4, stroke: #2D5F2D, stroke-width: 3px, color: #000
style B fill: #D4E4F7, stroke: #2B5278, stroke-width: 2px, color: #000
style C fill: #D4E4F7, stroke: #2B5278, stroke-width: 2px, color: #000
style G fill: #D4E4F7, stroke: #2B5278, stroke-width: 2px, color: #000
style D fill: #FFF4D6, stroke: #D4A574, stroke-width: 2px, color: #000
style E fill: #FFF4D6, stroke: #D4A574, stroke-width: 2px, color: #000
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex30](../Cap03_Ex30/flowchart.md)
- [📝 Código Java](Cap03_Ex40.java)
- [➡️ Próximo: Cap03_Ex44](../Cap03_Ex44/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
