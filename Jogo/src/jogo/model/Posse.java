package jogo.model;

public class Posse {
	private float valorCasa1;
	private float valorCasa2;
	private float valorCasa3;
	private float valorCasa4;
	private float valorAluguel;
	private float comprarCasa;
	
	public Posse(float valorCasa1, float valorCasa2, float valorCasa3, float valorCasa4, float valorAluguel,
			float comprarCasa) {
		super();
		this.valorCasa1 = valorCasa1;
		this.valorCasa2 = valorCasa2;
		this.valorCasa3 = valorCasa3;
		this.valorCasa4 = valorCasa4;
		this.valorAluguel = valorAluguel;
		this.comprarCasa = comprarCasa;
	}
	
	public float getValorCasa1() {
		return valorCasa1;
	}
	
	public void setValorCasa1(float valorCasa1) {
		this.valorCasa1 = valorCasa1;
	}
	
	public float getValorCasa2() {
		return valorCasa2;
	}
	
	public void setValorCasa2(float valorCasa2) {
		this.valorCasa2 = valorCasa2;
	}
	
	public float getValorCasa3() {
		return valorCasa3;
	}
	
	public void setValorCasa3(float valorCasa3) {
		this.valorCasa3 = valorCasa3;
	}
	
	public float getValorCasa4() {
		return valorCasa4;
	}
	
	public void setValorCasa4(float valorCasa4) {
		this.valorCasa4 = valorCasa4;
	}
	
	public float getValorAluguel() {
		return valorAluguel;
	}
	
	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public float getComprarCasa() {
		return comprarCasa;
	}
	
	public void setComprarCasa(float comprarCasa) {
		this.comprarCasa = comprarCasa;
	}
	
	
}
