package jogo.model;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import jogo.controllers.ViewController;
import jogo.model.propriedades.PropriedadeComercializavel;

public class Jogador {
	private String nome;
	private float saldo;
	private int rodadasNaPrisao;
	private boolean jogando;
	private int localizacaoAtual;
	private Pino pino;
	private List<PropriedadeComercializavel> propriedades;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public int getRodadasNaPrisao() {
		return rodadasNaPrisao;
	}



	public void setRodadasNaPrisao(int rodadasNaPrisao) {
		this.rodadasNaPrisao = rodadasNaPrisao;
	}
	
	public void zerarContadorPrisao() {
		this.rodadasNaPrisao = 0;
	}
	
	public void incrementarContPrisao() {
		this.rodadasNaPrisao++;
	}


	public boolean isJogando() {
		return jogando;
	}



	public void setJogando(boolean jogando) {
		this.jogando = jogando;
	}



	public int getLocalizacaoAtual() {
		return localizacaoAtual;
	}



	public void setLocalizacaoAtual(int localizacaoAtual) {
		this.localizacaoAtual = localizacaoAtual;
	}



	public Pino getPino() {
		return pino;
	}



	public void setPino(Pino pino) {
		this.pino = pino;
	}



	public List<PropriedadeComercializavel> getPropriedades() {
		List <PropriedadeComercializavel> auxiliar = new ArrayList<>();
		
		for (PropriedadeComercializavel prop : propriedades) {
			auxiliar.add(prop);
		}
		return auxiliar;
	}
	
	public void adicionarPropriedade(PropriedadeComercializavel prop) {
		if(propriedades.contains(prop) == false) {
			prop.comprarPropriedade(getLocalizacaoAtual(), this);
			propriedades.add(prop);
		}else {
			ViewController.getInstance().mostrarMensagemPropriedadeJaAdquirida(prop);
		}
	}
	
	public void removerPropriedade(PropriedadeComercializavel prop) {
		if(propriedades.contains(prop) == true) {
			prop.removerPropriedade(this);
			propriedades.remove(prop);
			//Propriedade é removida do jogo e da lista de propriedades do jogador
		}
	}



	public void setPropriedades(List<PropriedadeComercializavel> propriedades) {
		this.propriedades = propriedades;
	}



	public Jogador(Pino pino, String nome) {
		super();
		this.nome = nome;
		this.saldo = 1000.00f;
		this.rodadasNaPrisao = 0;
		this.jogando = true;
		this.localizacaoAtual = 0;
		this.pino = pino;
		this.propriedades = new ArrayList<>();
	}
	
	public void pagar(float valor) {
		this.saldo = saldo - valor;
	}
	
	public void receber(float valor) {
		this.saldo = saldo + valor;
	}
	
	public void desativarJogador() {
		this.jogando = false;
		
	}
	
	public void pagarAluguelProprietario(Jogador dono, float valor) {
		this.pagar(valor);
		dono.receber(valor);
	}
	
	public boolean comprarPropriedade(PropriedadeComercializavel prop) {
		if(prop.getValor() <= this.getSaldo()) {
			this.pagar(prop.getValor());
			this.adicionarPropriedade(prop);
			ViewController.getInstance().mostrarMensagemPropriedadeComprada(prop);
			return true;
		}
		return false;
	}
	
	public boolean jogadorHasCasas() {
		if(propriedades.size()>0) {
			return true;
		}
		
		return false;
	}
	
	public void moverPinoJogador(Point ponto) {
		pino.moverPinoParaLocal(ponto);
	}
	
	public boolean jogadorPossuiSaldo(Jogador jogador, float valor){
		if(jogador.getSaldo() >= valor){
			return true;
		}
		
		return false;
	}	

}
