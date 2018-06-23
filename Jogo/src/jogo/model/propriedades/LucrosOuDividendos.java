package jogo.model.propriedades;

import java.awt.Point;

import jogo.controllers.ViewController;
import jogo.model.Jogador;

public class LucrosOuDividendos extends PropriedadeNaoComercializavel{

	
	
	public LucrosOuDividendos(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void efeito(Jogador jogador) {
		ViewController.getInstance().mostrarMensagemLucrosOuDividendos();
		jogador.receber(500.00f);
	}
}
