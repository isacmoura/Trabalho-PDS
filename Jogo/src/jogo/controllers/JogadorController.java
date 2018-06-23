package jogo.controllers;

import java.util.List;

import jogo.model.Jogador;
import jogo.repositorio.RepositorioJogador;

public class JogadorController {
	private static JogadorController jogador;
	
	private JogadorController() {
		
	}
	
	public static JogadorController getInstance() {
		if(jogador == null) {
			jogador = new JogadorController();
		}
		return jogador;
	}
	
	public void addJogador(Jogador jogador) {
		RepositorioJogador.getInstance().addJogador(jogador);
	}
	
	public List<Jogador> getJogadores(){
		return RepositorioJogador.getInstance().getAllJogadores();
	}

}
