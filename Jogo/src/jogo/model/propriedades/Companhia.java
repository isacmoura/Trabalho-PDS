package jogo.model.propriedades;

import java.awt.Point;

import javax.swing.JOptionPane;

import jogo.controllers.DadoController;
import jogo.controllers.TabuleiroController;
import jogo.controllers.ViewController;
import jogo.model.Jogador;
import jogo.model.PosseCompanhia;

public class Companhia extends PropriedadeComercializavel{
	private PosseCompanhia posseCompanhia;
	

	public Companhia(String tituloCompanhia, String descricao, int indice, Point coordenadaCasa, PosseCompanhia tituloPosseCompanhia) {
		super(tituloCompanhia, descricao, indice, coordenadaCasa);
		this.posseCompanhia = tituloPosseCompanhia;
	}
	
	

	public PosseCompanhia getPosseCompanhia() {
		return posseCompanhia;
	}



	@Override
	public float getAluguel() {
		return posseCompanhia.getValor();
	}
	
	@Override
	public void efeito(Jogador jogador) {
		int totalFaces = DadoController.totalDados(TabuleiroController.getInstance().getDados());
		float totalAluguel = totalFaces * posseCompanhia.getValor();
		
		//se tiver dono
		if(getDono() != null) {
			//se o jogador da vez não é o dono
			if(!getDono().equals(jogador)) {
				if(jogador.jogadorPossuiSaldo(jogador, totalAluguel)) {
					ViewController.getInstance().mostrarMensagemPagarAluguel(getDescricao(), getDono().getNome(), totalAluguel);
					jogador.pagarAluguelProprietario(getDono(), totalAluguel);;
				}else {
					//Jogador não tem saldo para pagar aluguel e é eliminado
					ViewController.getInstance().mostrarMensagemAcabouOJogo(jogador.getNome());
					jogador.setJogando(false);
				}
			}
		}else {
			//Se não tiver dono, o jogador pode comprar a propriedade
			if(ViewController.getInstance().mostrarMensagemComprarPropriedade(getDescricao(), getValor()) == JOptionPane.YES_OPTION) {
				if(jogador.jogadorPossuiSaldo(jogador, getValor())) {
					jogador.comprarPropriedade(this);
				}else {
					ViewController.getInstance().mostrarMensagemSaldoInsuficiente();
				}
			}
		}
	}

}
