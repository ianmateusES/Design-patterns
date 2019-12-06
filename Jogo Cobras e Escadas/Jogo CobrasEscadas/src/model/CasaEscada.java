package model;

/**
 * CasaEscada
 */
public class CasaEscada extends ACasaEspecial {
    private int topo;

    public CasaEscada(int posicao, int topo) {
        super(posicao);
        this.topo = topo;
    }


    public int efeito() {
        return this.topo;
    }
}