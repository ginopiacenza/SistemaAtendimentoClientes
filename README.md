# Sistema de Atendimento ao Cliente

## 📋 Sobre

Este projeto é um sistema de gerenciamento de atendimento ao cliente, implementado totalmente em **Java** utilizando **lista encadeada manual**, **sem usar estruturas prontas**.

O sistema simula:

- **Fila de Atendimento**: gerencia a ordem dos clientes (estrutura FIFO - Primeiro a Entrar, Primeiro a Sair).
- **Pilha de Histórico**: registra as solicitações realizadas (estrutura LIFO - Último a Entrar, Primeiro a Sair).

---

## 🛠️ Tecnologias e Regras Usadas

- Linguagem: **Java**
- Estruturas: **Fila** e **Pilha** usando **lista encadeada manual**.
- Apenas tipos básicos (`String`, `int`, `float`, `try-catch`, `throws`).
- Não foi utilizado `List`, `ArrayList`, `Arrays`, `StringBuilder`, ou qualquer tipo abstrato.

---

Cada classe tem uma responsabilidade específica:
- **Elemento.java**: Representa o cliente ou a solicitação.
- **Node.java**: Estrutura de nó da lista encadeada.
- **Pilha.java**: Implementa o histórico de solicitações.
- **Fila.java**: Implementa a fila de atendimento.
- **Main.java**: Gerencia o funcionamento geral (menu e opções).

---
