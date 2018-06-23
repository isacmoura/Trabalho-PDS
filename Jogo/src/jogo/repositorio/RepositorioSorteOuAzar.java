package jogo.repositorio;

import java.util.List;

import jogo.principal.Carta;

public class RepositorioSorteOuAzar {
	private static RepositorioSorteOuAzar repositorio;
	private List<Carta> cartas;
	
	private RepositorioSorteOuAzar() {
		
	}
	
	public static RepositorioSorteOuAzar getInstance() {
		if(repositorio == null) {
			repositorio = new RepositorioSorteOuAzar();
		}
		
		return repositorio;
	}

	public List<Carta> getCartas() {
		return cartas;
	}
	
	public int getQuantidadeCartas() {
		return cartas.size();
	}
	
	public Carta getCarta(int indiceCarta) {
		return cartas.get(indiceCarta);
	}
	

}
