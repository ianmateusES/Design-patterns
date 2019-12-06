package model;

/**
 * Diretor
 */
public class Diretor {
    private ABuilderJogador construtorJogador;

    public void setConstrutorJogador(ABuilderJogador builderDaVez){
        this.construtorJogador = builderDaVez;
    }

    public Jogadores contruirJogador(){
        construtorJogador.newJogadores();
        construtorJogador.buildJogadores();
        
        return construtorJogador.getJogadores();
    }
    
}