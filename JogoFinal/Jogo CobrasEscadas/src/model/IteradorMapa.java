package model;

import java.util.ArrayList;

/**
 * IteradorMapa
 */
public class IteradorMapa implements IIteradorMapa {
    private ArrayList<ACasa> tabuleiro;

    public IteradorMapa(ArrayList<ACasa> tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    
    public boolean temProximo(int posicao, int qtdCasas) {
        if((posicao-1)+qtdCasas < this.tabuleiro.size()){
            return true;
        }
        return false;
    }

    
    public ACasa proximo(int posicao, int qtdCasas) {
        return tabuleiro.get((posicao-1)+qtdCasas);
    }
}