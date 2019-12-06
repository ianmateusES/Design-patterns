package model;

/**
 * Builder4Jogadores
 */
public class Builder4Jogadores extends ABuilderJogador {

    public void buildJogadores() {
        jogadores.addJogador(new JogadorVermelho());
        jogadores.addJogador(new JogadorAzul());
        jogadores.addJogador(new JogadorVerde());
        jogadores.addJogador(new JogadorAmarelo());
    }
}