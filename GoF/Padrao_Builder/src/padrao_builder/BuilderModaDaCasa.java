package padrao_builder;

/**
 * BuilderModaDaCasa
 */
public class BuilderModaDaCasa extends ABuilderPizza {

    @Override
    public void builderSabor() {
        // TODO Auto-generated method stub
        this.pizza.setSabor("Mussarela");
    }

    @Override
    public void builderBorda() {
        // TODO Auto-generated method stub
        this.pizza.setBorda("Catupyri");
    }

    @Override
    public void builderMassa() {
        // TODO Auto-generated method stub
        this.pizza.setMassa("Fina");
    }
}