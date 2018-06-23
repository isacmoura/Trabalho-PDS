package jogo.controllers;

import jogo.principal.Carta;
import jogo.repositorio.RepositorioSorteOuAzar;

public class SorteOuAzarController {
	private static SorteOuAzarController sorteOuAzar;
	
	private SorteOuAzarController() {
		
	}
	
	public static SorteOuAzarController getInstance() {
		if(sorteOuAzar == null) {
			sorteOuAzar = new SorteOuAzarController();
		}
		
		return sorteOuAzar;
	}
	
	public int getQuantiCartas() {
		return RepositorioSorteOuAzar.getInstance().getQuantidadeCartas();
	}
	
	public Carta obterCarta(int indice) {
		return RepositorioSorteOuAzar.getInstance().getCarta(indice);
	}

}
