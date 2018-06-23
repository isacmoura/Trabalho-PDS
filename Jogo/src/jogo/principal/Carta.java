package jogo.principal;

import jogo.model.Jogador;

public interface Carta {
	String tipo = null;
	
	
	public void efeito(Jogador jogador);

}
