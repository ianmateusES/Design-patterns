package padrao_builder;

/**
 * BuilderModaDoChefe
 */
public class BuilderModaDoChefe extends ABuilderPizza {

    @Override
    public void builderSabor() {
        // TODO Auto-generated method stub
        this.pizza.setSabor("Portuguesa com Peru");
    }

    @Override
    public void builderBorda() {
        // TODO Auto-generated method stub
        this.pizza.setBorda("Catupyri");
    }

    @Override
    public void builderMassa() {
        // TODO Auto-generated method stub
        this.pizza.setMassa("Integral");
    }

    
}