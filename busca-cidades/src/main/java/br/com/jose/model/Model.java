package br.com.jose.model;

import java.util.LinkedList;
import java.util.List;

import br.com.jose.controller.Atrativos;
import br.com.jose.controller.Cidade;



public class Model {
	
	private List<Cidade> cidades = new LinkedList<Cidade>();

	

	public void addCidade(Cidade cidade){
		cidade.add(cidade);
	}
	
	public Cidade buscarPorEstado(String estado){
		for(Cidade cidade:cidades){
			if(cidade.getEstado().equals(cidade)) return cidade;
		}
		
		return null;
	}
//	public Carro buscarMarca(String marca){
//		for(Carro carro:carros){
//			if(carro.getEspc().getMarca().equals(marca)) return carro;
//		}
//		
//		return null;
//	}
//	
//	
	public List<Cidade> buscarAtracoesTuristicas(Atrativos lugares){
		List<Cidade> cidadeEncontradas = new LinkedList<Cidade>();
		
		for(Cidade cidade:cidades){
			 if(lugares.comparar(cidade.getLugares())) cidadeEncontradas.add(cidade);
		}
		
		return cidadeEncontradas;
		
    }
//	
//	
//	public List<Carro> buscarModelo(String modelo){
//		List<Carro> carrosEncontrados = new LinkedList<Carro>();
//		for(Carro carro:carros) {
//			if(carro.getEspc().getModelo().equals(modelo)) carrosEncontrados.add(carro);
//		}
//		return carrosEncontrados;
//	}
//	
//	public List<Carro> getCarros(){
//		return carros;
//	}

}
