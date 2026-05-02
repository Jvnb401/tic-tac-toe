package main;

public class Jogo {
    private Tabuleiro tabuleiro;
    private char jogadorAtual = 'X';
    private boolean acabou = false;

    public Jogo() {
        this.tabuleiro = new Tabuleiro();
    }

    public char[] getCasas() {
        return tabuleiro.getCasas();
    }

    public void jogar(int posicao) {
        if (acabou) {
            throw new IllegalStateException("O jogo já terminou");
        }

        tabuleiro.marcar(posicao, jogadorAtual);


        if (temVencedor() || tabuleiro.estaCheio()) {
            acabou = true;
            return;
        }

        alternarJogador();
    }

    private void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    public char jogadorAtual() {
        return jogadorAtual;
    }

    public boolean acabou() {
        return acabou;
    }

    private boolean iguais(char a, char b, char c) {
        return a != ' ' && a == b && b == c;
    }

    public boolean temVencedor() {
        char[] t = tabuleiro.getCasas();

        int[][] combinacoes = {
                {0,1,2},{3,4,5},{6,7,8}, //linhas
                {0,3,6},{1,4,7},{2,5,8}, //colunas
                {0,4,8},{2,4,6} //diagonais
        };

        for (int[] c : combinacoes) {
            if (iguais(t[c[0]], t[c[1]], t[c[2]])) {
                return true;
            }
        }

        return false;
    }
}
