package model;

import java.util.Random;

/**
 * Dado
 */
public class Dado {
    private static Dado dado = new Dado();
    private Random valores;

    private Dado(){
        this.valores = new Random();
    }

    public static Dado getDado(){
        return dado;
    }

    public int rodarDado(){
        return (valores.nextInt(5)+1);
    }
}