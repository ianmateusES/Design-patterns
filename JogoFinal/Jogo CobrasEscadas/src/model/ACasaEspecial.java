package model;

/**
 * ACasaEspecial
 */
public abstract class ACasaEspecial extends ACasa{

    public ACasaEspecial(int posicao) {
        super(posicao);
    }

    public abstract int efeito();
}