package br.arilson.estoque.servicos;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("produto")
public class ServicoProduto {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Deu certo !";
	}
}
