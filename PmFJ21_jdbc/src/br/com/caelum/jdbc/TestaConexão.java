package br.com.caelum.jdbc;
import java.sql connection;
import java.sql SQLExceptiom;

public class TestaConexão {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!");
        connction close();    
	}

}
