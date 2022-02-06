package br.arilson.estoque.servicos;

import java.util.List;

import br.arilson.estoque.entidades.Produto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("produto")
public class ServicoProduto {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Produto produto) {
		
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(@QueryParam("codigo") int codigo) {
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Produto produto) {
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> listar(){
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("pesquisar")
	public List<Produto> listar(@QueryParam("pesquisar") String pesquisar){
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("pesquisarID")
	public Produto pesquisarID(@QueryParam("codigo") int codigo) {
		return null;
	}
	
	
}
