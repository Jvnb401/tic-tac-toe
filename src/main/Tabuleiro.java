package main;

public class Tabuleiro {
    private char[] casas = new char[9];

    public Tabuleiro() {
        for (int i = 0; i < 9; i++){
            casas[i] = ' ';
        }
    }

    public char getPosicao(int i) {
        return casas[i];
    }

    public char[] getCasas() {
        return casas;
    }

    public void marcar(int posicao, char jogador) {
        if (posicao < 0 || posicao >= casas.length) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (casas[posicao] != ' ') {
            throw new IllegalStateException("Casa já ocupada");
        }

        casas[posicao] = jogador;
    }

    public boolean estaCheio() {
        for (char c : casas) {
            if (c == ' ') return false;
        }
        return true;
    }
}
