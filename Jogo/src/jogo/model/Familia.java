package jogo.model;

public class Familia {
	private String cor;
	private int qtdProps;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQtdProps() {
		return qtdProps;
	}
	public void setQtdProps(int qtdProps) {
		this.qtdProps = qtdProps;
	}
	public Familia(String cor, int qtdProps) {
		super();
		this.cor = cor;
		this.qtdProps = qtdProps;
	}
	
	
}

