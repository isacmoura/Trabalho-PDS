package jogo.repositorio;

import java.util.List;

import jogo.model.propriedades.Propriedade;

public class RepositorioPropriedades {
	private static RepositorioPropriedades repositorio;
	private static List<Propriedade> propriedades;
	
	private RepositorioPropriedades() {
		
	}
	
	public static RepositorioPropriedades getInstance() {
		if(repositorio == null) {
			repositorio = new RepositorioPropriedades();
		}
		
		return repositorio;
	}

	public static List<Propriedade> getPropriedades() {
		return propriedades;
	}

	public static void setPropriedades(List<Propriedade> propriedades) {
		RepositorioPropriedades.propriedades = propriedades;
	}
	
	public int numPropriedades() {
		return this.propriedades.size();
	}

	public Propriedade getPropriedade (int indice) {
		return propriedades.get(indice);
	}
	
	public List<Propriedade> getPropriedadesList(){
		return propriedades;
	}
	
	

}
