package model;

/**
 * ACasa
 */
public class ACasa {
    private int posicao;
    private int x;
    private int y;

    public ACasa(int posicao, int x, int y){
        this.posicao = posicao;
        this.x = x;
        this.y = y;
    }

    public int getPosicao(){
        return this.posicao;
    }

    public int getPosicaoX(){
        return x;
    }

    public int getPosicaoY(){
        return y;
    }
}