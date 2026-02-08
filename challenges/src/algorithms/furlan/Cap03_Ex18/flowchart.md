# Capítulo 3 - Exercício 18: Cálculo de Desconto IRRF

> **Livro:** Algoritmos e Lógica da Programação, Marco A. Furlan de Souza  
> **Capítulo:** 3 - Algoritmos e Fluxogramas

---

## 📝 Enunciado

O desconto do IRRF (Imposto de Renda Retido na Fonte), também denominado "Mordida do Leão", é calculado sobre o salário líquido após a dedução da contribuição ao INSS, de acordo com a seguinte tabela:

| Base de cálculo em R$        | Alíquota (%) | Parcela a deduzir em R$ |
| ---------------------------- | ------------ | ----------------------- |
| Até R$ 1.903,98              | Isento       | -                       |
| De R$ 1.903,99 a R$ 2.826,65 | 7,5%         | R$ 142,80               |
| De R$ 2.826,66 a R$ 3.751,05 | 15%          | R$ 354,80               |
| De R$ 3.751,06 a R$ 4.664,68 | 22,5%        | R$ 636,13               |
| Acima de R$ 4.664,68         | 27,5%        | R$ 869,36               |

**Fórmulas:**

- Base de cálculo do IRRF = Salário bruto - Contribuição INSS
- Desconto IRRF = (Base de cálculo × Alíquota) - Parcela a deduzir
- Salário líquido = Salário bruto - Contribuição INSS - Desconto IRRF

Elabore um fluxograma e um algoritmo que, dada uma entrada do salário bruto, calcule a contribuição ao INSS (conforme exercício anterior), o desconto do IRRF e o salário líquido final.

---

## 📊 Fluxograma

```mermaid
%%{init: {'theme':'base', 'themeVariables': { 'primaryColor':'#7C3AED','primaryTextColor':'#fff','primaryBorderColor':'#5B21B6','lineColor':'#6366F1','secondaryColor':'#10B981','secondaryTextColor':'#fff','tertiaryColor':'#F59E0B','tertiaryTextColor':'#000','noteBkgColor':'#DBEAFE','noteTextColor':'#1E3A8A'}}}%%
flowchart TD
    Start([Início]) --> Input[/Ler Salário Bruto/]
    Input --> CalcINSS{Salário ≤ 1659.38?}
    
    CalcINSS -->|Sim| INSS1[INSS = Salário × 0.08]
    CalcINSS -->|Não| CheckINSS2{Salário ≤ 2765.66?}
    CheckINSS2 -->|Sim| INSS2[INSS = Salário × 0.09]
    CheckINSS2 -->|Não| CheckINSS3{Salário ≤ 5531.31?}
    CheckINSS3 -->|Sim| INSS3[INSS = Salário × 0.11]
    CheckINSS3 -->|Não| INSS4[INSS = 608.44]
    
    INSS1 --> CalcBase[Base = Salário - INSS]
    INSS2 --> CalcBase
    INSS3 --> CalcBase
    INSS4 --> CalcBase
    
    CalcBase --> CheckIRRF1{Base ≤ 1903.98?}
    CheckIRRF1 -->|Sim| IRRF1[IRRF = 0]
    CheckIRRF1 -->|Não| CheckIRRF2{Base ≤ 2826.65?}
    CheckIRRF2 -->|Sim| IRRF2[IRRF = Base × 0.075 - 142.80]
    CheckIRRF2 -->|Não| CheckIRRF3{Base ≤ 3751.05?}
    CheckIRRF3 -->|Sim| IRRF3[IRRF = Base × 0.15 - 354.80]
    CheckIRRF3 -->|Não| CheckIRRF4{Base ≤ 4664.68?}
    CheckIRRF4 -->|Sim| IRRF4[IRRF = Base × 0.225 - 636.13]
    CheckIRRF4 -->|Não| IRRF5[IRRF = Base × 0.275 - 869.36]
    
    IRRF1 --> CalcNet[Líquido = Salário - INSS - IRRF]
    IRRF2 --> CalcNet
    IRRF3 --> CalcNet
    IRRF4 --> CalcNet
    IRRF5 --> CalcNet
    
    CalcNet --> Output[/Mostrar INSS, IRRF, Líquido/]
    Output --> End([Fim])

    style Start fill:#7C3AED,stroke:#5B21B6,stroke-width:3px,color:#fff
    style End fill:#10B981,stroke:#059669,stroke-width:3px,color:#fff
    style CalcINSS fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style CheckINSS2 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style CheckINSS3 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style CheckIRRF1 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style CheckIRRF2 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style CheckIRRF3 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style CheckIRRF4 fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style INSS1 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style INSS2 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style INSS3 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style INSS4 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style CalcBase fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style IRRF1 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style IRRF2 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style IRRF3 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style IRRF4 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style IRRF5 fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style CalcNet fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Input fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style Output fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
```
---

## 🔗 Links Relacionados

- [Código Java](Cap03_Ex18.java)
- [Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)
