package model;

/**
 * CasaCobra
 */
public class CasaCobra extends ACasaEspecial {
    private int calda;

    public CasaCobra(int posicao, int calda) {
        super(posicao);
        this.calda = calda;
    }

    public int efeito() {
        return this.calda;
    }

    
}