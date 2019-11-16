package padrao_builder;

/**
 * Diretor
 */
public class Diretor {
    private ABuilderPizza builderPizza;

    public void setBuilder(ABuilderPizza builderDaVez){
        this.builderPizza = builderDaVez;
    }

    public IPizza getPizza(){
        return builderPizza.getPizza();
    }

    public void construirPizza(){
        this.builderPizza.newPizza();
        this.builderPizza.builderSabor();
        this.builderPizza.builderBorda();
        this.builderPizza.builderMassa();
    }
}