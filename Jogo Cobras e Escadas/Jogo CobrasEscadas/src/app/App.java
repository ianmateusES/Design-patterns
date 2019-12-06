package app;

import java.util.Scanner;

import view.InterfaceJogo;

public class App {
    public static void main(String[] args) throws Exception {
        InterfaceJogo jogo;
        Scanner scan = new Scanner(System.in);
        String escolha = new String();

        do{
            System.out.println("\nBem-vindo ao jogo cobras e escadas!");
            System.out.println("Quantos jogadores iram jogar? (2, 3 ou 4)");
            int qtdJogadores = scan.nextInt();
            scan.nextLine();
            jogo = new InterfaceJogo(qtdJogadores);
            jogo.jogo();

            System.out.println("Deseja continuar jogando? (S-sim, N-nao)");
            escolha = scan.nextLine();
        }while(escolha.equals("s") || escolha.equals("S"));
        
        scan.close();
    }
}