package br.arilson.estoque.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/estoque", "root", "12345");

	}

	public static void main(String[] args) {
		try {
			connect();
			System.out.println("CONECTADO!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}