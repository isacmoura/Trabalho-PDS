package jogo.model.propriedades;

import java.awt.Point;

import jogo.model.Casa;
import jogo.model.Jogador;

public abstract class PropriedadeComercializavel extends Casa{
	public PropriedadeComercializavel(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super(titulo, descricao, indice, coordenadaCasa);
		// TODO Auto-generated constructor stub
	}

	private float valor;
	private Jogador dono;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}


	
	public void comprarPropriedade(int indice, Jogador dono) {
		this.dono = dono;
	}
	
	public void removerPropriedade(Jogador dono) {
		this.dono = null;
	}

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}
	
	public abstract float getAluguel();
	
	
	
	
}
