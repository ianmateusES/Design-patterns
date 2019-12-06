package view;

import control.ControlJogador;
import control.ControlMovimento;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import model.Dado;
import model.Jogador;
import model.Mapa;

/**
 * InterfaceJogo
 */
public class InterfaceJogo {
    private ControlJogador controlJogador;
    private ControlMovimento controlMovimento;
    private Window janela;
	private Scene cena;

    public InterfaceJogo(int qtdJogadores, Window janela){
        this.controlJogador = new ControlJogador();
        this.controlJogador.construiJogadores(qtdJogadores);
        this.controlMovimento = new ControlMovimento(this.controlJogador.getIteradorJogadores(), Mapa.getMapa().criarIterador());
        this.janela = janela;
        this.cena = new Scene();
        this.cena.loadFromFile("scn/tabuleiro.scn");
    }

    public void jogo() {

        while(controlJogador.temProximo()) {
            Keyboard teclado = janela.getKeyboard();		
            cena.draw();
            Jogador jogador = controlJogador.proximoJogador();
            jogador.draw();
            jogador.update();
            Dado.getDado().draw();
            janela.update();
            Dado.getDado().setLoop(false);
            Dado.getDado().update();
            if(teclado.keyDown(Keyboard.SPACE_KEY)){
                Dado.getDado().setLoop(true);
                Dado.getDado().setTotalDuration(1000);
                Dado.getDado().update();
                controlMovimento.movimentarJogador(jogador);
            }
        }
    }
}