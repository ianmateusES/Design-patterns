package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * PosicaoJogadorMapa
 */
public class PosicaoJogadorMapa implements IObservavel {
    private HashMap<Jogador, ACasa> posicoesJogadores;
    private ArrayList<IObservador> observadores;
    private IIteradorMapa tabuleiro;
    private Jogador jogadorVencedor;

    public PosicaoJogadorMapa(IIteradorJogador iteradorJogadores, IIteradorMapa mapa){
        this.posicoesJogadores = new HashMap<Jogador,ACasa>();
        this.tabuleiro = mapa;
        this.observadores = new ArrayList<IObservador>();
        // Coloca todos os jogadores na primera casa
        for(int i = 0; i < iteradorJogadores.qtdJogadores(); i++){
            Jogador jogador = iteradorJogadores.proximo();
            this.posicoesJogadores.put(jogador, tabuleiro.proximo(1, 0));
        }
        this.addObservador((IObservador) iteradorJogadores);
    }

    public void mudarPosicaoJogador(Jogador jogador){
        ACasa casa = posicoesJogadores.get(jogador);
        int qtdCasas = jogador.jogarDado();

        ACasa novaCasa = tabuleiro.proximo(casa.getPosicao(), qtdCasas);
        posicoesJogadores.put(jogador, novaCasa);
        
        /*
         Equanto casa diferente de normal, faz um cache para 
         casaEspecial e utiliza o efeito da casa.
        */
        while(!(novaCasa instanceof CasaNormal)){
            ACasaEspecial casaEspecial = (ACasaEspecial) novaCasa;
            novaCasa = tabuleiro.proximo(casaEspecial.getPosicao(), casaEspecial.efeito());
            posicoesJogadores.put(jogador, novaCasa);
        }

        if(novaCasa.getPosicao() == tabuleiro.qtdCasasTabuleiro()){
            this.jogadorVencedor = jogador;
            this.notificar();
        }
    }

    public void addObservador(IObservador observador){
        this.observadores.add(observador);
    }
    
    public void removeObservador(IObservador observador){
        this.observadores.remove(observador);
    }

    public void notificar(){
        for (IObservador iObservador : observadores) {
            iObservador.atualizar();
        }
    }

    public void toPrint() {
        for (Entry<Jogador, ACasa> entrada : posicoesJogadores.entrySet()) {
            System.out.println(entrada.getKey().getCor() + " " + entrada.getValue().getPosicao());
        }
    }

    public Jogador getJogadorVencedor(){
        return jogadorVencedor;
    }
}