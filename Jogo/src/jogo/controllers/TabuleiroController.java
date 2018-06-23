package jogo.controllers;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import jogo.model.Dado;
import jogo.model.Jogador;
import jogo.model.Pino;
import jogo.model.propriedades.Propriedade;
import jogo.views.TabuleiroView;

public class TabuleiroController {
	private static TabuleiroController tabuleiro;
	private List<Dado> dados;
	private int qtdDadosIguais;
	int localizacaoAtualJogador;
	public static final int NUM_CASAS = 40;
	
	private TabuleiroController() {
		super();
		this.dados = new ArrayList<Dado>();
		dados.add(new Dado(new Point(100,100).x, new Point(100,100).y));
		dados.add(new Dado(new Point(100,300).x, new Point(100,300).y));
		this.qtdDadosIguais = 0;
	}
	
	public static TabuleiroController getInstance() {
		if(tabuleiro == null) {
			tabuleiro = new TabuleiroController();
		}
		return tabuleiro;
	}
	
	public List<Dado> getDados() {
		return dados;
	}
	
	public void setDados(List<Dado> dados) {
		this.dados = dados;
	}
	
	public int getQtdDadosIguais() {
		return qtdDadosIguais;
	}
	
	public void setQtdDadosIguais(int qtdDadosIguais) {
		this.qtdDadosIguais = qtdDadosIguais;
	}
	
	public void iniciarJogo() {
		addJogador();
		rolarJogo();
		
		
	}
	
	public void atualizarPosicaoDoJogador(Jogador jogador, Propriedade prop) {
		//Mover jogador até coordenada da propriedade
		jogador.moverPinoJogador(prop.getCoordenada());
		jogador.setLocalizacaoAtual(prop.getIndice());
		TabuleiroView.getInstance().desenharPino();
	}
	
	public void addJogador() {
		for (int i = 1; i<=2; i++) {
			String nome = ViewController.getInstance().inputNome(i);
			
			Propriedade prop = PropriedadeController.getInstance().getPropriedade(0);
			JogadorController.getInstance().addJogador(new Jogador(new Pino(i, prop.getCoordenada().x, prop.getCoordenada().y), nome));
		}
	}
	
	public int jogar(Jogador jogador) {
		
		if((jogador.getRodadasNaPrisao()>0) && (jogador.getRodadasNaPrisao()<4)) {
			
			lancarDados();
			if(DadoController.getInstance().verificarFacesIguais(dados) == false) {
				jogador.incrementarContPrisao();
				return 1;
			}
		}else {
			lancarDados();
		}
		
		localizacaoAtualJogador = jogador.getLocalizacaoAtual() + DadoController.getInstance().totalDados(dados);
		
		//Hora de verificar na jogada se o usuário passou da casa inicial
		passouDoInicio(localizacaoAtualJogador, jogador);
		
		Propriedade prop = PropriedadeController.getInstance().getPropriedade(localizacaoAtualJogador);
	
		if(DadoController.getInstance().verificarFacesIguais(dados)) {
			qtdDadosIguais++;
			if(qtdDadosIguais == 3) {
				ViewController.getInstance().mostrarMensagemDadosRepetidosPrisao();
				
			}
		}
		return 0;
	}
	
	public void lancarDados() {
		for(int i = 0;i < dados.size(); i++) {
			dados.get(i).lancarDado();
		}
	}
	
	public void passouDoInicio(int nvIndice, Jogador jogador) {
		if(nvIndice > NUM_CASAS) {
			PropriedadeController.getInstance().getPropriedade(0).efeito(jogador);
		}
	}
	
	public boolean verificarCampeao(){
		if(JogadorController.getInstance().getJogadores().size() == 1) {
			ViewController.getInstance().mostrarMensagemCampeao(JogadorController.getInstance().getJogadores().get(0).getNome());
			return true;
		}
		return false;
	}
	
	public void acabarJogo() {
		JogoController.getInstance().finalizarJogo();
	}
	
	public void rolarJogo() {
		boolean continuarJogando = true;
		while(continuarJogando) {
			if(verificarCampeao() == false) {
				for(Jogador jogador : JogadorController.getInstance().getJogadores()) {
					TabuleiroView.getInstance().desenharPino();
					ViewController.getInstance().mostrarMensagemInicioTurnoDoJogador(jogador.getNome());
					jogar(jogador);
					TabuleiroView.getInstance().desenharPino();
				}
			}else {
				continuarJogando = false;
			}
		}
	}
}
