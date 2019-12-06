package control;

import model.IIteradorJogador;
import model.IIteradorMapa;
import model.Jogador;
import model.PosicaoJogadorMapa;

/**
 * ControlMovimento
 */
public class ControlMovimento {
    private PosicaoJogadorMapa posicaoJogadorMapa;

    public ControlMovimento(IIteradorJogador interadorJogadores, IIteradorMapa mapa){
        posicaoJogadorMapa = new PosicaoJogadorMapa(interadorJogadores, mapa);
    }

    public void movimentarJogador(Jogador jogador){
        posicaoJogadorMapa.mudarPosicaoJogador(jogador);
    }

    public void toPrintPosicaoJogadorMapa(){
        posicaoJogadorMapa.toPrint();
    }

    public Jogador getJogadorVencedor(){
        return posicaoJogadorMapa.getJogadorVencedor();
    }
}