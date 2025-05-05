package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "usuario";
		
		try (Connection con = DriverManager.getConnection(url, usuario, contraseña)){
			Statement st = con.createStatement();
			int insertar = st.executeUpdate("insert into ");

			
			
		}catch (SQLException e) {
			System.out.println("Error al connectar  " + e);
		}

	}

}
