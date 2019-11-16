package padrao_factory;

/**
 * FabricaPS4
 */
public class FabricaPS4 implements IFabrica {

    @Override
    public AGamer criarGamer(String nome) {
        switch (nome) {
            case "TheLastOfUs": return new TheLastOfUs(300);
            case "GodOfWar": return new GodOfWar(259);
            case "UnitilDawn": return new UnitilDawn(300);
            default: return new Fifa(250);
        }
    }
}