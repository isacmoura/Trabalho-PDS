package jogo.model;

import java.awt.Point;

import jogo.principal.Carta;

public class Casa implements Carta{
	private String titulo;
	private String descricao;
	int indice;
	private float valor;
	private Point coordenadaCasa;
	
	public Casa(String titulo, String descricao, int indice, Point coordenadaCasa) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.indice = indice;
		this.coordenadaCasa = coordenadaCasa;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
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



	public int getIndice() {
		return indice;
	}



	public void setIndice(int indice) {
		this.indice = indice;
	}



	@Override
	public void efeito(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}



	public Point getCoordenadaCasa() {
		return coordenadaCasa;
	}



	public void setCoordenadaCasa(Point coordenadaCasa) {
		this.coordenadaCasa = coordenadaCasa;
	}

}
