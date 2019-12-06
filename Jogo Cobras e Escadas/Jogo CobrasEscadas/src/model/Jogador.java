package model;

/**
 * Jogador
 */
public class Jogador {
    private String cor;

    public Jogador(String cor){
        this.cor = cor;
    }


    public String getCor(){
        return this.cor;
    }

    public int jogarDado(){
        return Dado.getDado().rodarDado();
    }
}