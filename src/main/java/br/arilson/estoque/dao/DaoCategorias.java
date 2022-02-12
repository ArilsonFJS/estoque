package br.arilson.estoque.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.arilson.estoque.entidades.Categorias;

public class DaoCategorias {

	public static void inserir(Categorias categorias) throws Exception {

		String sql = "INSERT INTO CATEGORIAS (nome) VALUES (?)";

		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {

			ps.setString(1, categorias.getNome());

			ps.execute();
		}
	}

	public static void excluir(int idCategorias) throws Exception {

		String slq = "DELETE FROM CATEGORIAS WHERE idCategorias = ? ";

		try (PreparedStatement ps = DB.connect().prepareStatement(slq)) {

			ps.setInt(1, idCategorias);
			ps.execute();
		}
	}

	public static void atualizar(Categorias categorias) throws Exception {

		String sql = "UPDATE CATEGORIAS SET nome = ? WHERE idCategorias = ?";

		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {

			ps.setString(1, categorias.getNome());
			ps.setInt(2, categorias.getIdCategorias());
			ps.executeUpdate();
		}
	}

	public static Categorias pesquisar(int idCategorias) throws Exception {

		String sql = "SELECT * FROM CATEGORIAS WHERE idCategorias = ?";

		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {

			ps.setInt(1, idCategorias);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				Categorias categorias = new Categorias();
				categorias.setIdCategorias(rs.getInt("idCategorias"));
				categorias.setNome(rs.getString("nome"));

				return categorias;
			}else {
				return null;
			}

		}

	}
	
	public static List<Categorias> listar() throws Exception{
		
		String sql = "SELECT * FROM CATEGORIAS";
		
		List<Categorias> lista = new ArrayList<>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Categorias categorias = new Categorias();
				
				categorias.setIdCategorias(rs.getInt("idCategorias"));
				categorias.setNome(rs.getString("nome"));
				
				lista.add(categorias);
			}
		}
		
		return lista;
	}
}
