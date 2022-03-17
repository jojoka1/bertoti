package br.com.jose.controller;
import static spark.Spark.*;

import br.com.jose.model.Model;


public class MainServer {
	
final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        System.out.println("teste");
        Integer port;
        
        System.out.println("teste");
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
            System.out.println("teste");
        } else {
            port = 80;
        }
      
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCidade();

		Controller controller = new Controller(model);
		
		controller.buscarCidade();
		controller.buscarEstado();
		controller.buscarLugares();
		

		
		
		
		
    }
    
   





	public static void inicializarCidade(){
    	model.addCidade(new Cidade("Bonito", "MT",new Atrativos("Bom descanço", "Praça bela", "Come bem")));
    	
    	model.addCidade(new Cidade("Ubatuba", "SP",new Atrativos("Cantinho da praia", "Praia Bela", "Sabor do mar")));
    }
}
