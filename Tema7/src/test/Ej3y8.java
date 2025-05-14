package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ej3y8 {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASEÑA)){
			String sql ="Delete From estudiantes Where id_estudiante = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Dame el id para eliminar");
			pst.setString(1, sc.next());
			System.out.println(pst.executeUpdate());
			
			
		}catch (SQLException e) {                                            
			System.out.println("Error al connectar  " + e);
		}

	}

}
