package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	// m�dulo de conex�o
	// par�metros de conex�o 
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone"
			+ "=UTC";
	private String user = "root";
	private String password = "";  	
	
	
	// m�todo de conex�o
	private Connection conectar() {
		Connection con = null;
		
		// fazer tratamento de exce��o com o banco de dados, por isso try catch. ctrl + espa�o
		try {
			Class.forName(driver); // vai ler o driver do banco de dados. vai buscar a variavel driver
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
		// teste de conex�o
	/*public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		} */
	}

