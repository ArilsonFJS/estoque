package br.arilson.estoque.dao;

import java.sql.PreparedStatement;
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
		
		try (PreparedStatement ps = DB.connect().prepareStatement(slq)){
			
			ps.setInt(1, idCategorias);
			ps.execute();
		}
	}
}
