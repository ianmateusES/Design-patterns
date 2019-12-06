package model;

/**
 * IIteradorJogador
 */
public interface IIteradorJogador {
    public boolean temProximo();
    public Jogador proximo();
    public int qtdJogadores();
}