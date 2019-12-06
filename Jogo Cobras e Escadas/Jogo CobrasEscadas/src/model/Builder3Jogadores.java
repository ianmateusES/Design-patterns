package model;

/**
 * Builder3Jogadores
 */
public class Builder3Jogadores extends ABuilderJogador {

    public void buildJogadores() {
        jogadores.addJogador(new Jogador("Vermelho"));
        jogadores.addJogador(new Jogador("Azul"));
        jogadores.addJogador(new Jogador("Verde"));
    }
}