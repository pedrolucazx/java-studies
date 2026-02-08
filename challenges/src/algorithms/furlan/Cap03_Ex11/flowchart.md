# Capítulo 3 - Exercício 11: Maior de N Valores

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e a suas Representações

---

## 📝 Enunciado

Elabore um fluxograma que permita a entrada de n (lido pelo teclado) valores reais e apresente como resultado o maior entre esses valores.

---

## 📊 Fluxograma

```mermaid
%%{init: {'theme':'base', 'themeVariables': { 'primaryColor':'#7C3AED','primaryTextColor':'#fff','primaryBorderColor':'#5B21B6','lineColor':'#6366F1','secondaryColor':'#10B981','secondaryTextColor':'#fff','tertiaryColor':'#F59E0B','tertiaryTextColor':'#000','noteBkgColor':'#DBEAFE','noteTextColor':'#1E3A8A'}}}%%
flowchart TD
    Start([Início]) --> Input1[/Ler n/]
    Input1 --> Init[largest = 0<br/>i = 1]
    Init --> Condition{i <= n?}

    Condition -->|Sim| Input2[/Ler número/]
    Input2 --> Decision{número > largest?}

    Decision -->|Sim| Update[largest = número]
    Decision -->|Não| Increment
    Update --> Increment[i = i + 1]

    Increment --> Condition

    Condition -->|Não| Output[/Mostrar largest/]
    Output --> End([Fim])

    style Start fill:#7C3AED,stroke:#5B21B6,stroke-width:3px,color:#fff
    style End fill:#10B981,stroke:#059669,stroke-width:3px,color:#fff
    style Condition fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style Decision fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style Init fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Update fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Increment fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Input1 fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style Input2 fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style Output fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap01_Ex07](../Cap01_Ex07/flowchart.md)
- [📝 Código Java](Cap03_Ex11.java)
- [➡️ Próximo: Cap03_Ex17](../Cap03_Ex17/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
