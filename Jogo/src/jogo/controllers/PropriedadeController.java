package jogo.controllers;

import java.util.List;

import jogo.model.propriedades.Propriedade;
import jogo.repositorio.RepositorioPropriedades;


public class PropriedadeController {
	private static PropriedadeController propriedade;
	
	private PropriedadeController() {
		
	}
	
	public static PropriedadeController getInstance() {
		if(propriedade == null) {
			propriedade = new PropriedadeController();
		}
		return propriedade;
	}
	
	public Propriedade getPropriedade(int indice) {
		if(indice < quantPropriedades()) {
			return RepositorioPropriedades.getInstance().getPropriedade(indice);
		}
		
		return null;
	}
	
	public int quantPropriedades() {
		return RepositorioPropriedades.getInstance().numPropriedades();
	}
	
	public List<Propriedade> getAllPropriedades() {
		return RepositorioPropriedades.getInstance().getPropriedadesList();
	}
}
