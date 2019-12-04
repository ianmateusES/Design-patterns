package model;

import java.util.ArrayList;

/**
 * Jogadores
 */
public class Jogadores implements IAgregador<IIteradorJogador>{
    private ArrayList<Jogador> jogadores;
    
    public Jogadores(){
        jogadores = new ArrayList<Jogador>();
    }


    public void addJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador){
        this.jogadores.remove(jogador);
    }

    public IIteradorJogador criarIterador(){
        return new IteradorJogador(this.jogadores);
    }
}