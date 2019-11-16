package padrao_iterator;

/**
 * Arma
 */
public class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano){
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDano(){
        return this.dano;
    } 
}