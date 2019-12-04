package model;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * PosicaoJogadorMapa
 */
public class PosicaoJogadorMapa {
    private HashMap<Jogador, ACasa> posicoesJogadores;
    private IIteradorMapa tabuleiro;

    public PosicaoJogadorMapa(IIteradorJogador jogadores, IIteradorMapa mapa){
        this.posicoesJogadores = new HashMap<Jogador,ACasa>();
        this.tabuleiro = mapa;

        for(int i = 0; i < jogadores.qtdJogadores(); i++){
            this.posicoesJogadores.put(jogadores.proximo(), tabuleiro.proximo(1, 0));
        }
    }

    public void mudarPosicaoJogador(Jogador jogador){
        ACasa casa = posicoesJogadores.get(jogador);
        int qtdCasas = jogador.jogarDado();
        ACasa novaCasa = tabuleiro.proximo(casa.getPosicao(), qtdCasas);
        posicoesJogadores.put(jogador, novaCasa);
        
        while(!(novaCasa instanceof CasaNormal)){
            ACasaEspecial casaEspecial = (ACasaEspecial) novaCasa;
            novaCasa = tabuleiro.proximo(casaEspecial.getPosicao(), casaEspecial.efeito());
            posicoesJogadores.put(jogador, novaCasa);
        }
    }

    public void toPrint() {
        for (Entry<Jogador, ACasa> entrada : posicoesJogadores.entrySet()) {
            System.out.println(entrada.getKey().getCor() + " " + entrada.getValue().getPosicao());
        }
        System.out.println("");
    }

}