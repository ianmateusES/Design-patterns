package model;

/**
 * Builder3Jogadores
 */
public class Builder3Jogadores extends ABuilderJogador {

    public void buildJogadores() {
        jogadores.addJogador(new JogadorVermelho());
        jogadores.addJogador(new JogadorAzul());
        jogadores.addJogador(new JogadorVerde());
    }
}