package jogo.factorys;

import java.util.Map;
import java.util.TreeMap;

import jogo.model.Familia;


public class FamiliaFabrica {
	private static FamiliaFabrica fabrica;
	
	
	private FamiliaFabrica() {
		
	}
	
	public static FamiliaFabrica getInstance() {
		if(fabrica == null) {
			fabrica = new FamiliaFabrica();
		}
		
		return fabrica;
	}
	
	public Map<String, Familia> criarFamilia() {
		familias = new TreeMap<>();
		familias.put("VERDE", new Familia("VERDE", 3));
		familias.put("VERMELHO", new Familia("VERMELHO", 3));
		familias.put("AZUL", new Familia("AZUL", 3));
		familias.put("ROSA", new Familia("ROSA", 2));
		familias.put("LILÁS", new Familia("LILÁS", 2));
		familias.put("AZUL ESCURO", new Familia("AZUL ESCURO", 3));
		familias.put("LARANJA", new Familia("LARANJA", 3));
		familias.put("AMARELO", new Familia("AMARELO", 3));
		return familias;
	}

	public Map<String, Familia> getFamilias() {
		return familias;
	}

	
	
}
