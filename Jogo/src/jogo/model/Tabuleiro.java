package jogo.model;

import java.awt.Point;

import jogo.principal.Carta;

public class Tabuleiro {
	

	int qtdCasas;

	public int getQtdCasas() {
		return qtdCasas;
	}

	public void setQtdCasas(int qtdCasas) {
		this.qtdCasas = qtdCasas;
	}

	public Tabuleiro(int qtdCasas) {
		super();
		this.qtdCasas = qtdCasas;
	}
	
	

}
