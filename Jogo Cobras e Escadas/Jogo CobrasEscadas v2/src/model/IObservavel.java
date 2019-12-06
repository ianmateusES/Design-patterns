package model;

/**
 * IObservavel
 */
public interface IObservavel {
    public void addObservador(IObservador observedor);
    public void removeObservador(IObservador observedor);
    public void notificar();
}