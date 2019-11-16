package padrao_factory;

/**
 * IGamer
 */
public abstract class AGamer {
    private String nome;
    private float valor;

    public AGamer(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }
    public float getValor(){
        return this.valor;
    }
}