package br.com.caelum.jdbc;
import java.sql connection;
import java.sql DriverManeger;
import java.sql SQLExceptiom;

public class ConnectionFactory {
    public class ConnectionFactory () {
    	try {
    		return DriverManeger.getConnection("jdbc:mysql://localhost/pmfj21", "root","");
    	} catch(SQLException e) {
    		throw new RuntimeException(e);
    	}
    }
}
