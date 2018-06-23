package jogo.controllers;

public class JogoController {
	private static JogoController jogo;
	
	private JogoController() {
		
	}
	
	public static JogoController getInstance() {
		if(jogo == null) {
			jogo = new JogoController();
		}
		
		return jogo;
	}
	
	public void finalizarJogo() {
		System.exit(0);
	}
}
