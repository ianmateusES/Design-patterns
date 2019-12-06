package model;

/**
 * CasaCobra
 */
public class CasaCobra extends ACasaEspecial {
    private int calda;

    public CasaCobra(int posicao, int calda, int x, int y) {
        super(posicao, x, y);
        this.calda = calda;
    }

    public int efeito() {
        return this.calda;
    }

    
}