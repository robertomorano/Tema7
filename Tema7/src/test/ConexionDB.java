package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "usuario";

		try (Connection con = DriverManager.getConnection(url, usuario, contraseña)) {
			Statement st = con.createStatement();
			ResultSet a = st.executeQuery("select * from estudiantes");
			while (a.next()) {
				System.out.println(a.getString(1));
			}
			String sql = "select *"+"From calificaciones " +" Where id_curso = ? AND nota > ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, 1);
			pst.setDouble(2, 8);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(2) +" ");
				System.out.println(rs.getInt(3) +" ");
				System.out.println(rs.getDouble(6) +" ");
			}

		} catch (SQLException e) {
			System.out.println("Error al connectar  " + e);
		}

	}

}
