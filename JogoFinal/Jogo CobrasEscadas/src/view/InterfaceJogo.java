package view;

import control.ControlJogador;
import control.ControlMovimento;
import model.Jogador;
import model.Mapa;

/**
 * InterfaceJogo
 */
public class InterfaceJogo {
    private ControlJogador controlJogador;
    private ControlMovimento controlMovimento;

    public InterfaceJogo(int qtdJogadores){
        this.controlJogador = new ControlJogador();
        this.controlJogador.construiJogadores(qtdJogadores);
        this.controlMovimento = new ControlMovimento(this.controlJogador.getIteradorJogadores(), Mapa.getMapa().criarIterador());
    }

    public void jogo(){
        Jogador jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);

        jogadorDaVez = this.controlJogador.proximoJogador();
        this.controlMovimento.movimentarJogador(jogadorDaVez);
    }
}