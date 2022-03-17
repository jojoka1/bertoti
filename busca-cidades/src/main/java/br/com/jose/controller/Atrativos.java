package br.com.jose.controller;



public class Atrativos {

	private String hoteis;
	private String cartaoPostal;
	private String restaurantes;
	
	public Atrativos(String hoteis, String cartaoPostal, String restaurantes) {
		this.hoteis = hoteis;
		this.cartaoPostal = cartaoPostal;
		this.restaurantes = restaurantes;
	}
	

	public String getHoteis() {
		return hoteis;

	}

	public String getCartãoPostal() {
		return cartaoPostal;
	}

	public String getRestaurantes() {
		return restaurantes;
	}


	public boolean comparar(Atrativos lugares) {
			if(hoteis.equals(lugares.hoteis) && cartaoPostal.equals(lugares.cartaoPostal) && restaurantes.equals(lugares.restaurantes)){
				return true;
			} else {
				return false;
			}
		}
	}


