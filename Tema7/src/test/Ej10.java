package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ej10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASEÑA)) {

			String sql = "Select nombre, fecha_nacimiento From estudiantes Where id_estudiante in (Select id_estudiante From calificaciones Where id_curso = ?)";
			int idCurso = 0;

			System.out.println("Dame el id del curso");
			idCurso = sc.nextInt();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCurso);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println((rs.getString(1)));
				System.out.println((rs.getString(2)));
			}
			
			
			
			 

			

		} catch (SQLException e) {
			System.out.println("Error al connectar  " + e);
		}

	}

}
