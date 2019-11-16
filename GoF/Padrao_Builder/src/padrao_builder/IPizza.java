package padrao_builder;

/**
 * IPizza
 */
public interface IPizza {
    public void setSabor(String sabor);
    public void setBorda(String borda);
    public void setMassa(String massa);
    public String toPrint();
}