package padrao_factory;

/**
 * FabricaXBOX
 */
public class FabricaXBOX implements IFabrica{

    @Override
    public AGamer criarGamer(String nome) {
        switch (nome) {
            case "BlueDragon": return new BlueDragon(240);
            case "Fable": return new Fable(237);
            case "DeadRising": return new DeadRising(350);
            default: return new Fifa(250);
        }
    }
}