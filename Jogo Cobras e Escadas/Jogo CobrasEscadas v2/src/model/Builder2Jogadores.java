package model;

/**
 * Builder2Jogadores
 */
public class Builder2Jogadores extends ABuilderJogador{
    
    public void buildJogadores() {
        jogadores.addJogador(new JogadorVermelho());
        jogadores.addJogador(new JogadorAzul());
    }    
}