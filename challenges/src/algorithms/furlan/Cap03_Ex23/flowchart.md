# Capítulo 3 - Exercício 23: Número Triangular

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e a suas representações

---

## 📝 Enunciado

Um número inteiro é considerado **triangular** se este for o produto de três números inteiros consecutivos, como,
por exemplo, 120 = 4 × 5 × 6. Elabore um fluxograma e um algoritmo que, após ler um número n inteiro, verifiquem 
se ele é ou não triangular.

## 📊 Fluxograma

```mermaid
flowchart TD
    A([Início])
    B{{Ler n}}
    C[i = 0]

    A --> B
    B --> C

    C --> D(( ))
D --> E[i = i + 1]
E --> F["valor = i × (i + 1) × (i + 2)"]
F --> G{valor >= n?}

G -->|Não| D

G -->|Sim| H{valor = n?}
H -->|Sim| I{{Escrever: n é triangular}}
H -->|Não| J{{Escrever: n não é triangular}}

I --> K(( ))
J --> K
K --> L([Fim])

style A fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
style L fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
style B fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
style I fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
style J fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
style C fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
style E fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
style F fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
style G fill:#FFE4CC,stroke:#994C00,stroke-width:2px,color:#000
style H fill:#FFE4CC,stroke:#994C00,stroke-width:2px,color:#000
style D fill:#E8E8E8,stroke:#404040,stroke-width:2px,color:#000
style K fill:#E8E8E8,stroke:#404040,stroke-width:2px,color:#000
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex19](../Cap03_Ex19/flowchart.md)
- [📝 Código Java](Cap03_Ex23.java)
- [➡️ Próximo: Cap03_Ex24](../Cap03_Ex24/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
