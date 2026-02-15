# Capítulo 3 - Exercício 26: Verificação de Triângulo Válido

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e Suas Representações

---

## 📝 Enunciado

Elabore um fluxograma que receba três valores digitados A, B e C, informando se estes podem ser os lados de um
triângulo.

---

## 📊 Fluxograma

```mermaid
flowchart TD
    A([Início])
    B{{Ler A}}
    C{{Ler B}}
    D{{Ler C}}
    E{A > 0 E B > 0 E C > 0?}
    F{A + B > C E<br/>A + C > B E<br/>B + C > A?}
    G(( ))
    
    A --> B
    B --> C
    C --> D
    D --> E
    
    E -->|Não| H{{Escrever: Valores inválidos}}
    E -->|Sim| F
    
    F -->|Sim| I{{Escrever: Triângulo válido}}
    F -->|Não| J{{Escrever: Não forma triângulo}}
    
    H --> G
    I --> G
    J --> G
    G --> K([Fim])
    
    style A fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
    style K fill:#D4F1D4,stroke:#2D5F2D,stroke-width:3px,color:#000
    style B fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style C fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style D fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style H fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style I fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style J fill:#D4E4F7,stroke:#2B5278,stroke-width:2px,color:#000
    style E fill:#FFF4D6,stroke:#D4A574,stroke-width:2px,color:#000
    style F fill:#FFF4D6,stroke:#D4A574,stroke-width:2px,color:#000
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex25](../Cap03_Ex25/flowchart.md)
- [📝 Código Java](Cap03_Ex26.java)
- [➡️ Próximo: Cap03_Ex30](../Cap03_Ex30/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
