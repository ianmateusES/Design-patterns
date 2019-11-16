package padrao_builder;

/**
 * ABuilderPizza
 */
public abstract class ABuilderPizza {
    protected IPizza pizza;
    
    public IPizza getPizza(){
        return this.pizza;
    }

    public void newPizza(){
        this.pizza = new Pizza();
    }

    public abstract void builderSabor();
    public abstract void builderBorda();
    public abstract void builderMassa();
}