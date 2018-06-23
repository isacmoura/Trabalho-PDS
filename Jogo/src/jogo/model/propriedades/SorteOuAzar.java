package jogo.model.propriedades;

import java.awt.Point;
import java.util.Random;

import jogo.controllers.SorteOuAzarController;
import jogo.model.Jogador;

public class SorteOuAzar extends PropriedadeNaoComercializavel{
	
	public SorteOuAzar(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void efeito(Jogador jogador) {
		Random aleatorio = new Random();
		int indice = aleatorio.nextInt(SorteOuAzarController.getInstance().getQuantiCartas());
		SorteOuAzarController.getInstance().obterCarta(indice).efeito(jogador);
	}
	
}
