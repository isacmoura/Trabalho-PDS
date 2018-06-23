package jogo.repositorio;

import java.util.Map;

import jogo.factorys.FamiliaFabrica;
import jogo.model.Familia;

public class RepositorioFamilia {
	private static RepositorioFamilia famRepositorio;
	private Map<String, Familia> familias;
	
	private RepositorioFamilia() {
		
	}
	
	public RepositorioFamilia getInstance() {
		if(famRepositorio == null) {
			famRepositorio = new RepositorioFamilia();
		}
		
		return famRepositorio;
	}
	
	public void addFamilia(Familia ){
		familias.put();
	}

}
