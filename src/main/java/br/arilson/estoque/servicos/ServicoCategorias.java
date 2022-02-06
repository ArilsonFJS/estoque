package br.arilson.estoque.servicos;

import java.util.List;

import br.arilson.estoque.dao.DaoCategorias;
import br.arilson.estoque.entidades.Categorias;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("categorias")
public class ServicoCategorias {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Categorias categorias) {
		
		try {
			DaoCategorias.inserir(categorias);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(@QueryParam("idCategorias") int idCategorias) {
		
		try {
			DaoCategorias.excluir(idCategorias);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Categorias categorias) {
		try {
			DaoCategorias.atualizar(categorias);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categorias> listar(){
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("pesquisar")
	public List<Categorias> listar(@QueryParam("pesquisar") String pesquisar){
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("pesquisarID")
	public Categorias pesquisarID(@QueryParam("codigo") int codigo) {
		return null;
	}
}
