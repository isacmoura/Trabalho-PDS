package jogo.model.propriedades;

import java.awt.Point;

import jogo.model.Jogador;
import jogo.principal.Carta;

public class Propriedade implements Carta{
	private int indice;
	private Point coordenada;
	private String titulo;
	private String descricao;
	
	public Propriedade(int indice, Point coordenada, String titulo, String descricao) {
		super();
		this.indice = indice;
		this.coordenada = coordenada;
		this.titulo = titulo;
		this.descricao = descricao;
	}



	public int getIndice() {
		return indice;
	}



	public void setIndice(int indice) {
		this.indice = indice;
	}



	public Point getCoordenada() {
		return coordenada;
	}



	public void setCoordenada(Point coordenada) {
		this.coordenada = coordenada;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	@Override
	public void efeito(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean equals(Propriedade prop) {
		if(this.getIndice() == prop.getIndice()) {
			return true;
		}
		return false;
	}

}
