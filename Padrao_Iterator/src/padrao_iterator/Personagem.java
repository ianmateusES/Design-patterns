package padrao_iterator;

import java.util.ArrayList;

public class Personagem implements Agregador{
    ArrayList<Arma> armas;

    public Personagem(){
        this.armas = new ArrayList<Arma>();
        this.armas.add(new Arma("Metralhadora", 55));
        this.armas.add(new Arma("Pistola", 15));
        this.armas.add(new Arma("Lança missel", 500));
    }
    
    public IteradorArmas criarInterador(){
        return new IteradorArmas(this.armas);
    }
}