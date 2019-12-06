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
        if(posicao+qtdCasas <= this.tabuleiro.size()){
            return true;
        }
        return false;
    }

    public ACasa proximo(int posicao, int qtdCasas) {
        for (ACasa aCasa : tabuleiro) {
            if(aCasa.getPosicao() == (posicao+qtdCasas)){
                return aCasa;
            }
        }

        for (ACasa aCasa : tabuleiro) {
            if(aCasa.getPosicao() == posicao){
                return aCasa;
            }
        }
        return null;
    }

    public int qtdCasasTabuleiro(){
        return tabuleiro.size();
    }
}