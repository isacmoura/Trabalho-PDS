package jogo.model.propriedades;

import java.awt.Point;

import jogo.controllers.ViewController;
import jogo.model.Jogador;

public class RF extends PropriedadeNaoComercializavel{

	public RF(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void efeito(Jogador jogador) {
		ViewController.getInstance().mostrarMensagemRF();
		jogador.pagar(2000.00f);
	}

}
