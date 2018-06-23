package jogo.repositorio;

import java.util.ArrayList;
import java.util.List;

import jogo.model.Jogador;

public class RepositorioJogador {
	private static RepositorioJogador repositorio;
	private static List<Jogador> jogadores;
	
	private RepositorioJogador() {
		// TODO Auto-generated constructor stub
	}
	
	public static RepositorioJogador getInstance(){
		if(repositorio == null){
			repositorio = new RepositorioJogador();
			jogadores = new ArrayList<>();
		}
		
		return repositorio;
	}
	
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public List<Jogador> getAllJogadores(){
		List<Jogador> ativos = new ArrayList<>();
		for(Jogador j : jogadores) {
			if(j.isJogando()) {
				ativos.add(j);
			}
		}
		return ativos;
	}

}
