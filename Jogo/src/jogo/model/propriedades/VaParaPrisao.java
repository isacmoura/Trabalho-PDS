package jogo.model.propriedades;

import java.awt.Point;

import jogo.controllers.PropriedadeController;
import jogo.controllers.TabuleiroController;
import jogo.controllers.ViewController;
import jogo.model.Jogador;

public class VaParaPrisao extends PropriedadeNaoComercializavel{

	public VaParaPrisao(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void efeito(Jogador jogador) {
		ViewController.getInstance().mostrarJogadorVaiParaPrisao();
		TabuleiroController.getInstance().atualizarPosicaoDoJogador(jogador, PropriedadeController.getInstance().getPropriedade(10));
		//Indice da prisão no tabuleior é 10
		jogador.incrementarContPrisao();
	}

}
