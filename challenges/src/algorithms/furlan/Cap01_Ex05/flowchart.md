# Capítulo 1 - Exercício 05: Caramujo

> **Livro:** Algoritmos e Lógica da Programação, Marco A. Furlan de Souza  
> **Capítulo:** 1 - Introdução

---

## 📝 Enunciado

Um caramujo está na parede de um poço a cinco metros de sua borda. Tentando sair do poço, ele sobe três metros durante o dia, porém desce escorregando dois metros durante a noite. Quantos dias levará para o caramujo conseguir sair do poço?

---

## 📊 Fluxograma

```mermaid
%%{init: {'theme':'base', 'themeVariables': { 'primaryColor':'#7C3AED','primaryTextColor':'#fff','primaryBorderColor':'#5B21B6','lineColor':'#6366F1','secondaryColor':'#10B981','secondaryTextColor':'#fff','tertiaryColor':'#F59E0B','tertiaryTextColor':'#000','noteBkgColor':'#DBEAFE','noteTextColor':'#1E3A8A'}}}%%
flowchart TD
    Start([Início]) --> Init[distancia = 5m<br/>dia = 0]
    Init --> Day[dia = dia + 1]
    Day --> Check{distancia <= 3?}

    Check -->|Sim| Exit[/Caramujo sai do poço<br/>no dia: dia/]
    Exit --> End([Fim])

    Check -->|Não| Climb[distancia = distancia - 3]
    Climb --> Slide[distancia = distancia + 2]
    Slide --> Day

    style Start fill:#7C3AED,stroke:#5B21B6,stroke-width:3px,color:#fff
    style End fill:#10B981,stroke:#059669,stroke-width:3px,color:#fff
    style Check fill:#F59E0B,stroke:#D97706,stroke-width:2px,color:#000
    style Init fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Day fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Climb fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Slide fill:#3B82F6,stroke:#2563EB,stroke-width:2px,color:#fff
    style Exit fill:#8B5CF6,stroke:#7C3AED,stroke-width:2px,color:#fff
```

---

## 🔗 Links Relacionados

- [Código Java](Cap01_Ex05.java)
- [Resumo do Capítulo 1](../../../../docs/resumos/furlan-logica.md#capítulo-1)
