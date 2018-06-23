package jogo.views;

import java.awt.Point;

import jogo.controllers.JogadorController;
import jogo.controllers.TabuleiroController;
import jogo.model.Dado;
import jogo.model.Jogador;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class TabuleiroView {
	private static TabuleiroView tabuleiro;
	private Window janela;
	private Scene cena;
	
	private TabuleiroView(Window janela) {
		this.janela = janela;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("tabuleiro.scn"));
		cena.draw();
	}
	
	public static TabuleiroView getInstance() {
		if(tabuleiro == null) {
			tabuleiro = new TabuleiroView(new Window(new Point(700,700).x, new Point(700,700).y));
		}
		return tabuleiro;
	}
	
	public void desenharPino() {
		for(Dado dado : TabuleiroController.getInstance().getDados()) {
			dado.lancarImagem();
		}
		
		for(Jogador jogador : JogadorController.getInstance().getJogadores()) {
			jogador.getPino().draw();
		}
		
		janela.update();
		cena.draw();
	}

	public Window getJanela() {
		return janela;
	}

	public Scene getCena() {
		return cena;
	}
	

}
