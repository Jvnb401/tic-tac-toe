# 🎮 Jogo da Velha em Java

Projeto simples de Jogo da Velha desenvolvido em Java, utilizando práticas de **XP (Extreme Programming)** com foco em testes automatizados (JUnit) e refatoração contínua.

## 🚀 Funcionalidades

* Tabuleiro 3x3
* Alternância automática entre jogadores (X e O)
* Validação de jogadas:

  * Posição inválida
  * Casa já ocupada
* Detecção de vitória:

  * Linhas, colunas e diagonais
* Detecção de empate (velha)
* Bloqueio de jogadas após o fim do jogo
* Interface via terminal

## 🧪 Testes

O projeto foi desenvolvido com **TDD**, incluindo testes para:

* Estado inicial do tabuleiro
* Jogadas válidas e inválidas
* Alternância de jogadores
* Condições de vitória
* Empate
* Garantia de consistência do estado após erros

## 💻 Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Jvnb401/tic-tac-toe.git
```

2. Compile o projeto:

```bash
javac *.java
```

3. Execute:

```bash
java Main
```

## 🎯 Como jogar

* O jogo é executado no terminal
* Cada jogador escolhe uma posição de **0 a 8**
* As posições são exibidas no tabuleiro
* Vence quem completar uma linha, coluna ou diagonal

## 📚 Conceitos aplicados

* Programação Orientada a Objetos
* TDD (Test Driven Development)
* Refatoração contínua
* Separação de responsabilidades (Jogo / Tabuleiro)

## 📌 Melhorias futuras

* Interface gráfica
* Placar entre jogadores
* Opção de reiniciar partida
* Inteligência artificial (jogador vs máquina)

---

Feito para fins de estudo 🚀
