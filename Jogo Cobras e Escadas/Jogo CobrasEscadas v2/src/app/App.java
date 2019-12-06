package app;

import java.awt.event.KeyEvent;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;
import view.InterfaceJogo;

public class App {
    public static void main(String[] args) throws Exception {
        InterfaceJogo jogo;
        Window janela = new Window(800, 600);
		GameImage plano;
		Keyboard teclado = janela.getKeyboard();
		teclado.addKey(KeyEvent.VK_2);
		teclado.addKey(KeyEvent.VK_3);
		teclado.addKey(KeyEvent.VK_4);
        teclado.addKey(KeyEvent.VK_S);
        teclado.addKey(KeyEvent.VK_N);

        String escolha = new String();
        boolean loop;
        int qtdJogadores = 2;

        do{
            plano = new GameImage("imagens/woody.jpeg");
            plano.draw();
            janela.update();
            loop = true;
            while(loop){
                if(teclado.keyDown(KeyEvent.VK_2)){
                    qtdJogadores = 2;
                    loop = false;
                } else if(teclado.keyDown(KeyEvent.VK_3)) {
                    qtdJogadores = 3;
                    loop = false;
                } else if(teclado.keyDown(KeyEvent.VK_4)) {
                    qtdJogadores = 4;
                    loop = false;
                }
            }
            
            jogo = new InterfaceJogo(qtdJogadores, janela);
            jogo.jogo();

            plano = new GameImage("imagens/buz.jpeg");
            plano.draw();
            janela.update();
            loop = true;
            while(loop){
                if(teclado.keyDown(KeyEvent.VK_S)){
                    escolha = "s";
                    loop = false;
                } else if(teclado.keyDown(KeyEvent.VK_N)){
                    escolha = "n";
                    loop = false;
                }
            }
            
        }while(escolha.equals("s"));

        System.out.println("----------Fim----------");
        janela.exit();
    }
}