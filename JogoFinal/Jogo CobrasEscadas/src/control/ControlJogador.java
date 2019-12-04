package control;

import model.ABuilderJogador;
import model.Builder2Jogadores;
import model.Builder3Jogadores;
import model.Builder4Jogadores;
import model.Diretor;
import model.IIteradorJogador;
import model.Jogador;
import model.Jogadores;

/**
 * ControlJogador
 */
public class ControlJogador {
    private Diretor diretor;
    private IIteradorJogador iteradorJogadores;

    public ControlJogador(){
        this.diretor = new Diretor();
    }

    public void construiJogadores(int qtdJogadores){
        ABuilderJogador build;
        switch(qtdJogadores){
            case 2:
                build = new Builder2Jogadores();
            break;
            case 3:
                build = new Builder3Jogadores();
            break;
            case 4:
                build = new Builder4Jogadores();
            break;
            default:
                build = null;
        }
        
        diretor.setConstrutorJogador(build);
        Jogadores jogadores = diretor.contruirJogador();
        iteradorJogadores = jogadores.criarIterador();
    }

    public IIteradorJogador getIteradorJogadores(){
        return this.iteradorJogadores;
    }

    public Jogador proximoJogador(){
        return this.iteradorJogadores.proximo();
    }
}