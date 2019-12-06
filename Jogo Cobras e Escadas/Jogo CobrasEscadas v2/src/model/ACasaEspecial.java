package model;

/**
 * ACasaEspecial
 */
public abstract class ACasaEspecial extends ACasa{

    public ACasaEspecial(int posicao, int x, int y) {
        super(posicao, x, y);
    }

    public abstract int efeito();
}