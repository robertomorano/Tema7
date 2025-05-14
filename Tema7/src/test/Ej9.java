package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ej9 {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASEÑA)){
			String sql ="Select nombre, fecha_nacimiento From estudiantes";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				rs.getString(1);
				rs.getString(2);
			}
			
			
		}catch (SQLException e) {                                            
			System.out.println("Error al connectar  " + e);
		}

	}

}
