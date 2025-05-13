package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ej7 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASEÑA)){
			String sql ="insert into estudiantes (nombre, apellido, fecha_nacimiento, email, telefono) values(?,?,?,?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Dame las cosa");
			pst.setString(1, sc.next());
			System.out.println("Dame las cosa");
			pst.setString(2, sc.next());
			System.out.println("Dame las cosa");
			pst.setString(3, sc.next());
			System.out.println("Dame las cosa");
			pst.setString(4, sc.next());
			System.out.println("Dame las cosa");
			pst.setString(5, sc.next());
			int a = pst.executeUpdate();
			System.out.println(a);
			
			
			
		}catch (SQLException e) {                                            
			System.out.println("Error al connectar  " + e);
		}
	}

}
