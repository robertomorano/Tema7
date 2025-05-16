package crud;

public class Estudiante {
	private int id;
	private String nombre;
	private String apellido;
	private String fecha_nacimiento;
	private String email;
	private String telefono;
	public Estudiante(int id, String nombre, String apellido, String fecha_nacimiento, String email, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.email = email;
		this.telefono = telefono;
	}
	
}
