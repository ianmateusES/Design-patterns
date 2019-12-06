package model;

import java.util.Random;

import jplay.Animation;

/**
 * Dado
 */
public class Dado extends Animation{
    private static Dado dado = new Dado();
    private Random valores;

    private Dado(){
        super("imagens/dado.png", 6, true);
        this.valores = new Random();
        this.x = 620;
        this.y = 300;
    }

    public static Dado getDado(){
        return dado;
    }

    public int rodarDado(){
        int valor = (valores.nextInt(5)+1); 
        setCurrFrame(valor);
        return valor;
    }
}