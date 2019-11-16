package padrao_factory;

public class App {
    public static void main(String[] args) throws Exception {
        IFabrica fabricaVez = new FabricaPS4();
        AGamer gamer1 = fabricaVez.criarGamer("GodOfWar");
        fabricaVez = new FabricaXBOX();
        AGamer gamer2 = fabricaVez.criarGamer("DeadRising");

        System.out.println(gamer1.getNome() + ", valor: " + gamer1.getValor());
        System.out.println(gamer2.getNome() + ", valor: " + gamer2.getValor());
    }
}