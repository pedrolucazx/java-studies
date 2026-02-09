# Capítulo 3 - Exercício 25: Verificação de Número Palíndromo

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e Suas Representações

---

## 📝 Enunciado

Um número palíndromo é aquele que se lido da esquerda para a direita e da direita para a esquerda possui o mesmo valor (ex: 34543). Elabore um fluxograma que leia um número n, inteiro, e verifique se ele é um palíndromo.

---

## 📊 Fluxograma

```mermaid
flowchart TD
    A([Início])
    B{{Ler n}}
    C{n < 0?}
    D[original = n]
    E[reversed = 0]
    F(( ))
    
    A --> B
    B --> C
    C -->|Sim| G{{Escrever: n não é palíndromo}}
    C -->|Não| D
    
    D --> E
    E --> F
    
    F --> H{n > 0?}
    
    H -->|Não| I{original = reversed?}
    H -->|Sim| J[digit = n mod 10]
    
    J --> K[reversed = reversed * 10 + digit]
    K --> L[n = n / 10]
    L --> F
    
    I -->|Sim| M{{Escrever: n é palíndromo}}
    I -->|Não| G
    
    G --> N(( ))
    M --> N
    N --> O([Fim])
    
    style A fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
    style O fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
    style B fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style G fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style M fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex24](../Cap03_Ex24/flowchart.md)
- [📝 Código Java](Cap03_Ex25.java)
- [➡️ Próximo: Cap03_Ex26](../Cap03_Ex26/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
