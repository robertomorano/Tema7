package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej1y4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "usuario";
		
		try (Connection con = DriverManager.getConnection(url, usuario, contraseña)){
			Statement st = con.createStatement();
			int insertar = st.executeUpdate("insert into cursos ( nombre, descripcion, año_escolar) "
					+ "values ( 'Historia 1º', 'edscrito',2025)");
			insertar += st.executeUpdate("insert into cursos ( nombre, descripcion, año_escolar) "
					+ "values ( 'Biologia 1º', 'edscrito',2025)");
			insertar += st.executeUpdate("insert into cursos ( nombre, descripcion, año_escolar) "
					+ "values ( 'Ed.Física 1º', 'edscrito',2025)");
			insertar += st.executeUpdate("insert into cursos ( nombre, descripcion, año_escolar) "
					+ "values ( 'Música 1º', 'edscrito',2025)");
			insertar += st.executeUpdate("insert into cursos ( nombre, descripcion, año_escolar) "
					+ "values ( 'Tecnología 1º', 'edscrito',2025)");
			System.out.println(insertar);

			
			
		}catch (SQLException e) {
			System.out.println("Error al connectar  " + e);
		}

	}

}
