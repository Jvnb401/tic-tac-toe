package test;

import static org.junit.jupiter.api.Assertions.*;

import main.Jogo;
import main.Tabuleiro;
import org.junit.jupiter.api.Test;

public class JogoTest {

    @Test
    void deveDetectarVitoriaNaLinha() {
        Jogo jogo = new Jogo();

        jogo.jogar(0);
        jogo.jogar(3);
        jogo.jogar(1);
        jogo.jogar(4);
        jogo.jogar(2);

        assertTrue(jogo.temVencedor());
    }

    @Test
    void deveDetectarVitoriaNaColuna() {
        Jogo jogo = new Jogo();

        jogo.jogar(0);
        jogo.jogar(1);
        jogo.jogar(3);
        jogo.jogar(4);
        jogo.jogar(6);

        assertTrue(jogo.temVencedor());
    }

    @Test
    void deveDetectarVitoriaNaDiagonal() {
        Jogo jogo = new Jogo();

        jogo.jogar(0);
        jogo.jogar(3);
        jogo.jogar(4);
        jogo.jogar(5);
        jogo.jogar(8);

        assertTrue(jogo.temVencedor());
    }

    @Test
    void deveAlternarJogadores() {
        Jogo jogo = new Jogo();

        assertEquals('X', jogo.jogadorAtual());

        jogo.jogar(0);
        assertEquals('O', jogo.jogadorAtual());

        jogo.jogar(1);
        assertEquals('X', jogo.jogadorAtual());
    }

    @Test
    void deveDetectarEmpate() {
        Jogo jogo = new Jogo();

        for(int i = 0; i < 9; i++){
            if(i==2) i++;
            jogo.jogar(i);
        }

        jogo.jogar(2);

        assertTrue(jogo.acabou());
    }

    @Test
    void naoDevePermitirJogadasAposVitoria() {
        Jogo jogo = new Jogo();

        jogo.jogar(0);
        jogo.jogar(3);
        jogo.jogar(1);
        jogo.jogar(4);
        jogo.jogar(2); // vitória

        assertThrows(IllegalStateException.class, () -> jogo.jogar(5));
    }

    @Test
    void naoDeveAlterarEstadoSeJogadaInvalida() {
        Jogo jogo = new Jogo();

        jogo.jogar(0); // X

        assertThrows(IllegalStateException.class, () -> jogo.jogar(0));

        assertEquals('O', jogo.jogadorAtual()); // não deve ter alternado
    }
}
