package padrao_builder;

/**
 * BuilderDoceVariado
 */
public class BuilderDoceVariado extends ABuilderPizza {

    @Override
    public void builderSabor() {
        // TODO Auto-generated method stub
        this.pizza.setSabor("Chocolate");
    }

    @Override
    public void builderBorda() {
        // TODO Auto-generated method stub
        this.pizza.setBorda("Chocolate branco");
    }

    @Override
    public void builderMassa() {
        // TODO Auto-generated method stub
        this.pizza.setMassa("Grossa");
    }
}