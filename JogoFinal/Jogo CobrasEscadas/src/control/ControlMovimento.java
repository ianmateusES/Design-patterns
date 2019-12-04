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

    public ControlMovimento(IIteradorJogador jogadores, IIteradorMapa mapa){
        posicaoJogadorMapa = new PosicaoJogadorMapa(jogadores, mapa);
    }

    public void movimentarJogador(Jogador jogador){
        posicaoJogadorMapa.mudarPosicaoJogador(jogador);
        posicaoJogadorMapa.toPrint();


    }
}