package model;

/**
 * Builder2Jogadores
 */
public class Builder2Jogadores extends ABuilderJogador{
    
    public void buildJogadores() {
        jogadores.addJogador(new Jogador("Vermelho"));
        jogadores.addJogador(new Jogador("Azul"));
    }    
}