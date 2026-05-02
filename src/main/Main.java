package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in);

        while (!jogo.acabou()) {
            imprimirTabuleiro(jogo);

            System.out.print("Jogador " + jogo.jogadorAtual() + ", escolha uma posição (0-8): ");

            try {
                int posicao = scanner.nextInt();
                jogo.jogar(posicao);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine(); // limpa buffer
            }
        }

        imprimirTabuleiro(jogo);

        if (jogo.temVencedor()) {
            System.out.println("Jogador " + jogo.jogadorAtual() + " venceu!");
        } else {
            System.out.println("Deu velha! (empate)");
        }

        scanner.close();
    }

    private static void imprimirTabuleiro(Jogo jogo) {
        char[] t = jogo.getCasas();

        for (int i = 0; i < 9; i++) {
            char valor;

            if (t[i] == ' ') {
                valor = Character.forDigit(i, 10); // mostra índice
            } else {
                valor = t[i]; // mostra X ou O
            }

            System.out.print(" " + valor + " ");

            if (i % 3 != 2) {
                System.out.print("|");
            }

            if (i % 3 == 2 && i != 8) {
                System.out.println("\n---+---+---");
            }
        }

        System.out.println("\n");
    }
}