package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "usuario";
		
		try (Connection con = DriverManager.getConnection(url, usuario, contraseña)){
			Statement st = con.createStatement();
			ResultSet a = st.executeQuery("select * from estudiantes");
			while (a.next()) {
				System.out.println(a.getString(1));
			}
			
			
		}catch (SQLException e) {
			System.out.println("Error al connectar  " + e);
		}
		
	}

}
