package br.com.jose.controller;

public class Cidade {
	
	private String nome;
	private String estado;
	private Atrativos lugares;
	
	public Cidade(String nome, String estado, Atrativos lugar) {
		this.nome = nome;
		this.estado = estado;
		this.lugares = lugar;
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getEstado() {
		return estado;
	}
	public Atrativos getLugares() {
		return lugares;
	}

	public void add(Cidade cidade) {
		// TODO Auto-generated method stub
		
	}

}
