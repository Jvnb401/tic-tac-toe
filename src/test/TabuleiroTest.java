package test;

import static org.junit.jupiter.api.Assertions.*;

import main.Tabuleiro;
import org.junit.jupiter.api.Test;

public class TabuleiroTest {

    @Test
    void tabuleiroDeveComecarVazio(){
        Tabuleiro tabuleiro = new Tabuleiro();

        for (int i = 0; i < 9; i++){
            assertEquals(' ', tabuleiro.getPosicao(i));
        }
    }

    @Test
    void deveFazerUmaJogada() {
        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.marcar(0, 'X');

        assertEquals('X', tabuleiro.getPosicao(0));
    }

    @Test
    void naoDevePermitirJogarEmCasaOcupada() {
        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.marcar(0, 'X');

        assertThrows(IllegalStateException.class, () -> {
            tabuleiro.marcar(0, 'O');
        });
    }

    @Test
    void naoDevePermitirPosicaoInvalida() {
        Tabuleiro tabuleiro = new Tabuleiro();

        assertThrows(IllegalArgumentException.class, () -> {
            tabuleiro.marcar(9, 'X');
        });
    }
}
