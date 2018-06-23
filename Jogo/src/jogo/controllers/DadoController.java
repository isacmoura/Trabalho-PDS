package jogo.controllers;

import java.util.List;

import jogo.model.Dado;

public class DadoController {
	private static DadoController dado;
	
	private DadoController() {
		
	}
	
	public static DadoController getInstance() {
		if(dado == null) {
			dado = new DadoController();
		}
		return dado;
	}
	
	public static boolean verificarFacesIguais(List<Dado> dados){	
		return dados.get(0).equals(dados.get(1));
	}
	
	public static int totalDados(List<Dado> dados){
		int total = 0;
		for(int i=0;i<dados.size();i++){
			total += dados.get(i).getFace();
		}
		
		return total;
	}
	
}
