package jogo.model;

import java.awt.Point;

import jplay.Sprite;
import jplay.URL;

public class Pino extends Sprite{

	public Pino(int idJogador, int x, int y) {
		super(URL.sprite("pino-"+idJogador+".png"), 1);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public void moverPinoParaLocal(Point ponto) {
		this.x = ponto.getX();
		this.y = ponto.getY();
	}
	
	public void moverPinoVelocidade(){
		moveX(0.4);
		moveY(0.4);
	}

}
