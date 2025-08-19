<div align="center">

# 🚀 Repositório de Práticas em Java

[![Java](https://img.shields.io/badge/Java-17+-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=for-the-badge)](CONTRIBUTING.md)

### 📚 Do Básico ao Avançado: Domine Java com Projetos Práticos e Estruturados

</div>

---

## 📊 Visão Geral

Este repositório é uma coleção organizada de exercícios em Java, projetada para aprimorar suas habilidades de forma progressiva. Cada projeto é uma aplicação autocontida que demonstra conceitos fundamentais e avançados da linguagem e do ecossistema Java.

| 🏗️ **Total de Projetos** | 📈 **Nível de Dificuldade** | 🎯 **Principais Conceitos** |
|:-------------------------:|:---------------------------:|:-------------------------:|
| **7+ (e crescendo!)** | 🟢 Iniciante → 🔴 Avançado | **OOP, SOLID, Design Patterns, Clean Code** |

---

## 🎯 Objetivos de Aprendizagem

-   ✅ **Programação Orientada a Objetos (OOP):** Encapsulamento, Herança, Polimorfismo e Abstração.
-   ✅ **Princípios de Design:** Aplicação prática dos princípios **SOLID**.
-   ✅ **Boas Práticas:** Clean Code, organização de pacotes e padrões de nomenclatura.
-   ✅ **Padrões de Projeto (Design Patterns):** Soluções elegantes para problemas comuns.
-   ✅ **Estruturas de Dados:** Uso eficiente de `Collections` e `Enums`.
-   ✅ **Tratamento de Exceções:** Implementação de lógica de validação e tratamento de erros.

---

## 🚀 Como Começar

### 📋 Pré-requisitos

| Ferramenta | Versão Mínima | Onde Baixar |
|:--- |:--- |:--- |
| ☕ **Java JDK** | 17+ | [Adoptium (Temurin)](https://adoptium.net/) |
| 🌿 **Git** | 2.x+ | [Download Git](https://git-scm.com/) |
| 💻 **IDE** | Opcional | IntelliJ IDEA / Eclipse / VS Code |

### ⚡ Instalação e Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/java-practice.git](https://github.com/seu-usuario/java-practice.git)
    cd java-practice
    ```

2.  **Navegue até um exercício:**
    ```bash
    cd exercicio-01-funcionarios
    ```

3.  **Compile e execute:**
    * Para exercícios simples (sem pacotes):
        ```bash
        javac *.java
        java Main
        ```
    * Para exercícios com pacotes (como o projeto SOLID):
        ```bash
        # Compile a partir da pasta 'src'
        javac -d build src/com/example/Main.java
        # Execute informando o caminho completo da classe principal
        java -cp build com.example.Main
        ```

---

## 📂 Estrutura dos Exercícios

Cada exercício está contido em sua própria pasta e foca em um conjunto específico de habilidades.

#### 1. 🏢 Sistema de Gerenciamento de Funcionários
* **Descrição:** Uma aplicação CLI para gerenciar funcionários e departamentos.
* **Conceitos:** Encapsulamento, Herança, Polimorfismo.
    ```
    📁 exercicio-01-funcionarios/
    ├── Departamento.java
    ├── Empregado.java
    └── Main.java
    ```

#### 2. 🚗 Sistema de Gerenciamento de Veículos
* **Descrição:** Modela diferentes tipos de veículos para demonstrar polimorfismo e abstração.
* **Conceitos:** Abstração, Classes Abstratas, Interfaces, Composição.
    ```
    📁 exercicio-02-veiculos/
    ├── Veiculo.java      (Abstrato)
    ├── Carro.java
    ├── Moto.java
    └── Main.java
    ```

#### 3. 🛒 Sistema Simplificado de E-commerce
* **Descrição:** Gerencia produtos, pedidos e status de entrega.
* **Conceitos:** Enums, Collections Framework, Relacionamentos entre classes.
    ```
    📁 exercicio-03-ecommerce/
    ├── Pedido.java
    ├── Produto.java
    ├── ItemPedido.java
    └── StatusPedido.java (Enum)
    ```

#### 4. 🧮 Calculadora com Padrões de Projeto
* **Descrição:** Implementa uma calculadora que suporta diferentes operações usando o padrão *Strategy*.
* **Conceitos:** Padrão de Projeto (Strategy), Interfaces, Polimorfismo.
    ```
    📁 exercicio-04-calculadora/
    ├── Operacao.java       (Interface Strategy)
    ├── Adicao.java
    ├── Subtracao.java
    ├── Calculadora.java    (Contexto)
    └── Main.java
    ```

#### 5. 🎯 Desafio de POO - Agência Bancária
* **Descrição:** Um sistema mais completo que simula contas, transações e clientes de um banco.
* **Conceitos:** Agregação, Tratamento de Exceções, Validação de regras de negócio.
    ```
    📁 desafio-01-banco/
    ├── Cliente.java
    ├── Conta.java
    ├── ContaCorrente.java
    ├── ContaPoupanca.java
    └── Main.java
    ```

#### 6. ✨ Projeto com Princípios SOLID
* **Descrição:** Um sistema de checkout de e-commerce projetado com os 5 princípios SOLID.
* **Conceitos:** SRP, OCP, LSP, ISP, DIP, Injeção de Dependência.
    ```
    📁 projeto-solid-ecommerce/
    └── src/
        ├── com/example/
        ├── domain/         # Entidades (Pedido, Produto)
        ├── notification/   # Interfaces e classes de notificação
        ├── payment/        # Interfaces e classes de pagamento
        ├── persistence/    # Interfaces de repositório
        ├── service/        # Lógica de negócio (CheckoutService)
        └── Main.java
    ```

---

## 🛠️ Tecnologias e Ferramentas

| Categoria | Tecnologias |
|:--- |:--- |
| **Linguagem** | ![Java](https://img.shields.io/badge/Java-17+-007396?style=flat-square&logo=java&logoColor=white) |
| **Build Tools** | ![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=flat-square&logo=apache-maven&logoColor=white) ![Gradle](https://img.shields.io/badge/Gradle-8+-02303A?style=flat-square&logo=gradle&logoColor=white) |
| **Testes** | ![JUnit5](https://img.shields.io/badge/JUnit-5-25A162?style=flat-square&logo=junit5&logoColor=white) ![Mockito](https://img.shields.io/badge/Mockito-5+-E91E63?style=flat-square&logo=mockito&logoColor=white) |

---

## 🤝 Como Contribuir

Contribuições são o que tornam a comunidade de código aberto um lugar incrível para aprender e criar. Qualquer contribuição que você fizer será **muito apreciada**.

1.  **Faça um Fork** do projeto.
2.  Crie sua Feature Branch (`git checkout -b feature/NovaFuncionalidade`).
3.  Faça o Commit de suas mudanças (`git commit -m 'Adiciona NovaFuncionalidade'`).
4.  Faça o Push para a Branch (`git push origin feature/NovaFuncionalidade`).
5.  Abra um **Pull Request**.

---

## 📄 Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.