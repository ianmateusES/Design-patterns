package padrao_iterator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem jogador = new Personagem();
        //Scanner scanner = new Scanner(System.in);
        Iterador<Arma> iterador = jogador.criarInterador();

        while(iterador.temProximo()){
            Arma arma = iterador.Proximo();
            System.out.println(arma.getNome() + ", dano " + arma.getDano());
        }
    }
}