package model;

/**
 * CasaEscada
 */
public class CasaEscada extends ACasaEspecial {
    private int topo;

    public CasaEscada(int posicao, int topo, int x, int y) {
        super(posicao, x, y);
        this.topo = topo;
    }


    public int efeito() {
        return this.topo;
    }
}