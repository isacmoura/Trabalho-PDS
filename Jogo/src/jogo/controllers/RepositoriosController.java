package jogo.controllers;

public class RepositoriosController {
	private static RepositoriosController cRepositorios;
	
	private RepositoriosController() {
		
	}
	
	public static RepositoriosController getInstance() {
		if(cRepositorios == null) {
			cRepositorios = new RepositoriosController();
		}
		
		return cRepositorios;
	}
	
	public iniciarFabricas() {
		
	}

}
