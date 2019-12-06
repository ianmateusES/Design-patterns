package model;

import java.util.ArrayList;

/**
 * IteradorJogador
 */
public class IteradorJogador implements IIteradorJogador, IObservador {
    private ArrayList<Jogador> jogadores;
    private int jogadorDaVez;

    public IteradorJogador(ArrayList<Jogador> jogadores){
        this.jogadores = jogadores;
        this.jogadorDaVez = 0;
    }

    
    public boolean temProximo() {
        if(jogadorDaVez == -1){
            return false;
        }
        return true;
    }

    public Jogador proximo() {
        Jogador jogador = jogadores.get(jogadorDaVez);
        this.jogadorDaVez++;
        
        if(this.jogadorDaVez >= jogadores.size()){
            jogadorDaVez = 0;
        }
        
        return jogador;
    }

    public int qtdJogadores(){
        return jogadores.size();
    }

    public void atualizar() {
        jogadorDaVez = -1;
    }
}