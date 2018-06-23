package jogo.model;

import java.awt.Point;

import jogo.controllers.ViewController;
import jogo.model.propriedades.SorteOuAzar;

public class Sorte extends SorteOuAzar{

	public Sorte(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void efeito(Jogador jogador) {
		//Mostra mensagem de azar e traz valor a ser pago pelo jogador da vez
		ViewController.getInstance().mostrarMensagemSorte(getDescricao(), getValor());
		jogador.receber(getValor());
		
	}

}
