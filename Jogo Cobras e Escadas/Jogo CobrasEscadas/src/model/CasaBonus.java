package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * CasaBonus
 */
public class CasaBonus extends ACasaEspecial {
    ArrayList<Carta> cartas;

    public CasaBonus(int posicao) {
        super(posicao);
        this.cartas = new ArrayList<Carta>();
        for(int i = -3; i < 4; i++){
            if(i != 0){
                this.cartas.add(new Carta(i));
            }
        }
    }

    
    public int efeito() {
        Random cartaAle = new Random();
        int valor = cartaAle.nextInt(5);
        return this.cartas.get(valor+1).getEfeito();
    }
        
}