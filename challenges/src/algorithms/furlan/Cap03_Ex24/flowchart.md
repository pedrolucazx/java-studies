# Capítulo 3 - Exercício 24: Verificação de Número Primo

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e Suas Representações

---

## 📝 Enunciado
Elabore um fluxograma e uma algoritmo que leia um valor n inteiro e verifique se este é ou não primo (numéro primo 
é aquele que é divisível apenas por 1 e por ele mesmo).

---

## 📊 Fluxograma

```mermaid
flowchart TD
    A([Início])
    B{{Ler n}}
    C[divisorCount = 0]
    D[i = 1]
    
    A --> B
    B --> C
    C --> D
    
    D --> E(( ))
    E --> F{i <= n?}
    
    F -->|Não| G{divisorCount = 2?}
    F -->|Sim| H{n % i = 0?}
    
    H -->|Sim| I[divisorCount = divisorCount + 1]
    H -->|Não| J[i = i + 1]
    
    I --> J
    J --> E
    
    G -->|Sim| K{{Escrever: n é primo}}
    G -->|Não| L{{Escrever: n não é primo}}
    
    K --> M(( ))
    L --> M
    M --> N([Fim])
    
    style A fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
    style N fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
    style B fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style K fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style L fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style C fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
    style D fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
    style I fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
    style J fill:#FFF4CC,stroke:#806600,stroke-width:2px,color:#000
    style F fill:#FFE4CC,stroke:#994C00,stroke-width:2px,color:#000
    style G fill:#FFE4CC,stroke:#994C00,stroke-width:2px,color:#000
    style H fill:#FFE4CC,stroke:#994C00,stroke-width:2px,color:#000
    style E fill:#E8E8E8,stroke:#404040,stroke-width:2px,color:#000
    style M fill:#E8E8E8,stroke:#404040,stroke-width:2px,color:#000
```
---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex23](../Cap03_Ex23/flowchart.md)
- [📝 Código Java](Cap03_Ex24.java)
- [➡️ Próximo: Cap03_Ex25](../Cap03_Ex25/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
