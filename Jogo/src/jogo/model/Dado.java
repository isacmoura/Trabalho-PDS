package jogo.model;

import java.util.Random;

import jplay.GameImage;
import jplay.URL;

public class Dado {
	int face1;
	int face2;
	int x, y;
	boolean dadosIguais;
	private GameImage imagem;
	
	public int getFace1() {
		return face1;
	}
	
	public void setFace1(int face1) {
		this.face1 = face1;
	}
	
	public int getFace2() {
		return face2;
	}
	
	public void setFace2(int face2) {
		this.face2 = face2;
	}
	
	public boolean isDadosIguais() {
		return dadosIguais;
	}
	
	public void setDadosIguais(boolean dadosIguais) {
		this.dadosIguais = dadosIguais;
	}
	
	public Dado(int x, int y) {
		super();
		imagem = new GameImage(URL.sprite("dado-1"));
	}
	
	public boolean equals(Dado dado) {
		if(dado.getFace1() == dado.getFace2()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void lancarDado(){
		Random aleatorio = new Random();
		this.face1 = aleatorio.nextInt(6) + 1; 
		//Somando + 1 pois começa a contar de 0
		this.face2 = aleatorio.nextInt(6) + 1;
		imagem.loadImage("dado-"+face1+".png"); //Primeiro dado
		imagem.loadImage("dado-"+face2+".png"); //Segundo dado
		imagem.draw();
	}

	public int getFace() {
		return getFace1() + getFace2();
	}
	
	public void lancarImagem() {
		imagem.draw();
	} 
}
