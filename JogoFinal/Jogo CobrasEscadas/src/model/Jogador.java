package model;

/**
 * Jogador
 */
public class Jogador {
    private String cor;
    private boolean dadoLivre;

    public Jogador(String cor){
        this.cor = cor;
        dadoLivre = true;
    }


    public String getCor(){
        return this.cor;
    }

    public int jogarDado(){
        if(dadoLivre){
            return Dado.getDado().rodarDado();
        }
        return 0;
    }

    public void fimDejogo(){
        this.dadoLivre = false;
    }
}