# Capítulo 3 - Exercício 19: Aprovação de Aluno

> **Livro:** Algoritmos E Lógica Da Programação  
> **Capítulo:** 3 - Algoritmos e a suas Representações

---

## 📝 Enunciado

Elabore um fluxograma e um algoritmo que leia as quatro notas de prova (P1, P2, P3 e P4) e quatro notas de trabalho (T1, T2, T3 e T4) e exiba 'Aprovado' ou 'Não aprovado' dependendo dos valores obtidos.

### Regras de Cálculo:

**Média das Provas:**
$$MP = \frac{P1 + P2 + P3 + P4}{4}$$

**Média dos Trabalhos:**
$$MT = \frac{T1 + T2 + T3 + T4}{4}$$

**Média Final:**
$$MF = 0,8 \times MP + 0,2 \times MT$$

### Critério de Aprovação:

| Condição | Resultado |
|----------|-----------|
| MF ≥ 6.0 | Aprovado ✅ |
| MF < 6.0 | Não aprovado ❌ |

---

## 📊 Fluxograma

```mermaid
%%{init: {'theme':'base', 'themeVariables': { 'primaryColor':'#7C3AED','primaryTextColor':'#fff','primaryBorderColor':'#5B21B6','lineColor':'#6366F1','secondaryColor':'#10B981','secondaryTextColor':'#fff','tertiaryColor':'#F59E0B','tertiaryTextColor':'#000','noteBkgColor':'#DBEAFE','noteTextColor':'#1E3A8A'}}}%%
flowchart TD
    Start([Início]) --> InitP[somaP = 0<br/>i = 1]
    
    InitP --> LoopP{i <= 4?}
    LoopP -->|Não| InitT[somaT = 0<br/>i = 1]
    LoopP -->|Sim| InputP[/Ler nota prova P + i/]
    InputP --> AccumP[somaP = somaP + nota]
    AccumP --> IncrP[i = i + 1]
    IncrP --> LoopP
    
    InitT --> LoopT{i <= 4?}
    LoopT -->|Não| CalcMP[MP = somaP / 4]
    LoopT -->|Sim| InputT[/Ler nota trabalho T + i/]
    InputT --> AccumT[somaT = somaT + nota]
    AccumT --> IncrT[i = i + 1]
    IncrT --> LoopT
    
    CalcMP --> CalcMT[MT = somaT / 4]
    CalcMT --> CalcMF[MF = 0,8 × MP + 0,2 × MT]
    CalcMF --> CheckMF{MF >= 6.0?}
    
    CheckMF -->|Sim| AprovadoMsg[Status = 'Aprovado ✅']
    CheckMF -->|Não| NaoAprovadoMsg[Status = 'Não aprovado ❌']
    
    AprovadoMsg --> Output[/Exibir:<br/>MP, MT, MF, Status/]
    NaoAprovadoMsg --> Output
    Output --> End([Fim])

    style Start fill:#7C3AED,stroke:#5B21B6,stroke-width:3px,color:#fff
    style End fill:#10B981,stroke:#059669,stroke-width:3px,color:#fff
    style CheckMF fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style LoopP fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style LoopT fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style InputP fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style InputT fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style Output fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
    style AccumP fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style AccumT fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style CalcMP fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style CalcMT fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style CalcMF fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style AprovadoMsg fill:#10B981,stroke:#059669,stroke-width:2px,color:#fff
    style NaoAprovadoMsg fill:#EF4444,stroke:#DC2626,stroke-width:2px,color:#fff
```

---

## 🔗 Links Relacionados

- [⬅️ Anterior: Cap03_Ex18](../Cap03_Ex18/flowchart.md)
- [📝 Código Java](Cap03_Ex19.java)
- [➡️ Próximo: Cap03_Ex23](../Cap03_Ex23/flowchart.md)
- [📚 Resumo do Capítulo 3](../../../../docs/resumos/furlan-logica.md#capítulo-3)