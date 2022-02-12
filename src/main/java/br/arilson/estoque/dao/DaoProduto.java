package br.arilson.estoque.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.arilson.estoque.entidades.Categorias;
import br.arilson.estoque.entidades.Produto;

public class DaoProduto {

	/*private static int inserirCategorias(Categorias categorias) throws Exception {

		String sql = "INSERT INTO CATEGORIAS (idCategorias, nome) VALUES (?, ?)";

		try (PreparedStatement ps = DB.connect().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

			ps.setInt(1, categorias.getIdCategorias());
			ps.setString(2, categorias.getNome());

			ps.execute();

			ResultSet rsKeys = ps.getGeneratedKeys();
			if (rsKeys.next()) {
				return rsKeys.getInt(1);
			}

		}
		return -1;

	}*/

	public static void inserir(Produto produto) throws Exception {
		
		//int idCategorias = inserirCategorias(produto.getCategorias());
		

		String slq = "INSERT INTO PRODUTO (nome, preco, quantidade, idCategorias) VALUES (?, ?, ?, ?)";

		try (PreparedStatement ps = DB.connect().prepareStatement(slq)) {

			ps.setString(1, produto.getNome());
			ps.setDouble(2, produto.getPreco());
			ps.setInt(3, produto.getQuantidade());
			ps.setInt(4, produto.getCategorias().getIdCategorias());
			
			
			ps.execute();
		}
	}
}
