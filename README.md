# Cálculos Matemáticos (Java Swing)

Aplicação desktop em Java/Swing com um menu central que reúne calculadoras matemáticas e um gerador de senhas. Projeto voltado para estudo de interfaces gráficas e operações percentuais.

## ✨ Funcionalidades

- Aplicar desconto em um valor
- Incrementar porcentagem em um valor
- Amostragem ($X\%$ de $Y$)
- Amostragem inversa (quanto $X$ representa de $Y$)
- Descobrir desconto aplicado
- Variação do delta (%)
- Descobrir valor original com desconto
- Regra de três simples
- Gerador de senhas seguras (maiúsculas, minúsculas, números e símbolos)

## 🧱 Estrutura do projeto

```
src/
  Utils/
    CalculosMatematicos.java
  View/
    MenuWindow.java
    MenuWindowMain.java
  Windows/
    Tela1.java
    Tela2.java
    Tela3.java
    Tela4.java
    Tela5.java
    Tela6.java
    Tela7.java
    Tela8.java
    Tela9.java
```

## ✅ Requisitos

- Java JDK 8+ (recomendado 11+)
- Sistema com suporte a interface gráfica (Swing)

## ▶️ Como executar

1) Compile o projeto:

```
cd /home/joao.santos/Área\ de\ trabalho/calculosMatematico-java
javac -d out $(find src -name "*.java")
```

2) Execute o menu principal:

```
java -cp out View.MenuWindowMain
```

## 🧮 Fórmulas utilizadas

- Desconto: $a - a\cdot\frac{b}{100}$
- Acréscimo: $a + a\cdot\frac{b}{100}$
- Amostragem: $\frac{a\cdot b}{100}$
- Amostragem inversa: $\frac{b}{a}\cdot 100$
- Descobrir desconto: $\frac{a-b}{a}\cdot 100$
- Variação delta: $\frac{b-a}{a}\cdot 100$
- Valor original: $\frac{a\cdot 100}{100-b}$
- Regra de três: $\frac{r1\cdot b}{a}$

## 🧩 Tecnologias

- Java
- Swing (GUI)

## 📄 Licença

Este projeto está disponível para fins educacionais. Caso deseje adicionar uma licença formal, crie um arquivo LICENSE.
