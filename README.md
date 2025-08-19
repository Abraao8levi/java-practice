<div align="center">

# 🚀 Java Practice Repository

[![Java](https://img.shields.io/badge/Java-17+-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=for-the-badge)](CONTRIBUTING.md)

### 📚 Repositório de Exercícios Java - Do Básico ao Avançado

**Domine Java através de prática estruturada e projetos reais**

</div>

---

## 📊 Visão Geral

<div align="center">

| 🏗️ **Total de Exercícios** | 📈 **Nível de Dificuldade** | 🎯 **Conceitos Abordados** |
|:-------------------------:|:---------------------------:|:-------------------------:|
| **5+** | 🟢 Iniciante → 🔴 Avançado | **OOP, Design Patterns, Clean Code** |

</div>

Este repositório é uma coleção cuidadosamente estruturada de exercícios Java, projetada para desenvolver habilidades progressivamente. Cada exercício é uma aplicação completa que demonstra conceitos fundamentais e avançados da linguagem Java.

---

## 🎯 Objetivos de Aprendizagem

### 🥇 **Fundamentos**
- ✅ Programação Orientada a Objetos (OOP)
- ✅ Princípios SOLID
- ✅ Clean Code & Best Practices
- ✅ Design Patterns Essenciais

### 🥈 **Avançado**
- ✅ Arquitetura de Software
- ✅ Testes Unitários & Integração
- ✅ Java Collections Framework
- ✅ Exception Handling Avançado

---

## 🚀 Começando

### 📋 **Pré-requisitos**

| Ferramenta | Versão Mínima | Instalação |
|------------|---------------|------------|
| ![Java](https://img.shields.io/badge/Java-JDK_17+-blue) | 17+ | [Download JDK](https://adoptium.net/) |
| ![Git](https://img.shields.io/badge/Git-2.x-purple) | 2.x+ | [Download Git](https://git-scm.com/) |
| ![IDE](https://img.shields.io/badge/IDE-Any-green) | - | IntelliJ IDEA / Eclipse / VS Code |

### ⚡ **Instalação Rápida**

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/java-practice.git

# Entre no diretório
cd java-practice

# Compile qualquer exercício
cd Exercicio1
javac *.java && java Main
```

---

## 📚 Estrutura de Exercícios

### 🏢 **Exercício 1 - Sistema de Gerenciamento de Funcionários**
```java
📁 Exercicio1/
├── Departamento.java    // Gestão de departamentos
├── Empregado.java       // Modelo de funcionário
└── Main.java           // Aplicação principal
```
**Conceitos:** Encapsulamento, Herança, Polimorfismo

### 🚗 **Exercicio 2 - Sistema de Gerenciamento de Veículos**
```java
📁 Exercicio2/
├── Carro.java         // Classe base para veículos
├── Carro1.java        // Implementação específica
└── Testes            // Validações de negócio
```
**Conceitos:** Abstração, Interfaces, Composição

### 🏍️ **Exercicio 3 - Sistema de Motocicletas**
```java
📁 Exercicio3/
├── Motorcycle.java    // Gestão de motocicletas
├── Person.java        // Modelo de pessoa
└── Main.java          // Simulação de uso
```
**Conceitos:** Agregação, Validações, Regras de Negócio

### 🛒 **Exercicio 4 - Sistema de E-commerce**
```java
📁 Exercicio4/
├── Pedido.java        // Gestão de pedidos
├── Produto.java       // Catálogo de produtos
├── ItemPedido.java    // Itens do pedido
└── StatusPedido.java  // Enum de status
```
**Conceitos:** Enums, Collections, Relacionamentos complexos

### 🧮 **Exercicio 5 - Calculadora Avançada**
```java
📁 Exercicio5/Calculadora/
├── Calculator.java    // Lógica de cálculo
└── Solver.java        // Resolução de expressões
```
**Conceitos:** Parsers, Expressões, Design Patterns

### 🧪 **Teste 1 - Projeto POO**
```java
📁 Teste1/
└── ProjetoPOO.java    // Sistema completo de POO
```
**Conceitos:** Programação Orientada a Objetos, Herança, Polimorfismo, Encapsulamento

### 🎯 **SOLID - Princípios de Design**
```java
📁 solid/
├── Main.java                    // Aplicação principal
├── domain/
│   ├── Order.java              // Modelo de pedido
│   ├── OrderItem.java          // Item do pedido
│   ├── Product.java            // Modelo de produto
│   └── Custom.java             // Cliente
├── payment/
│   ├── PaymentProcessor.java   // Interface de pagamento
│   ├── CreditCardPaymentProcessor.java
│   ├── PixPaymentProcessor.java
│   └── PaymentDetails.java     // Detalhes do pagamento
├── pricing/
│   ├── DiscountPolicy.java     // Interface de desconto
│   ├── NoDiscount.java         // Sem desconto
│   └── SeasonalDiscount.java   // Desconto sazonal
├── notify/
│   ├── MessageSender.java      // Interface de notificação
│   ├── EmailNotifier.java      // Notificação por email
│   ├── SmsNotifier.java        // Notificação por SMS
│   └── ReceiptSender.java      // Envio de recibos
├── repo/
│   ├── OrderRepository.java    // Interface do repositório
│   └── InMemoryOrderRepository.java
└── service/
    └── CheckoutService.java    // Serviço de checkout
```
**Conceitos:** Princípios SOLID, Clean Architecture, Dependency Inversion, Open/Closed Principle

---

## 🧪 Testes & Qualidade

### ✅ **Estratégia de Testes**
- **Unit Tests**: Cada classe possui testes específicos
- **Integration Tests**: Validação de fluxos completos
- **Edge Cases**: Tratamento de casos extremos
- **Performance**: Benchmarks onde aplicável

---

## 🛠️ **Tecnologias & Ferramentas**

<div align="center">

| **Categoria** | **Tecnologias** |
|---------------|-----------------|
| **Linguagem** | ![Java](https://img.shields.io/badge/Java_17-Features-orange) |
| **Build** | ![Maven](https://img.shields.io/badge/Maven-3.8+-blue) ![Gradle](https://img.shields.io/badge/Gradle-7+-green) |
| **Testes** | ![JUnit5](https://img.shields.io/badge/JUnit5-Latest-red) ![Mockito](https://img.shields.io/badge/Mockito-4+-yellow) |

</div>

---

## 🤝 **Como Contribuir**

### 📋 **Processo de Contribuição**

1. **Fork** o projeto
2. **Crie** uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. **Commit** suas mudanças (`git commit -m 'Add: nova funcionalidade'`)
4. **Push** para a branch (`git push origin feature/AmazingFeature`)
5. **Abra** um Pull Request

---

## 📄 **Licença**

Este projeto está licenciado sob a **MIT License** - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

