# Capítulo 3 - Exercício 17: Cálculo de Contribuição INSS

> **Livro:** Algoritmos e Lógica da Programação, Marco A. Furlan de Souza  
> **Capítulo:** 3 - Algoritmos e Fluxogramas

---

## 📝 Enunciado

A contribuição para o INSS é calculada de forma progressiva com base no salário bruto, conforme a tabela:

| Salário de Contribuição em R$ | Alíquota (%) |
| ----------------------------- | ------------ |
| Até R$ 1.659,38               | 8%           |
| De R$ 1.659,39 a R$ 2.765,66  | 9%           |
| De R$ 2.765,67 a R$ 5.531,31  | 11%          |
| Acima de R$ 5.531,31          | R$ 608,44    |

Elabore um algoritmo que, para uma entrada do salário bruto, calcule a contribuição ao INSS e o salário líquido restante.

---

## 📊 Fluxograma

```mermaid
%%{init: {'theme':'base', 'themeVariables': { 'primaryColor':'#7C3AED','primaryTextColor':'#fff','primaryBorderColor':'#5B21B6','lineColor':'#6366F1','secondaryColor':'#10B981','secondaryTextColor':'#fff','tertiaryColor':'#F59E0B','tertiaryTextColor':'#000','noteBkgColor':'#DBEAFE','noteTextColor':'#1E3A8A'}}}%%
flowchart TD
    Start([Início]) --> Input[/Ler Salário Bruto/]
    Input --> Check1{Salário ≤ 1659.38?}
    
    Check1 -->|Sim| INSS1[INSS = Salário × 0.08]
    Check1 -->|Não| Check2{Salário ≤ 2765.66?}
    Check2 -->|Sim| INSS2[INSS = Salário × 0.09]
    Check2 -->|Não| Check3{Salário ≤ 5531.31?}
    Check3 -->|Sim| INSS3[INSS = Salário × 0.11]
    Check3 -->|Não| INSS4[INSS = 608.44]
    
    INSS1 --> CalcNet[Líquido = Salário - INSS]
    INSS2 --> CalcNet
    INSS3 --> CalcNet
    INSS4 --> CalcNet
    
    CalcNet --> Output[/Mostrar INSS e Líquido/]
    Output --> End([Fim])

    style Start fill:#7C3AED,stroke:#5B21B6,stroke-width:3px,color:#fff
    style End fill:#10B981,stroke:#059669,stroke-width:3px,color:#fff
    style Check1 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style Check2 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style Check3 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style INSS1 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style INSS2 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style INSS3 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style INSS4 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style CalcNet fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Input fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style Output fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
```
---
## 🔗 Links Relacionados
- [Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
- [Exercício Anterior: Cap03_Ex11.md](Cap03_Ex11.md)
- [Próximo exercício: Cap03_Ex18.md](Cap03_Ex18.md)

