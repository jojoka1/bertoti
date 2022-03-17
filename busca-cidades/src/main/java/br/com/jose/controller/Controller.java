package br.com.jose.controller;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

import br.com.jose.model.Model;


public class Controller {
	
	private Model model;
	
	public Controller(Model model) {
		this.model = model;
	}

	public void buscarCidade() {
		get("/cidade/:hoteis/:cartaoPostal/:restaurantes", (req, res) -> {
			
			Atrativos lugares = new Atrativos(req.params(":hoteis"), req.params(":cartaoPostal"), req.params(":restaurantes"));	
			List<Cidade> cidadesEncontradas = model.buscarAtracoesTuristicas(lugares);	
			return new Gson().toJson(cidadesEncontradas);
			
		});
		
	}

	public void buscarEstado() {
		// TODO Auto-generated method stub
		
	}

	public void buscarLugares() {
		// TODO Auto-generated method stub
		
	}

}
