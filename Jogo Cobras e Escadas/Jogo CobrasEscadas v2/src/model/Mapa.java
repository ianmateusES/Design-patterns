package model;

import java.util.ArrayList;

/**
 * Mapa
 */
public class Mapa implements IAgregador<IIteradorMapa> {
    private static Mapa mapa = new Mapa();
    private ArrayList<ACasa> tabuleiro;

    private Mapa(){
        tabuleiro = new ArrayList<ACasa>();
        
        tabuleiro.add(new CasaNormal(100, 0, 0));
        tabuleiro.add(new CasaNormal(99, 60, 0));
        tabuleiro.add(new CasaNormal(98, 120, 0));
        tabuleiro.add(new CasaCobra(97, -36, 180,0));
        tabuleiro.add(new CasaNormal(96, 240, 0));
        tabuleiro.add(new CasaNormal(95, 300, 0));
        tabuleiro.add(new CasaNormal(94, 360, 0));
        tabuleiro.add(new CasaNormal(93, 420, 0));
        tabuleiro.add(new CasaNormal(92, 480, 0));
        tabuleiro.add(new CasaCobra(91, -18, 540,0));

        tabuleiro.add(new CasaNormal(81, 0, 60));
        tabuleiro.add(new CasaNormal(82, 60, 60));
        tabuleiro.add(new CasaNormal(83, 120, 60));
        tabuleiro.add(new CasaNormal(84, 180,60));
        tabuleiro.add(new CasaNormal(85, 240, 60));
        tabuleiro.add(new CasaBonus(86, 300, 60));
        tabuleiro.add(new CasaNormal(87, 360, 60));
        tabuleiro.add(new CasaNormal(88, 420, 60));
        tabuleiro.add(new CasaNormal(89, 480, 60));
        tabuleiro.add(new CasaNormal(90, 540,60));
        
        tabuleiro.add(new CasaNormal(80, 0, 120));
        tabuleiro.add(new CasaNormal(79, 60, 120));
        tabuleiro.add(new CasaNormal(78, 120, 120));
        tabuleiro.add(new CasaNormal(77, 180,120));
        tabuleiro.add(new CasaCobra(76, -22,240, 120));
        tabuleiro.add(new CasaNormal(75, 300, 120));
        tabuleiro.add(new CasaNormal(74, 360, 120));
        tabuleiro.add(new CasaNormal(73, 420, 120));
        tabuleiro.add(new CasaNormal(72, 480, 120));
        tabuleiro.add(new CasaNormal(71, 540, 120));

        tabuleiro.add(new CasaNormal(61, 0, 180));
        tabuleiro.add(new CasaNormal(62, 60, 180));
        tabuleiro.add(new CasaNormal(63, 120, 180));
        tabuleiro.add(new CasaEscada(64, 19,180,180));
        tabuleiro.add(new CasaNormal(65, 240, 180));
        tabuleiro.add(new CasaBonus(66, 300, 180));
        tabuleiro.add(new CasaNormal(67, 360, 180));
        tabuleiro.add(new CasaNormal(68, 420, 180));
        tabuleiro.add(new CasaNormal(69, 480, 180));
        tabuleiro.add(new CasaNormal(70, 540, 180));

        tabuleiro.add(new CasaNormal(60, 0, 240));
        tabuleiro.add(new CasaBonus(59, 60, 240));
        tabuleiro.add(new CasaNormal(58, 120, 240));
        tabuleiro.add(new CasaNormal(57, 180,240));
        tabuleiro.add(new CasaNormal(56, 240, 240));
        tabuleiro.add(new CasaBonus(55, 300, 240));
        tabuleiro.add(new CasaNormal(54, 360, 240));
        tabuleiro.add(new CasaEscada(53, 19, 420, 240));
        tabuleiro.add(new CasaNormal(52, 480, 240));
        tabuleiro.add(new CasaCobra(51, -41, 540, 240));

        tabuleiro.add(new CasaNormal(41, 0, 300));
        tabuleiro.add(new CasaNormal(42, 60, 300));
        tabuleiro.add(new CasaNormal(43, 120, 300));
        tabuleiro.add(new CasaNormal(44, 180,300));
        tabuleiro.add(new CasaNormal(45, 240, 300));
        tabuleiro.add(new CasaBonus(46, 300, 300));
        tabuleiro.add(new CasaNormal(47, 360, 300));
        tabuleiro.add(new CasaNormal(48, 420, 300));
        tabuleiro.add(new CasaNormal(49, 480, 300));
        tabuleiro.add(new CasaNormal(50, 540, 300));

        tabuleiro.add(new CasaNormal(40, 0, 360));
        tabuleiro.add(new CasaNormal(39, 60, 360));
        tabuleiro.add(new CasaCobra(38, -18, 120, 360));
        tabuleiro.add(new CasaNormal(37, 180,360));
        tabuleiro.add(new CasaNormal(36, 240, 360));
        tabuleiro.add(new CasaNormal(35, 300, 360));
        tabuleiro.add(new CasaNormal(34, 360, 360));
        tabuleiro.add(new CasaNormal(33, 420, 360));
        tabuleiro.add(new CasaNormal(32, 480, 360));
        tabuleiro.add(new CasaNormal(31, 540, 360));

        tabuleiro.add(new CasaNormal(21, 0, 420));
        tabuleiro.add(new CasaNormal(22, 60, 420));
        tabuleiro.add(new CasaNormal(23, 120, 420));
        tabuleiro.add(new CasaNormal(24, 180, 420));
        tabuleiro.add(new CasaNormal(25, 240, 420));
        tabuleiro.add(new CasaNormal(26, 300, 420));
        tabuleiro.add(new CasaBonus(27, 360, 420));
        tabuleiro.add(new CasaNormal(28, 420, 420));
        tabuleiro.add(new CasaNormal(29, 480, 420));
        tabuleiro.add(new CasaNormal(30, 540, 420));

        tabuleiro.add(new CasaNormal(20, 0, 480));
        tabuleiro.add(new CasaNormal(19, 60, 480));
        tabuleiro.add(new CasaNormal(18, 120, 480));
        tabuleiro.add(new CasaNormal(17, 180, 480));
        tabuleiro.add(new CasaNormal(16, 240, 480));
        tabuleiro.add(new CasaNormal(15, 300, 480));
        tabuleiro.add(new CasaEscada(14, 35, 360, 480));
        tabuleiro.add(new CasaNormal(13, 420, 480));
        tabuleiro.add(new CasaNormal(12, 480, 480));
        tabuleiro.add(new CasaNormal(11, 540, 480));

        tabuleiro.add(new CasaNormal(1, 0, 540));
        tabuleiro.add(new CasaNormal(2, 60, 540));
        tabuleiro.add(new CasaNormal(3, 120, 540));
        tabuleiro.add(new CasaNormal(4, 180, 540));
        tabuleiro.add(new CasaEscada(5, 53, 240, 540));
        tabuleiro.add(new CasaNormal(6, 300, 540));
        tabuleiro.add(new CasaNormal(7, 360, 540));
        tabuleiro.add(new CasaNormal(8, 420, 540));
        tabuleiro.add(new CasaNormal(9, 480, 540));
        tabuleiro.add(new CasaNormal(10, 540, 540));        
    }

    public static Mapa getMapa(){
        return mapa;
    }

	public IIteradorMapa criarIterador() {
		return new IteradorMapa(this.tabuleiro);
	}
}