package model;

/**
 * ABuilderJogador
 */
public abstract class ABuilderJogador {
    protected Jogadores jogadores;

    
    public Jogadores getJogadores() {
        return this.jogadores;
    }

    public void newJogadores(){
        this.jogadores = new Jogadores();
    }

    public abstract void buildJogadores();
    
}