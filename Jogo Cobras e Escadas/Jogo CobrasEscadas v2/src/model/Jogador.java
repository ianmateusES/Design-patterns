package model;

import jplay.Sprite;

/**
 * Jogador
 */
public abstract class Jogador extends Sprite {

    public Jogador(String cor){
        super(cor, 4);
        this.x = 0;
        this.y = 540;
        setLoop(true);
		setTotalDuration(1000);
    }

    public int jogarDado(){
        return Dado.getDado().rodarDado();
    }

    public void mover(int x, int y){
        this.x = x;
        this.y = y;
    }
}