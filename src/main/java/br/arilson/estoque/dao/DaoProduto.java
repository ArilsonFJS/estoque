package br.arilson.estoque.dao;

import java.sql.PreparedStatement;

import br.arilson.estoque.entidades.Produto;

public class DaoProduto {

	public static void inserir(Produto produto) throws Exception {
		
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
