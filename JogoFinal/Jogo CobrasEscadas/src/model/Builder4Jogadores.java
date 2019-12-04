package model;

/**
 * Builder4Jogadores
 */
public class Builder4Jogadores extends ABuilderJogador {

    public void buildJogadores() {
        jogadores.addJogador(new Jogador("Vermelho"));
        jogadores.addJogador(new Jogador("Azul"));
        jogadores.addJogador(new Jogador("Verde"));
        jogadores.addJogador(new Jogador("Amarelo"));
    }
}