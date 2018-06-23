package jogo.model.propriedades;

import java.awt.Point;

import jogo.model.Jogador;

public class Prisao extends PropriedadeNaoComercializavel{

	
	
	public Prisao(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void efeito(Jogador jogador) {
		jogador.incrementarContPrisao();
	}

}
