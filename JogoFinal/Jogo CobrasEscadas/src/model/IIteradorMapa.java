package model;

/**
 * IIteradorMapa
 */
public interface IIteradorMapa {
    public boolean temProximo(int posicao, int qtdCasas);
    public ACasa proximo(int posicao, int qtdCasas);
}