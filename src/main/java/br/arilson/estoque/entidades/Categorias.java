package br.arilson.estoque.entidades;

public class Categorias {
	
	private int codigo;
	private String nome;
	private Produto produto;
	
	public Categorias(int codigo, String nome, Produto produto) {
		this.codigo = codigo;
		this.nome = nome;
		this.produto = produto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
