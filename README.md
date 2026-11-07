# Calculadora TDD

Projeto de uma calculadora simples em Java, desenvolvido com **TDD (Test-Driven Development)**, usando **Maven** e **JUnit 5**.

## Funcionalidades

- Somar
- Subtrair
- Multiplicar
- Dividir (com tratamento de divisão por zero)

## Tecnologias

- Java 21
- Maven
- JUnit 5
- JaCoCo (cobertura de testes)

## Etapas do TDD

1. Criar o projeto (Maven, `pom.xml` e nomes das classes)
2. Escrever as classes
3. Escrever um teste que falha 🔴
4. Testar
5. Implementar o mínimo para o teste passar 🟢
6. Refatorar 🔵

## Estrutura

```
src/
├── main/java/br/ueg/trindade/
│   └── Calculadora.java
└── test/java/br/ueg/trindade/
    └── CalculadoraTest.java
```

## Casos de teste

| Caso | Operação | Resultado esperado |
|------|----------|--------------------|
| 1 | 2 + 2 | 4 |
| 2 | 10 - 4 | 6 |
| 3 | 3 x 4 | 12 |
| 4 | 10 / 2 | 5 |
| 5 | 10 / 0 | Lança `ArithmeticException` |

## Como executar os testes

Pré-requisitos: Java 21 ou superior e Maven instalados.

```
mvn test
```

Para verificar a cobertura mínima de 80%:

```
mvn verify
```

O relatório de cobertura é gerado em `target/site/jacoco/index.html`.

## Autora

Hayra
