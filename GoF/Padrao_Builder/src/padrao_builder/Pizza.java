package padrao_builder;

/**
 * Pizza
 */
public class Pizza implements IPizza{
    private String sabor;
    private String borda;
    private String massa;

    @Override
    public void setSabor(String sabor) {
        // TODO Auto-generated method stub
        this.sabor = sabor;
    }

    @Override
    public void setBorda(String borda) {
        // TODO Auto-generated method stub
        this.borda = borda;
    }

    @Override
    public void setMassa(String massa) {
        // TODO Auto-generated method stub
        this.massa = massa;
    }

    public String toPrint(){
        return "Sabor: " + this.sabor + "; Borda: " + this.borda + "; Massa: " + this.massa;
    }
}