package view;

import java.util.Scanner;

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

    public void jogo() {
        Scanner scan = new Scanner(System.in);

        while(controlJogador.temProximo()) {
            Jogador jogador = controlJogador.proximoJogador();
            System.out.println("\nJogador da vez: " + jogador.getCor());
            System.out.println("Enter para jogar dado!");
            scan.nextLine();
            controlMovimento.movimentarJogador(jogador);
            controlMovimento.toPrintPosicaoJogadorMapa();
        }
        System.out.println("Jogador vencedor é: " + controlMovimento.getJogadorVencedor().getCor());
    }
}