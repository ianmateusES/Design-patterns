package model;

import java.util.ArrayList;

/**
 * Mapa
 */
public class Mapa implements IAgregador<IIteradorMapa> {
    private static Mapa mapa = new Mapa();
    private ArrayList<ACasa> tabuleiro;

    private Mapa(){
        tabuleiro = new ArrayList<ACasa>();
        
        for(int i = 1; i <=100; i++){
            if(i == 5){
                tabuleiro.add(new CasaEscada(i, 53));
            } else if(i == 14){
                tabuleiro.add(new CasaEscada(i, 35));
            } else if(i == 25 || i == 59 || i == 66 || i == 86){
                tabuleiro.add(new CasaBonus(i));
            } else if(i == 38){
                tabuleiro.add(new CasaCobra(i, -18));
            } else if(i == 51){
                tabuleiro.add(new CasaCobra(i, -41));
            } else if(i == 53){
                tabuleiro.add(new CasaEscada(i, 19));
            } else if(i == 76){
                tabuleiro.add(new CasaCobra(i, -22));
            } else if(i == 91){
                tabuleiro.add(new CasaCobra(i, -18));
            } else if(i == 97){
                tabuleiro.add(new CasaCobra(i, -36));
            } else {
                tabuleiro.add(new CasaNormal(i));
            }
        }        
    }

    public static Mapa getMapa(){
        return mapa;
    }

	public IIteradorMapa criarIterador() {
		return new IteradorMapa(this.tabuleiro);
	}
}