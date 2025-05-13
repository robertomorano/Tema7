package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ej8 {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASEÑA)){
			String sql ="Delete From estudiantes Where id_estudiante = ?S";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Dame las cosa");
			pst.setString(1, sc.next());
	
			
			
		}catch (SQLException e) {                                            
			System.out.println("Error al connectar  " + e);
		}

	}

}
