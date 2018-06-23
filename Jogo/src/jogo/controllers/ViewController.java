package jogo.controllers;

import javax.swing.JOptionPane;

import jogo.model.propriedades.PropriedadeComercializavel;

public class ViewController {
	private static ViewController view;
	
	private ViewController() {
		
	}
	
	public static ViewController getInstance() {
		if(view == null) {
			view = new ViewController();
		}
		return view;
	}
	
	
	public void mostrarMensagemAzar(String descricao, float valor){
		JOptionPane.showMessageDialog(null, 
									 descricao+"\nPague R$ "+valor,
									 "AZAR",
									 JOptionPane.WARNING_MESSAGE);	
	}
	
	public void mostrarMensagemPropriedadeJaAdquirida(PropriedadeComercializavel prop){
		JOptionPane.showMessageDialog(null, "Você já possui a propriedade "+prop.getTitulo(),
									 "Tente comprar outra propriedade",
									 JOptionPane.ERROR_MESSAGE);	
	}
	
	public void mostrarMensagemPropriedadeComprada(PropriedadeComercializavel prop){
		JOptionPane.showMessageDialog(null, "Você comprou a propriedade "+prop.getTitulo()+" por R$: " + prop.getValor(),
									 "!",
									 JOptionPane.WARNING_MESSAGE);	
	}
	
	public void mostrarMensagemSorte(String descricao, float valor) {
		JOptionPane.showMessageDialog(null, descricao+"\nGanhe R$ "+valor,
				 "SORTE",
				 JOptionPane.WARNING_MESSAGE);
	}
	
	public String inputNome(int i) {
		return JOptionPane.showInputDialog(null, "Insira o nome do jogador "+(i), "Adicionar Jogador", JOptionPane.QUESTION_MESSAGE);
	}
	
	public void mostrarMensagemDadosRepetidosPrisao() {
		JOptionPane.showMessageDialog(null, "Os dados se repetiram 3 vezes. Prepare-se para ir para a prisão!");
	}
	
	public void mostrarMensagemCampeao(String nome) {
		JOptionPane.showMessageDialog(null, 
				                      nome+ " Foi o campeão da partida!",
				                      "CAMPEÃO", 
				                      JOptionPane.OK_OPTION);
	}
	
	public void mostrarMensagemPagarAluguel(String descPropriedade, String dono, float taxa){
		JOptionPane.showMessageDialog(null, 
				                      "Você está na propriedade "+descPropriedade+
				                      ", pertencente a "+dono+".\nPague R$ "+taxa, 
				                      "PAGAR ALUGUEL", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMensagemAcabouOJogo(String nome) {
		JOptionPane.showMessageDialog(null, 
                					 nome+", você foi à falência. Acabou o jogo para você!", 
                					 "FALIU", 
                					 JOptionPane.OK_OPTION);
	}
	
	public int mostrarMensagemComprarPropriedade(String descricao, float valor){
		return JOptionPane.showConfirmDialog(null, "Deseja comprar a companhia " +descricao+ " por R$: "+valor+"?");
	}
	
	public void mostrarMensagemSaldoInsuficiente() {
		JOptionPane.showMessageDialog(null, 
				                     "Você não possui saldo suficiente para adquirir esta propriedade", 
				                     "DINHEIRO INSUFICIENTE", 
				                     JOptionPane.OK_OPTION);
		
	}
	
	public void mostrarMensagemBonusPassouDoInicio(){
		JOptionPane.showMessageDialog(null, 
				                      "Você passou pelo iniício. \nRecebea R$ 200,00",
				                      "BONUS INÍCIO",
				                      JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMensagemLucrosOuDividendos(){
		JOptionPane.showMessageDialog(null, 
				                      "PARABÉNS! Sua empresa deu lucros/dividendos. \nRecebea R$ 500,00",
				                      "LUCROS OU DIVIDENDOS",
				                      JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMensagemParadaLivre(){
		JOptionPane.showMessageDialog(null, 
				                      "Tire um descanso!",
				                      "PARADA LIVRE",
				                      JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMensagemRF(){
		JOptionPane.showMessageDialog(null, 
				  					 "Você caiu na malha fina da Receita Federal. Pague R$ 2000,00",
				  					 "RECEITA FEDERAL",
				  					 JOptionPane.INFORMATION_MESSAGE);			
	}
	
	public void mostrarJogadorVaiParaPrisao(){		
		JOptionPane.showMessageDialog(null, 
                					 "Você foi pego numa blitz, o xadrez é o seu destino!",
                					 "VÁ PARA A PRISÃO",
                					 JOptionPane.WARNING_MESSAGE);
	}
	
	public void mostrarMensagemInicioTurnoDoJogador(String jogadorNome){
		JOptionPane.showMessageDialog(null, 
				                      jogadorNome+", é sua vez!",
				                      "NOVA JOGADA", 
				                      JOptionPane.INFORMATION_MESSAGE);
	}
}
