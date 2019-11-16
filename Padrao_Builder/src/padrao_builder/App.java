package padrao_builder;

public class App {
    public static void main(String[] args) throws Exception {
        Diretor diretor = new Diretor();
        ABuilderPizza builderPizza;

        builderPizza = new BuilderModaDaCasa();
        diretor.setBuilder(builderPizza);
        diretor.construirPizza();
        IPizza pizza1 = diretor.getPizza();

        builderPizza = new BuilderDoceVariado();
        diretor.setBuilder(builderPizza);
        diretor.construirPizza();
        IPizza pizza2 = diretor.getPizza();

        builderPizza = new BuilderModaDoChefe();
        diretor.setBuilder(builderPizza);
        diretor.construirPizza();
        IPizza pizza3 = diretor.getPizza();

        System.out.println(pizza1.toPrint());
        System.out.println(pizza2.toPrint());
        System.out.println(pizza3.toPrint());
    }
}