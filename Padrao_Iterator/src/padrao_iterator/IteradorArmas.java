package padrao_iterator;

import java.util.ArrayList;

/**
 * IteradorArmas
 */
public class IteradorArmas implements Iterador<Arma>{
    private Object[] armas;
    private int posicao;

    public IteradorArmas(ArrayList<Arma> armas) {
        this.armas = armas.toArray();
        this.posicao = this.armas.length-1;
    }

    @Override
    public boolean temProximo() {
        if(posicao >= 0)
            return true;
        else
            return false;
    }

    @Override
    public Arma Proximo() {
        Arma arma = (Arma) armas[posicao];
        posicao--;
        return arma;
    }
}